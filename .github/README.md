# ArticData

[![license](https://img.shields.io/github/license/Articdive/ArticData.svg)](../LICENSE)
[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg)](https://github.com/RichardLitt/standard-readme)
[![Discord Shield](https://discordapp.com/api/guilds/706185253441634317/widget.png?style=shield)](https://discord.gg/JnksJCFkE4)

This is a data extractor and generator for Minecraft.

It works in the JVM 16 (or higher) environment it takes advantage of [Gradle](https://gradle.org/) and is written in
Java.

## Table of Contents

- [Install](#install)
- [Usage](#usage)
- [Supported Data](#supported-data)
    - [Attributes](#attributes)
    - [Biomes](#biomes)
    - [Blocks](#blocks)
    - [Custom Statistics](#custom-statistics)
    - [Enchantments](#enchantments)
    - [Entities](#entities)
    - [Entity Data Serializers](#entity-data-serializers)
    - [Fluids](#fluids)
    - [Game Events](#game-events)
    - [Items](#items)
    - [Map Colors](#map-colors)
    - [Particles](#particles)
    - [Potion Effects](#potion-status-effects)
    - [Potions](#potions)
    - [Sounds](#soundevents)
    - [Sound Sources](#sound-sources)
    - [Villager Professions](#villager-professions)
    - [Villager Types](#villager-types)
- [Maintainers](#maintainers)
- [Contributing](#contributing)
- [License](#license)

## Install

### Maven and Gradle

To add ArticData (not the generator) to your project using [Maven](http://maven.apache.org/)
or [Gradle](https://gradle.org/):

Repository (Maven):

```
<repository>
    <id>minestom-repo</id>
    <url>https://repo.minestom.com/repository/maven-public/</url>
</repository>
```

Dependency (Maven):

```
<dependency>
    <groupId>de.articdive</groupId>
    <artifactId>articdata</artifactId>
    <version>1.16.5</version>
</dependency>
```

Repository (Gradle Kotlin DSL)

```
repositories {
    maven {
        name = "minestom-repo"
        url = uri("https://repo.minestom.com/repository/maven-public/")
    }
}
```

Dependency (Gradle Kotlin DSL)

```
dependencies {
    implementation("de.articdive:articdata:1.16.5")
}
```

## Usage

The repository artifacts include the data located [here](../Articdata)

They include JSON files full of useful data to do with Minecraft.

## Supported Data
We emit data in two ways:
- One JSON Object with namespaced identifiers as keys for json objects. [Example](../Articdata/1.17/1_17_blocks.json)
- One JSON Array with many json objects. [Example](../Articdata/1.17/1_17_map_colors.json)

If you require any data, open a GitHub Issue and specify the data you need.

WARNING: There is no guarantee that the format of the data will stay the same.

### Attributes

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Translation Key           | :heavy_check_mark: | 1.16+        |
| Default Value             | :heavy_check_mark: | 1.16+        |
| Client Synchronization    | :heavy_check_mark: | 1.16+        |
| Attribute range           | :heavy_check_mark: | 1.16+        |

### Biomes

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Humidity                  | :heavy_check_mark: | 1.16+        |
| Scale                     | :heavy_check_mark: | 1.16+        |
| Depth                     | :heavy_check_mark: | 1.16+        |
| Temperature               | :heavy_check_mark: | 1.16+        |
| Percipitation             | :heavy_check_mark: | 1.16+        |
| Downfall                  | :heavy_check_mark: | 1.16+        |
| Category                  | :heavy_check_mark: | 1.16+        |
| Fog Color                 | :heavy_check_mark: | 1.16+        |
| Water Color               | :heavy_check_mark: | 1.16+        |
| Water Fog Color           | :heavy_check_mark: | 1.16+        |
| Sky Color                 | :heavy_check_mark: | 1.16+        |
| Grass Color               | :heavy_check_mark: | 1.16+        |
| Foliage Color             | :heavy_check_mark: | 1.16+        |

### Blocks

| Data Type                  | Supported?         | Versions     |
| :------------------------: | ------------------ | :----------: |
| Protocol ID                | :heavy_check_mark: | 1.16+        |
| Namespace ID               | :heavy_check_mark: | 1.16+        |
| Mojang Name                | :heavy_check_mark: | 1.16+        |
| Translation Key            | :heavy_check_mark: | 1.16+        |
| Loot Table Key             | :heavy_check_mark: | 1.16+        |
| Block States               | :heavy_check_mark: | 1.16+        |
| Block (State) Properties   | :heavy_check_mark: | 1.16+        |
| Block Entities             | :heavy_check_mark: | 1.16+        |
| Hardness                   | :heavy_check_mark: | 1.16+        |
| Explosion Resistance       | :heavy_check_mark: | 1.16+        |
| Friction                   | :heavy_check_mark: | 1.16+        |
| Speed & Jump Factor        | :heavy_check_mark: | 1.16+        |
| Default Block State        | :heavy_check_mark: | 1.16+        |
| Corresponding Item         | :heavy_check_mark: | 1.16+        |
| Corresponding Map Color    | :heavy_check_mark: | 1.16+        |
| Solid, Liquid, Blocking    | :heavy_check_mark: | 1.16+        |
| Piston Push Reaction       | :heavy_check_mark: | 1.16+        |
| Gravity                    | :heavy_check_mark: | 1.16+        |
| Respawn Eligibility        | :heavy_check_mark: | 1.16+        |
| Tool Required For Drops    | :heavy_check_mark: | 1.16+        |

#### Block Hitboxes, Shapes, Light Data, Opacity
| Large Collision Shape      | :heavy_check_mark: | 1.16+        |
| Collision Shape Full Block | :heavy_check_mark: | 1.16+        |
| Occlusion                  | :heavy_check_mark: | 1.16+        |
| Hitbox                     | :heavy_check_mark: | 1.16+        |
| Collision Hitbox           | :heavy_check_mark: | 1.16+        |
| Interaction Hitbox         | :heavy_check_mark: | 1.16+        |
| Occlusion Hitbox           | :heavy_check_mark: | 1.16+        |
| Visual Hitbox              | :heavy_check_mark: | 1.16+        |
| Dynamic Shape              | :heavy_check_mark: | 1.16+        |
| Solid Render               | :heavy_check_mark: | 1.16+        |
| Light Emission             | :heavy_check_mark: | 1.16+        |
| Light Block                | :heavy_check_mark: | 1.16+        |
| Propagates Skylight Down   | :heavy_check_mark: | 1.16+        |
| Shape for Light Occlusion  | :heavy_check_mark: | 1.16+        |
| Opacity                    | :heavy_check_mark: | 1.16+        |
| Conditionally Opaque       | :heavy_check_mark: | 1.16+        |

### Block Entities

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Block IDs                 | :heavy_check_mark: | 1.16+        |

### Custom Statistics

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |

### Dimension Types

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Bed Works                 | :heavy_check_mark: | 1.16+        |
| Coordinate Scale          | :heavy_check_mark: | 1.16+        |
| Ceiling                   | :heavy_check_mark: | 1.16+        |
| Fixed Time                | :heavy_check_mark: | 1.16+        |
| Raids                     | :heavy_check_mark: | 1.16+        |
| Sky Light                 | :heavy_check_mark: | 1.16+        |
| Piglin Safe               | :heavy_check_mark: | 1.16+        |
| Logical Height            | :heavy_check_mark: | 1.16+        |
| Natural                   | :heavy_check_mark: | 1.16+        |
| Ultra Warm                | :heavy_check_mark: | 1.16+        |
| Respawn Anchor Works      | :heavy_check_mark: | 1.16+        |
| MinY                      | :heavy_check_mark: | 1.17+        |
| Height                    | :heavy_check_mark: | 1.17+        |

### Enchantments

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Translation Key           | :heavy_check_mark: | 1.16+        |
| Max Level                 | :heavy_check_mark: | 1.16+        |
| Rarity                    | :heavy_check_mark: | 1.16+        |
| Curse                     | :heavy_check_mark: | 1.16+        |
| Discoverable              | :heavy_check_mark: | 1.16+        |
| Tradeable                 | :heavy_check_mark: | 1.16+        |
| Treasure Only             | :heavy_check_mark: | 1.16+        |
| Category                  | :heavy_check_mark: | 1.16+        |
| Incompatible Enchantments | :heavy_check_mark: | 1.16+        |

### Entities

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Translation Key           | :heavy_check_mark: | 1.16+        |
| Loot Table Key            | :heavy_check_mark: | 1.16+        |
| Entity Data Packet Info   | :heavy_check_mark: | 1.16+        |
| Entity Data Serializers   | :heavy_check_mark: | 1.16+        |
| Packet Type               | :heavy_check_mark: | 1.16+        |
| Fire Immune               | :heavy_check_mark: | 1.16+        |
| Height                    | :heavy_check_mark: | 1.16+        |
| Width                     | :heavy_check_mark: | 1.16+        |
| Client Tracking Range     | :heavy_check_mark: | 1.16+        |

### Entity Data Serializers

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |

### Fluids

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Bucket Item               | :heavy_check_mark: | 1.16+        |

### Game Events

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.17+        |
| Notification Radius       | :heavy_check_mark: | 1.17+        |

### Items

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Translation Key           | :heavy_check_mark: | 1.16+        |
| Useable (Depletes)        | :heavy_check_mark: | 1.16+        |
| Max Stack Size            | :heavy_check_mark: | 1.16+        |
| Max Damage (Durability)   | :heavy_check_mark: | 1.16+        |
| Edible                    | :heavy_check_mark: | 1.16+        |
| Food Properties           | :heavy_check_mark: | 1.16+        |
| Fire Resistant            | :heavy_check_mark: | 1.16+        |
| Corresponding Block       | :heavy_check_mark: | 1.16+        |
| Eating & Drinking Sound   | :heavy_check_mark: | 1.16+        |
| Armor Properties          | :heavy_check_mark: | 1.16+        |

### Map Colors

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Color (Decimal value)     | :heavy_check_mark: | 1.16+        |

### Particles

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |

### Potion (Status) Effects

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Color (Decimal value)     | :heavy_check_mark: | 1.16+        |
| Instantenous              | :heavy_check_mark: | 1.16+        |

### Potions

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |

### SoundEvents

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Translation Key (ID Path) | :heavy_check_mark: | 1.16+        |

### Sound Sources

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Type                      | :heavy_check_mark: | 1.16+        |

### Villager professions

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |
| Work Sound                | :heavy_check_mark: | 1.16+        |

### Villager types

| Data Type                 | Supported?         | Versions     |
| :-----------------------: | ------------------ | :----------: |
| Protocol ID               | :heavy_check_mark: | 1.16+        |
| Namespace ID              | :heavy_check_mark: | 1.16+        |
| Mojang Name               | :heavy_check_mark: | 1.16+        |

## Maintainers

[@Articdive](https://www.github.com/Articdive/)

## Contributing

See [the contributing file](CONTRIBUTING.md)!

## License

[MIT License © Lukas Mansour (Articdive) ](../LICENSE)