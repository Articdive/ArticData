dependencies {
    compileOnly(files("../../Deobfuscator/deobfuscated_jars/deobfu_1.17-pre4.jar"))
    implementation(project(":DataGenerator:1.16.5"))
    implementation(project(":DataGenerator:core"))
}