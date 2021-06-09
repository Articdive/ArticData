plugins {
    id("maven-publish")
}

val dataDir: File = project.rootProject.file("Minestom-data")
val verFolders: List<File> =
    dataDir.listFiles()?.filterNotNull()?.filter { file -> file.isDirectory } ?: emptyList()

tasks {
    for (verFolder in verFolders) {
        // the version folder name is the version, e.g. 1.16.5
        val mcV = verFolder.name
        // packageVersion_full_1.16.5
        register<Jar>("packageVersions_full_$mcV") {
            archiveBaseName.set("minestom-data-full")
            archiveVersion.set(mcV)


            destinationDirectory.set(layout.buildDirectory.dir("dist"))
            from(verFolder)
        }
        // packageVersion_customizable_1.16.5
//        register<Jar>("packageVersions_customizable_$mcV") {
//            archiveBaseName.set("minestom-data-customizable")
//            archiveVersion.set(mcV)
//            // Exclude meta inf
//            manifest = null
//
//            destinationDirectory.set(layout.buildDirectory.dir("dist"))
//            // TODO: Add filter for only customizable data
//            from(verFolder)
//        }
    }
}

publishing {
    publications {
        for (verFolder in verFolders) {
            // the version folder name is the version, e.g. 1.16.5
            val mcV = verFolder.name

            // Full
            create<MavenPublication>("packageVersions_full_$mcV") {
                groupId = "net.minestom"
                artifactId = "minestom-data-full"
                version = mcV

                artifact(tasks.getByName("packageVersions_full_$mcV"))
            }
//            // Customizable
//            create<MavenPublication>("packageVersions_customizable_$mcV") {
//                groupId = "net.minestom"
//                artifactId = "minestom-data-customizable"
//                version = mcV
//
//                artifact(tasks.getByName("packageVersions_customizable_$mcV"))
//            }
        }
    }
    repositories {
        maven {
            name = "minestom-repo"
            url = uri("https://repo.minestom.com/repository/maven-public")
            credentials {
                username = System.getenv("MINESTOM_REPO_CREDS_USR")
                password = System.getenv("MINESTOM_REPO_CREDS_PSW")
            }
        }
    }
}