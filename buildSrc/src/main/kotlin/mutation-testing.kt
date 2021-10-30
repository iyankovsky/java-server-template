import info.solidsoft.gradle.pitest.PitestPluginExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

fun Project.mutate(classMask: String) {
    apply(plugin = "info.solidsoft.pitest")

    (this as org.gradle.api.plugins.ExtensionAware).extensions.configure<PitestPluginExtension>("pitest") {
        pitestVersion.set("1.6.8")
        junit5PluginVersion.set("0.15")
        targetClasses.set(listOf(classMask))
        threads.set(1)
        outputFormats.set(setOf("XML", "HTML"))
        mutators.set(setOf("STRONGER", "DEFAULTS"))
        verbose.set(true)
    }
}
