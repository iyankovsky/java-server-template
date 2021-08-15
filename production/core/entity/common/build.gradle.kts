description = "Common entities"

plugins {
    `java-library`
}

dependencies {
    val junitVersion = findProperty("junit5.version")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks {
    jar {
        archiveBaseName.set("entity-common")
    }
}
