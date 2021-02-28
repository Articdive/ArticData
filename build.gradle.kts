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
        // TODO: Get closest implemented version
        val project : Project = try {
            project(":DataGenerator:$version")
        } catch (e : UnknownProjectException ) {
            // TODO: Get closest version and not latest version
            project(":DataGenerator:1.16.5")
        }
        dependsOn(project.tasks.getByName<JavaExec>("run") {
            setArgsString(version)
        })

    }
}