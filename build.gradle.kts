import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.osacky.doctor") version "0.7.2"
    id("com.github.ben-manes.versions") version "0.39.0"
    id("com.adarshr.test-logger") version "3.0.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "com.adarshr.test-logger")

    plugins.withType<JavaPlugin>().configureEach {
        configure<JavaPluginExtension> {
            toolchain {
                vendor.set(JvmVendorSpec.ADOPTOPENJDK)
                languageVersion.set(JavaLanguageVersion.of(16))
            }

            modularity.inferModulePath.set(true)
        }
    }

    tasks.withType<JacocoReport> {
        reports {
            html.required.set(true)
            html.outputLocation.set(File("$buildDir/reports/jacoco/report.html"))
        }
    }

    tasks.withType<JacocoCoverageVerification> {
        violationRules {
            rule {
                limit {
                    minimum = 1.0.toBigDecimal()
                }
            }
        }
    }
}

group = "template"

tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    gradleReleaseChannel = "current"

    fun isNonStable(version: String) = "^.*\\-(M|RC)[0-9]*$".toRegex().matches(version)

    rejectVersionIf {
        isNonStable(candidate.version)
    }
}
