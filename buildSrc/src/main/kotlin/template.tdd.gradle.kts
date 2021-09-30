import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
    `java-library`
    jacoco
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

// share source directories for the aggregated coverage report
configurations.create("sourceDirectories") {
    extendsFrom(configurations.implementation.get())

    isVisible = false
    isCanBeResolved = false
    isCanBeConsumed = true

    attributes {
        attribute(DocsType.DOCS_TYPE_ATTRIBUTE, objects.named("source-directories"))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
    }

    sourceSets.main.get().java.srcDirs.forEach {
        outgoing.artifact(it)
    }
}

// share the coverage data for the aggregated coverage report
configurations.create("coverageData") {
    extendsFrom(configurations.implementation.get())

    isVisible = false
    isCanBeResolved = false
    isCanBeConsumed = true

    attributes {
        attribute(DocsType.DOCS_TYPE_ATTRIBUTE, objects.named("jacoco-coverage-data"))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
    }

    // this will cause the test task to run if the coverage data is requested by the aggregation task
    outgoing.artifact(tasks.test.map { task ->
        task.extensions.getByType<JacocoTaskExtension>().destinationFile!!
    })
}
