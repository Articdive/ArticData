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

            classpath += project(":DataGenerator:$implementedVersion").configurations.getByName("runtimeClasspath")
            classpath += project(":DataGenerator:$implementedVersion").tasks.getByName<Jar>("jar").outputs.files
            setClasspath(classpath)
        }
    }
}