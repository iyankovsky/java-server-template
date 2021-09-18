description = "Common entities"

plugins {
    id("template.tdd")
}

tasks {
    jar {
        archiveBaseName.set("entity-common")
    }
}
