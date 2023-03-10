# ArticData

[![license](https://img.shields.io/github/license/Articdive/ArticData.svg)](../LICENSE)
[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg)](https://github.com/RichardLitt/standard-readme)

This is a data extractor and generator for Minecraft.

It works in the JVM 16 (or higher) environment it takes advantage of [Gradle](https://gradle.org/) and is written in
Java. The generators for this data are located [here](https://github.com/Articdive/ArticDataGenerator).

## Table of Contents

- [Install](#install)
- [Usage](#usage)
- [Supported Data](#supported-data)
    - [Attributes](#attributes)
    - [Biomes](#biomes)
    - [Blocks](#blocks)
    - [Block Entities](#block-entities)
    - [Block Properties](#block-properties)
    - [Commands](#commands)
    - [Custom Statistics](#custom-statistics)
    - [Dimension Types](#dimension-types)
    - [Dye Colors](#dye-colors)
    - [Enchantments](#enchantments)
    - [Entities](#entities)
    - [Entity Data Serializers](#entity-data-serializers)
    - [Fluids](#fluids)
    - [Fluid Properties](#fluid-properties)
    - [Map Colors](#map-colors)
    - [Items](#items)
    - [Potion Effects](#potion-effects)
    - [Packets](#packets)
    - [Particles](#particles)
    - [Potions](#potions)
    - [Recipes](#recipes)
    - [Sounds](#sounds)
    - [Sound Sources](#sound-sources)
    - [Villager Professions](#villager-professions)
    - [Villager Types](#villager-types)
- [Maintainers](#maintainers)
- [Contributing](#contributing)
- [License](#license)

## Install

### Maven and Gradle

To add ArticData (not the generators!) to your project using [Maven](http://maven.apache.org/)
or [Gradle](https://gradle.org/):

Adding to a Maven Project:

```xml
<dependencies>
    <dependency>
        <groupId>de.articdive</groupId>
        <artifactId>articdata</artifactId>
        <version>1.16.5-90b60617</version>
    </dependency>
</dependencies>
```

Adding to a Gradle Project (Kotlin DSL)

```kotlin
repositories {
    mavenCentral()
}
dependencies {
    implementation("de.articdive:articdata:1.16.5-90b60617")
}
```

## Usage

The repository artifacts include the data located [here](https://github.com/Articdive/ArticData).

They include JSON files full of useful data to do with Minecraft.

## Supported Data
We emit data in two ways:
- One JSON Object with namespaced identifiers as keys for json objects. [Example](https://raw.githubusercontent.com/Articdive/ArticData/1.17.1/1_17_1_blocks.json)
- One JSON Array with many json objects. [Example](https://raw.githubusercontent.com/Articdive/ArticData/1.17.1/1_17_1_map_colors.json)

If you require any data, open a GitHub Issue and specify the data you need.

WARNING: There is no guarantee that the format of the data will stay the same.

### Attributes

|       Data Type        |     Supported?      |
|:----------------------:|:-------------------:|
|      Protocol ID       | :heavy_check_mark:  |
|      Namespace ID      | :heavy_check_mark:  |
|      Mojang Name       | :heavy_check_mark:  |
|    Translation Key     | :heavy_check_mark:  |
|     Default Value      | :heavy_check_mark:  |
| Client Synchronization | :heavy_check_mark:  |
|    Attribute Range     | :heavy_check_mark:  |

### Biomes

|       Data Type        |     Supported?      |
|:----------------------:|:-------------------:|
|      Namespace ID      | :heavy_check_mark:  |
|      Mojang Name       | :heavy_check_mark:  |
|        Humidity        | :heavy_check_mark:  |
|         Scale          | :heavy_check_mark:  |
|         Depth          | :heavy_check_mark:  |
|      Temperature       | :heavy_check_mark:  |
|     Percipitation      | :heavy_check_mark:  |
|        Downfall        | :heavy_check_mark:  |
|       Fog Color        | :heavy_check_mark:  |
|      Water Color       | :heavy_check_mark:  |
|    Water Fog Color     | :heavy_check_mark:  |
|       Sky Color        | :heavy_check_mark:  |
|      Grass Color       | :heavy_check_mark:  |
|  Grass Color Modifier  | :heavy_check_mark:  |
|     Foliage Color      | :heavy_check_mark:  |
| Foliage Color Override | :heavy_check_mark:  |
|        Category        | :heavy_check_mark:  |

### Blocks

|          Data Type           |     Supported?      |
|:----------------------------:|:-------------------:|
|         Protocol ID          | :heavy_check_mark:  |
|         Namespace ID         | :heavy_check_mark:  |
|         Mojang Name          | :heavy_check_mark:  |
|       Translation Key        | :heavy_check_mark:  |
|        Loot Table Key        | :heavy_check_mark:  |
|         Block States         | :heavy_check_mark:  |
|    BlockState Properties     | :heavy_check_mark:  |
|        Block Entities        | :heavy_check_mark:  |
|           Hardness           | :heavy_check_mark:  |
|     Explosion Resistance     | :heavy_check_mark:  |
|           Friction           | :heavy_check_mark:  |
|     Speed & Jump Factor      | :heavy_check_mark:  |
|     Default Block State      | :heavy_check_mark:  |
|      Corresponding Item      | :heavy_check_mark:  |
|   Corresponding Map Color    | :heavy_check_mark:  |
| Solid, Liquid, Blocking etc. | :heavy_check_mark:  |
|     Piston Push Reaction     | :heavy_check_mark:  |
|           Gravity            | :heavy_check_mark:  |
|      Respawn Eligiblity      | :heavy_check_mark:  |
|    Tool Require For Drops    | :heavy_check_mark:  |
|    Large Collision Shape     | :heavy_check_mark:  |
|  Collision Shape Full Block  | :heavy_check_mark:  |
|          Occlusion           | :heavy_check_mark:  |
|            Hitbox            | :heavy_check_mark:  |
|       Collision Hitbox       | :heavy_check_mark:  |
|      Interaction Hitbox      | :heavy_check_mark:  |
|       Occlusion Hitbox       | :heavy_check_mark:  |
|        Visual Hitbox         | :heavy_check_mark:  |
|        Dynamic Shape         | :heavy_check_mark:  |
|         Solid Render         | :heavy_check_mark:  |
|        Light Emission        | :heavy_check_mark:  |
|         Light Block          | :heavy_check_mark:  |
|   Propagates Skylight Down   | :heavy_check_mark:  |
|  Shape for Light Occlusion   | :heavy_check_mark:  |
|           Opacity            | :heavy_check_mark:  |
|     Conditional Opacity      | :heavy_check_mark:  |
|         Render Shape         | :heavy_check_mark:  |
|      Sound Information       | :heavy_check_mark:  |

### Block Entities

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |
|  Block IDs   | :heavy_check_mark:  |

### Block Properties

|    Data Type    |     Supported?      |
|:---------------:|:-------------------:|
|   Mojang Name   | :heavy_check_mark:  |
|       Key       | :heavy_check_mark:  |
| Possible Values | :heavy_check_mark:  |

### Commands

|      Data Type      |     Supported?      |           Description            |
|:-------------------:|:-------------------:|:--------------------------------:|
| Entire Command Tree | :heavy_check_mark:  | See https://wiki.vg/Command_Data |

### Custom Statistics

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |

### Dimension Types

|      Data Type       |     Supported?      |
|:--------------------:|:-------------------:|
|     Namespace ID     | :heavy_check_mark:  |
|      Bed Works       | :heavy_check_mark:  |
|   Coordinate Scale   | :heavy_check_mark:  |
|    Ceiling Height    | :heavy_check_mark:  |
|      Fixed Time      | :heavy_check_mark:  |
|        Raids         | :heavy_check_mark:  |
|      Sky Light       | :heavy_check_mark:  |
|     Piglin Safe      | :heavy_check_mark:  |
|    Logical Height    | :heavy_check_mark:  |
|       Natural        | :heavy_check_mark:  |
|      Ultra Warm      | :heavy_check_mark:  |
| Respawn Anchor Works | :heavy_check_mark:  |

### Dye Colors

|            Data Type             |     Supported?      |
|:--------------------------------:|:-------------------:|
|           Protocol ID            | :heavy_check_mark:  |
|           Mojang Name            | :heavy_check_mark:  |
|      Color (Material Color)      | :heavy_check_mark:  |
|     Firework Color (Decimal)     | :heavy_check_mark:  |
|       Text Color (Decimal)       | :heavy_check_mark:  |
|  TextureDiffuseColor (Decimal)   | :heavy_check_mark:  |
| TextureDiffuseColorBGR (Decimal) | :heavy_check_mark:  |
|       TextureDiffuseColors       | :heavy_check_mark:  |

### Enchantments

|         Data Type         |     Supported?      |
|:-------------------------:|:-------------------:|
|        Protocol ID        | :heavy_check_mark:  |
|       Namespace ID        | :heavy_check_mark:  |
|        Mojang Name        | :heavy_check_mark:  |
|      Translation Key      | :heavy_check_mark:  |
|         Max Level         | :heavy_check_mark:  |
|          Rarity           | :heavy_check_mark:  |
|           Curse           | :heavy_check_mark:  |
|       Discoverable        | :heavy_check_mark:  |
|         Tradeable         | :heavy_check_mark:  |
|       Treasure Only       | :heavy_check_mark:  |
|         Category          | :heavy_check_mark:  |
| Incompatible Enchantments | :heavy_check_mark:  |

### Entities

|        Data Type        |     Supported?      |
|:-----------------------:|:-------------------:|
|       Protocol ID       | :heavy_check_mark:  |
|      Namespace ID       | :heavy_check_mark:  |
|       Mojang Name       | :heavy_check_mark:  |
|     Translation Key     | :heavy_check_mark:  |
|     Loot Table Key      | :heavy_check_mark:  |
| Entity Data Packet Info | :heavy_check_mark:  |
|       Packet Type       | :heavy_check_mark:  |
|      Fire Immunity      | :heavy_check_mark:  |
|         Height          | :heavy_check_mark:  |
|          Width          | :heavy_check_mark:  |
|  Client Tracking Range  | :heavy_check_mark:  |

### Entity Data Serializers

|  Data Type  |     Supported?      |
|:-----------:|:-------------------:|
| Protocol ID | :heavy_check_mark:  |
| Mojang Name | :heavy_check_mark:  |

### Fluids

|         Data Type         |     Supported?      |
|:-------------------------:|:-------------------:|
|        Protocol ID        | :heavy_check_mark:  |
|       Namespace ID        | :heavy_check_mark:  |
|        Mojang Name        | :heavy_check_mark:  |
| Corresponding Bucket Item | :heavy_check_mark:  |

### Fluid Properties

| Data Type | Supported? |
|:---------:|:----------:|


### Map Colors

|    Data Type    |     Supported?      |
|:---------------:|:-------------------:|
|   Protocol ID   | :heavy_check_mark:  |
|   Mojang Name   | :heavy_check_mark:  |
| Color (Decimal) | :heavy_check_mark:  |

### Items

|        Data Type        |     Supported?      |
|:-----------------------:|:-------------------:|
|       Protocol ID       | :heavy_check_mark:  |
|      Namespace ID       | :heavy_check_mark:  |
|       Mojang Name       | :heavy_check_mark:  |
|     Translation Key     | :heavy_check_mark:  |
|        Depletes         | :heavy_check_mark:  |
|     Max Stack Size      | :heavy_check_mark:  |
| Max Damage (Durability) | :heavy_check_mark:  |
|         Edible          | :heavy_check_mark:  |
|     Fire Resistant      | :heavy_check_mark:  |
|   Corresponding Block   | :heavy_check_mark:  |
| Eating & Drinking Sound | :heavy_check_mark:  |
|     Food Properties     | :heavy_check_mark:  |
|    Armor Properties     | :heavy_check_mark:  |
|  Spawn Egg Properties   | :heavy_check_mark:  |
|     Tool Properties     | :heavy_check_mark:  |
|    Bucket Properties    | :heavy_check_mark:  |
|     Dye Properties      | :heavy_check_mark:  |

### Potion Effects

|    Data Type    |     Supported?      |
|:---------------:|:-------------------:|
|   Protocol ID   | :heavy_check_mark:  |
|  Namespace ID   | :heavy_check_mark:  |
|   Mojang Name   | :heavy_check_mark:  |
| Color (Decimal) | :heavy_check_mark:  |
|  Instanteneous  | :heavy_check_mark:  |

### Packets

|    Data Type     |     Supported?      |
|:----------------:|:-------------------:|
|    Packet ID     | :heavy_check_mark:  |
| Packet Classname | :heavy_check_mark:  |
| Packet Direction | :heavy_check_mark:  |
| Connection State | :heavy_check_mark:  |

### Particles

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |

### Potions

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |

### Recipes

|  Data Type  |     Supported?      |
|:-----------:|:-------------------:|
|  Mojang ID  | :heavy_check_mark:  |
| Recipe Type | :heavy_check_mark:  |
|   Layout    | :heavy_check_mark:  |
|   Recipe    | :heavy_check_mark:  |
|   Result    | :heavy_check_mark:  |

### Sounds

|    Data Type    |     Supported?      |
|:---------------:|:-------------------:|
|   Protocol ID   | :heavy_check_mark:  |
|  Namespace ID   | :heavy_check_mark:  |
|   Mojang Name   | :heavy_check_mark:  |
| Translation Key | :heavy_check_mark:  |

### Sound Sources

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
|     Type     | :heavy_check_mark:  |

### Villager Professions

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |
|  Work Sound  | :heavy_check_mark:  |

### Villager Types

|  Data Type   |     Supported?      |
|:------------:|:-------------------:|
| Protocol ID  | :heavy_check_mark:  |
| Namespace ID | :heavy_check_mark:  |
| Mojang Name  | :heavy_check_mark:  |


## Maintainers

[@Articdive](https://www.github.com/Articdive/)

## Contributing

See [the contributing file](https://github.com/Articdive/ArticDataGenerator/blob/main/.github/CONTRIBUTING.md)!

## License
Data is licensed under the [Minecraft EULA](https://account.mojang.com/documents/minecraft_eula).
The rest (Format, Generators, etc.) is licensed under the [MIT License © Articdive](../LICENSE).