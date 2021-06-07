rootProject.name = "DataGenerator"
include("Deobfuscator")
// DataGenerator
include("DataGenerator")
// DataPublisher
include("DataPublisher")

include("DataGenerator:core")
findProject(":DataGenerator:core")?.name = "core"

include("DataGenerator:1.16.5")
findProject(":DataGenerator:1.16.5")?.name = "1.16.5"

include("DataGenerator:1.17-rc1")
findProject(":DataGenerator:1.17-rc1")?.name = "1.17-rc1"