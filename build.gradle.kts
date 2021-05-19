import java.util.*
import kotlin.math.log

group = "net.minestom"
version = "0.1.0"

subprojects {
    version = project.rootProject.version
}

tasks {
    register("generateData") {
        val version: String = (project.properties["mcversion"] ?: "1.16.5") as String
        val outputLocation: String = (project.properties["output"] ?: "../Minestom-Data/${version}/") as String
        val closestVersion: String = getClosestVersion(version)

        logger.warn("Mojang requires all source-code and mappings used to be governed by the Minecraft EULA.")
        logger.warn("We also require a running Minecraft server to extract data.")
        logger.warn("Please read the Minecraft EULA located at https://account.mojang.com/documents/minecraft_eula.")
        logger.warn("In order to agree to the EULA you must create a file called eula.txt with the text 'eula=true'.")
        val eulaTxt = File("${project.rootProject.projectDir}/eula.txt")
        logger.warn("The file must be located at '${eulaTxt.absolutePath}'.")
        if (eulaTxt.exists() && eulaTxt.readText(Charsets.UTF_8).equals("eula=true", true)) {
            logger.warn("")
            logger.warn("The EULA has been accepted and signed.")
            logger.warn("")
        } else {
            throw GradleException("Data generation has been halted as the EULA has not been signed.")
        }
        logger.warn("It is unclear if the data from the data generator also adhere to the Minecraft EULA.")
        logger.warn("Please consult your own legal team!")
        logger.warn("All data is given independently without warranty, guarantee or liability of any kind.")
        logger.warn("The data may or may not be the intellectual property of Mojang Studios.")
        logger.warn("")

        // DataGeneration
        val projectDG: Project = project(":DataGenerator")
        dependsOn(projectDG.tasks.getByName<JavaExec>("run") {
            args = arrayListOf(closestVersion, outputLocation)
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

