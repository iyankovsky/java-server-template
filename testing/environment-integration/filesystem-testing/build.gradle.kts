import org.gradle.api.tasks.testing.logging.TestLogEvent.*

description = "Filesystem integration testing within development environment"

plugins {
    `java-library`
}

dependencies {
    testImplementation(project(":development:support:filesystem"))

    val junitVersion = findProperty("junit5.version")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events(PASSED, SKIPPED, FAILED)
    }
    environment("DATASET_DIRECTORY",
        File("${rootProject.projectDir.absolutePath}/dataset").absolutePath)
}
