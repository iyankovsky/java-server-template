description = "Filesystem access for development support"

plugins {
    `java-library`
}

tasks {
    jar {
        archiveBaseName.set("support-filesystem")
    }
}
