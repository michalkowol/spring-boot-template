pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "eu.codeloop") {
                useModule("com.github.codeloopeu.codeloop-build:${requested.id}.gradle.plugin:${requested.version}")
            }
        }
    }
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "spring-boot-template"
