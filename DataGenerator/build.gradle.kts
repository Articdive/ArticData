group = "de.articdive.datagen"

plugins {
    id("application")
    id("java")
}

application {
    mainClass.set("de.articdive.articdata.datagen.DataGen")
}

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Logging
        implementation("org.apache.logging.log4j:log4j-core:2.14.0")
        // SLF4J is the base logger for most libraries, therefore we can hook it into log4j2.
        implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")
        implementation("com.google.code.gson:gson:2.8.6")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":DataGenerator:core"))
    val version: String = project.properties["mcVersion"] as String
    runtimeOnly(files("../Deobfuscator/deobfuscated_jars/deobfu_$version.jar"))
    runtimeOnly(project(":DataGenerator:${project.rootProject.ext["genVersion"]}"))
}