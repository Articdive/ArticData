rootProject.name = "MinestomDataGenerator"
include("Deobfuscator")
include("DataGenerator")

include("DataGenerator:common")
findProject(":DataGenerator:common")?.name = "common"


include("DataGenerator:1.16.5")
findProject(":DataGenerator:1.16.5")?.name = "1.16.5"
