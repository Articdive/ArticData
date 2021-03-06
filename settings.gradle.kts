rootProject.name = "MinestomDataGenerator"
include("Deobfuscator")
include("DataGenerator")

include("DataGenerator:core")
findProject(":DataGenerator:core")?.name = "core"

include("DataGenerator:1.16.5")
findProject(":DataGenerator:1.16.5")?.name = "1.16.5"
include("DataGenerator:21w08b")
findProject(":DataGenerator:21w08b")?.name = "21w08b"

