import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.osacky.doctor") version "0.7.0"
    id("com.github.ben-manes.versions") version "0.39.0"
}

group = "template"

tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    gradleReleaseChannel = "current"
}
