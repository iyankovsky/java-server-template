import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.osacky.doctor") version "0.7.1"
    id("com.github.ben-manes.versions") version "0.39.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    plugins.withType<JavaPlugin>().configureEach {
        configure<JavaPluginExtension> {
            toolchain {
                vendor.set(JvmVendorSpec.ORACLE)
                languageVersion.set(JavaLanguageVersion.of(16))
            }

            modularity.inferModulePath.set(true)
        }
    }

    tasks.withType(Test::class) {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}

group = "template"

tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    gradleReleaseChannel = "current"
}
