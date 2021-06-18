plugins {
    id("maven-publish")
}

val dataDir: File = project.rootProject.file("Articdata")
val verFolders: List<File> =
    dataDir.listFiles()?.filterNotNull()?.filter { file -> file.isDirectory } ?: emptyList()

tasks {
    for (verFolder in verFolders) {
        // the version folder name is the version, e.g. 1.16.5
        val mcV = verFolder.name
        // packageVersion_full_1.16.5
        register<Jar>("packageVersions_full_$mcV") {
            archiveBaseName.set("articdata")
            archiveVersion.set(mcV)


            destinationDirectory.set(layout.buildDirectory.dir("dist"))
            from(verFolder)
        }
    }
}

publishing {
    publications {
        for (verFolder in verFolders) {
            // the version folder name is the version, e.g. 1.16.5
            val mcV = verFolder.name

            // Full
            create<MavenPublication>("packageVersions_full_$mcV") {
                groupId = "de.articdive"
                artifactId = "articdata"
                version = mcV

                artifact(tasks.getByName("packageVersions_full_$mcV"))
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