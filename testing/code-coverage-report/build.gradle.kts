plugins {
    `java-library`
    jacoco
}

dependencies {
    implementation(project(":production:core:entity:common"))
}

// collect source code
val sourcesPath: Configuration by configurations.creating {
    extendsFrom(configurations.implementation.get())

    isVisible = false
    isCanBeResolved = true
    isCanBeConsumed = false

    attributes {
        attribute(DocsType.DOCS_TYPE_ATTRIBUTE, objects.named("source-directories"))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
    }
}

// collect coverage data
val coverageDataPath: Configuration by configurations.creating {
    extendsFrom(configurations.implementation.get())

    isVisible = false
    isCanBeResolved = true
    isCanBeConsumed = false

    attributes {
        attribute(DocsType.DOCS_TYPE_ATTRIBUTE, objects.named("jacoco-coverage-data"))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
    }
}

// gather code coverage from multiple projects
val codeCoverageReport by tasks.registering(JacocoReport::class) {
    additionalClassDirs(configurations.runtimeClasspath.get())

    additionalSourceDirs(sourcesPath.incoming.artifactView { lenient(true) }.files)
    executionData(coverageDataPath.incoming.artifactView { lenient(true) }.files.filter { it.exists() })

    reports {
        html.required.set(true)
        csv.required.set(true)
    }
}

tasks.check {
    dependsOn(codeCoverageReport)
}
