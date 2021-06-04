dependencies {
    compileOnly(files("../../Deobfuscator/deobfuscated_jars/deobfu_1.16.5.jar"))
    implementation(project(":DataGenerator:core"))
}