import java.io.InputStreamReader
import java.net.URL

group = "com.minestom"
version = "0.1.0"

subprojects {
    version = project.rootProject.version
}

tasks {
    register("generateData") {
        val version: String = (project.properties["mcversion"] ?: "1.16.5") as String
        val closestVersion: String = getClosestVersion(version)
        // DataGeneration
        val projectDG: Project = project(":DataGenerator:$closestVersion")
        dependsOn(projectDG.tasks.getByName<JavaExec>("run") {
            setArgsString(version)
            // Deobfuscation
            run {
                if (version != closestVersion) {
                    // Need to run deobfuscator on closestVersion as it is used to compile.
                    // This just prevents us from running the Deobfuscator on the same version twice
                    dependsOn(project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
                        setArgsString(closestVersion)
                    })
                }
                // Need to run deobfuscator on version as it is used on runtime.
                dependsOn(project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
                    setArgsString(version)
                })
            }
        })
    }
}

fun getClosestVersion(version: String): String {
    // check if the specified version exists as a project
    // e.g. if the project 21w15a exists then this WONT throw the UnknownProjectException and return "21w15a".
    try {
        val projectC : Project = project(":DataGenerator:$version")
        return version
    } catch (e : UnknownProjectException) {
        // ignored
    }
    // TODO: Get closest version and not use a hardfixed version
    return "1.16.5"
}

