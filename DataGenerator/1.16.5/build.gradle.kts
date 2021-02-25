plugins {
    id("application")
}

application {
    mainClass.set("com.minestom.data_generator.DataGenerator")
}

dependencies {
    implementation(files("../../Deobfuscator/deobfuscated_jars/deobfu_1.16.5.jar"))
    implementation(project(":DataGenerator:common"))
}
