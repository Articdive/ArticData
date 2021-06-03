group = "net.minestom"
version = "0.1.0"

subprojects {
    version = project.rootProject.version
}

tasks {
    register("generateData") {
        val version: String = (project.properties["mcversion"] ?: "1.16.5") as String
        val outputLocation: String = (project.properties["output"] ?: "../Minestom-Data/${version}/") as String

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

        // Deobfuscation
        for (ver in getVersionsRequiredForCompile(version)) {
            project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
                setArgsString(ver)
            }.exec()
        }
        dependsOn(project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
            setArgsString(version)
        }).finalizedBy(project(":DataGenerator").tasks.getByName<JavaExec>("run") {
            args = arrayListOf(version, outputLocation)
        })
    }
}

// Returns a List of versions required to get data for the specified version.
fun getVersionsRequiredForCompile(version: String): Array<String> {
    // 1.17
    if (version == "1.17-pre4") {
        return arrayOf("1.17-pre4", "1.16.5")
    }
    // 1.16.5
    if (version == "1.16") {
        return arrayOf("1.16.5")
    }
    if (version == "1.16.1") {
        return arrayOf("1.16.5")
    }
    if (version == "1.16.2") {
        return arrayOf("1.16.5")
    }
    if (version == "1.16.3") {
        return arrayOf("1.16.5")
    }
    if (version == "1.16.4") {
        return arrayOf("1.16.5")
    }
    if (version == "1.16.5") {
        return arrayOf("1.16.5");
    }
    // TODO: Make sure this corresponds to DataGen and the versions required.
    return arrayOf("1.16.5");
}

