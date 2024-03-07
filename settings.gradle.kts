pluginManagement {
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
        id("org.jetbrains.compose").version(extra["compose.version"] as String)
    }

    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "JavaLibraryTest"

