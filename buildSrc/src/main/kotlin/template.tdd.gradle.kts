import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
    `java-library`
}

dependencies {
    val junitVersion = findProperty("junit5.version")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events(PASSED, SKIPPED, FAILED)
    }
}
