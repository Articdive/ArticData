plugins {
    id("application")
}
dependencies {
    implementation(project(":CodeGenerator:core"))
}

application {
    mainClass.set("com.minestom.code_generator.CodeGenerator")
}