group = "net.minestom.data_generator"

plugins {
    id("application")
    id("java")
}

application {
    mainClass.set("net.minestom.datagen.DataGen")
}

sourceSets {
    // Core
    create("core") {
        java {
            srcDir("src/core/java")
        }
        resources {
            srcDir("src/core/resources")
        }
    }
    // Core-bridge
    create("entrypoint") {
        java {
            srcDir("src/entrypoint/java")
        }
        resources {
            srcDir("src/entrypoint/resources")
        }
    }
    // 1.16.5
    create("1_16_5") {
        java {
            srcDir("src/1_16_5/java")
        }
        resources {
            srcDir("src/1_16_5/resources")
        }
    }
    getByName("1_16_5") {
        compileClasspath += sourceSets["core"].compileClasspath + sourceSets["core"].output
        runtimeClasspath += sourceSets["core"].runtimeClasspath + sourceSets["core"].output
    }
    getByName("main") {
        compileClasspath += sourceSets["core"].compileClasspath + sourceSets["core"].output
        runtimeClasspath += sourceSets["core"].runtimeClasspath + sourceSets["core"].output

        compileClasspath += sourceSets["1_16_5"].compileClasspath + sourceSets["1_16_5"].output
        runtimeClasspath += sourceSets["1_16_5"].runtimeClasspath + sourceSets["1_16_5"].output
    }
}
tasks {
    jar {
        from(sourceSets["main"].output.classesDirs)
        from(sourceSets["core"].output.classesDirs)
        from(sourceSets["1_16_5"].output.classesDirs)
        from(sourceSets["entrypoint"].output.classesDirs)
    }
}
repositories {
    mavenCentral()
}

val coreImplementation by configurations.getting {
    extendsFrom(configurations.implementation.get())
}

dependencies {
    val compileOnly1_16_5 = configurations.getByName("1_16_5CompileOnly")
    // Logging
    implementation("org.apache.logging.log4j:log4j-core:2.14.0")
    // SLF4J is the base logger for most libraries, therefore we can hook it into log4j2.
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")
    // Gson
    coreImplementation("com.google.code.gson:gson:2.8.6")

    compileOnly1_16_5(files("../Deobfuscator/deobfuscated_jars/deobfu_1.16.5.jar"))
    val version: String = (project.properties["mcversion"] ?: "1.16.5") as String
   runtimeOnly(files("../Deobfuscator/deobfuscated_jars/deobfu_$version.jar"))
}