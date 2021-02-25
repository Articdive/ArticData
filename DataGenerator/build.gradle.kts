group = "com.minestom.data_generator"

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
    dependencies {
        val implementation by configurations
        val testImplementation by configurations
        val testRuntimeOnly by configurations

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