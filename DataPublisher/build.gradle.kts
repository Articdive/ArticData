plugins {
    id("maven-publish")
}

val dataDir: File = project.rootProject.file("Articdata")
val supportedVersions = project.properties["supportedVersions"].toString().split(",").map(String::trim)

tasks {
    for (mcVersion in supportedVersions) {
        // packageVersion_full_1.16.5
        register<Jar>("packageVersions_full_$mcVersion") {
            archiveBaseName.set("articdata")
            archiveVersion.set(mcVersion)


            destinationDirectory.set(layout.buildDirectory.dir("dist"))
            from(dataDir.resolve(mcVersion))
        }
    }
}

publishing {
    publications {
        for (mcVersion in supportedVersions) {
            // Full
            create<MavenPublication>("V$mcVersion") {
                groupId = "de.articdive"
                artifactId = "articdata"
                version = mcVersion

                artifact(tasks.getByName("packageVersions_full_$mcVersion"))
            }
        }
    }
    repositories {
        maven {
            name = "minestom-repo"
            url = uri("https://repo.minestom.net/repository/maven-public")
            credentials {
                username = System.getenv("MINESTOM_REPO_CREDS_USR")
                password = System.getenv("MINESTOM_REPO_CREDS_PSW")
            }
        }
    }
}