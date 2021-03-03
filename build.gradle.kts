group = "com.minestom"
version = "0.1.0"

subprojects {
    version = project.rootProject.version
}

tasks {
    register("generateData") {
        val version: String = (project.properties["mcversion"] ?: "1.16.5") as String
        dependsOn(project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
            setArgsString(version)
        })
        val project : Project = try {
            project(":DataGenerator:$version")
        } catch (e : UnknownProjectException ) {
            // TODO: Get closest version and not use a hardfixed version
            val closestVersion = "1.16.5"
            // Run data generator for the closestVersion (important as it used to compile!)
            dependsOn(project(":Deobfuscator").tasks.getByName<JavaExec>("run") {
                setArgsString(closestVersion)
            })
            project(":DataGenerator:$closestVersion")
        }
        dependsOn(project.tasks.getByName<JavaExec>("run") {
            setArgsString(version)
        })

    }
}