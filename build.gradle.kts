plugins {
    id("maven-publish")
    signing
}

tasks {
    register<Jar>("packageVersion") {
        archiveBaseName.set("articdata")
        archiveVersion.set("1.17-d451cb01")

        destinationDirectory.set(layout.buildDirectory.dir("dist"))
        from(project.rootProject.rootDir)
        // Exclude any gradle files
        exclude("/.gradle/", "/build/", "/gradle/", "/gradlew", "/gradlew.bat", "/build.gradle.kts", "/settings.gradle.kts", "/.github", "/LICENSE")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "de.articdive"
            artifactId = "articdata"
            version = "1.17-d451cb01"

            pom {
                name.set("ArticData")
                description.set("Collection of data extracted from Minecraft.")
                url.set("https://github.com/Articdive/ArticData")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("http://www.opensource.org/licenses/mit-license.php")
                    }
                }
                developers {
                    developer {
                        id.set("Articdive")
                        name.set("Articdive")
                    }
                }
                scm {
                    connection.set("scm:git:github.com/Articdive/ArticData.git")
                    developerConnection.set("scm:git:ssh://github.com/Articdive/ArticData.git")
                    url.set("https://github.com/Articdive/ArticData/tree/1.17")
                }
            }

            artifact(tasks.getByName("packageVersion"))
        }
    }
    repositories {
        maven {
            credentials {
                username = System.getenv()["SONATYPE_USERNAME"] ?: (if (hasProperty("SONATYPE_USERNAME")) (property("SONATYPE_USERNAME") as String) else "")
                password = System.getenv()["SONATYPE_PASSWORD"] ?: (if (hasProperty("SONATYPE_PASSWORD")) (property("SONATYPE_PASSWORD") as String) else "")
            }
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
        }
    }
    signing {
        if (System.getenv()["CI"] != null) {
            useInMemoryPgpKeys(System.getenv()["SIGNING_KEY"], System.getenv()["SIGNING_PASSWORD"])
            // Only attempt to sign if we are in the CI.
            // If you are publishing to maven local then it doesn't need signing.
            sign(publishing.publications["maven"])
        }
    }
}