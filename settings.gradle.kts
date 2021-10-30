pluginManagement {
    plugins {
        id("info.solidsoft.pitest") version "1.7.0"
    }
}

rootProject.name = "java-server-template"

include(":production:core:entity:common")

include(":testing:code-coverage-report")
