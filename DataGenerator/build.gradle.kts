group = "com.minestom.data_generator"

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
    dependencies {
        val compileOnly by configurations
        val implementation by configurations
        val testImplementation by configurations
        val testRuntimeOnly by configurations

        // Jetbrains annotations
        compileOnly("org.jetbrains:annotations:20.1.0")

        // Logging
        implementation("org.apache.logging.log4j:log4j-core:2.14.0")
        // SLF4J is the base logger for most libraries, therefore we can hook it into log4j2.
        implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")

        // JUnit testing framework
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    }
    tasks {
        getByName<Test>("test") {
            useJUnitPlatform()
        }
    }
}