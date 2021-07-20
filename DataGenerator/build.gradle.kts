group = "de.articdive.datagen"

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Logging
        "implementation"("org.apache.logging.log4j:log4j-core:2.14.0")
        // SLF4J is the base logger for most libraries, therefore we can hook it into log4j2.
        "implementation"("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")
        "implementation"("com.google.code.gson:gson:2.8.7")
    }
}

val implementedVersions = rootProject.properties["implementedVersions"].toString().split(",").map(String::trim)

tasks {
    for (implementedVersion in implementedVersions) {
        register<JavaExec>("run_$implementedVersion") {
            dependsOn(
                project(":DataGenerator:$implementedVersion").tasks.getByName<Jar>("jar"),
            )
            mainClass.set("de.articdive.articdata.datagen.DataGen")
            var classpath: FileCollection = project.objects.fileCollection()

            classpath = classpath.plus(
                project(":DataGenerator:$implementedVersion").configurations.getByName("runtimeClasspath")
            )
            classpath = classpath.plus(
                project(":DataGenerator:$implementedVersion").tasks.getByName<Jar>("jar").outputs.files
            )
            doFirst {
                // The IDE will say args cannot be null, but then gradle will complain that this it can.
                val actualVersion = args!![0] ?: "1.16.5"
                classpath = classpath.plus(files("../Deobfuscator/deobfuscated_jars/deobfu_$actualVersion.jar"))
                setClasspath(classpath)
            }
        }
    }
}