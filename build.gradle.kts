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
        dependsOn(project(":DataGenerator:$version").tasks.getByName<JavaExec>("run") {

        })

    }
}