package net.minestom.server.instance.block;

import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import net.minestom.server.instance.block.states.AcaciaButton;
import net.minestom.server.instance.block.states.AcaciaDoor;
import net.minestom.server.instance.block.states.AcaciaFence;
import net.minestom.server.instance.block.states.AcaciaFenceGate;
import net.minestom.server.instance.block.states.AcaciaLeaves;
import net.minestom.server.instance.block.states.AcaciaLog;
import net.minestom.server.instance.block.states.AcaciaPlanks;
import net.minestom.server.instance.block.states.AcaciaPressurePlate;
import net.minestom.server.instance.block.states.AcaciaSapling;
import net.minestom.server.instance.block.states.AcaciaSign;
import net.minestom.server.instance.block.states.AcaciaSlab;
import net.minestom.server.instance.block.states.AcaciaStairs;
import net.minestom.server.instance.block.states.AcaciaTrapdoor;
import net.minestom.server.instance.block.states.AcaciaWallSign;
import net.minestom.server.instance.block.states.AcaciaWood;
import net.minestom.server.instance.block.states.ActivatorRail;
import net.minestom.server.instance.block.states.Air;
import net.minestom.server.instance.block.states.Allium;
import net.minestom.server.instance.block.states.AncientDebris;
import net.minestom.server.instance.block.states.Andesite;
import net.minestom.server.instance.block.states.AndesiteSlab;
import net.minestom.server.instance.block.states.AndesiteStairs;
import net.minestom.server.instance.block.states.AndesiteWall;
import net.minestom.server.instance.block.states.Anvil;
import net.minestom.server.instance.block.states.AttachedMelonStem;
import net.minestom.server.instance.block.states.AttachedPumpkinStem;
import net.minestom.server.instance.block.states.AzureBluet;
import net.minestom.server.instance.block.states.Bamboo;
import net.minestom.server.instance.block.states.BambooSapling;
import net.minestom.server.instance.block.states.Barrel;
import net.minestom.server.instance.block.states.Barrier;
import net.minestom.server.instance.block.states.Basalt;
import net.minestom.server.instance.block.states.Beacon;
import net.minestom.server.instance.block.states.Bedrock;
import net.minestom.server.instance.block.states.BeeNest;
import net.minestom.server.instance.block.states.Beehive;
import net.minestom.server.instance.block.states.Beetroots;
import net.minestom.server.instance.block.states.Bell;
import net.minestom.server.instance.block.states.BirchButton;
import net.minestom.server.instance.block.states.BirchDoor;
import net.minestom.server.instance.block.states.BirchFence;
import net.minestom.server.instance.block.states.BirchFenceGate;
import net.minestom.server.instance.block.states.BirchLeaves;
import net.minestom.server.instance.block.states.BirchLog;
import net.minestom.server.instance.block.states.BirchPlanks;
import net.minestom.server.instance.block.states.BirchPressurePlate;
import net.minestom.server.instance.block.states.BirchSapling;
import net.minestom.server.instance.block.states.BirchSign;
import net.minestom.server.instance.block.states.BirchSlab;
import net.minestom.server.instance.block.states.BirchStairs;
import net.minestom.server.instance.block.states.BirchTrapdoor;
import net.minestom.server.instance.block.states.BirchWallSign;
import net.minestom.server.instance.block.states.BirchWood;
import net.minestom.server.instance.block.states.BlackBanner;
import net.minestom.server.instance.block.states.BlackBed;
import net.minestom.server.instance.block.states.BlackCarpet;
import net.minestom.server.instance.block.states.BlackConcrete;
import net.minestom.server.instance.block.states.BlackConcretePowder;
import net.minestom.server.instance.block.states.BlackGlazedTerracotta;
import net.minestom.server.instance.block.states.BlackShulkerBox;
import net.minestom.server.instance.block.states.BlackStainedGlass;
import net.minestom.server.instance.block.states.BlackStainedGlassPane;
import net.minestom.server.instance.block.states.BlackTerracotta;
import net.minestom.server.instance.block.states.BlackWallBanner;
import net.minestom.server.instance.block.states.BlackWool;
import net.minestom.server.instance.block.states.Blackstone;
import net.minestom.server.instance.block.states.BlackstoneSlab;
import net.minestom.server.instance.block.states.BlackstoneStairs;
import net.minestom.server.instance.block.states.BlackstoneWall;
import net.minestom.server.instance.block.states.BlastFurnace;
import net.minestom.server.instance.block.states.BlueBanner;
import net.minestom.server.instance.block.states.BlueBed;
import net.minestom.server.instance.block.states.BlueCarpet;
import net.minestom.server.instance.block.states.BlueConcrete;
import net.minestom.server.instance.block.states.BlueConcretePowder;
import net.minestom.server.instance.block.states.BlueGlazedTerracotta;
import net.minestom.server.instance.block.states.BlueIce;
import net.minestom.server.instance.block.states.BlueOrchid;
import net.minestom.server.instance.block.states.BlueShulkerBox;
import net.minestom.server.instance.block.states.BlueStainedGlass;
import net.minestom.server.instance.block.states.BlueStainedGlassPane;
import net.minestom.server.instance.block.states.BlueTerracotta;
import net.minestom.server.instance.block.states.BlueWallBanner;
import net.minestom.server.instance.block.states.BlueWool;
import net.minestom.server.instance.block.states.BoneBlock;
import net.minestom.server.instance.block.states.Bookshelf;
import net.minestom.server.instance.block.states.BrainCoral;
import net.minestom.server.instance.block.states.BrainCoralBlock;
import net.minestom.server.instance.block.states.BrainCoralFan;
import net.minestom.server.instance.block.states.BrainCoralWallFan;
import net.minestom.server.instance.block.states.BrewingStand;
import net.minestom.server.instance.block.states.BrickSlab;
import net.minestom.server.instance.block.states.BrickStairs;
import net.minestom.server.instance.block.states.BrickWall;
import net.minestom.server.instance.block.states.Bricks;
import net.minestom.server.instance.block.states.BrownBanner;
import net.minestom.server.instance.block.states.BrownBed;
import net.minestom.server.instance.block.states.BrownCarpet;
import net.minestom.server.instance.block.states.BrownConcrete;
import net.minestom.server.instance.block.states.BrownConcretePowder;
import net.minestom.server.instance.block.states.BrownGlazedTerracotta;
import net.minestom.server.instance.block.states.BrownMushroom;
import net.minestom.server.instance.block.states.BrownMushroomBlock;
import net.minestom.server.instance.block.states.BrownShulkerBox;
import net.minestom.server.instance.block.states.BrownStainedGlass;
import net.minestom.server.instance.block.states.BrownStainedGlassPane;
import net.minestom.server.instance.block.states.BrownTerracotta;
import net.minestom.server.instance.block.states.BrownWallBanner;
import net.minestom.server.instance.block.states.BrownWool;
import net.minestom.server.instance.block.states.BubbleColumn;
import net.minestom.server.instance.block.states.BubbleCoral;
import net.minestom.server.instance.block.states.BubbleCoralBlock;
import net.minestom.server.instance.block.states.BubbleCoralFan;
import net.minestom.server.instance.block.states.BubbleCoralWallFan;
import net.minestom.server.instance.block.states.Cactus;
import net.minestom.server.instance.block.states.Cake;
import net.minestom.server.instance.block.states.Campfire;
import net.minestom.server.instance.block.states.Carrots;
import net.minestom.server.instance.block.states.CartographyTable;
import net.minestom.server.instance.block.states.CarvedPumpkin;
import net.minestom.server.instance.block.states.Cauldron;
import net.minestom.server.instance.block.states.CaveAir;
import net.minestom.server.instance.block.states.Chain;
import net.minestom.server.instance.block.states.ChainCommandBlock;
import net.minestom.server.instance.block.states.Chest;
import net.minestom.server.instance.block.states.ChippedAnvil;
import net.minestom.server.instance.block.states.ChiseledNetherBricks;
import net.minestom.server.instance.block.states.ChiseledPolishedBlackstone;
import net.minestom.server.instance.block.states.ChiseledQuartzBlock;
import net.minestom.server.instance.block.states.ChiseledRedSandstone;
import net.minestom.server.instance.block.states.ChiseledSandstone;
import net.minestom.server.instance.block.states.ChiseledStoneBricks;
import net.minestom.server.instance.block.states.ChorusFlower;
import net.minestom.server.instance.block.states.ChorusPlant;
import net.minestom.server.instance.block.states.Clay;
import net.minestom.server.instance.block.states.CoalBlock;
import net.minestom.server.instance.block.states.CoalOre;
import net.minestom.server.instance.block.states.CoarseDirt;
import net.minestom.server.instance.block.states.Cobblestone;
import net.minestom.server.instance.block.states.CobblestoneSlab;
import net.minestom.server.instance.block.states.CobblestoneStairs;
import net.minestom.server.instance.block.states.CobblestoneWall;
import net.minestom.server.instance.block.states.Cobweb;
import net.minestom.server.instance.block.states.Cocoa;
import net.minestom.server.instance.block.states.CommandBlock;
import net.minestom.server.instance.block.states.Comparator;
import net.minestom.server.instance.block.states.Composter;
import net.minestom.server.instance.block.states.Conduit;
import net.minestom.server.instance.block.states.Cornflower;
import net.minestom.server.instance.block.states.CrackedNetherBricks;
import net.minestom.server.instance.block.states.CrackedPolishedBlackstoneBricks;
import net.minestom.server.instance.block.states.CrackedStoneBricks;
import net.minestom.server.instance.block.states.CraftingTable;
import net.minestom.server.instance.block.states.CreeperHead;
import net.minestom.server.instance.block.states.CreeperWallHead;
import net.minestom.server.instance.block.states.CrimsonButton;
import net.minestom.server.instance.block.states.CrimsonDoor;
import net.minestom.server.instance.block.states.CrimsonFence;
import net.minestom.server.instance.block.states.CrimsonFenceGate;
import net.minestom.server.instance.block.states.CrimsonFungus;
import net.minestom.server.instance.block.states.CrimsonHyphae;
import net.minestom.server.instance.block.states.CrimsonNylium;
import net.minestom.server.instance.block.states.CrimsonPlanks;
import net.minestom.server.instance.block.states.CrimsonPressurePlate;
import net.minestom.server.instance.block.states.CrimsonRoots;
import net.minestom.server.instance.block.states.CrimsonSign;
import net.minestom.server.instance.block.states.CrimsonSlab;
import net.minestom.server.instance.block.states.CrimsonStairs;
import net.minestom.server.instance.block.states.CrimsonStem;
import net.minestom.server.instance.block.states.CrimsonTrapdoor;
import net.minestom.server.instance.block.states.CrimsonWallSign;
import net.minestom.server.instance.block.states.CryingObsidian;
import net.minestom.server.instance.block.states.CutRedSandstone;
import net.minestom.server.instance.block.states.CutRedSandstoneSlab;
import net.minestom.server.instance.block.states.CutSandstone;
import net.minestom.server.instance.block.states.CutSandstoneSlab;
import net.minestom.server.instance.block.states.CyanBanner;
import net.minestom.server.instance.block.states.CyanBed;
import net.minestom.server.instance.block.states.CyanCarpet;
import net.minestom.server.instance.block.states.CyanConcrete;
import net.minestom.server.instance.block.states.CyanConcretePowder;
import net.minestom.server.instance.block.states.CyanGlazedTerracotta;
import net.minestom.server.instance.block.states.CyanShulkerBox;
import net.minestom.server.instance.block.states.CyanStainedGlass;
import net.minestom.server.instance.block.states.CyanStainedGlassPane;
import net.minestom.server.instance.block.states.CyanTerracotta;
import net.minestom.server.instance.block.states.CyanWallBanner;
import net.minestom.server.instance.block.states.CyanWool;
import net.minestom.server.instance.block.states.DamagedAnvil;
import net.minestom.server.instance.block.states.Dandelion;
import net.minestom.server.instance.block.states.DarkOakButton;
import net.minestom.server.instance.block.states.DarkOakDoor;
import net.minestom.server.instance.block.states.DarkOakFence;
import net.minestom.server.instance.block.states.DarkOakFenceGate;
import net.minestom.server.instance.block.states.DarkOakLeaves;
import net.minestom.server.instance.block.states.DarkOakLog;
import net.minestom.server.instance.block.states.DarkOakPlanks;
import net.minestom.server.instance.block.states.DarkOakPressurePlate;
import net.minestom.server.instance.block.states.DarkOakSapling;
import net.minestom.server.instance.block.states.DarkOakSign;
import net.minestom.server.instance.block.states.DarkOakSlab;
import net.minestom.server.instance.block.states.DarkOakStairs;
import net.minestom.server.instance.block.states.DarkOakTrapdoor;
import net.minestom.server.instance.block.states.DarkOakWallSign;
import net.minestom.server.instance.block.states.DarkOakWood;
import net.minestom.server.instance.block.states.DarkPrismarine;
import net.minestom.server.instance.block.states.DarkPrismarineSlab;
import net.minestom.server.instance.block.states.DarkPrismarineStairs;
import net.minestom.server.instance.block.states.DaylightDetector;
import net.minestom.server.instance.block.states.DeadBrainCoral;
import net.minestom.server.instance.block.states.DeadBrainCoralBlock;
import net.minestom.server.instance.block.states.DeadBrainCoralFan;
import net.minestom.server.instance.block.states.DeadBrainCoralWallFan;
import net.minestom.server.instance.block.states.DeadBubbleCoral;
import net.minestom.server.instance.block.states.DeadBubbleCoralBlock;
import net.minestom.server.instance.block.states.DeadBubbleCoralFan;
import net.minestom.server.instance.block.states.DeadBubbleCoralWallFan;
import net.minestom.server.instance.block.states.DeadBush;
import net.minestom.server.instance.block.states.DeadFireCoral;
import net.minestom.server.instance.block.states.DeadFireCoralBlock;
import net.minestom.server.instance.block.states.DeadFireCoralFan;
import net.minestom.server.instance.block.states.DeadFireCoralWallFan;
import net.minestom.server.instance.block.states.DeadHornCoral;
import net.minestom.server.instance.block.states.DeadHornCoralBlock;
import net.minestom.server.instance.block.states.DeadHornCoralFan;
import net.minestom.server.instance.block.states.DeadHornCoralWallFan;
import net.minestom.server.instance.block.states.DeadTubeCoral;
import net.minestom.server.instance.block.states.DeadTubeCoralBlock;
import net.minestom.server.instance.block.states.DeadTubeCoralFan;
import net.minestom.server.instance.block.states.DeadTubeCoralWallFan;
import net.minestom.server.instance.block.states.DetectorRail;
import net.minestom.server.instance.block.states.DiamondBlock;
import net.minestom.server.instance.block.states.DiamondOre;
import net.minestom.server.instance.block.states.Diorite;
import net.minestom.server.instance.block.states.DioriteSlab;
import net.minestom.server.instance.block.states.DioriteStairs;
import net.minestom.server.instance.block.states.DioriteWall;
import net.minestom.server.instance.block.states.Dirt;
import net.minestom.server.instance.block.states.Dispenser;
import net.minestom.server.instance.block.states.DragonEgg;
import net.minestom.server.instance.block.states.DragonHead;
import net.minestom.server.instance.block.states.DragonWallHead;
import net.minestom.server.instance.block.states.DriedKelpBlock;
import net.minestom.server.instance.block.states.Dropper;
import net.minestom.server.instance.block.states.EmeraldBlock;
import net.minestom.server.instance.block.states.EmeraldOre;
import net.minestom.server.instance.block.states.EnchantingTable;
import net.minestom.server.instance.block.states.EndGateway;
import net.minestom.server.instance.block.states.EndPortal;
import net.minestom.server.instance.block.states.EndPortalFrame;
import net.minestom.server.instance.block.states.EndRod;
import net.minestom.server.instance.block.states.EndStone;
import net.minestom.server.instance.block.states.EndStoneBrickSlab;
import net.minestom.server.instance.block.states.EndStoneBrickStairs;
import net.minestom.server.instance.block.states.EndStoneBrickWall;
import net.minestom.server.instance.block.states.EndStoneBricks;
import net.minestom.server.instance.block.states.EnderChest;
import net.minestom.server.instance.block.states.Farmland;
import net.minestom.server.instance.block.states.Fern;
import net.minestom.server.instance.block.states.Fire;
import net.minestom.server.instance.block.states.FireCoral;
import net.minestom.server.instance.block.states.FireCoralBlock;
import net.minestom.server.instance.block.states.FireCoralFan;
import net.minestom.server.instance.block.states.FireCoralWallFan;
import net.minestom.server.instance.block.states.FletchingTable;
import net.minestom.server.instance.block.states.FlowerPot;
import net.minestom.server.instance.block.states.FrostedIce;
import net.minestom.server.instance.block.states.Furnace;
import net.minestom.server.instance.block.states.GildedBlackstone;
import net.minestom.server.instance.block.states.Glass;
import net.minestom.server.instance.block.states.GlassPane;
import net.minestom.server.instance.block.states.Glowstone;
import net.minestom.server.instance.block.states.GoldBlock;
import net.minestom.server.instance.block.states.GoldOre;
import net.minestom.server.instance.block.states.Granite;
import net.minestom.server.instance.block.states.GraniteSlab;
import net.minestom.server.instance.block.states.GraniteStairs;
import net.minestom.server.instance.block.states.GraniteWall;
import net.minestom.server.instance.block.states.Grass;
import net.minestom.server.instance.block.states.GrassBlock;
import net.minestom.server.instance.block.states.GrassPath;
import net.minestom.server.instance.block.states.Gravel;
import net.minestom.server.instance.block.states.GrayBanner;
import net.minestom.server.instance.block.states.GrayBed;
import net.minestom.server.instance.block.states.GrayCarpet;
import net.minestom.server.instance.block.states.GrayConcrete;
import net.minestom.server.instance.block.states.GrayConcretePowder;
import net.minestom.server.instance.block.states.GrayGlazedTerracotta;
import net.minestom.server.instance.block.states.GrayShulkerBox;
import net.minestom.server.instance.block.states.GrayStainedGlass;
import net.minestom.server.instance.block.states.GrayStainedGlassPane;
import net.minestom.server.instance.block.states.GrayTerracotta;
import net.minestom.server.instance.block.states.GrayWallBanner;
import net.minestom.server.instance.block.states.GrayWool;
import net.minestom.server.instance.block.states.GreenBanner;
import net.minestom.server.instance.block.states.GreenBed;
import net.minestom.server.instance.block.states.GreenCarpet;
import net.minestom.server.instance.block.states.GreenConcrete;
import net.minestom.server.instance.block.states.GreenConcretePowder;
import net.minestom.server.instance.block.states.GreenGlazedTerracotta;
import net.minestom.server.instance.block.states.GreenShulkerBox;
import net.minestom.server.instance.block.states.GreenStainedGlass;
import net.minestom.server.instance.block.states.GreenStainedGlassPane;
import net.minestom.server.instance.block.states.GreenTerracotta;
import net.minestom.server.instance.block.states.GreenWallBanner;
import net.minestom.server.instance.block.states.GreenWool;
import net.minestom.server.instance.block.states.Grindstone;
import net.minestom.server.instance.block.states.HayBlock;
import net.minestom.server.instance.block.states.HeavyWeightedPressurePlate;
import net.minestom.server.instance.block.states.HoneyBlock;
import net.minestom.server.instance.block.states.HoneycombBlock;
import net.minestom.server.instance.block.states.Hopper;
import net.minestom.server.instance.block.states.HornCoral;
import net.minestom.server.instance.block.states.HornCoralBlock;
import net.minestom.server.instance.block.states.HornCoralFan;
import net.minestom.server.instance.block.states.HornCoralWallFan;
import net.minestom.server.instance.block.states.Ice;
import net.minestom.server.instance.block.states.InfestedChiseledStoneBricks;
import net.minestom.server.instance.block.states.InfestedCobblestone;
import net.minestom.server.instance.block.states.InfestedCrackedStoneBricks;
import net.minestom.server.instance.block.states.InfestedMossyStoneBricks;
import net.minestom.server.instance.block.states.InfestedStone;
import net.minestom.server.instance.block.states.InfestedStoneBricks;
import net.minestom.server.instance.block.states.IronBars;
import net.minestom.server.instance.block.states.IronBlock;
import net.minestom.server.instance.block.states.IronDoor;
import net.minestom.server.instance.block.states.IronOre;
import net.minestom.server.instance.block.states.IronTrapdoor;
import net.minestom.server.instance.block.states.JackOLantern;
import net.minestom.server.instance.block.states.Jigsaw;
import net.minestom.server.instance.block.states.Jukebox;
import net.minestom.server.instance.block.states.JungleButton;
import net.minestom.server.instance.block.states.JungleDoor;
import net.minestom.server.instance.block.states.JungleFence;
import net.minestom.server.instance.block.states.JungleFenceGate;
import net.minestom.server.instance.block.states.JungleLeaves;
import net.minestom.server.instance.block.states.JungleLog;
import net.minestom.server.instance.block.states.JunglePlanks;
import net.minestom.server.instance.block.states.JunglePressurePlate;
import net.minestom.server.instance.block.states.JungleSapling;
import net.minestom.server.instance.block.states.JungleSign;
import net.minestom.server.instance.block.states.JungleSlab;
import net.minestom.server.instance.block.states.JungleStairs;
import net.minestom.server.instance.block.states.JungleTrapdoor;
import net.minestom.server.instance.block.states.JungleWallSign;
import net.minestom.server.instance.block.states.JungleWood;
import net.minestom.server.instance.block.states.Kelp;
import net.minestom.server.instance.block.states.KelpPlant;
import net.minestom.server.instance.block.states.Ladder;
import net.minestom.server.instance.block.states.Lantern;
import net.minestom.server.instance.block.states.LapisBlock;
import net.minestom.server.instance.block.states.LapisOre;
import net.minestom.server.instance.block.states.LargeFern;
import net.minestom.server.instance.block.states.Lava;
import net.minestom.server.instance.block.states.Lectern;
import net.minestom.server.instance.block.states.Lever;
import net.minestom.server.instance.block.states.LightBlueBanner;
import net.minestom.server.instance.block.states.LightBlueBed;
import net.minestom.server.instance.block.states.LightBlueCarpet;
import net.minestom.server.instance.block.states.LightBlueConcrete;
import net.minestom.server.instance.block.states.LightBlueConcretePowder;
import net.minestom.server.instance.block.states.LightBlueGlazedTerracotta;
import net.minestom.server.instance.block.states.LightBlueShulkerBox;
import net.minestom.server.instance.block.states.LightBlueStainedGlass;
import net.minestom.server.instance.block.states.LightBlueStainedGlassPane;
import net.minestom.server.instance.block.states.LightBlueTerracotta;
import net.minestom.server.instance.block.states.LightBlueWallBanner;
import net.minestom.server.instance.block.states.LightBlueWool;
import net.minestom.server.instance.block.states.LightGrayBanner;
import net.minestom.server.instance.block.states.LightGrayBed;
import net.minestom.server.instance.block.states.LightGrayCarpet;
import net.minestom.server.instance.block.states.LightGrayConcrete;
import net.minestom.server.instance.block.states.LightGrayConcretePowder;
import net.minestom.server.instance.block.states.LightGrayGlazedTerracotta;
import net.minestom.server.instance.block.states.LightGrayShulkerBox;
import net.minestom.server.instance.block.states.LightGrayStainedGlass;
import net.minestom.server.instance.block.states.LightGrayStainedGlassPane;
import net.minestom.server.instance.block.states.LightGrayTerracotta;
import net.minestom.server.instance.block.states.LightGrayWallBanner;
import net.minestom.server.instance.block.states.LightGrayWool;
import net.minestom.server.instance.block.states.LightWeightedPressurePlate;
import net.minestom.server.instance.block.states.Lilac;
import net.minestom.server.instance.block.states.LilyOfTheValley;
import net.minestom.server.instance.block.states.LilyPad;
import net.minestom.server.instance.block.states.LimeBanner;
import net.minestom.server.instance.block.states.LimeBed;
import net.minestom.server.instance.block.states.LimeCarpet;
import net.minestom.server.instance.block.states.LimeConcrete;
import net.minestom.server.instance.block.states.LimeConcretePowder;
import net.minestom.server.instance.block.states.LimeGlazedTerracotta;
import net.minestom.server.instance.block.states.LimeShulkerBox;
import net.minestom.server.instance.block.states.LimeStainedGlass;
import net.minestom.server.instance.block.states.LimeStainedGlassPane;
import net.minestom.server.instance.block.states.LimeTerracotta;
import net.minestom.server.instance.block.states.LimeWallBanner;
import net.minestom.server.instance.block.states.LimeWool;
import net.minestom.server.instance.block.states.Lodestone;
import net.minestom.server.instance.block.states.Loom;
import net.minestom.server.instance.block.states.MagentaBanner;
import net.minestom.server.instance.block.states.MagentaBed;
import net.minestom.server.instance.block.states.MagentaCarpet;
import net.minestom.server.instance.block.states.MagentaConcrete;
import net.minestom.server.instance.block.states.MagentaConcretePowder;
import net.minestom.server.instance.block.states.MagentaGlazedTerracotta;
import net.minestom.server.instance.block.states.MagentaShulkerBox;
import net.minestom.server.instance.block.states.MagentaStainedGlass;
import net.minestom.server.instance.block.states.MagentaStainedGlassPane;
import net.minestom.server.instance.block.states.MagentaTerracotta;
import net.minestom.server.instance.block.states.MagentaWallBanner;
import net.minestom.server.instance.block.states.MagentaWool;
import net.minestom.server.instance.block.states.MagmaBlock;
import net.minestom.server.instance.block.states.Melon;
import net.minestom.server.instance.block.states.MelonStem;
import net.minestom.server.instance.block.states.MossyCobblestone;
import net.minestom.server.instance.block.states.MossyCobblestoneSlab;
import net.minestom.server.instance.block.states.MossyCobblestoneStairs;
import net.minestom.server.instance.block.states.MossyCobblestoneWall;
import net.minestom.server.instance.block.states.MossyStoneBrickSlab;
import net.minestom.server.instance.block.states.MossyStoneBrickStairs;
import net.minestom.server.instance.block.states.MossyStoneBrickWall;
import net.minestom.server.instance.block.states.MossyStoneBricks;
import net.minestom.server.instance.block.states.MovingPiston;
import net.minestom.server.instance.block.states.MushroomStem;
import net.minestom.server.instance.block.states.Mycelium;
import net.minestom.server.instance.block.states.NetherBrickFence;
import net.minestom.server.instance.block.states.NetherBrickSlab;
import net.minestom.server.instance.block.states.NetherBrickStairs;
import net.minestom.server.instance.block.states.NetherBrickWall;
import net.minestom.server.instance.block.states.NetherBricks;
import net.minestom.server.instance.block.states.NetherGoldOre;
import net.minestom.server.instance.block.states.NetherPortal;
import net.minestom.server.instance.block.states.NetherQuartzOre;
import net.minestom.server.instance.block.states.NetherSprouts;
import net.minestom.server.instance.block.states.NetherWart;
import net.minestom.server.instance.block.states.NetherWartBlock;
import net.minestom.server.instance.block.states.NetheriteBlock;
import net.minestom.server.instance.block.states.Netherrack;
import net.minestom.server.instance.block.states.NoteBlock;
import net.minestom.server.instance.block.states.OakButton;
import net.minestom.server.instance.block.states.OakDoor;
import net.minestom.server.instance.block.states.OakFence;
import net.minestom.server.instance.block.states.OakFenceGate;
import net.minestom.server.instance.block.states.OakLeaves;
import net.minestom.server.instance.block.states.OakLog;
import net.minestom.server.instance.block.states.OakPlanks;
import net.minestom.server.instance.block.states.OakPressurePlate;
import net.minestom.server.instance.block.states.OakSapling;
import net.minestom.server.instance.block.states.OakSign;
import net.minestom.server.instance.block.states.OakSlab;
import net.minestom.server.instance.block.states.OakStairs;
import net.minestom.server.instance.block.states.OakTrapdoor;
import net.minestom.server.instance.block.states.OakWallSign;
import net.minestom.server.instance.block.states.OakWood;
import net.minestom.server.instance.block.states.Observer;
import net.minestom.server.instance.block.states.Obsidian;
import net.minestom.server.instance.block.states.OrangeBanner;
import net.minestom.server.instance.block.states.OrangeBed;
import net.minestom.server.instance.block.states.OrangeCarpet;
import net.minestom.server.instance.block.states.OrangeConcrete;
import net.minestom.server.instance.block.states.OrangeConcretePowder;
import net.minestom.server.instance.block.states.OrangeGlazedTerracotta;
import net.minestom.server.instance.block.states.OrangeShulkerBox;
import net.minestom.server.instance.block.states.OrangeStainedGlass;
import net.minestom.server.instance.block.states.OrangeStainedGlassPane;
import net.minestom.server.instance.block.states.OrangeTerracotta;
import net.minestom.server.instance.block.states.OrangeTulip;
import net.minestom.server.instance.block.states.OrangeWallBanner;
import net.minestom.server.instance.block.states.OrangeWool;
import net.minestom.server.instance.block.states.OxeyeDaisy;
import net.minestom.server.instance.block.states.PackedIce;
import net.minestom.server.instance.block.states.Peony;
import net.minestom.server.instance.block.states.PetrifiedOakSlab;
import net.minestom.server.instance.block.states.PinkBanner;
import net.minestom.server.instance.block.states.PinkBed;
import net.minestom.server.instance.block.states.PinkCarpet;
import net.minestom.server.instance.block.states.PinkConcrete;
import net.minestom.server.instance.block.states.PinkConcretePowder;
import net.minestom.server.instance.block.states.PinkGlazedTerracotta;
import net.minestom.server.instance.block.states.PinkShulkerBox;
import net.minestom.server.instance.block.states.PinkStainedGlass;
import net.minestom.server.instance.block.states.PinkStainedGlassPane;
import net.minestom.server.instance.block.states.PinkTerracotta;
import net.minestom.server.instance.block.states.PinkTulip;
import net.minestom.server.instance.block.states.PinkWallBanner;
import net.minestom.server.instance.block.states.PinkWool;
import net.minestom.server.instance.block.states.Piston;
import net.minestom.server.instance.block.states.PistonHead;
import net.minestom.server.instance.block.states.PlayerHead;
import net.minestom.server.instance.block.states.PlayerWallHead;
import net.minestom.server.instance.block.states.Podzol;
import net.minestom.server.instance.block.states.PolishedAndesite;
import net.minestom.server.instance.block.states.PolishedAndesiteSlab;
import net.minestom.server.instance.block.states.PolishedAndesiteStairs;
import net.minestom.server.instance.block.states.PolishedBasalt;
import net.minestom.server.instance.block.states.PolishedBlackstone;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickSlab;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickStairs;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickWall;
import net.minestom.server.instance.block.states.PolishedBlackstoneBricks;
import net.minestom.server.instance.block.states.PolishedBlackstoneButton;
import net.minestom.server.instance.block.states.PolishedBlackstonePressurePlate;
import net.minestom.server.instance.block.states.PolishedBlackstoneSlab;
import net.minestom.server.instance.block.states.PolishedBlackstoneStairs;
import net.minestom.server.instance.block.states.PolishedBlackstoneWall;
import net.minestom.server.instance.block.states.PolishedDiorite;
import net.minestom.server.instance.block.states.PolishedDioriteSlab;
import net.minestom.server.instance.block.states.PolishedDioriteStairs;
import net.minestom.server.instance.block.states.PolishedGranite;
import net.minestom.server.instance.block.states.PolishedGraniteSlab;
import net.minestom.server.instance.block.states.PolishedGraniteStairs;
import net.minestom.server.instance.block.states.Poppy;
import net.minestom.server.instance.block.states.Potatoes;
import net.minestom.server.instance.block.states.PottedAcaciaSapling;
import net.minestom.server.instance.block.states.PottedAllium;
import net.minestom.server.instance.block.states.PottedAzureBluet;
import net.minestom.server.instance.block.states.PottedBamboo;
import net.minestom.server.instance.block.states.PottedBirchSapling;
import net.minestom.server.instance.block.states.PottedBlueOrchid;
import net.minestom.server.instance.block.states.PottedBrownMushroom;
import net.minestom.server.instance.block.states.PottedCactus;
import net.minestom.server.instance.block.states.PottedCornflower;
import net.minestom.server.instance.block.states.PottedCrimsonFungus;
import net.minestom.server.instance.block.states.PottedCrimsonRoots;
import net.minestom.server.instance.block.states.PottedDandelion;
import net.minestom.server.instance.block.states.PottedDarkOakSapling;
import net.minestom.server.instance.block.states.PottedDeadBush;
import net.minestom.server.instance.block.states.PottedFern;
import net.minestom.server.instance.block.states.PottedJungleSapling;
import net.minestom.server.instance.block.states.PottedLilyOfTheValley;
import net.minestom.server.instance.block.states.PottedOakSapling;
import net.minestom.server.instance.block.states.PottedOrangeTulip;
import net.minestom.server.instance.block.states.PottedOxeyeDaisy;
import net.minestom.server.instance.block.states.PottedPinkTulip;
import net.minestom.server.instance.block.states.PottedPoppy;
import net.minestom.server.instance.block.states.PottedRedMushroom;
import net.minestom.server.instance.block.states.PottedRedTulip;
import net.minestom.server.instance.block.states.PottedSpruceSapling;
import net.minestom.server.instance.block.states.PottedWarpedFungus;
import net.minestom.server.instance.block.states.PottedWarpedRoots;
import net.minestom.server.instance.block.states.PottedWhiteTulip;
import net.minestom.server.instance.block.states.PottedWitherRose;
import net.minestom.server.instance.block.states.PoweredRail;
import net.minestom.server.instance.block.states.Prismarine;
import net.minestom.server.instance.block.states.PrismarineBrickSlab;
import net.minestom.server.instance.block.states.PrismarineBrickStairs;
import net.minestom.server.instance.block.states.PrismarineBricks;
import net.minestom.server.instance.block.states.PrismarineSlab;
import net.minestom.server.instance.block.states.PrismarineStairs;
import net.minestom.server.instance.block.states.PrismarineWall;
import net.minestom.server.instance.block.states.Pumpkin;
import net.minestom.server.instance.block.states.PumpkinStem;
import net.minestom.server.instance.block.states.PurpleBanner;
import net.minestom.server.instance.block.states.PurpleBed;
import net.minestom.server.instance.block.states.PurpleCarpet;
import net.minestom.server.instance.block.states.PurpleConcrete;
import net.minestom.server.instance.block.states.PurpleConcretePowder;
import net.minestom.server.instance.block.states.PurpleGlazedTerracotta;
import net.minestom.server.instance.block.states.PurpleShulkerBox;
import net.minestom.server.instance.block.states.PurpleStainedGlass;
import net.minestom.server.instance.block.states.PurpleStainedGlassPane;
import net.minestom.server.instance.block.states.PurpleTerracotta;
import net.minestom.server.instance.block.states.PurpleWallBanner;
import net.minestom.server.instance.block.states.PurpleWool;
import net.minestom.server.instance.block.states.PurpurBlock;
import net.minestom.server.instance.block.states.PurpurPillar;
import net.minestom.server.instance.block.states.PurpurSlab;
import net.minestom.server.instance.block.states.PurpurStairs;
import net.minestom.server.instance.block.states.QuartzBlock;
import net.minestom.server.instance.block.states.QuartzBricks;
import net.minestom.server.instance.block.states.QuartzPillar;
import net.minestom.server.instance.block.states.QuartzSlab;
import net.minestom.server.instance.block.states.QuartzStairs;
import net.minestom.server.instance.block.states.Rail;
import net.minestom.server.instance.block.states.RedBanner;
import net.minestom.server.instance.block.states.RedBed;
import net.minestom.server.instance.block.states.RedCarpet;
import net.minestom.server.instance.block.states.RedConcrete;
import net.minestom.server.instance.block.states.RedConcretePowder;
import net.minestom.server.instance.block.states.RedGlazedTerracotta;
import net.minestom.server.instance.block.states.RedMushroom;
import net.minestom.server.instance.block.states.RedMushroomBlock;
import net.minestom.server.instance.block.states.RedNetherBrickSlab;
import net.minestom.server.instance.block.states.RedNetherBrickStairs;
import net.minestom.server.instance.block.states.RedNetherBrickWall;
import net.minestom.server.instance.block.states.RedNetherBricks;
import net.minestom.server.instance.block.states.RedSand;
import net.minestom.server.instance.block.states.RedSandstone;
import net.minestom.server.instance.block.states.RedSandstoneSlab;
import net.minestom.server.instance.block.states.RedSandstoneStairs;
import net.minestom.server.instance.block.states.RedSandstoneWall;
import net.minestom.server.instance.block.states.RedShulkerBox;
import net.minestom.server.instance.block.states.RedStainedGlass;
import net.minestom.server.instance.block.states.RedStainedGlassPane;
import net.minestom.server.instance.block.states.RedTerracotta;
import net.minestom.server.instance.block.states.RedTulip;
import net.minestom.server.instance.block.states.RedWallBanner;
import net.minestom.server.instance.block.states.RedWool;
import net.minestom.server.instance.block.states.RedstoneBlock;
import net.minestom.server.instance.block.states.RedstoneLamp;
import net.minestom.server.instance.block.states.RedstoneOre;
import net.minestom.server.instance.block.states.RedstoneTorch;
import net.minestom.server.instance.block.states.RedstoneWallTorch;
import net.minestom.server.instance.block.states.RedstoneWire;
import net.minestom.server.instance.block.states.Repeater;
import net.minestom.server.instance.block.states.RepeatingCommandBlock;
import net.minestom.server.instance.block.states.RespawnAnchor;
import net.minestom.server.instance.block.states.RoseBush;
import net.minestom.server.instance.block.states.Sand;
import net.minestom.server.instance.block.states.Sandstone;
import net.minestom.server.instance.block.states.SandstoneSlab;
import net.minestom.server.instance.block.states.SandstoneStairs;
import net.minestom.server.instance.block.states.SandstoneWall;
import net.minestom.server.instance.block.states.Scaffolding;
import net.minestom.server.instance.block.states.SeaLantern;
import net.minestom.server.instance.block.states.SeaPickle;
import net.minestom.server.instance.block.states.Seagrass;
import net.minestom.server.instance.block.states.Shroomlight;
import net.minestom.server.instance.block.states.ShulkerBox;
import net.minestom.server.instance.block.states.SkeletonSkull;
import net.minestom.server.instance.block.states.SkeletonWallSkull;
import net.minestom.server.instance.block.states.SlimeBlock;
import net.minestom.server.instance.block.states.SmithingTable;
import net.minestom.server.instance.block.states.Smoker;
import net.minestom.server.instance.block.states.SmoothQuartz;
import net.minestom.server.instance.block.states.SmoothQuartzSlab;
import net.minestom.server.instance.block.states.SmoothQuartzStairs;
import net.minestom.server.instance.block.states.SmoothRedSandstone;
import net.minestom.server.instance.block.states.SmoothRedSandstoneSlab;
import net.minestom.server.instance.block.states.SmoothRedSandstoneStairs;
import net.minestom.server.instance.block.states.SmoothSandstone;
import net.minestom.server.instance.block.states.SmoothSandstoneSlab;
import net.minestom.server.instance.block.states.SmoothSandstoneStairs;
import net.minestom.server.instance.block.states.SmoothStone;
import net.minestom.server.instance.block.states.SmoothStoneSlab;
import net.minestom.server.instance.block.states.Snow;
import net.minestom.server.instance.block.states.SnowBlock;
import net.minestom.server.instance.block.states.SoulCampfire;
import net.minestom.server.instance.block.states.SoulFire;
import net.minestom.server.instance.block.states.SoulLantern;
import net.minestom.server.instance.block.states.SoulSand;
import net.minestom.server.instance.block.states.SoulSoil;
import net.minestom.server.instance.block.states.SoulTorch;
import net.minestom.server.instance.block.states.SoulWallTorch;
import net.minestom.server.instance.block.states.Spawner;
import net.minestom.server.instance.block.states.Sponge;
import net.minestom.server.instance.block.states.SpruceButton;
import net.minestom.server.instance.block.states.SpruceDoor;
import net.minestom.server.instance.block.states.SpruceFence;
import net.minestom.server.instance.block.states.SpruceFenceGate;
import net.minestom.server.instance.block.states.SpruceLeaves;
import net.minestom.server.instance.block.states.SpruceLog;
import net.minestom.server.instance.block.states.SprucePlanks;
import net.minestom.server.instance.block.states.SprucePressurePlate;
import net.minestom.server.instance.block.states.SpruceSapling;
import net.minestom.server.instance.block.states.SpruceSign;
import net.minestom.server.instance.block.states.SpruceSlab;
import net.minestom.server.instance.block.states.SpruceStairs;
import net.minestom.server.instance.block.states.SpruceTrapdoor;
import net.minestom.server.instance.block.states.SpruceWallSign;
import net.minestom.server.instance.block.states.SpruceWood;
import net.minestom.server.instance.block.states.StickyPiston;
import net.minestom.server.instance.block.states.Stone;
import net.minestom.server.instance.block.states.StoneBrickSlab;
import net.minestom.server.instance.block.states.StoneBrickStairs;
import net.minestom.server.instance.block.states.StoneBrickWall;
import net.minestom.server.instance.block.states.StoneBricks;
import net.minestom.server.instance.block.states.StoneButton;
import net.minestom.server.instance.block.states.StonePressurePlate;
import net.minestom.server.instance.block.states.StoneSlab;
import net.minestom.server.instance.block.states.StoneStairs;
import net.minestom.server.instance.block.states.Stonecutter;
import net.minestom.server.instance.block.states.StrippedAcaciaLog;
import net.minestom.server.instance.block.states.StrippedAcaciaWood;
import net.minestom.server.instance.block.states.StrippedBirchLog;
import net.minestom.server.instance.block.states.StrippedBirchWood;
import net.minestom.server.instance.block.states.StrippedCrimsonHyphae;
import net.minestom.server.instance.block.states.StrippedCrimsonStem;
import net.minestom.server.instance.block.states.StrippedDarkOakLog;
import net.minestom.server.instance.block.states.StrippedDarkOakWood;
import net.minestom.server.instance.block.states.StrippedJungleLog;
import net.minestom.server.instance.block.states.StrippedJungleWood;
import net.minestom.server.instance.block.states.StrippedOakLog;
import net.minestom.server.instance.block.states.StrippedOakWood;
import net.minestom.server.instance.block.states.StrippedSpruceLog;
import net.minestom.server.instance.block.states.StrippedSpruceWood;
import net.minestom.server.instance.block.states.StrippedWarpedHyphae;
import net.minestom.server.instance.block.states.StrippedWarpedStem;
import net.minestom.server.instance.block.states.StructureBlock;
import net.minestom.server.instance.block.states.StructureVoid;
import net.minestom.server.instance.block.states.SugarCane;
import net.minestom.server.instance.block.states.Sunflower;
import net.minestom.server.instance.block.states.SweetBerryBush;
import net.minestom.server.instance.block.states.TallGrass;
import net.minestom.server.instance.block.states.TallSeagrass;
import net.minestom.server.instance.block.states.Target;
import net.minestom.server.instance.block.states.Terracotta;
import net.minestom.server.instance.block.states.Tnt;
import net.minestom.server.instance.block.states.Torch;
import net.minestom.server.instance.block.states.TrappedChest;
import net.minestom.server.instance.block.states.Tripwire;
import net.minestom.server.instance.block.states.TripwireHook;
import net.minestom.server.instance.block.states.TubeCoral;
import net.minestom.server.instance.block.states.TubeCoralBlock;
import net.minestom.server.instance.block.states.TubeCoralFan;
import net.minestom.server.instance.block.states.TubeCoralWallFan;
import net.minestom.server.instance.block.states.TurtleEgg;
import net.minestom.server.instance.block.states.TwistingVines;
import net.minestom.server.instance.block.states.TwistingVinesPlant;
import net.minestom.server.instance.block.states.Vine;
import net.minestom.server.instance.block.states.VoidAir;
import net.minestom.server.instance.block.states.WallTorch;
import net.minestom.server.instance.block.states.WarpedButton;
import net.minestom.server.instance.block.states.WarpedDoor;
import net.minestom.server.instance.block.states.WarpedFence;
import net.minestom.server.instance.block.states.WarpedFenceGate;
import net.minestom.server.instance.block.states.WarpedFungus;
import net.minestom.server.instance.block.states.WarpedHyphae;
import net.minestom.server.instance.block.states.WarpedNylium;
import net.minestom.server.instance.block.states.WarpedPlanks;
import net.minestom.server.instance.block.states.WarpedPressurePlate;
import net.minestom.server.instance.block.states.WarpedRoots;
import net.minestom.server.instance.block.states.WarpedSign;
import net.minestom.server.instance.block.states.WarpedSlab;
import net.minestom.server.instance.block.states.WarpedStairs;
import net.minestom.server.instance.block.states.WarpedStem;
import net.minestom.server.instance.block.states.WarpedTrapdoor;
import net.minestom.server.instance.block.states.WarpedWallSign;
import net.minestom.server.instance.block.states.WarpedWartBlock;
import net.minestom.server.instance.block.states.Water;
import net.minestom.server.instance.block.states.WeepingVines;
import net.minestom.server.instance.block.states.WeepingVinesPlant;
import net.minestom.server.instance.block.states.WetSponge;
import net.minestom.server.instance.block.states.Wheat;
import net.minestom.server.instance.block.states.WhiteBanner;
import net.minestom.server.instance.block.states.WhiteBed;
import net.minestom.server.instance.block.states.WhiteCarpet;
import net.minestom.server.instance.block.states.WhiteConcrete;
import net.minestom.server.instance.block.states.WhiteConcretePowder;
import net.minestom.server.instance.block.states.WhiteGlazedTerracotta;
import net.minestom.server.instance.block.states.WhiteShulkerBox;
import net.minestom.server.instance.block.states.WhiteStainedGlass;
import net.minestom.server.instance.block.states.WhiteStainedGlassPane;
import net.minestom.server.instance.block.states.WhiteTerracotta;
import net.minestom.server.instance.block.states.WhiteTulip;
import net.minestom.server.instance.block.states.WhiteWallBanner;
import net.minestom.server.instance.block.states.WhiteWool;
import net.minestom.server.instance.block.states.WitherRose;
import net.minestom.server.instance.block.states.WitherSkeletonSkull;
import net.minestom.server.instance.block.states.WitherSkeletonWallSkull;
import net.minestom.server.instance.block.states.YellowBanner;
import net.minestom.server.instance.block.states.YellowBed;
import net.minestom.server.instance.block.states.YellowCarpet;
import net.minestom.server.instance.block.states.YellowConcrete;
import net.minestom.server.instance.block.states.YellowConcretePowder;
import net.minestom.server.instance.block.states.YellowGlazedTerracotta;
import net.minestom.server.instance.block.states.YellowShulkerBox;
import net.minestom.server.instance.block.states.YellowStainedGlass;
import net.minestom.server.instance.block.states.YellowStainedGlassPane;
import net.minestom.server.instance.block.states.YellowTerracotta;
import net.minestom.server.instance.block.states.YellowWallBanner;
import net.minestom.server.instance.block.states.YellowWool;
import net.minestom.server.instance.block.states.ZombieHead;
import net.minestom.server.instance.block.states.ZombieWallHead;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class Block {
  public static final Block AIR = new Block("minecraft:air", (short) 0, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block STONE = new Block("minecraft:stone", (short) 1, 6.0, 0.6, 1.0, 1.0, "minecraft:stone");

  public static final Block GRANITE = new Block("minecraft:granite", (short) 2, 6.0, 0.6, 1.0, 1.0, "minecraft:granite");

  public static final Block POLISHED_GRANITE = new Block("minecraft:polished_granite", (short) 3, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_granite");

  public static final Block DIORITE = new Block("minecraft:diorite", (short) 4, 6.0, 0.6, 1.0, 1.0, "minecraft:diorite");

  public static final Block POLISHED_DIORITE = new Block("minecraft:polished_diorite", (short) 5, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_diorite");

  public static final Block ANDESITE = new Block("minecraft:andesite", (short) 6, 6.0, 0.6, 1.0, 1.0, "minecraft:andesite");

  public static final Block POLISHED_ANDESITE = new Block("minecraft:polished_andesite", (short) 7, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_andesite");

  public static final Block GRASS_BLOCK = new Block("minecraft:grass_block", (short) 9, 0.6, 0.6, 1.0, 1.0, "minecraft:grass_block");

  public static final Block DIRT = new Block("minecraft:dirt", (short) 10, 0.5, 0.6, 1.0, 1.0, "minecraft:dirt");

  public static final Block COARSE_DIRT = new Block("minecraft:coarse_dirt", (short) 11, 0.5, 0.6, 1.0, 1.0, "minecraft:coarse_dirt");

  public static final Block PODZOL = new Block("minecraft:podzol", (short) 13, 0.5, 0.6, 1.0, 1.0, "minecraft:podzol");

  public static final Block COBBLESTONE = new Block("minecraft:cobblestone", (short) 14, 6.0, 0.6, 1.0, 1.0, "minecraft:cobblestone");

  public static final Block OAK_PLANKS = new Block("minecraft:oak_planks", (short) 15, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_planks");

  public static final Block SPRUCE_PLANKS = new Block("minecraft:spruce_planks", (short) 16, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_planks");

  public static final Block BIRCH_PLANKS = new Block("minecraft:birch_planks", (short) 17, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_planks");

  public static final Block JUNGLE_PLANKS = new Block("minecraft:jungle_planks", (short) 18, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_planks");

  public static final Block ACACIA_PLANKS = new Block("minecraft:acacia_planks", (short) 19, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_planks");

  public static final Block DARK_OAK_PLANKS = new Block("minecraft:dark_oak_planks", (short) 20, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_planks");

  public static final Block OAK_SAPLING = new Block("minecraft:oak_sapling", (short) 21, 0.0, 0.6, 1.0, 1.0, "minecraft:oak_sapling");

  public static final Block SPRUCE_SAPLING = new Block("minecraft:spruce_sapling", (short) 23, 0.0, 0.6, 1.0, 1.0, "minecraft:spruce_sapling");

  public static final Block BIRCH_SAPLING = new Block("minecraft:birch_sapling", (short) 25, 0.0, 0.6, 1.0, 1.0, "minecraft:birch_sapling");

  public static final Block JUNGLE_SAPLING = new Block("minecraft:jungle_sapling", (short) 27, 0.0, 0.6, 1.0, 1.0, "minecraft:jungle_sapling");

  public static final Block ACACIA_SAPLING = new Block("minecraft:acacia_sapling", (short) 29, 0.0, 0.6, 1.0, 1.0, "minecraft:acacia_sapling");

  public static final Block DARK_OAK_SAPLING = new Block("minecraft:dark_oak_sapling", (short) 31, 0.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_sapling");

  public static final Block BEDROCK = new Block("minecraft:bedrock", (short) 33, 3600000.0, 0.6, 1.0, 1.0, "minecraft:bedrock");

  public static final Block WATER = new Block("minecraft:water", (short) 34, 100.0, 0.6, 1.0, 1.0, null);

  public static final Block LAVA = new Block("minecraft:lava", (short) 50, 100.0, 0.6, 1.0, 1.0, null);

  public static final Block SAND = new Block("minecraft:sand", (short) 66, 0.5, 0.6, 1.0, 1.0, "minecraft:sand");

  public static final Block RED_SAND = new Block("minecraft:red_sand", (short) 67, 0.5, 0.6, 1.0, 1.0, "minecraft:red_sand");

  public static final Block GRAVEL = new Block("minecraft:gravel", (short) 68, 0.6, 0.6, 1.0, 1.0, "minecraft:gravel");

  public static final Block GOLD_ORE = new Block("minecraft:gold_ore", (short) 69, 3.0, 0.6, 1.0, 1.0, "minecraft:gold_ore");

  public static final Block IRON_ORE = new Block("minecraft:iron_ore", (short) 70, 3.0, 0.6, 1.0, 1.0, "minecraft:iron_ore");

  public static final Block COAL_ORE = new Block("minecraft:coal_ore", (short) 71, 3.0, 0.6, 1.0, 1.0, "minecraft:coal_ore");

  public static final Block NETHER_GOLD_ORE = new Block("minecraft:nether_gold_ore", (short) 72, 3.0, 0.6, 1.0, 1.0, "minecraft:nether_gold_ore");

  public static final Block OAK_LOG = new Block("minecraft:oak_log", (short) 74, 2.0, 0.6, 1.0, 1.0, "minecraft:oak_log");

  public static final Block SPRUCE_LOG = new Block("minecraft:spruce_log", (short) 77, 2.0, 0.6, 1.0, 1.0, "minecraft:spruce_log");

  public static final Block BIRCH_LOG = new Block("minecraft:birch_log", (short) 80, 2.0, 0.6, 1.0, 1.0, "minecraft:birch_log");

  public static final Block JUNGLE_LOG = new Block("minecraft:jungle_log", (short) 83, 2.0, 0.6, 1.0, 1.0, "minecraft:jungle_log");

  public static final Block ACACIA_LOG = new Block("minecraft:acacia_log", (short) 86, 2.0, 0.6, 1.0, 1.0, "minecraft:acacia_log");

  public static final Block DARK_OAK_LOG = new Block("minecraft:dark_oak_log", (short) 89, 2.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_log");

  public static final Block STRIPPED_SPRUCE_LOG = new Block("minecraft:stripped_spruce_log", (short) 92, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_spruce_log");

  public static final Block STRIPPED_BIRCH_LOG = new Block("minecraft:stripped_birch_log", (short) 95, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_birch_log");

  public static final Block STRIPPED_JUNGLE_LOG = new Block("minecraft:stripped_jungle_log", (short) 98, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_jungle_log");

  public static final Block STRIPPED_ACACIA_LOG = new Block("minecraft:stripped_acacia_log", (short) 101, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_acacia_log");

  public static final Block STRIPPED_DARK_OAK_LOG = new Block("minecraft:stripped_dark_oak_log", (short) 104, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_dark_oak_log");

  public static final Block STRIPPED_OAK_LOG = new Block("minecraft:stripped_oak_log", (short) 107, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_oak_log");

  public static final Block OAK_WOOD = new Block("minecraft:oak_wood", (short) 110, 2.0, 0.6, 1.0, 1.0, "minecraft:oak_wood");

  public static final Block SPRUCE_WOOD = new Block("minecraft:spruce_wood", (short) 113, 2.0, 0.6, 1.0, 1.0, "minecraft:spruce_wood");

  public static final Block BIRCH_WOOD = new Block("minecraft:birch_wood", (short) 116, 2.0, 0.6, 1.0, 1.0, "minecraft:birch_wood");

  public static final Block JUNGLE_WOOD = new Block("minecraft:jungle_wood", (short) 119, 2.0, 0.6, 1.0, 1.0, "minecraft:jungle_wood");

  public static final Block ACACIA_WOOD = new Block("minecraft:acacia_wood", (short) 122, 2.0, 0.6, 1.0, 1.0, "minecraft:acacia_wood");

  public static final Block DARK_OAK_WOOD = new Block("minecraft:dark_oak_wood", (short) 125, 2.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_wood");

  public static final Block STRIPPED_OAK_WOOD = new Block("minecraft:stripped_oak_wood", (short) 128, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_oak_wood");

  public static final Block STRIPPED_SPRUCE_WOOD = new Block("minecraft:stripped_spruce_wood", (short) 131, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_spruce_wood");

  public static final Block STRIPPED_BIRCH_WOOD = new Block("minecraft:stripped_birch_wood", (short) 134, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_birch_wood");

  public static final Block STRIPPED_JUNGLE_WOOD = new Block("minecraft:stripped_jungle_wood", (short) 137, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_jungle_wood");

  public static final Block STRIPPED_ACACIA_WOOD = new Block("minecraft:stripped_acacia_wood", (short) 140, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_acacia_wood");

  public static final Block STRIPPED_DARK_OAK_WOOD = new Block("minecraft:stripped_dark_oak_wood", (short) 143, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_dark_oak_wood");

  public static final Block OAK_LEAVES = new Block("minecraft:oak_leaves", (short) 158, 0.2, 0.6, 1.0, 1.0, "minecraft:oak_leaves");

  public static final Block SPRUCE_LEAVES = new Block("minecraft:spruce_leaves", (short) 172, 0.2, 0.6, 1.0, 1.0, "minecraft:spruce_leaves");

  public static final Block BIRCH_LEAVES = new Block("minecraft:birch_leaves", (short) 186, 0.2, 0.6, 1.0, 1.0, "minecraft:birch_leaves");

  public static final Block JUNGLE_LEAVES = new Block("minecraft:jungle_leaves", (short) 200, 0.2, 0.6, 1.0, 1.0, "minecraft:jungle_leaves");

  public static final Block ACACIA_LEAVES = new Block("minecraft:acacia_leaves", (short) 214, 0.2, 0.6, 1.0, 1.0, "minecraft:acacia_leaves");

  public static final Block DARK_OAK_LEAVES = new Block("minecraft:dark_oak_leaves", (short) 228, 0.2, 0.6, 1.0, 1.0, "minecraft:dark_oak_leaves");

  public static final Block SPONGE = new Block("minecraft:sponge", (short) 229, 0.6, 0.6, 1.0, 1.0, "minecraft:sponge");

  public static final Block WET_SPONGE = new Block("minecraft:wet_sponge", (short) 230, 0.6, 0.6, 1.0, 1.0, "minecraft:wet_sponge");

  public static final Block GLASS = new Block("minecraft:glass", (short) 231, 0.3, 0.6, 1.0, 1.0, "minecraft:glass");

  public static final Block LAPIS_ORE = new Block("minecraft:lapis_ore", (short) 232, 3.0, 0.6, 1.0, 1.0, "minecraft:lapis_ore");

  public static final Block LAPIS_BLOCK = new Block("minecraft:lapis_block", (short) 233, 3.0, 0.6, 1.0, 1.0, "minecraft:lapis_block");

  public static final Block DISPENSER = new Block("minecraft:dispenser", (short) 235, 3.5, 0.6, 1.0, 1.0, "minecraft:dispenser");

  public static final Block SANDSTONE = new Block("minecraft:sandstone", (short) 246, 0.8, 0.6, 1.0, 1.0, "minecraft:sandstone");

  public static final Block CHISELED_SANDSTONE = new Block("minecraft:chiseled_sandstone", (short) 247, 0.8, 0.6, 1.0, 1.0, "minecraft:chiseled_sandstone");

  public static final Block CUT_SANDSTONE = new Block("minecraft:cut_sandstone", (short) 248, 0.8, 0.6, 1.0, 1.0, "minecraft:cut_sandstone");

  public static final Block NOTE_BLOCK = new Block("minecraft:note_block", (short) 250, 0.8, 0.6, 1.0, 1.0, "minecraft:note_block");

  public static final Block WHITE_BED = new Block("minecraft:white_bed", (short) 1052, 0.2, 0.6, 1.0, 1.0, "minecraft:white_bed");

  public static final Block ORANGE_BED = new Block("minecraft:orange_bed", (short) 1068, 0.2, 0.6, 1.0, 1.0, "minecraft:orange_bed");

  public static final Block MAGENTA_BED = new Block("minecraft:magenta_bed", (short) 1084, 0.2, 0.6, 1.0, 1.0, "minecraft:magenta_bed");

  public static final Block LIGHT_BLUE_BED = new Block("minecraft:light_blue_bed", (short) 1100, 0.2, 0.6, 1.0, 1.0, "minecraft:light_blue_bed");

  public static final Block YELLOW_BED = new Block("minecraft:yellow_bed", (short) 1116, 0.2, 0.6, 1.0, 1.0, "minecraft:yellow_bed");

  public static final Block LIME_BED = new Block("minecraft:lime_bed", (short) 1132, 0.2, 0.6, 1.0, 1.0, "minecraft:lime_bed");

  public static final Block PINK_BED = new Block("minecraft:pink_bed", (short) 1148, 0.2, 0.6, 1.0, 1.0, "minecraft:pink_bed");

  public static final Block GRAY_BED = new Block("minecraft:gray_bed", (short) 1164, 0.2, 0.6, 1.0, 1.0, "minecraft:gray_bed");

  public static final Block LIGHT_GRAY_BED = new Block("minecraft:light_gray_bed", (short) 1180, 0.2, 0.6, 1.0, 1.0, "minecraft:light_gray_bed");

  public static final Block CYAN_BED = new Block("minecraft:cyan_bed", (short) 1196, 0.2, 0.6, 1.0, 1.0, "minecraft:cyan_bed");

  public static final Block PURPLE_BED = new Block("minecraft:purple_bed", (short) 1212, 0.2, 0.6, 1.0, 1.0, "minecraft:purple_bed");

  public static final Block BLUE_BED = new Block("minecraft:blue_bed", (short) 1228, 0.2, 0.6, 1.0, 1.0, "minecraft:blue_bed");

  public static final Block BROWN_BED = new Block("minecraft:brown_bed", (short) 1244, 0.2, 0.6, 1.0, 1.0, "minecraft:brown_bed");

  public static final Block GREEN_BED = new Block("minecraft:green_bed", (short) 1260, 0.2, 0.6, 1.0, 1.0, "minecraft:green_bed");

  public static final Block RED_BED = new Block("minecraft:red_bed", (short) 1276, 0.2, 0.6, 1.0, 1.0, "minecraft:red_bed");

  public static final Block BLACK_BED = new Block("minecraft:black_bed", (short) 1292, 0.2, 0.6, 1.0, 1.0, "minecraft:black_bed");

  public static final Block POWERED_RAIL = new Block("minecraft:powered_rail", (short) 1311, 0.7, 0.6, 1.0, 1.0, "minecraft:powered_rail");

  public static final Block DETECTOR_RAIL = new Block("minecraft:detector_rail", (short) 1323, 0.7, 0.6, 1.0, 1.0, "minecraft:detector_rail");

  public static final Block STICKY_PISTON = new Block("minecraft:sticky_piston", (short) 1335, 1.5, 0.6, 1.0, 1.0, "minecraft:sticky_piston");

  public static final Block COBWEB = new Block("minecraft:cobweb", (short) 1341, 4.0, 0.6, 1.0, 1.0, "minecraft:cobweb");

  public static final Block GRASS = new Block("minecraft:grass", (short) 1342, 0.0, 0.6, 1.0, 1.0, "minecraft:grass");

  public static final Block FERN = new Block("minecraft:fern", (short) 1343, 0.0, 0.6, 1.0, 1.0, "minecraft:fern");

  public static final Block DEAD_BUSH = new Block("minecraft:dead_bush", (short) 1344, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_bush");

  public static final Block SEAGRASS = new Block("minecraft:seagrass", (short) 1345, 0.0, 0.6, 1.0, 1.0, "minecraft:seagrass");

  public static final Block TALL_SEAGRASS = new Block("minecraft:tall_seagrass", (short) 1347, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block PISTON = new Block("minecraft:piston", (short) 1354, 1.5, 0.6, 1.0, 1.0, "minecraft:piston");

  public static final Block PISTON_HEAD = new Block("minecraft:piston_head", (short) 1362, 1.5, 0.6, 1.0, 1.0, null);

  public static final Block WHITE_WOOL = new Block("minecraft:white_wool", (short) 1384, 0.8, 0.6, 1.0, 1.0, "minecraft:white_wool");

  public static final Block ORANGE_WOOL = new Block("minecraft:orange_wool", (short) 1385, 0.8, 0.6, 1.0, 1.0, "minecraft:orange_wool");

  public static final Block MAGENTA_WOOL = new Block("minecraft:magenta_wool", (short) 1386, 0.8, 0.6, 1.0, 1.0, "minecraft:magenta_wool");

  public static final Block LIGHT_BLUE_WOOL = new Block("minecraft:light_blue_wool", (short) 1387, 0.8, 0.6, 1.0, 1.0, "minecraft:light_blue_wool");

  public static final Block YELLOW_WOOL = new Block("minecraft:yellow_wool", (short) 1388, 0.8, 0.6, 1.0, 1.0, "minecraft:yellow_wool");

  public static final Block LIME_WOOL = new Block("minecraft:lime_wool", (short) 1389, 0.8, 0.6, 1.0, 1.0, "minecraft:lime_wool");

  public static final Block PINK_WOOL = new Block("minecraft:pink_wool", (short) 1390, 0.8, 0.6, 1.0, 1.0, "minecraft:pink_wool");

  public static final Block GRAY_WOOL = new Block("minecraft:gray_wool", (short) 1391, 0.8, 0.6, 1.0, 1.0, "minecraft:gray_wool");

  public static final Block LIGHT_GRAY_WOOL = new Block("minecraft:light_gray_wool", (short) 1392, 0.8, 0.6, 1.0, 1.0, "minecraft:light_gray_wool");

  public static final Block CYAN_WOOL = new Block("minecraft:cyan_wool", (short) 1393, 0.8, 0.6, 1.0, 1.0, "minecraft:cyan_wool");

  public static final Block PURPLE_WOOL = new Block("minecraft:purple_wool", (short) 1394, 0.8, 0.6, 1.0, 1.0, "minecraft:purple_wool");

  public static final Block BLUE_WOOL = new Block("minecraft:blue_wool", (short) 1395, 0.8, 0.6, 1.0, 1.0, "minecraft:blue_wool");

  public static final Block BROWN_WOOL = new Block("minecraft:brown_wool", (short) 1396, 0.8, 0.6, 1.0, 1.0, "minecraft:brown_wool");

  public static final Block GREEN_WOOL = new Block("minecraft:green_wool", (short) 1397, 0.8, 0.6, 1.0, 1.0, "minecraft:green_wool");

  public static final Block RED_WOOL = new Block("minecraft:red_wool", (short) 1398, 0.8, 0.6, 1.0, 1.0, "minecraft:red_wool");

  public static final Block BLACK_WOOL = new Block("minecraft:black_wool", (short) 1399, 0.8, 0.6, 1.0, 1.0, "minecraft:black_wool");

  public static final Block MOVING_PISTON = new Block("minecraft:moving_piston", (short) 1400, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block DANDELION = new Block("minecraft:dandelion", (short) 1412, 0.0, 0.6, 1.0, 1.0, "minecraft:dandelion");

  public static final Block POPPY = new Block("minecraft:poppy", (short) 1413, 0.0, 0.6, 1.0, 1.0, "minecraft:poppy");

  public static final Block BLUE_ORCHID = new Block("minecraft:blue_orchid", (short) 1414, 0.0, 0.6, 1.0, 1.0, "minecraft:blue_orchid");

  public static final Block ALLIUM = new Block("minecraft:allium", (short) 1415, 0.0, 0.6, 1.0, 1.0, "minecraft:allium");

  public static final Block AZURE_BLUET = new Block("minecraft:azure_bluet", (short) 1416, 0.0, 0.6, 1.0, 1.0, "minecraft:azure_bluet");

  public static final Block RED_TULIP = new Block("minecraft:red_tulip", (short) 1417, 0.0, 0.6, 1.0, 1.0, "minecraft:red_tulip");

  public static final Block ORANGE_TULIP = new Block("minecraft:orange_tulip", (short) 1418, 0.0, 0.6, 1.0, 1.0, "minecraft:orange_tulip");

  public static final Block WHITE_TULIP = new Block("minecraft:white_tulip", (short) 1419, 0.0, 0.6, 1.0, 1.0, "minecraft:white_tulip");

  public static final Block PINK_TULIP = new Block("minecraft:pink_tulip", (short) 1420, 0.0, 0.6, 1.0, 1.0, "minecraft:pink_tulip");

  public static final Block OXEYE_DAISY = new Block("minecraft:oxeye_daisy", (short) 1421, 0.0, 0.6, 1.0, 1.0, "minecraft:oxeye_daisy");

  public static final Block CORNFLOWER = new Block("minecraft:cornflower", (short) 1422, 0.0, 0.6, 1.0, 1.0, "minecraft:cornflower");

  public static final Block WITHER_ROSE = new Block("minecraft:wither_rose", (short) 1423, 0.0, 0.6, 1.0, 1.0, "minecraft:wither_rose");

  public static final Block LILY_OF_THE_VALLEY = new Block("minecraft:lily_of_the_valley", (short) 1424, 0.0, 0.6, 1.0, 1.0, "minecraft:lily_of_the_valley");

  public static final Block BROWN_MUSHROOM = new Block("minecraft:brown_mushroom", (short) 1425, 0.0, 0.6, 1.0, 1.0, "minecraft:brown_mushroom");

  public static final Block RED_MUSHROOM = new Block("minecraft:red_mushroom", (short) 1426, 0.0, 0.6, 1.0, 1.0, "minecraft:red_mushroom");

  public static final Block GOLD_BLOCK = new Block("minecraft:gold_block", (short) 1427, 6.0, 0.6, 1.0, 1.0, "minecraft:gold_block");

  public static final Block IRON_BLOCK = new Block("minecraft:iron_block", (short) 1428, 6.0, 0.6, 1.0, 1.0, "minecraft:iron_block");

  public static final Block BRICKS = new Block("minecraft:bricks", (short) 1429, 6.0, 0.6, 1.0, 1.0, "minecraft:bricks");

  public static final Block TNT = new Block("minecraft:tnt", (short) 1431, 0.0, 0.6, 1.0, 1.0, "minecraft:tnt");

  public static final Block BOOKSHELF = new Block("minecraft:bookshelf", (short) 1432, 1.5, 0.6, 1.0, 1.0, "minecraft:bookshelf");

  public static final Block MOSSY_COBBLESTONE = new Block("minecraft:mossy_cobblestone", (short) 1433, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_cobblestone");

  public static final Block OBSIDIAN = new Block("minecraft:obsidian", (short) 1434, 1200.0, 0.6, 1.0, 1.0, "minecraft:obsidian");

  public static final Block TORCH = new Block("minecraft:torch", (short) 1435, 0.0, 0.6, 1.0, 1.0, "minecraft:torch");

  public static final Block WALL_TORCH = new Block("minecraft:wall_torch", (short) 1436, 0.0, 0.6, 1.0, 1.0, "minecraft:torch");

  public static final Block FIRE = new Block("minecraft:fire", (short) 1471, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block SOUL_FIRE = new Block("minecraft:soul_fire", (short) 1952, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block SPAWNER = new Block("minecraft:spawner", (short) 1953, 5.0, 0.6, 1.0, 1.0, "minecraft:spawner");

  public static final Block OAK_STAIRS = new Block("minecraft:oak_stairs", (short) 1965, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_stairs");

  public static final Block CHEST = new Block("minecraft:chest", (short) 2035, 2.5, 0.6, 1.0, 1.0, "minecraft:chest");

  public static final Block REDSTONE_WIRE = new Block("minecraft:redstone_wire", (short) 3218, 0.0, 0.6, 1.0, 1.0, "minecraft:redstone");

  public static final Block DIAMOND_ORE = new Block("minecraft:diamond_ore", (short) 3354, 3.0, 0.6, 1.0, 1.0, "minecraft:diamond_ore");

  public static final Block DIAMOND_BLOCK = new Block("minecraft:diamond_block", (short) 3355, 6.0, 0.6, 1.0, 1.0, "minecraft:diamond_block");

  public static final Block CRAFTING_TABLE = new Block("minecraft:crafting_table", (short) 3356, 2.5, 0.6, 1.0, 1.0, "minecraft:crafting_table");

  public static final Block WHEAT = new Block("minecraft:wheat", (short) 3357, 0.0, 0.6, 1.0, 1.0, "minecraft:wheat_seeds");

  public static final Block FARMLAND = new Block("minecraft:farmland", (short) 3365, 0.6, 0.6, 1.0, 1.0, "minecraft:farmland");

  public static final Block FURNACE = new Block("minecraft:furnace", (short) 3374, 3.5, 0.6, 1.0, 1.0, "minecraft:furnace");

  public static final Block OAK_SIGN = new Block("minecraft:oak_sign", (short) 3382, 1.0, 0.6, 1.0, 1.0, "minecraft:oak_sign");

  public static final Block SPRUCE_SIGN = new Block("minecraft:spruce_sign", (short) 3414, 1.0, 0.6, 1.0, 1.0, "minecraft:spruce_sign");

  public static final Block BIRCH_SIGN = new Block("minecraft:birch_sign", (short) 3446, 1.0, 0.6, 1.0, 1.0, "minecraft:birch_sign");

  public static final Block ACACIA_SIGN = new Block("minecraft:acacia_sign", (short) 3478, 1.0, 0.6, 1.0, 1.0, "minecraft:acacia_sign");

  public static final Block JUNGLE_SIGN = new Block("minecraft:jungle_sign", (short) 3510, 1.0, 0.6, 1.0, 1.0, "minecraft:jungle_sign");

  public static final Block DARK_OAK_SIGN = new Block("minecraft:dark_oak_sign", (short) 3542, 1.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_sign");

  public static final Block OAK_DOOR = new Block("minecraft:oak_door", (short) 3584, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_door");

  public static final Block LADDER = new Block("minecraft:ladder", (short) 3638, 0.4, 0.6, 1.0, 1.0, "minecraft:ladder");

  public static final Block RAIL = new Block("minecraft:rail", (short) 3645, 0.7, 0.6, 1.0, 1.0, "minecraft:rail");

  public static final Block COBBLESTONE_STAIRS = new Block("minecraft:cobblestone_stairs", (short) 3666, 6.0, 0.6, 1.0, 1.0, "minecraft:cobblestone_stairs");

  public static final Block OAK_WALL_SIGN = new Block("minecraft:oak_wall_sign", (short) 3736, 1.0, 0.6, 1.0, 1.0, "minecraft:oak_sign");

  public static final Block SPRUCE_WALL_SIGN = new Block("minecraft:spruce_wall_sign", (short) 3744, 1.0, 0.6, 1.0, 1.0, "minecraft:spruce_sign");

  public static final Block BIRCH_WALL_SIGN = new Block("minecraft:birch_wall_sign", (short) 3752, 1.0, 0.6, 1.0, 1.0, "minecraft:birch_sign");

  public static final Block ACACIA_WALL_SIGN = new Block("minecraft:acacia_wall_sign", (short) 3760, 1.0, 0.6, 1.0, 1.0, "minecraft:acacia_sign");

  public static final Block JUNGLE_WALL_SIGN = new Block("minecraft:jungle_wall_sign", (short) 3768, 1.0, 0.6, 1.0, 1.0, "minecraft:jungle_sign");

  public static final Block DARK_OAK_WALL_SIGN = new Block("minecraft:dark_oak_wall_sign", (short) 3776, 1.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_sign");

  public static final Block LEVER = new Block("minecraft:lever", (short) 3792, 0.5, 0.6, 1.0, 1.0, "minecraft:lever");

  public static final Block STONE_PRESSURE_PLATE = new Block("minecraft:stone_pressure_plate", (short) 3808, 0.5, 0.6, 1.0, 1.0, "minecraft:stone_pressure_plate");

  public static final Block IRON_DOOR = new Block("minecraft:iron_door", (short) 3820, 5.0, 0.6, 1.0, 1.0, "minecraft:iron_door");

  public static final Block OAK_PRESSURE_PLATE = new Block("minecraft:oak_pressure_plate", (short) 3874, 0.5, 0.6, 1.0, 1.0, "minecraft:oak_pressure_plate");

  public static final Block SPRUCE_PRESSURE_PLATE = new Block("minecraft:spruce_pressure_plate", (short) 3876, 0.5, 0.6, 1.0, 1.0, "minecraft:spruce_pressure_plate");

  public static final Block BIRCH_PRESSURE_PLATE = new Block("minecraft:birch_pressure_plate", (short) 3878, 0.5, 0.6, 1.0, 1.0, "minecraft:birch_pressure_plate");

  public static final Block JUNGLE_PRESSURE_PLATE = new Block("minecraft:jungle_pressure_plate", (short) 3880, 0.5, 0.6, 1.0, 1.0, "minecraft:jungle_pressure_plate");

  public static final Block ACACIA_PRESSURE_PLATE = new Block("minecraft:acacia_pressure_plate", (short) 3882, 0.5, 0.6, 1.0, 1.0, "minecraft:acacia_pressure_plate");

  public static final Block DARK_OAK_PRESSURE_PLATE = new Block("minecraft:dark_oak_pressure_plate", (short) 3884, 0.5, 0.6, 1.0, 1.0, "minecraft:dark_oak_pressure_plate");

  public static final Block REDSTONE_ORE = new Block("minecraft:redstone_ore", (short) 3886, 3.0, 0.6, 1.0, 1.0, "minecraft:redstone_ore");

  public static final Block REDSTONE_TORCH = new Block("minecraft:redstone_torch", (short) 3887, 0.0, 0.6, 1.0, 1.0, "minecraft:redstone_torch");

  public static final Block REDSTONE_WALL_TORCH = new Block("minecraft:redstone_wall_torch", (short) 3889, 0.0, 0.6, 1.0, 1.0, "minecraft:redstone_torch");

  public static final Block STONE_BUTTON = new Block("minecraft:stone_button", (short) 3906, 0.5, 0.6, 1.0, 1.0, "minecraft:stone_button");

  public static final Block SNOW = new Block("minecraft:snow", (short) 3921, 0.1, 0.6, 1.0, 1.0, "minecraft:snow");

  public static final Block ICE = new Block("minecraft:ice", (short) 3929, 0.5, 0.98, 1.0, 1.0, "minecraft:ice");

  public static final Block SNOW_BLOCK = new Block("minecraft:snow_block", (short) 3930, 0.2, 0.6, 1.0, 1.0, "minecraft:snow_block");

  public static final Block CACTUS = new Block("minecraft:cactus", (short) 3931, 0.4, 0.6, 1.0, 1.0, "minecraft:cactus");

  public static final Block CLAY = new Block("minecraft:clay", (short) 3947, 0.6, 0.6, 1.0, 1.0, "minecraft:clay");

  public static final Block SUGAR_CANE = new Block("minecraft:sugar_cane", (short) 3948, 0.0, 0.6, 1.0, 1.0, "minecraft:sugar_cane");

  public static final Block JUKEBOX = new Block("minecraft:jukebox", (short) 3965, 6.0, 0.6, 1.0, 1.0, "minecraft:jukebox");

  public static final Block OAK_FENCE = new Block("minecraft:oak_fence", (short) 3997, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_fence");

  public static final Block PUMPKIN = new Block("minecraft:pumpkin", (short) 3998, 1.0, 0.6, 1.0, 1.0, "minecraft:pumpkin");

  public static final Block NETHERRACK = new Block("minecraft:netherrack", (short) 3999, 0.4, 0.6, 1.0, 1.0, "minecraft:netherrack");

  public static final Block SOUL_SAND = new Block("minecraft:soul_sand", (short) 4000, 0.5, 0.6, 0.4, 1.0, "minecraft:soul_sand");

  public static final Block SOUL_SOIL = new Block("minecraft:soul_soil", (short) 4001, 0.5, 0.6, 1.0, 1.0, "minecraft:soul_soil");

  public static final Block BASALT = new Block("minecraft:basalt", (short) 4003, 4.2, 0.6, 1.0, 1.0, "minecraft:basalt");

  public static final Block POLISHED_BASALT = new Block("minecraft:polished_basalt", (short) 4006, 4.2, 0.6, 1.0, 1.0, "minecraft:polished_basalt");

  public static final Block SOUL_TORCH = new Block("minecraft:soul_torch", (short) 4008, 0.0, 0.6, 1.0, 1.0, "minecraft:soul_torch");

  public static final Block SOUL_WALL_TORCH = new Block("minecraft:soul_wall_torch", (short) 4009, 0.0, 0.6, 1.0, 1.0, "minecraft:soul_torch");

  public static final Block GLOWSTONE = new Block("minecraft:glowstone", (short) 4013, 0.3, 0.6, 1.0, 1.0, "minecraft:glowstone");

  public static final Block NETHER_PORTAL = new Block("minecraft:nether_portal", (short) 4014, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block CARVED_PUMPKIN = new Block("minecraft:carved_pumpkin", (short) 4016, 1.0, 0.6, 1.0, 1.0, "minecraft:carved_pumpkin");

  public static final Block JACK_O_LANTERN = new Block("minecraft:jack_o_lantern", (short) 4020, 1.0, 0.6, 1.0, 1.0, "minecraft:jack_o_lantern");

  public static final Block CAKE = new Block("minecraft:cake", (short) 4024, 0.5, 0.6, 1.0, 1.0, "minecraft:cake");

  public static final Block REPEATER = new Block("minecraft:repeater", (short) 4034, 0.0, 0.6, 1.0, 1.0, "minecraft:repeater");

  public static final Block WHITE_STAINED_GLASS = new Block("minecraft:white_stained_glass", (short) 4095, 0.3, 0.6, 1.0, 1.0, "minecraft:white_stained_glass");

  public static final Block ORANGE_STAINED_GLASS = new Block("minecraft:orange_stained_glass", (short) 4096, 0.3, 0.6, 1.0, 1.0, "minecraft:orange_stained_glass");

  public static final Block MAGENTA_STAINED_GLASS = new Block("minecraft:magenta_stained_glass", (short) 4097, 0.3, 0.6, 1.0, 1.0, "minecraft:magenta_stained_glass");

  public static final Block LIGHT_BLUE_STAINED_GLASS = new Block("minecraft:light_blue_stained_glass", (short) 4098, 0.3, 0.6, 1.0, 1.0, "minecraft:light_blue_stained_glass");

  public static final Block YELLOW_STAINED_GLASS = new Block("minecraft:yellow_stained_glass", (short) 4099, 0.3, 0.6, 1.0, 1.0, "minecraft:yellow_stained_glass");

  public static final Block LIME_STAINED_GLASS = new Block("minecraft:lime_stained_glass", (short) 4100, 0.3, 0.6, 1.0, 1.0, "minecraft:lime_stained_glass");

  public static final Block PINK_STAINED_GLASS = new Block("minecraft:pink_stained_glass", (short) 4101, 0.3, 0.6, 1.0, 1.0, "minecraft:pink_stained_glass");

  public static final Block GRAY_STAINED_GLASS = new Block("minecraft:gray_stained_glass", (short) 4102, 0.3, 0.6, 1.0, 1.0, "minecraft:gray_stained_glass");

  public static final Block LIGHT_GRAY_STAINED_GLASS = new Block("minecraft:light_gray_stained_glass", (short) 4103, 0.3, 0.6, 1.0, 1.0, "minecraft:light_gray_stained_glass");

  public static final Block CYAN_STAINED_GLASS = new Block("minecraft:cyan_stained_glass", (short) 4104, 0.3, 0.6, 1.0, 1.0, "minecraft:cyan_stained_glass");

  public static final Block PURPLE_STAINED_GLASS = new Block("minecraft:purple_stained_glass", (short) 4105, 0.3, 0.6, 1.0, 1.0, "minecraft:purple_stained_glass");

  public static final Block BLUE_STAINED_GLASS = new Block("minecraft:blue_stained_glass", (short) 4106, 0.3, 0.6, 1.0, 1.0, "minecraft:blue_stained_glass");

  public static final Block BROWN_STAINED_GLASS = new Block("minecraft:brown_stained_glass", (short) 4107, 0.3, 0.6, 1.0, 1.0, "minecraft:brown_stained_glass");

  public static final Block GREEN_STAINED_GLASS = new Block("minecraft:green_stained_glass", (short) 4108, 0.3, 0.6, 1.0, 1.0, "minecraft:green_stained_glass");

  public static final Block RED_STAINED_GLASS = new Block("minecraft:red_stained_glass", (short) 4109, 0.3, 0.6, 1.0, 1.0, "minecraft:red_stained_glass");

  public static final Block BLACK_STAINED_GLASS = new Block("minecraft:black_stained_glass", (short) 4110, 0.3, 0.6, 1.0, 1.0, "minecraft:black_stained_glass");

  public static final Block OAK_TRAPDOOR = new Block("minecraft:oak_trapdoor", (short) 4126, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_trapdoor");

  public static final Block SPRUCE_TRAPDOOR = new Block("minecraft:spruce_trapdoor", (short) 4190, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_trapdoor");

  public static final Block BIRCH_TRAPDOOR = new Block("minecraft:birch_trapdoor", (short) 4254, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_trapdoor");

  public static final Block JUNGLE_TRAPDOOR = new Block("minecraft:jungle_trapdoor", (short) 4318, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_trapdoor");

  public static final Block ACACIA_TRAPDOOR = new Block("minecraft:acacia_trapdoor", (short) 4382, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_trapdoor");

  public static final Block DARK_OAK_TRAPDOOR = new Block("minecraft:dark_oak_trapdoor", (short) 4446, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_trapdoor");

  public static final Block STONE_BRICKS = new Block("minecraft:stone_bricks", (short) 4495, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_bricks");

  public static final Block MOSSY_STONE_BRICKS = new Block("minecraft:mossy_stone_bricks", (short) 4496, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_stone_bricks");

  public static final Block CRACKED_STONE_BRICKS = new Block("minecraft:cracked_stone_bricks", (short) 4497, 6.0, 0.6, 1.0, 1.0, "minecraft:cracked_stone_bricks");

  public static final Block CHISELED_STONE_BRICKS = new Block("minecraft:chiseled_stone_bricks", (short) 4498, 6.0, 0.6, 1.0, 1.0, "minecraft:chiseled_stone_bricks");

  public static final Block INFESTED_STONE = new Block("minecraft:infested_stone", (short) 4499, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_stone");

  public static final Block INFESTED_COBBLESTONE = new Block("minecraft:infested_cobblestone", (short) 4500, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_cobblestone");

  public static final Block INFESTED_STONE_BRICKS = new Block("minecraft:infested_stone_bricks", (short) 4501, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_stone_bricks");

  public static final Block INFESTED_MOSSY_STONE_BRICKS = new Block("minecraft:infested_mossy_stone_bricks", (short) 4502, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_mossy_stone_bricks");

  public static final Block INFESTED_CRACKED_STONE_BRICKS = new Block("minecraft:infested_cracked_stone_bricks", (short) 4503, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_cracked_stone_bricks");

  public static final Block INFESTED_CHISELED_STONE_BRICKS = new Block("minecraft:infested_chiseled_stone_bricks", (short) 4504, 0.75, 0.6, 1.0, 1.0, "minecraft:infested_chiseled_stone_bricks");

  public static final Block BROWN_MUSHROOM_BLOCK = new Block("minecraft:brown_mushroom_block", (short) 4505, 0.2, 0.6, 1.0, 1.0, "minecraft:brown_mushroom_block");

  public static final Block RED_MUSHROOM_BLOCK = new Block("minecraft:red_mushroom_block", (short) 4569, 0.2, 0.6, 1.0, 1.0, "minecraft:red_mushroom_block");

  public static final Block MUSHROOM_STEM = new Block("minecraft:mushroom_stem", (short) 4633, 0.2, 0.6, 1.0, 1.0, "minecraft:mushroom_stem");

  public static final Block IRON_BARS = new Block("minecraft:iron_bars", (short) 4728, 6.0, 0.6, 1.0, 1.0, "minecraft:iron_bars");

  public static final Block CHAIN = new Block("minecraft:chain", (short) 4732, 6.0, 0.6, 1.0, 1.0, "minecraft:chain");

  public static final Block GLASS_PANE = new Block("minecraft:glass_pane", (short) 4766, 0.3, 0.6, 1.0, 1.0, "minecraft:glass_pane");

  public static final Block MELON = new Block("minecraft:melon", (short) 4767, 1.0, 0.6, 1.0, 1.0, "minecraft:melon");

  public static final Block ATTACHED_PUMPKIN_STEM = new Block("minecraft:attached_pumpkin_stem", (short) 4768, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block ATTACHED_MELON_STEM = new Block("minecraft:attached_melon_stem", (short) 4772, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block PUMPKIN_STEM = new Block("minecraft:pumpkin_stem", (short) 4776, 0.0, 0.6, 1.0, 1.0, "minecraft:pumpkin_seeds");

  public static final Block MELON_STEM = new Block("minecraft:melon_stem", (short) 4784, 0.0, 0.6, 1.0, 1.0, "minecraft:melon_seeds");

  public static final Block VINE = new Block("minecraft:vine", (short) 4823, 0.2, 0.6, 1.0, 1.0, "minecraft:vine");

  public static final Block OAK_FENCE_GATE = new Block("minecraft:oak_fence_gate", (short) 4831, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_fence_gate");

  public static final Block BRICK_STAIRS = new Block("minecraft:brick_stairs", (short) 4867, 6.0, 0.6, 1.0, 1.0, "minecraft:brick_stairs");

  public static final Block STONE_BRICK_STAIRS = new Block("minecraft:stone_brick_stairs", (short) 4947, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_brick_stairs");

  public static final Block MYCELIUM = new Block("minecraft:mycelium", (short) 5017, 0.6, 0.6, 1.0, 1.0, "minecraft:mycelium");

  public static final Block LILY_PAD = new Block("minecraft:lily_pad", (short) 5018, 0.0, 0.6, 1.0, 1.0, "minecraft:lily_pad");

  public static final Block NETHER_BRICKS = new Block("minecraft:nether_bricks", (short) 5019, 6.0, 0.6, 1.0, 1.0, "minecraft:nether_bricks");

  public static final Block NETHER_BRICK_FENCE = new Block("minecraft:nether_brick_fence", (short) 5051, 6.0, 0.6, 1.0, 1.0, "minecraft:nether_brick_fence");

  public static final Block NETHER_BRICK_STAIRS = new Block("minecraft:nether_brick_stairs", (short) 5063, 6.0, 0.6, 1.0, 1.0, "minecraft:nether_brick_stairs");

  public static final Block NETHER_WART = new Block("minecraft:nether_wart", (short) 5132, 0.0, 0.6, 1.0, 1.0, "minecraft:nether_wart");

  public static final Block ENCHANTING_TABLE = new Block("minecraft:enchanting_table", (short) 5136, 1200.0, 0.6, 1.0, 1.0, "minecraft:enchanting_table");

  public static final Block BREWING_STAND = new Block("minecraft:brewing_stand", (short) 5144, 0.5, 0.6, 1.0, 1.0, "minecraft:brewing_stand");

  public static final Block CAULDRON = new Block("minecraft:cauldron", (short) 5145, 2.0, 0.6, 1.0, 1.0, "minecraft:cauldron");

  public static final Block END_PORTAL = new Block("minecraft:end_portal", (short) 5149, 3600000.0, 0.6, 1.0, 1.0, null);

  public static final Block END_PORTAL_FRAME = new Block("minecraft:end_portal_frame", (short) 5154, 3600000.0, 0.6, 1.0, 1.0, "minecraft:end_portal_frame");

  public static final Block END_STONE = new Block("minecraft:end_stone", (short) 5158, 9.0, 0.6, 1.0, 1.0, "minecraft:end_stone");

  public static final Block DRAGON_EGG = new Block("minecraft:dragon_egg", (short) 5159, 9.0, 0.6, 1.0, 1.0, "minecraft:dragon_egg");

  public static final Block REDSTONE_LAMP = new Block("minecraft:redstone_lamp", (short) 5161, 0.3, 0.6, 1.0, 1.0, "minecraft:redstone_lamp");

  public static final Block COCOA = new Block("minecraft:cocoa", (short) 5162, 3.0, 0.6, 1.0, 1.0, "minecraft:cocoa_beans");

  public static final Block SANDSTONE_STAIRS = new Block("minecraft:sandstone_stairs", (short) 5185, 0.8, 0.6, 1.0, 1.0, "minecraft:sandstone_stairs");

  public static final Block EMERALD_ORE = new Block("minecraft:emerald_ore", (short) 5254, 3.0, 0.6, 1.0, 1.0, "minecraft:emerald_ore");

  public static final Block ENDER_CHEST = new Block("minecraft:ender_chest", (short) 5256, 600.0, 0.6, 1.0, 1.0, "minecraft:ender_chest");

  public static final Block TRIPWIRE_HOOK = new Block("minecraft:tripwire_hook", (short) 5272, 0.0, 0.6, 1.0, 1.0, "minecraft:tripwire_hook");

  public static final Block TRIPWIRE = new Block("minecraft:tripwire", (short) 5406, 0.0, 0.6, 1.0, 1.0, "minecraft:string");

  public static final Block EMERALD_BLOCK = new Block("minecraft:emerald_block", (short) 5407, 6.0, 0.6, 1.0, 1.0, "minecraft:emerald_block");

  public static final Block SPRUCE_STAIRS = new Block("minecraft:spruce_stairs", (short) 5419, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_stairs");

  public static final Block BIRCH_STAIRS = new Block("minecraft:birch_stairs", (short) 5499, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_stairs");

  public static final Block JUNGLE_STAIRS = new Block("minecraft:jungle_stairs", (short) 5579, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_stairs");

  public static final Block COMMAND_BLOCK = new Block("minecraft:command_block", (short) 5654, 3600000.0, 0.6, 1.0, 1.0, "minecraft:command_block");

  public static final Block BEACON = new Block("minecraft:beacon", (short) 5660, 3.0, 0.6, 1.0, 1.0, "minecraft:beacon");

  public static final Block COBBLESTONE_WALL = new Block("minecraft:cobblestone_wall", (short) 5664, 6.0, 0.6, 1.0, 1.0, "minecraft:cobblestone_wall");

  public static final Block MOSSY_COBBLESTONE_WALL = new Block("minecraft:mossy_cobblestone_wall", (short) 5988, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_cobblestone_wall");

  public static final Block FLOWER_POT = new Block("minecraft:flower_pot", (short) 6309, 0.0, 0.6, 1.0, 1.0, "minecraft:flower_pot");

  public static final Block POTTED_OAK_SAPLING = new Block("minecraft:potted_oak_sapling", (short) 6310, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_SPRUCE_SAPLING = new Block("minecraft:potted_spruce_sapling", (short) 6311, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_BIRCH_SAPLING = new Block("minecraft:potted_birch_sapling", (short) 6312, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_JUNGLE_SAPLING = new Block("minecraft:potted_jungle_sapling", (short) 6313, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_ACACIA_SAPLING = new Block("minecraft:potted_acacia_sapling", (short) 6314, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_DARK_OAK_SAPLING = new Block("minecraft:potted_dark_oak_sapling", (short) 6315, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_FERN = new Block("minecraft:potted_fern", (short) 6316, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_DANDELION = new Block("minecraft:potted_dandelion", (short) 6317, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_POPPY = new Block("minecraft:potted_poppy", (short) 6318, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_BLUE_ORCHID = new Block("minecraft:potted_blue_orchid", (short) 6319, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_ALLIUM = new Block("minecraft:potted_allium", (short) 6320, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_AZURE_BLUET = new Block("minecraft:potted_azure_bluet", (short) 6321, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_RED_TULIP = new Block("minecraft:potted_red_tulip", (short) 6322, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_ORANGE_TULIP = new Block("minecraft:potted_orange_tulip", (short) 6323, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_WHITE_TULIP = new Block("minecraft:potted_white_tulip", (short) 6324, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_PINK_TULIP = new Block("minecraft:potted_pink_tulip", (short) 6325, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_OXEYE_DAISY = new Block("minecraft:potted_oxeye_daisy", (short) 6326, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_CORNFLOWER = new Block("minecraft:potted_cornflower", (short) 6327, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_LILY_OF_THE_VALLEY = new Block("minecraft:potted_lily_of_the_valley", (short) 6328, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_WITHER_ROSE = new Block("minecraft:potted_wither_rose", (short) 6329, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_RED_MUSHROOM = new Block("minecraft:potted_red_mushroom", (short) 6330, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_BROWN_MUSHROOM = new Block("minecraft:potted_brown_mushroom", (short) 6331, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_DEAD_BUSH = new Block("minecraft:potted_dead_bush", (short) 6332, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_CACTUS = new Block("minecraft:potted_cactus", (short) 6333, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block CARROTS = new Block("minecraft:carrots", (short) 6334, 0.0, 0.6, 1.0, 1.0, "minecraft:carrot");

  public static final Block POTATOES = new Block("minecraft:potatoes", (short) 6342, 0.0, 0.6, 1.0, 1.0, "minecraft:potato");

  public static final Block OAK_BUTTON = new Block("minecraft:oak_button", (short) 6359, 0.5, 0.6, 1.0, 1.0, "minecraft:oak_button");

  public static final Block SPRUCE_BUTTON = new Block("minecraft:spruce_button", (short) 6383, 0.5, 0.6, 1.0, 1.0, "minecraft:spruce_button");

  public static final Block BIRCH_BUTTON = new Block("minecraft:birch_button", (short) 6407, 0.5, 0.6, 1.0, 1.0, "minecraft:birch_button");

  public static final Block JUNGLE_BUTTON = new Block("minecraft:jungle_button", (short) 6431, 0.5, 0.6, 1.0, 1.0, "minecraft:jungle_button");

  public static final Block ACACIA_BUTTON = new Block("minecraft:acacia_button", (short) 6455, 0.5, 0.6, 1.0, 1.0, "minecraft:acacia_button");

  public static final Block DARK_OAK_BUTTON = new Block("minecraft:dark_oak_button", (short) 6479, 0.5, 0.6, 1.0, 1.0, "minecraft:dark_oak_button");

  public static final Block SKELETON_SKULL = new Block("minecraft:skeleton_skull", (short) 6494, 1.0, 0.6, 1.0, 1.0, "minecraft:skeleton_skull");

  public static final Block SKELETON_WALL_SKULL = new Block("minecraft:skeleton_wall_skull", (short) 6510, 1.0, 0.6, 1.0, 1.0, "minecraft:skeleton_skull");

  public static final Block WITHER_SKELETON_SKULL = new Block("minecraft:wither_skeleton_skull", (short) 6514, 1.0, 0.6, 1.0, 1.0, "minecraft:wither_skeleton_skull");

  public static final Block WITHER_SKELETON_WALL_SKULL = new Block("minecraft:wither_skeleton_wall_skull", (short) 6530, 1.0, 0.6, 1.0, 1.0, "minecraft:wither_skeleton_skull");

  public static final Block ZOMBIE_HEAD = new Block("minecraft:zombie_head", (short) 6534, 1.0, 0.6, 1.0, 1.0, "minecraft:zombie_head");

  public static final Block ZOMBIE_WALL_HEAD = new Block("minecraft:zombie_wall_head", (short) 6550, 1.0, 0.6, 1.0, 1.0, "minecraft:zombie_head");

  public static final Block PLAYER_HEAD = new Block("minecraft:player_head", (short) 6554, 1.0, 0.6, 1.0, 1.0, "minecraft:player_head");

  public static final Block PLAYER_WALL_HEAD = new Block("minecraft:player_wall_head", (short) 6570, 1.0, 0.6, 1.0, 1.0, "minecraft:player_head");

  public static final Block CREEPER_HEAD = new Block("minecraft:creeper_head", (short) 6574, 1.0, 0.6, 1.0, 1.0, "minecraft:creeper_head");

  public static final Block CREEPER_WALL_HEAD = new Block("minecraft:creeper_wall_head", (short) 6590, 1.0, 0.6, 1.0, 1.0, "minecraft:creeper_head");

  public static final Block DRAGON_HEAD = new Block("minecraft:dragon_head", (short) 6594, 1.0, 0.6, 1.0, 1.0, "minecraft:dragon_head");

  public static final Block DRAGON_WALL_HEAD = new Block("minecraft:dragon_wall_head", (short) 6610, 1.0, 0.6, 1.0, 1.0, "minecraft:dragon_head");

  public static final Block ANVIL = new Block("minecraft:anvil", (short) 6614, 1200.0, 0.6, 1.0, 1.0, "minecraft:anvil");

  public static final Block CHIPPED_ANVIL = new Block("minecraft:chipped_anvil", (short) 6618, 1200.0, 0.6, 1.0, 1.0, "minecraft:chipped_anvil");

  public static final Block DAMAGED_ANVIL = new Block("minecraft:damaged_anvil", (short) 6622, 1200.0, 0.6, 1.0, 1.0, "minecraft:damaged_anvil");

  public static final Block TRAPPED_CHEST = new Block("minecraft:trapped_chest", (short) 6627, 2.5, 0.6, 1.0, 1.0, "minecraft:trapped_chest");

  public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE = new Block("minecraft:light_weighted_pressure_plate", (short) 6650, 0.5, 0.6, 1.0, 1.0, "minecraft:light_weighted_pressure_plate");

  public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE = new Block("minecraft:heavy_weighted_pressure_plate", (short) 6666, 0.5, 0.6, 1.0, 1.0, "minecraft:heavy_weighted_pressure_plate");

  public static final Block COMPARATOR = new Block("minecraft:comparator", (short) 6683, 0.0, 0.6, 1.0, 1.0, "minecraft:comparator");

  public static final Block DAYLIGHT_DETECTOR = new Block("minecraft:daylight_detector", (short) 6714, 0.2, 0.6, 1.0, 1.0, "minecraft:daylight_detector");

  public static final Block REDSTONE_BLOCK = new Block("minecraft:redstone_block", (short) 6730, 6.0, 0.6, 1.0, 1.0, "minecraft:redstone_block");

  public static final Block NETHER_QUARTZ_ORE = new Block("minecraft:nether_quartz_ore", (short) 6731, 3.0, 0.6, 1.0, 1.0, "minecraft:nether_quartz_ore");

  public static final Block HOPPER = new Block("minecraft:hopper", (short) 6732, 4.8, 0.6, 1.0, 1.0, "minecraft:hopper");

  public static final Block QUARTZ_BLOCK = new Block("minecraft:quartz_block", (short) 6742, 0.8, 0.6, 1.0, 1.0, "minecraft:quartz_block");

  public static final Block CHISELED_QUARTZ_BLOCK = new Block("minecraft:chiseled_quartz_block", (short) 6743, 0.8, 0.6, 1.0, 1.0, "minecraft:chiseled_quartz_block");

  public static final Block QUARTZ_PILLAR = new Block("minecraft:quartz_pillar", (short) 6745, 0.8, 0.6, 1.0, 1.0, "minecraft:quartz_pillar");

  public static final Block QUARTZ_STAIRS = new Block("minecraft:quartz_stairs", (short) 6758, 0.8, 0.6, 1.0, 1.0, "minecraft:quartz_stairs");

  public static final Block ACTIVATOR_RAIL = new Block("minecraft:activator_rail", (short) 6833, 0.7, 0.6, 1.0, 1.0, "minecraft:activator_rail");

  public static final Block DROPPER = new Block("minecraft:dropper", (short) 6840, 3.5, 0.6, 1.0, 1.0, "minecraft:dropper");

  public static final Block WHITE_TERRACOTTA = new Block("minecraft:white_terracotta", (short) 6851, 4.2, 0.6, 1.0, 1.0, "minecraft:white_terracotta");

  public static final Block ORANGE_TERRACOTTA = new Block("minecraft:orange_terracotta", (short) 6852, 4.2, 0.6, 1.0, 1.0, "minecraft:orange_terracotta");

  public static final Block MAGENTA_TERRACOTTA = new Block("minecraft:magenta_terracotta", (short) 6853, 4.2, 0.6, 1.0, 1.0, "minecraft:magenta_terracotta");

  public static final Block LIGHT_BLUE_TERRACOTTA = new Block("minecraft:light_blue_terracotta", (short) 6854, 4.2, 0.6, 1.0, 1.0, "minecraft:light_blue_terracotta");

  public static final Block YELLOW_TERRACOTTA = new Block("minecraft:yellow_terracotta", (short) 6855, 4.2, 0.6, 1.0, 1.0, "minecraft:yellow_terracotta");

  public static final Block LIME_TERRACOTTA = new Block("minecraft:lime_terracotta", (short) 6856, 4.2, 0.6, 1.0, 1.0, "minecraft:lime_terracotta");

  public static final Block PINK_TERRACOTTA = new Block("minecraft:pink_terracotta", (short) 6857, 4.2, 0.6, 1.0, 1.0, "minecraft:pink_terracotta");

  public static final Block GRAY_TERRACOTTA = new Block("minecraft:gray_terracotta", (short) 6858, 4.2, 0.6, 1.0, 1.0, "minecraft:gray_terracotta");

  public static final Block LIGHT_GRAY_TERRACOTTA = new Block("minecraft:light_gray_terracotta", (short) 6859, 4.2, 0.6, 1.0, 1.0, "minecraft:light_gray_terracotta");

  public static final Block CYAN_TERRACOTTA = new Block("minecraft:cyan_terracotta", (short) 6860, 4.2, 0.6, 1.0, 1.0, "minecraft:cyan_terracotta");

  public static final Block PURPLE_TERRACOTTA = new Block("minecraft:purple_terracotta", (short) 6861, 4.2, 0.6, 1.0, 1.0, "minecraft:purple_terracotta");

  public static final Block BLUE_TERRACOTTA = new Block("minecraft:blue_terracotta", (short) 6862, 4.2, 0.6, 1.0, 1.0, "minecraft:blue_terracotta");

  public static final Block BROWN_TERRACOTTA = new Block("minecraft:brown_terracotta", (short) 6863, 4.2, 0.6, 1.0, 1.0, "minecraft:brown_terracotta");

  public static final Block GREEN_TERRACOTTA = new Block("minecraft:green_terracotta", (short) 6864, 4.2, 0.6, 1.0, 1.0, "minecraft:green_terracotta");

  public static final Block RED_TERRACOTTA = new Block("minecraft:red_terracotta", (short) 6865, 4.2, 0.6, 1.0, 1.0, "minecraft:red_terracotta");

  public static final Block BLACK_TERRACOTTA = new Block("minecraft:black_terracotta", (short) 6866, 4.2, 0.6, 1.0, 1.0, "minecraft:black_terracotta");

  public static final Block WHITE_STAINED_GLASS_PANE = new Block("minecraft:white_stained_glass_pane", (short) 6898, 0.3, 0.6, 1.0, 1.0, "minecraft:white_stained_glass_pane");

  public static final Block ORANGE_STAINED_GLASS_PANE = new Block("minecraft:orange_stained_glass_pane", (short) 6930, 0.3, 0.6, 1.0, 1.0, "minecraft:orange_stained_glass_pane");

  public static final Block MAGENTA_STAINED_GLASS_PANE = new Block("minecraft:magenta_stained_glass_pane", (short) 6962, 0.3, 0.6, 1.0, 1.0, "minecraft:magenta_stained_glass_pane");

  public static final Block LIGHT_BLUE_STAINED_GLASS_PANE = new Block("minecraft:light_blue_stained_glass_pane", (short) 6994, 0.3, 0.6, 1.0, 1.0, "minecraft:light_blue_stained_glass_pane");

  public static final Block YELLOW_STAINED_GLASS_PANE = new Block("minecraft:yellow_stained_glass_pane", (short) 7026, 0.3, 0.6, 1.0, 1.0, "minecraft:yellow_stained_glass_pane");

  public static final Block LIME_STAINED_GLASS_PANE = new Block("minecraft:lime_stained_glass_pane", (short) 7058, 0.3, 0.6, 1.0, 1.0, "minecraft:lime_stained_glass_pane");

  public static final Block PINK_STAINED_GLASS_PANE = new Block("minecraft:pink_stained_glass_pane", (short) 7090, 0.3, 0.6, 1.0, 1.0, "minecraft:pink_stained_glass_pane");

  public static final Block GRAY_STAINED_GLASS_PANE = new Block("minecraft:gray_stained_glass_pane", (short) 7122, 0.3, 0.6, 1.0, 1.0, "minecraft:gray_stained_glass_pane");

  public static final Block LIGHT_GRAY_STAINED_GLASS_PANE = new Block("minecraft:light_gray_stained_glass_pane", (short) 7154, 0.3, 0.6, 1.0, 1.0, "minecraft:light_gray_stained_glass_pane");

  public static final Block CYAN_STAINED_GLASS_PANE = new Block("minecraft:cyan_stained_glass_pane", (short) 7186, 0.3, 0.6, 1.0, 1.0, "minecraft:cyan_stained_glass_pane");

  public static final Block PURPLE_STAINED_GLASS_PANE = new Block("minecraft:purple_stained_glass_pane", (short) 7218, 0.3, 0.6, 1.0, 1.0, "minecraft:purple_stained_glass_pane");

  public static final Block BLUE_STAINED_GLASS_PANE = new Block("minecraft:blue_stained_glass_pane", (short) 7250, 0.3, 0.6, 1.0, 1.0, "minecraft:blue_stained_glass_pane");

  public static final Block BROWN_STAINED_GLASS_PANE = new Block("minecraft:brown_stained_glass_pane", (short) 7282, 0.3, 0.6, 1.0, 1.0, "minecraft:brown_stained_glass_pane");

  public static final Block GREEN_STAINED_GLASS_PANE = new Block("minecraft:green_stained_glass_pane", (short) 7314, 0.3, 0.6, 1.0, 1.0, "minecraft:green_stained_glass_pane");

  public static final Block RED_STAINED_GLASS_PANE = new Block("minecraft:red_stained_glass_pane", (short) 7346, 0.3, 0.6, 1.0, 1.0, "minecraft:red_stained_glass_pane");

  public static final Block BLACK_STAINED_GLASS_PANE = new Block("minecraft:black_stained_glass_pane", (short) 7378, 0.3, 0.6, 1.0, 1.0, "minecraft:black_stained_glass_pane");

  public static final Block ACACIA_STAIRS = new Block("minecraft:acacia_stairs", (short) 7390, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_stairs");

  public static final Block DARK_OAK_STAIRS = new Block("minecraft:dark_oak_stairs", (short) 7470, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_stairs");

  public static final Block SLIME_BLOCK = new Block("minecraft:slime_block", (short) 7539, 0.0, 0.8, 1.0, 1.0, "minecraft:slime_block");

  public static final Block BARRIER = new Block("minecraft:barrier", (short) 7540, 3600000.8, 0.6, 1.0, 1.0, "minecraft:barrier");

  public static final Block IRON_TRAPDOOR = new Block("minecraft:iron_trapdoor", (short) 7556, 5.0, 0.6, 1.0, 1.0, "minecraft:iron_trapdoor");

  public static final Block PRISMARINE = new Block("minecraft:prismarine", (short) 7605, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine");

  public static final Block PRISMARINE_BRICKS = new Block("minecraft:prismarine_bricks", (short) 7606, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_bricks");

  public static final Block DARK_PRISMARINE = new Block("minecraft:dark_prismarine", (short) 7607, 6.0, 0.6, 1.0, 1.0, "minecraft:dark_prismarine");

  public static final Block PRISMARINE_STAIRS = new Block("minecraft:prismarine_stairs", (short) 7619, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_stairs");

  public static final Block PRISMARINE_BRICK_STAIRS = new Block("minecraft:prismarine_brick_stairs", (short) 7699, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_brick_stairs");

  public static final Block DARK_PRISMARINE_STAIRS = new Block("minecraft:dark_prismarine_stairs", (short) 7779, 6.0, 0.6, 1.0, 1.0, "minecraft:dark_prismarine_stairs");

  public static final Block PRISMARINE_SLAB = new Block("minecraft:prismarine_slab", (short) 7851, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_slab");

  public static final Block PRISMARINE_BRICK_SLAB = new Block("minecraft:prismarine_brick_slab", (short) 7857, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_brick_slab");

  public static final Block DARK_PRISMARINE_SLAB = new Block("minecraft:dark_prismarine_slab", (short) 7863, 6.0, 0.6, 1.0, 1.0, "minecraft:dark_prismarine_slab");

  public static final Block SEA_LANTERN = new Block("minecraft:sea_lantern", (short) 7866, 0.3, 0.6, 1.0, 1.0, "minecraft:sea_lantern");

  public static final Block HAY_BLOCK = new Block("minecraft:hay_block", (short) 7868, 0.5, 0.6, 1.0, 1.0, "minecraft:hay_block");

  public static final Block WHITE_CARPET = new Block("minecraft:white_carpet", (short) 7870, 0.1, 0.6, 1.0, 1.0, "minecraft:white_carpet");

  public static final Block ORANGE_CARPET = new Block("minecraft:orange_carpet", (short) 7871, 0.1, 0.6, 1.0, 1.0, "minecraft:orange_carpet");

  public static final Block MAGENTA_CARPET = new Block("minecraft:magenta_carpet", (short) 7872, 0.1, 0.6, 1.0, 1.0, "minecraft:magenta_carpet");

  public static final Block LIGHT_BLUE_CARPET = new Block("minecraft:light_blue_carpet", (short) 7873, 0.1, 0.6, 1.0, 1.0, "minecraft:light_blue_carpet");

  public static final Block YELLOW_CARPET = new Block("minecraft:yellow_carpet", (short) 7874, 0.1, 0.6, 1.0, 1.0, "minecraft:yellow_carpet");

  public static final Block LIME_CARPET = new Block("minecraft:lime_carpet", (short) 7875, 0.1, 0.6, 1.0, 1.0, "minecraft:lime_carpet");

  public static final Block PINK_CARPET = new Block("minecraft:pink_carpet", (short) 7876, 0.1, 0.6, 1.0, 1.0, "minecraft:pink_carpet");

  public static final Block GRAY_CARPET = new Block("minecraft:gray_carpet", (short) 7877, 0.1, 0.6, 1.0, 1.0, "minecraft:gray_carpet");

  public static final Block LIGHT_GRAY_CARPET = new Block("minecraft:light_gray_carpet", (short) 7878, 0.1, 0.6, 1.0, 1.0, "minecraft:light_gray_carpet");

  public static final Block CYAN_CARPET = new Block("minecraft:cyan_carpet", (short) 7879, 0.1, 0.6, 1.0, 1.0, "minecraft:cyan_carpet");

  public static final Block PURPLE_CARPET = new Block("minecraft:purple_carpet", (short) 7880, 0.1, 0.6, 1.0, 1.0, "minecraft:purple_carpet");

  public static final Block BLUE_CARPET = new Block("minecraft:blue_carpet", (short) 7881, 0.1, 0.6, 1.0, 1.0, "minecraft:blue_carpet");

  public static final Block BROWN_CARPET = new Block("minecraft:brown_carpet", (short) 7882, 0.1, 0.6, 1.0, 1.0, "minecraft:brown_carpet");

  public static final Block GREEN_CARPET = new Block("minecraft:green_carpet", (short) 7883, 0.1, 0.6, 1.0, 1.0, "minecraft:green_carpet");

  public static final Block RED_CARPET = new Block("minecraft:red_carpet", (short) 7884, 0.1, 0.6, 1.0, 1.0, "minecraft:red_carpet");

  public static final Block BLACK_CARPET = new Block("minecraft:black_carpet", (short) 7885, 0.1, 0.6, 1.0, 1.0, "minecraft:black_carpet");

  public static final Block TERRACOTTA = new Block("minecraft:terracotta", (short) 7886, 4.2, 0.6, 1.0, 1.0, "minecraft:terracotta");

  public static final Block COAL_BLOCK = new Block("minecraft:coal_block", (short) 7887, 6.0, 0.6, 1.0, 1.0, "minecraft:coal_block");

  public static final Block PACKED_ICE = new Block("minecraft:packed_ice", (short) 7888, 0.5, 0.98, 1.0, 1.0, "minecraft:packed_ice");

  public static final Block SUNFLOWER = new Block("minecraft:sunflower", (short) 7890, 0.0, 0.6, 1.0, 1.0, "minecraft:sunflower");

  public static final Block LILAC = new Block("minecraft:lilac", (short) 7892, 0.0, 0.6, 1.0, 1.0, "minecraft:lilac");

  public static final Block ROSE_BUSH = new Block("minecraft:rose_bush", (short) 7894, 0.0, 0.6, 1.0, 1.0, "minecraft:rose_bush");

  public static final Block PEONY = new Block("minecraft:peony", (short) 7896, 0.0, 0.6, 1.0, 1.0, "minecraft:peony");

  public static final Block TALL_GRASS = new Block("minecraft:tall_grass", (short) 7898, 0.0, 0.6, 1.0, 1.0, "minecraft:tall_grass");

  public static final Block LARGE_FERN = new Block("minecraft:large_fern", (short) 7900, 0.0, 0.6, 1.0, 1.0, "minecraft:large_fern");

  public static final Block WHITE_BANNER = new Block("minecraft:white_banner", (short) 7901, 1.0, 0.6, 1.0, 1.0, "minecraft:white_banner");

  public static final Block ORANGE_BANNER = new Block("minecraft:orange_banner", (short) 7917, 1.0, 0.6, 1.0, 1.0, "minecraft:orange_banner");

  public static final Block MAGENTA_BANNER = new Block("minecraft:magenta_banner", (short) 7933, 1.0, 0.6, 1.0, 1.0, "minecraft:magenta_banner");

  public static final Block LIGHT_BLUE_BANNER = new Block("minecraft:light_blue_banner", (short) 7949, 1.0, 0.6, 1.0, 1.0, "minecraft:light_blue_banner");

  public static final Block YELLOW_BANNER = new Block("minecraft:yellow_banner", (short) 7965, 1.0, 0.6, 1.0, 1.0, "minecraft:yellow_banner");

  public static final Block LIME_BANNER = new Block("minecraft:lime_banner", (short) 7981, 1.0, 0.6, 1.0, 1.0, "minecraft:lime_banner");

  public static final Block PINK_BANNER = new Block("minecraft:pink_banner", (short) 7997, 1.0, 0.6, 1.0, 1.0, "minecraft:pink_banner");

  public static final Block GRAY_BANNER = new Block("minecraft:gray_banner", (short) 8013, 1.0, 0.6, 1.0, 1.0, "minecraft:gray_banner");

  public static final Block LIGHT_GRAY_BANNER = new Block("minecraft:light_gray_banner", (short) 8029, 1.0, 0.6, 1.0, 1.0, "minecraft:light_gray_banner");

  public static final Block CYAN_BANNER = new Block("minecraft:cyan_banner", (short) 8045, 1.0, 0.6, 1.0, 1.0, "minecraft:cyan_banner");

  public static final Block PURPLE_BANNER = new Block("minecraft:purple_banner", (short) 8061, 1.0, 0.6, 1.0, 1.0, "minecraft:purple_banner");

  public static final Block BLUE_BANNER = new Block("minecraft:blue_banner", (short) 8077, 1.0, 0.6, 1.0, 1.0, "minecraft:blue_banner");

  public static final Block BROWN_BANNER = new Block("minecraft:brown_banner", (short) 8093, 1.0, 0.6, 1.0, 1.0, "minecraft:brown_banner");

  public static final Block GREEN_BANNER = new Block("minecraft:green_banner", (short) 8109, 1.0, 0.6, 1.0, 1.0, "minecraft:green_banner");

  public static final Block RED_BANNER = new Block("minecraft:red_banner", (short) 8125, 1.0, 0.6, 1.0, 1.0, "minecraft:red_banner");

  public static final Block BLACK_BANNER = new Block("minecraft:black_banner", (short) 8141, 1.0, 0.6, 1.0, 1.0, "minecraft:black_banner");

  public static final Block WHITE_WALL_BANNER = new Block("minecraft:white_wall_banner", (short) 8157, 1.0, 0.6, 1.0, 1.0, "minecraft:white_banner");

  public static final Block ORANGE_WALL_BANNER = new Block("minecraft:orange_wall_banner", (short) 8161, 1.0, 0.6, 1.0, 1.0, "minecraft:orange_banner");

  public static final Block MAGENTA_WALL_BANNER = new Block("minecraft:magenta_wall_banner", (short) 8165, 1.0, 0.6, 1.0, 1.0, "minecraft:magenta_banner");

  public static final Block LIGHT_BLUE_WALL_BANNER = new Block("minecraft:light_blue_wall_banner", (short) 8169, 1.0, 0.6, 1.0, 1.0, "minecraft:light_blue_banner");

  public static final Block YELLOW_WALL_BANNER = new Block("minecraft:yellow_wall_banner", (short) 8173, 1.0, 0.6, 1.0, 1.0, "minecraft:yellow_banner");

  public static final Block LIME_WALL_BANNER = new Block("minecraft:lime_wall_banner", (short) 8177, 1.0, 0.6, 1.0, 1.0, "minecraft:lime_banner");

  public static final Block PINK_WALL_BANNER = new Block("minecraft:pink_wall_banner", (short) 8181, 1.0, 0.6, 1.0, 1.0, "minecraft:pink_banner");

  public static final Block GRAY_WALL_BANNER = new Block("minecraft:gray_wall_banner", (short) 8185, 1.0, 0.6, 1.0, 1.0, "minecraft:gray_banner");

  public static final Block LIGHT_GRAY_WALL_BANNER = new Block("minecraft:light_gray_wall_banner", (short) 8189, 1.0, 0.6, 1.0, 1.0, "minecraft:light_gray_banner");

  public static final Block CYAN_WALL_BANNER = new Block("minecraft:cyan_wall_banner", (short) 8193, 1.0, 0.6, 1.0, 1.0, "minecraft:cyan_banner");

  public static final Block PURPLE_WALL_BANNER = new Block("minecraft:purple_wall_banner", (short) 8197, 1.0, 0.6, 1.0, 1.0, "minecraft:purple_banner");

  public static final Block BLUE_WALL_BANNER = new Block("minecraft:blue_wall_banner", (short) 8201, 1.0, 0.6, 1.0, 1.0, "minecraft:blue_banner");

  public static final Block BROWN_WALL_BANNER = new Block("minecraft:brown_wall_banner", (short) 8205, 1.0, 0.6, 1.0, 1.0, "minecraft:brown_banner");

  public static final Block GREEN_WALL_BANNER = new Block("minecraft:green_wall_banner", (short) 8209, 1.0, 0.6, 1.0, 1.0, "minecraft:green_banner");

  public static final Block RED_WALL_BANNER = new Block("minecraft:red_wall_banner", (short) 8213, 1.0, 0.6, 1.0, 1.0, "minecraft:red_banner");

  public static final Block BLACK_WALL_BANNER = new Block("minecraft:black_wall_banner", (short) 8217, 1.0, 0.6, 1.0, 1.0, "minecraft:black_banner");

  public static final Block RED_SANDSTONE = new Block("minecraft:red_sandstone", (short) 8221, 0.8, 0.6, 1.0, 1.0, "minecraft:red_sandstone");

  public static final Block CHISELED_RED_SANDSTONE = new Block("minecraft:chiseled_red_sandstone", (short) 8222, 0.8, 0.6, 1.0, 1.0, "minecraft:chiseled_red_sandstone");

  public static final Block CUT_RED_SANDSTONE = new Block("minecraft:cut_red_sandstone", (short) 8223, 0.8, 0.6, 1.0, 1.0, "minecraft:cut_red_sandstone");

  public static final Block RED_SANDSTONE_STAIRS = new Block("minecraft:red_sandstone_stairs", (short) 8235, 0.8, 0.6, 1.0, 1.0, "minecraft:red_sandstone_stairs");

  public static final Block OAK_SLAB = new Block("minecraft:oak_slab", (short) 8307, 3.0, 0.6, 1.0, 1.0, "minecraft:oak_slab");

  public static final Block SPRUCE_SLAB = new Block("minecraft:spruce_slab", (short) 8313, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_slab");

  public static final Block BIRCH_SLAB = new Block("minecraft:birch_slab", (short) 8319, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_slab");

  public static final Block JUNGLE_SLAB = new Block("minecraft:jungle_slab", (short) 8325, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_slab");

  public static final Block ACACIA_SLAB = new Block("minecraft:acacia_slab", (short) 8331, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_slab");

  public static final Block DARK_OAK_SLAB = new Block("minecraft:dark_oak_slab", (short) 8337, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_slab");

  public static final Block STONE_SLAB = new Block("minecraft:stone_slab", (short) 8343, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_slab");

  public static final Block SMOOTH_STONE_SLAB = new Block("minecraft:smooth_stone_slab", (short) 8349, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_stone_slab");

  public static final Block SANDSTONE_SLAB = new Block("minecraft:sandstone_slab", (short) 8355, 6.0, 0.6, 1.0, 1.0, "minecraft:sandstone_slab");

  public static final Block CUT_SANDSTONE_SLAB = new Block("minecraft:cut_sandstone_slab", (short) 8361, 6.0, 0.6, 1.0, 1.0, "minecraft:cut_sandstone_slab");

  public static final Block PETRIFIED_OAK_SLAB = new Block("minecraft:petrified_oak_slab", (short) 8367, 6.0, 0.6, 1.0, 1.0, "minecraft:petrified_oak_slab");

  public static final Block COBBLESTONE_SLAB = new Block("minecraft:cobblestone_slab", (short) 8373, 6.0, 0.6, 1.0, 1.0, "minecraft:cobblestone_slab");

  public static final Block BRICK_SLAB = new Block("minecraft:brick_slab", (short) 8379, 6.0, 0.6, 1.0, 1.0, "minecraft:brick_slab");

  public static final Block STONE_BRICK_SLAB = new Block("minecraft:stone_brick_slab", (short) 8385, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_brick_slab");

  public static final Block NETHER_BRICK_SLAB = new Block("minecraft:nether_brick_slab", (short) 8391, 6.0, 0.6, 1.0, 1.0, "minecraft:nether_brick_slab");

  public static final Block QUARTZ_SLAB = new Block("minecraft:quartz_slab", (short) 8397, 6.0, 0.6, 1.0, 1.0, "minecraft:quartz_slab");

  public static final Block RED_SANDSTONE_SLAB = new Block("minecraft:red_sandstone_slab", (short) 8403, 6.0, 0.6, 1.0, 1.0, "minecraft:red_sandstone_slab");

  public static final Block CUT_RED_SANDSTONE_SLAB = new Block("minecraft:cut_red_sandstone_slab", (short) 8409, 6.0, 0.6, 1.0, 1.0, "minecraft:cut_red_sandstone_slab");

  public static final Block PURPUR_SLAB = new Block("minecraft:purpur_slab", (short) 8415, 6.0, 0.6, 1.0, 1.0, "minecraft:purpur_slab");

  public static final Block SMOOTH_STONE = new Block("minecraft:smooth_stone", (short) 8418, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_stone");

  public static final Block SMOOTH_SANDSTONE = new Block("minecraft:smooth_sandstone", (short) 8419, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_sandstone");

  public static final Block SMOOTH_QUARTZ = new Block("minecraft:smooth_quartz", (short) 8420, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_quartz");

  public static final Block SMOOTH_RED_SANDSTONE = new Block("minecraft:smooth_red_sandstone", (short) 8421, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_red_sandstone");

  public static final Block SPRUCE_FENCE_GATE = new Block("minecraft:spruce_fence_gate", (short) 8429, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_fence_gate");

  public static final Block BIRCH_FENCE_GATE = new Block("minecraft:birch_fence_gate", (short) 8461, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_fence_gate");

  public static final Block JUNGLE_FENCE_GATE = new Block("minecraft:jungle_fence_gate", (short) 8493, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_fence_gate");

  public static final Block ACACIA_FENCE_GATE = new Block("minecraft:acacia_fence_gate", (short) 8525, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_fence_gate");

  public static final Block DARK_OAK_FENCE_GATE = new Block("minecraft:dark_oak_fence_gate", (short) 8557, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_fence_gate");

  public static final Block SPRUCE_FENCE = new Block("minecraft:spruce_fence", (short) 8613, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_fence");

  public static final Block BIRCH_FENCE = new Block("minecraft:birch_fence", (short) 8645, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_fence");

  public static final Block JUNGLE_FENCE = new Block("minecraft:jungle_fence", (short) 8677, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_fence");

  public static final Block ACACIA_FENCE = new Block("minecraft:acacia_fence", (short) 8709, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_fence");

  public static final Block DARK_OAK_FENCE = new Block("minecraft:dark_oak_fence", (short) 8741, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_fence");

  public static final Block SPRUCE_DOOR = new Block("minecraft:spruce_door", (short) 8753, 3.0, 0.6, 1.0, 1.0, "minecraft:spruce_door");

  public static final Block BIRCH_DOOR = new Block("minecraft:birch_door", (short) 8817, 3.0, 0.6, 1.0, 1.0, "minecraft:birch_door");

  public static final Block JUNGLE_DOOR = new Block("minecraft:jungle_door", (short) 8881, 3.0, 0.6, 1.0, 1.0, "minecraft:jungle_door");

  public static final Block ACACIA_DOOR = new Block("minecraft:acacia_door", (short) 8945, 3.0, 0.6, 1.0, 1.0, "minecraft:acacia_door");

  public static final Block DARK_OAK_DOOR = new Block("minecraft:dark_oak_door", (short) 9009, 3.0, 0.6, 1.0, 1.0, "minecraft:dark_oak_door");

  public static final Block END_ROD = new Block("minecraft:end_rod", (short) 9066, 0.0, 0.6, 1.0, 1.0, "minecraft:end_rod");

  public static final Block CHORUS_PLANT = new Block("minecraft:chorus_plant", (short) 9131, 0.4, 0.6, 1.0, 1.0, "minecraft:chorus_plant");

  public static final Block CHORUS_FLOWER = new Block("minecraft:chorus_flower", (short) 9132, 0.4, 0.6, 1.0, 1.0, "minecraft:chorus_flower");

  public static final Block PURPUR_BLOCK = new Block("minecraft:purpur_block", (short) 9138, 6.0, 0.6, 1.0, 1.0, "minecraft:purpur_block");

  public static final Block PURPUR_PILLAR = new Block("minecraft:purpur_pillar", (short) 9140, 6.0, 0.6, 1.0, 1.0, "minecraft:purpur_pillar");

  public static final Block PURPUR_STAIRS = new Block("minecraft:purpur_stairs", (short) 9153, 6.0, 0.6, 1.0, 1.0, "minecraft:purpur_stairs");

  public static final Block END_STONE_BRICKS = new Block("minecraft:end_stone_bricks", (short) 9222, 9.0, 0.6, 1.0, 1.0, "minecraft:end_stone_bricks");

  public static final Block BEETROOTS = new Block("minecraft:beetroots", (short) 9223, 0.0, 0.6, 1.0, 1.0, "minecraft:beetroot_seeds");

  public static final Block GRASS_PATH = new Block("minecraft:grass_path", (short) 9227, 0.65, 0.6, 1.0, 1.0, "minecraft:grass_path");

  public static final Block END_GATEWAY = new Block("minecraft:end_gateway", (short) 9228, 3600000.0, 0.6, 1.0, 1.0, null);

  public static final Block REPEATING_COMMAND_BLOCK = new Block("minecraft:repeating_command_block", (short) 9235, 3600000.0, 0.6, 1.0, 1.0, "minecraft:repeating_command_block");

  public static final Block CHAIN_COMMAND_BLOCK = new Block("minecraft:chain_command_block", (short) 9247, 3600000.0, 0.6, 1.0, 1.0, "minecraft:chain_command_block");

  public static final Block FROSTED_ICE = new Block("minecraft:frosted_ice", (short) 9253, 0.5, 0.98, 1.0, 1.0, null);

  public static final Block MAGMA_BLOCK = new Block("minecraft:magma_block", (short) 9257, 0.5, 0.6, 1.0, 1.0, "minecraft:magma_block");

  public static final Block NETHER_WART_BLOCK = new Block("minecraft:nether_wart_block", (short) 9258, 1.0, 0.6, 1.0, 1.0, "minecraft:nether_wart_block");

  public static final Block RED_NETHER_BRICKS = new Block("minecraft:red_nether_bricks", (short) 9259, 6.0, 0.6, 1.0, 1.0, "minecraft:red_nether_bricks");

  public static final Block BONE_BLOCK = new Block("minecraft:bone_block", (short) 9261, 2.0, 0.6, 1.0, 1.0, "minecraft:bone_block");

  public static final Block STRUCTURE_VOID = new Block("minecraft:structure_void", (short) 9263, 0.0, 0.6, 1.0, 1.0, "minecraft:structure_void");

  public static final Block OBSERVER = new Block("minecraft:observer", (short) 9269, 3.0, 0.6, 1.0, 1.0, "minecraft:observer");

  public static final Block SHULKER_BOX = new Block("minecraft:shulker_box", (short) 9280, 2.0, 0.6, 1.0, 1.0, "minecraft:shulker_box");

  public static final Block WHITE_SHULKER_BOX = new Block("minecraft:white_shulker_box", (short) 9286, 2.0, 0.6, 1.0, 1.0, "minecraft:white_shulker_box");

  public static final Block ORANGE_SHULKER_BOX = new Block("minecraft:orange_shulker_box", (short) 9292, 2.0, 0.6, 1.0, 1.0, "minecraft:orange_shulker_box");

  public static final Block MAGENTA_SHULKER_BOX = new Block("minecraft:magenta_shulker_box", (short) 9298, 2.0, 0.6, 1.0, 1.0, "minecraft:magenta_shulker_box");

  public static final Block LIGHT_BLUE_SHULKER_BOX = new Block("minecraft:light_blue_shulker_box", (short) 9304, 2.0, 0.6, 1.0, 1.0, "minecraft:light_blue_shulker_box");

  public static final Block YELLOW_SHULKER_BOX = new Block("minecraft:yellow_shulker_box", (short) 9310, 2.0, 0.6, 1.0, 1.0, "minecraft:yellow_shulker_box");

  public static final Block LIME_SHULKER_BOX = new Block("minecraft:lime_shulker_box", (short) 9316, 2.0, 0.6, 1.0, 1.0, "minecraft:lime_shulker_box");

  public static final Block PINK_SHULKER_BOX = new Block("minecraft:pink_shulker_box", (short) 9322, 2.0, 0.6, 1.0, 1.0, "minecraft:pink_shulker_box");

  public static final Block GRAY_SHULKER_BOX = new Block("minecraft:gray_shulker_box", (short) 9328, 2.0, 0.6, 1.0, 1.0, "minecraft:gray_shulker_box");

  public static final Block LIGHT_GRAY_SHULKER_BOX = new Block("minecraft:light_gray_shulker_box", (short) 9334, 2.0, 0.6, 1.0, 1.0, "minecraft:light_gray_shulker_box");

  public static final Block CYAN_SHULKER_BOX = new Block("minecraft:cyan_shulker_box", (short) 9340, 2.0, 0.6, 1.0, 1.0, "minecraft:cyan_shulker_box");

  public static final Block PURPLE_SHULKER_BOX = new Block("minecraft:purple_shulker_box", (short) 9346, 2.0, 0.6, 1.0, 1.0, "minecraft:purple_shulker_box");

  public static final Block BLUE_SHULKER_BOX = new Block("minecraft:blue_shulker_box", (short) 9352, 2.0, 0.6, 1.0, 1.0, "minecraft:blue_shulker_box");

  public static final Block BROWN_SHULKER_BOX = new Block("minecraft:brown_shulker_box", (short) 9358, 2.0, 0.6, 1.0, 1.0, "minecraft:brown_shulker_box");

  public static final Block GREEN_SHULKER_BOX = new Block("minecraft:green_shulker_box", (short) 9364, 2.0, 0.6, 1.0, 1.0, "minecraft:green_shulker_box");

  public static final Block RED_SHULKER_BOX = new Block("minecraft:red_shulker_box", (short) 9370, 2.0, 0.6, 1.0, 1.0, "minecraft:red_shulker_box");

  public static final Block BLACK_SHULKER_BOX = new Block("minecraft:black_shulker_box", (short) 9376, 2.0, 0.6, 1.0, 1.0, "minecraft:black_shulker_box");

  public static final Block WHITE_GLAZED_TERRACOTTA = new Block("minecraft:white_glazed_terracotta", (short) 9378, 1.4, 0.6, 1.0, 1.0, "minecraft:white_glazed_terracotta");

  public static final Block ORANGE_GLAZED_TERRACOTTA = new Block("minecraft:orange_glazed_terracotta", (short) 9382, 1.4, 0.6, 1.0, 1.0, "minecraft:orange_glazed_terracotta");

  public static final Block MAGENTA_GLAZED_TERRACOTTA = new Block("minecraft:magenta_glazed_terracotta", (short) 9386, 1.4, 0.6, 1.0, 1.0, "minecraft:magenta_glazed_terracotta");

  public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA = new Block("minecraft:light_blue_glazed_terracotta", (short) 9390, 1.4, 0.6, 1.0, 1.0, "minecraft:light_blue_glazed_terracotta");

  public static final Block YELLOW_GLAZED_TERRACOTTA = new Block("minecraft:yellow_glazed_terracotta", (short) 9394, 1.4, 0.6, 1.0, 1.0, "minecraft:yellow_glazed_terracotta");

  public static final Block LIME_GLAZED_TERRACOTTA = new Block("minecraft:lime_glazed_terracotta", (short) 9398, 1.4, 0.6, 1.0, 1.0, "minecraft:lime_glazed_terracotta");

  public static final Block PINK_GLAZED_TERRACOTTA = new Block("minecraft:pink_glazed_terracotta", (short) 9402, 1.4, 0.6, 1.0, 1.0, "minecraft:pink_glazed_terracotta");

  public static final Block GRAY_GLAZED_TERRACOTTA = new Block("minecraft:gray_glazed_terracotta", (short) 9406, 1.4, 0.6, 1.0, 1.0, "minecraft:gray_glazed_terracotta");

  public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA = new Block("minecraft:light_gray_glazed_terracotta", (short) 9410, 1.4, 0.6, 1.0, 1.0, "minecraft:light_gray_glazed_terracotta");

  public static final Block CYAN_GLAZED_TERRACOTTA = new Block("minecraft:cyan_glazed_terracotta", (short) 9414, 1.4, 0.6, 1.0, 1.0, "minecraft:cyan_glazed_terracotta");

  public static final Block PURPLE_GLAZED_TERRACOTTA = new Block("minecraft:purple_glazed_terracotta", (short) 9418, 1.4, 0.6, 1.0, 1.0, "minecraft:purple_glazed_terracotta");

  public static final Block BLUE_GLAZED_TERRACOTTA = new Block("minecraft:blue_glazed_terracotta", (short) 9422, 1.4, 0.6, 1.0, 1.0, "minecraft:blue_glazed_terracotta");

  public static final Block BROWN_GLAZED_TERRACOTTA = new Block("minecraft:brown_glazed_terracotta", (short) 9426, 1.4, 0.6, 1.0, 1.0, "minecraft:brown_glazed_terracotta");

  public static final Block GREEN_GLAZED_TERRACOTTA = new Block("minecraft:green_glazed_terracotta", (short) 9430, 1.4, 0.6, 1.0, 1.0, "minecraft:green_glazed_terracotta");

  public static final Block RED_GLAZED_TERRACOTTA = new Block("minecraft:red_glazed_terracotta", (short) 9434, 1.4, 0.6, 1.0, 1.0, "minecraft:red_glazed_terracotta");

  public static final Block BLACK_GLAZED_TERRACOTTA = new Block("minecraft:black_glazed_terracotta", (short) 9438, 1.4, 0.6, 1.0, 1.0, "minecraft:black_glazed_terracotta");

  public static final Block WHITE_CONCRETE = new Block("minecraft:white_concrete", (short) 9442, 1.8, 0.6, 1.0, 1.0, "minecraft:white_concrete");

  public static final Block ORANGE_CONCRETE = new Block("minecraft:orange_concrete", (short) 9443, 1.8, 0.6, 1.0, 1.0, "minecraft:orange_concrete");

  public static final Block MAGENTA_CONCRETE = new Block("minecraft:magenta_concrete", (short) 9444, 1.8, 0.6, 1.0, 1.0, "minecraft:magenta_concrete");

  public static final Block LIGHT_BLUE_CONCRETE = new Block("minecraft:light_blue_concrete", (short) 9445, 1.8, 0.6, 1.0, 1.0, "minecraft:light_blue_concrete");

  public static final Block YELLOW_CONCRETE = new Block("minecraft:yellow_concrete", (short) 9446, 1.8, 0.6, 1.0, 1.0, "minecraft:yellow_concrete");

  public static final Block LIME_CONCRETE = new Block("minecraft:lime_concrete", (short) 9447, 1.8, 0.6, 1.0, 1.0, "minecraft:lime_concrete");

  public static final Block PINK_CONCRETE = new Block("minecraft:pink_concrete", (short) 9448, 1.8, 0.6, 1.0, 1.0, "minecraft:pink_concrete");

  public static final Block GRAY_CONCRETE = new Block("minecraft:gray_concrete", (short) 9449, 1.8, 0.6, 1.0, 1.0, "minecraft:gray_concrete");

  public static final Block LIGHT_GRAY_CONCRETE = new Block("minecraft:light_gray_concrete", (short) 9450, 1.8, 0.6, 1.0, 1.0, "minecraft:light_gray_concrete");

  public static final Block CYAN_CONCRETE = new Block("minecraft:cyan_concrete", (short) 9451, 1.8, 0.6, 1.0, 1.0, "minecraft:cyan_concrete");

  public static final Block PURPLE_CONCRETE = new Block("minecraft:purple_concrete", (short) 9452, 1.8, 0.6, 1.0, 1.0, "minecraft:purple_concrete");

  public static final Block BLUE_CONCRETE = new Block("minecraft:blue_concrete", (short) 9453, 1.8, 0.6, 1.0, 1.0, "minecraft:blue_concrete");

  public static final Block BROWN_CONCRETE = new Block("minecraft:brown_concrete", (short) 9454, 1.8, 0.6, 1.0, 1.0, "minecraft:brown_concrete");

  public static final Block GREEN_CONCRETE = new Block("minecraft:green_concrete", (short) 9455, 1.8, 0.6, 1.0, 1.0, "minecraft:green_concrete");

  public static final Block RED_CONCRETE = new Block("minecraft:red_concrete", (short) 9456, 1.8, 0.6, 1.0, 1.0, "minecraft:red_concrete");

  public static final Block BLACK_CONCRETE = new Block("minecraft:black_concrete", (short) 9457, 1.8, 0.6, 1.0, 1.0, "minecraft:black_concrete");

  public static final Block WHITE_CONCRETE_POWDER = new Block("minecraft:white_concrete_powder", (short) 9458, 0.5, 0.6, 1.0, 1.0, "minecraft:white_concrete_powder");

  public static final Block ORANGE_CONCRETE_POWDER = new Block("minecraft:orange_concrete_powder", (short) 9459, 0.5, 0.6, 1.0, 1.0, "minecraft:orange_concrete_powder");

  public static final Block MAGENTA_CONCRETE_POWDER = new Block("minecraft:magenta_concrete_powder", (short) 9460, 0.5, 0.6, 1.0, 1.0, "minecraft:magenta_concrete_powder");

  public static final Block LIGHT_BLUE_CONCRETE_POWDER = new Block("minecraft:light_blue_concrete_powder", (short) 9461, 0.5, 0.6, 1.0, 1.0, "minecraft:light_blue_concrete_powder");

  public static final Block YELLOW_CONCRETE_POWDER = new Block("minecraft:yellow_concrete_powder", (short) 9462, 0.5, 0.6, 1.0, 1.0, "minecraft:yellow_concrete_powder");

  public static final Block LIME_CONCRETE_POWDER = new Block("minecraft:lime_concrete_powder", (short) 9463, 0.5, 0.6, 1.0, 1.0, "minecraft:lime_concrete_powder");

  public static final Block PINK_CONCRETE_POWDER = new Block("minecraft:pink_concrete_powder", (short) 9464, 0.5, 0.6, 1.0, 1.0, "minecraft:pink_concrete_powder");

  public static final Block GRAY_CONCRETE_POWDER = new Block("minecraft:gray_concrete_powder", (short) 9465, 0.5, 0.6, 1.0, 1.0, "minecraft:gray_concrete_powder");

  public static final Block LIGHT_GRAY_CONCRETE_POWDER = new Block("minecraft:light_gray_concrete_powder", (short) 9466, 0.5, 0.6, 1.0, 1.0, "minecraft:light_gray_concrete_powder");

  public static final Block CYAN_CONCRETE_POWDER = new Block("minecraft:cyan_concrete_powder", (short) 9467, 0.5, 0.6, 1.0, 1.0, "minecraft:cyan_concrete_powder");

  public static final Block PURPLE_CONCRETE_POWDER = new Block("minecraft:purple_concrete_powder", (short) 9468, 0.5, 0.6, 1.0, 1.0, "minecraft:purple_concrete_powder");

  public static final Block BLUE_CONCRETE_POWDER = new Block("minecraft:blue_concrete_powder", (short) 9469, 0.5, 0.6, 1.0, 1.0, "minecraft:blue_concrete_powder");

  public static final Block BROWN_CONCRETE_POWDER = new Block("minecraft:brown_concrete_powder", (short) 9470, 0.5, 0.6, 1.0, 1.0, "minecraft:brown_concrete_powder");

  public static final Block GREEN_CONCRETE_POWDER = new Block("minecraft:green_concrete_powder", (short) 9471, 0.5, 0.6, 1.0, 1.0, "minecraft:green_concrete_powder");

  public static final Block RED_CONCRETE_POWDER = new Block("minecraft:red_concrete_powder", (short) 9472, 0.5, 0.6, 1.0, 1.0, "minecraft:red_concrete_powder");

  public static final Block BLACK_CONCRETE_POWDER = new Block("minecraft:black_concrete_powder", (short) 9473, 0.5, 0.6, 1.0, 1.0, "minecraft:black_concrete_powder");

  public static final Block KELP = new Block("minecraft:kelp", (short) 9474, 0.0, 0.6, 1.0, 1.0, "minecraft:kelp");

  public static final Block KELP_PLANT = new Block("minecraft:kelp_plant", (short) 9500, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block DRIED_KELP_BLOCK = new Block("minecraft:dried_kelp_block", (short) 9501, 2.5, 0.6, 1.0, 1.0, "minecraft:dried_kelp_block");

  public static final Block TURTLE_EGG = new Block("minecraft:turtle_egg", (short) 9502, 0.5, 0.6, 1.0, 1.0, "minecraft:turtle_egg");

  public static final Block DEAD_TUBE_CORAL_BLOCK = new Block("minecraft:dead_tube_coral_block", (short) 9514, 6.0, 0.6, 1.0, 1.0, "minecraft:dead_tube_coral_block");

  public static final Block DEAD_BRAIN_CORAL_BLOCK = new Block("minecraft:dead_brain_coral_block", (short) 9515, 6.0, 0.6, 1.0, 1.0, "minecraft:dead_brain_coral_block");

  public static final Block DEAD_BUBBLE_CORAL_BLOCK = new Block("minecraft:dead_bubble_coral_block", (short) 9516, 6.0, 0.6, 1.0, 1.0, "minecraft:dead_bubble_coral_block");

  public static final Block DEAD_FIRE_CORAL_BLOCK = new Block("minecraft:dead_fire_coral_block", (short) 9517, 6.0, 0.6, 1.0, 1.0, "minecraft:dead_fire_coral_block");

  public static final Block DEAD_HORN_CORAL_BLOCK = new Block("minecraft:dead_horn_coral_block", (short) 9518, 6.0, 0.6, 1.0, 1.0, "minecraft:dead_horn_coral_block");

  public static final Block TUBE_CORAL_BLOCK = new Block("minecraft:tube_coral_block", (short) 9519, 6.0, 0.6, 1.0, 1.0, "minecraft:tube_coral_block");

  public static final Block BRAIN_CORAL_BLOCK = new Block("minecraft:brain_coral_block", (short) 9520, 6.0, 0.6, 1.0, 1.0, "minecraft:brain_coral_block");

  public static final Block BUBBLE_CORAL_BLOCK = new Block("minecraft:bubble_coral_block", (short) 9521, 6.0, 0.6, 1.0, 1.0, "minecraft:bubble_coral_block");

  public static final Block FIRE_CORAL_BLOCK = new Block("minecraft:fire_coral_block", (short) 9522, 6.0, 0.6, 1.0, 1.0, "minecraft:fire_coral_block");

  public static final Block HORN_CORAL_BLOCK = new Block("minecraft:horn_coral_block", (short) 9523, 6.0, 0.6, 1.0, 1.0, "minecraft:horn_coral_block");

  public static final Block DEAD_TUBE_CORAL = new Block("minecraft:dead_tube_coral", (short) 9524, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_tube_coral");

  public static final Block DEAD_BRAIN_CORAL = new Block("minecraft:dead_brain_coral", (short) 9526, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_brain_coral");

  public static final Block DEAD_BUBBLE_CORAL = new Block("minecraft:dead_bubble_coral", (short) 9528, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_bubble_coral");

  public static final Block DEAD_FIRE_CORAL = new Block("minecraft:dead_fire_coral", (short) 9530, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_fire_coral");

  public static final Block DEAD_HORN_CORAL = new Block("minecraft:dead_horn_coral", (short) 9532, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_horn_coral");

  public static final Block TUBE_CORAL = new Block("minecraft:tube_coral", (short) 9534, 0.0, 0.6, 1.0, 1.0, "minecraft:tube_coral");

  public static final Block BRAIN_CORAL = new Block("minecraft:brain_coral", (short) 9536, 0.0, 0.6, 1.0, 1.0, "minecraft:brain_coral");

  public static final Block BUBBLE_CORAL = new Block("minecraft:bubble_coral", (short) 9538, 0.0, 0.6, 1.0, 1.0, "minecraft:bubble_coral");

  public static final Block FIRE_CORAL = new Block("minecraft:fire_coral", (short) 9540, 0.0, 0.6, 1.0, 1.0, "minecraft:fire_coral");

  public static final Block HORN_CORAL = new Block("minecraft:horn_coral", (short) 9542, 0.0, 0.6, 1.0, 1.0, "minecraft:horn_coral");

  public static final Block DEAD_TUBE_CORAL_FAN = new Block("minecraft:dead_tube_coral_fan", (short) 9544, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_tube_coral_fan");

  public static final Block DEAD_BRAIN_CORAL_FAN = new Block("minecraft:dead_brain_coral_fan", (short) 9546, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_brain_coral_fan");

  public static final Block DEAD_BUBBLE_CORAL_FAN = new Block("minecraft:dead_bubble_coral_fan", (short) 9548, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_bubble_coral_fan");

  public static final Block DEAD_FIRE_CORAL_FAN = new Block("minecraft:dead_fire_coral_fan", (short) 9550, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_fire_coral_fan");

  public static final Block DEAD_HORN_CORAL_FAN = new Block("minecraft:dead_horn_coral_fan", (short) 9552, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_horn_coral_fan");

  public static final Block TUBE_CORAL_FAN = new Block("minecraft:tube_coral_fan", (short) 9554, 0.0, 0.6, 1.0, 1.0, "minecraft:tube_coral_fan");

  public static final Block BRAIN_CORAL_FAN = new Block("minecraft:brain_coral_fan", (short) 9556, 0.0, 0.6, 1.0, 1.0, "minecraft:brain_coral_fan");

  public static final Block BUBBLE_CORAL_FAN = new Block("minecraft:bubble_coral_fan", (short) 9558, 0.0, 0.6, 1.0, 1.0, "minecraft:bubble_coral_fan");

  public static final Block FIRE_CORAL_FAN = new Block("minecraft:fire_coral_fan", (short) 9560, 0.0, 0.6, 1.0, 1.0, "minecraft:fire_coral_fan");

  public static final Block HORN_CORAL_FAN = new Block("minecraft:horn_coral_fan", (short) 9562, 0.0, 0.6, 1.0, 1.0, "minecraft:horn_coral_fan");

  public static final Block DEAD_TUBE_CORAL_WALL_FAN = new Block("minecraft:dead_tube_coral_wall_fan", (short) 9564, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_tube_coral_fan");

  public static final Block DEAD_BRAIN_CORAL_WALL_FAN = new Block("minecraft:dead_brain_coral_wall_fan", (short) 9572, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_brain_coral_fan");

  public static final Block DEAD_BUBBLE_CORAL_WALL_FAN = new Block("minecraft:dead_bubble_coral_wall_fan", (short) 9580, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_bubble_coral_fan");

  public static final Block DEAD_FIRE_CORAL_WALL_FAN = new Block("minecraft:dead_fire_coral_wall_fan", (short) 9588, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_fire_coral_fan");

  public static final Block DEAD_HORN_CORAL_WALL_FAN = new Block("minecraft:dead_horn_coral_wall_fan", (short) 9596, 0.0, 0.6, 1.0, 1.0, "minecraft:dead_horn_coral_fan");

  public static final Block TUBE_CORAL_WALL_FAN = new Block("minecraft:tube_coral_wall_fan", (short) 9604, 0.0, 0.6, 1.0, 1.0, "minecraft:tube_coral_fan");

  public static final Block BRAIN_CORAL_WALL_FAN = new Block("minecraft:brain_coral_wall_fan", (short) 9612, 0.0, 0.6, 1.0, 1.0, "minecraft:brain_coral_fan");

  public static final Block BUBBLE_CORAL_WALL_FAN = new Block("minecraft:bubble_coral_wall_fan", (short) 9620, 0.0, 0.6, 1.0, 1.0, "minecraft:bubble_coral_fan");

  public static final Block FIRE_CORAL_WALL_FAN = new Block("minecraft:fire_coral_wall_fan", (short) 9628, 0.0, 0.6, 1.0, 1.0, "minecraft:fire_coral_fan");

  public static final Block HORN_CORAL_WALL_FAN = new Block("minecraft:horn_coral_wall_fan", (short) 9636, 0.0, 0.6, 1.0, 1.0, "minecraft:horn_coral_fan");

  public static final Block SEA_PICKLE = new Block("minecraft:sea_pickle", (short) 9644, 0.0, 0.6, 1.0, 1.0, "minecraft:sea_pickle");

  public static final Block BLUE_ICE = new Block("minecraft:blue_ice", (short) 9652, 2.8, 0.989, 1.0, 1.0, "minecraft:blue_ice");

  public static final Block CONDUIT = new Block("minecraft:conduit", (short) 9653, 3.0, 0.6, 1.0, 1.0, "minecraft:conduit");

  public static final Block BAMBOO_SAPLING = new Block("minecraft:bamboo_sapling", (short) 9655, 1.0, 0.6, 1.0, 1.0, null);

  public static final Block BAMBOO = new Block("minecraft:bamboo", (short) 9656, 1.0, 0.6, 1.0, 1.0, "minecraft:bamboo");

  public static final Block POTTED_BAMBOO = new Block("minecraft:potted_bamboo", (short) 9668, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block VOID_AIR = new Block("minecraft:void_air", (short) 9669, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block CAVE_AIR = new Block("minecraft:cave_air", (short) 9670, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block BUBBLE_COLUMN = new Block("minecraft:bubble_column", (short) 9671, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POLISHED_GRANITE_STAIRS = new Block("minecraft:polished_granite_stairs", (short) 9684, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_granite_stairs");

  public static final Block SMOOTH_RED_SANDSTONE_STAIRS = new Block("minecraft:smooth_red_sandstone_stairs", (short) 9764, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_red_sandstone_stairs");

  public static final Block MOSSY_STONE_BRICK_STAIRS = new Block("minecraft:mossy_stone_brick_stairs", (short) 9844, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_stone_brick_stairs");

  public static final Block POLISHED_DIORITE_STAIRS = new Block("minecraft:polished_diorite_stairs", (short) 9924, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_diorite_stairs");

  public static final Block MOSSY_COBBLESTONE_STAIRS = new Block("minecraft:mossy_cobblestone_stairs", (short) 10004, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_cobblestone_stairs");

  public static final Block END_STONE_BRICK_STAIRS = new Block("minecraft:end_stone_brick_stairs", (short) 10084, 9.0, 0.6, 1.0, 1.0, "minecraft:end_stone_brick_stairs");

  public static final Block STONE_STAIRS = new Block("minecraft:stone_stairs", (short) 10164, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_stairs");

  public static final Block SMOOTH_SANDSTONE_STAIRS = new Block("minecraft:smooth_sandstone_stairs", (short) 10244, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_sandstone_stairs");

  public static final Block SMOOTH_QUARTZ_STAIRS = new Block("minecraft:smooth_quartz_stairs", (short) 10324, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_quartz_stairs");

  public static final Block GRANITE_STAIRS = new Block("minecraft:granite_stairs", (short) 10404, 6.0, 0.6, 1.0, 1.0, "minecraft:granite_stairs");

  public static final Block ANDESITE_STAIRS = new Block("minecraft:andesite_stairs", (short) 10484, 6.0, 0.6, 1.0, 1.0, "minecraft:andesite_stairs");

  public static final Block RED_NETHER_BRICK_STAIRS = new Block("minecraft:red_nether_brick_stairs", (short) 10564, 6.0, 0.6, 1.0, 1.0, "minecraft:red_nether_brick_stairs");

  public static final Block POLISHED_ANDESITE_STAIRS = new Block("minecraft:polished_andesite_stairs", (short) 10644, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_andesite_stairs");

  public static final Block DIORITE_STAIRS = new Block("minecraft:diorite_stairs", (short) 10724, 6.0, 0.6, 1.0, 1.0, "minecraft:diorite_stairs");

  public static final Block POLISHED_GRANITE_SLAB = new Block("minecraft:polished_granite_slab", (short) 10796, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_granite_slab");

  public static final Block SMOOTH_RED_SANDSTONE_SLAB = new Block("minecraft:smooth_red_sandstone_slab", (short) 10802, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_red_sandstone_slab");

  public static final Block MOSSY_STONE_BRICK_SLAB = new Block("minecraft:mossy_stone_brick_slab", (short) 10808, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_stone_brick_slab");

  public static final Block POLISHED_DIORITE_SLAB = new Block("minecraft:polished_diorite_slab", (short) 10814, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_diorite_slab");

  public static final Block MOSSY_COBBLESTONE_SLAB = new Block("minecraft:mossy_cobblestone_slab", (short) 10820, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_cobblestone_slab");

  public static final Block END_STONE_BRICK_SLAB = new Block("minecraft:end_stone_brick_slab", (short) 10826, 9.0, 0.6, 1.0, 1.0, "minecraft:end_stone_brick_slab");

  public static final Block SMOOTH_SANDSTONE_SLAB = new Block("minecraft:smooth_sandstone_slab", (short) 10832, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_sandstone_slab");

  public static final Block SMOOTH_QUARTZ_SLAB = new Block("minecraft:smooth_quartz_slab", (short) 10838, 6.0, 0.6, 1.0, 1.0, "minecraft:smooth_quartz_slab");

  public static final Block GRANITE_SLAB = new Block("minecraft:granite_slab", (short) 10844, 6.0, 0.6, 1.0, 1.0, "minecraft:granite_slab");

  public static final Block ANDESITE_SLAB = new Block("minecraft:andesite_slab", (short) 10850, 6.0, 0.6, 1.0, 1.0, "minecraft:andesite_slab");

  public static final Block RED_NETHER_BRICK_SLAB = new Block("minecraft:red_nether_brick_slab", (short) 10856, 6.0, 0.6, 1.0, 1.0, "minecraft:red_nether_brick_slab");

  public static final Block POLISHED_ANDESITE_SLAB = new Block("minecraft:polished_andesite_slab", (short) 10862, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_andesite_slab");

  public static final Block DIORITE_SLAB = new Block("minecraft:diorite_slab", (short) 10868, 6.0, 0.6, 1.0, 1.0, "minecraft:diorite_slab");

  public static final Block BRICK_WALL = new Block("minecraft:brick_wall", (short) 10874, 6.0, 0.6, 1.0, 1.0, "minecraft:brick_wall");

  public static final Block PRISMARINE_WALL = new Block("minecraft:prismarine_wall", (short) 11198, 6.0, 0.6, 1.0, 1.0, "minecraft:prismarine_wall");

  public static final Block RED_SANDSTONE_WALL = new Block("minecraft:red_sandstone_wall", (short) 11522, 0.8, 0.6, 1.0, 1.0, "minecraft:red_sandstone_wall");

  public static final Block MOSSY_STONE_BRICK_WALL = new Block("minecraft:mossy_stone_brick_wall", (short) 11846, 6.0, 0.6, 1.0, 1.0, "minecraft:mossy_stone_brick_wall");

  public static final Block GRANITE_WALL = new Block("minecraft:granite_wall", (short) 12170, 6.0, 0.6, 1.0, 1.0, "minecraft:granite_wall");

  public static final Block STONE_BRICK_WALL = new Block("minecraft:stone_brick_wall", (short) 12494, 6.0, 0.6, 1.0, 1.0, "minecraft:stone_brick_wall");

  public static final Block NETHER_BRICK_WALL = new Block("minecraft:nether_brick_wall", (short) 12818, 6.0, 0.6, 1.0, 1.0, "minecraft:nether_brick_wall");

  public static final Block ANDESITE_WALL = new Block("minecraft:andesite_wall", (short) 13142, 6.0, 0.6, 1.0, 1.0, "minecraft:andesite_wall");

  public static final Block RED_NETHER_BRICK_WALL = new Block("minecraft:red_nether_brick_wall", (short) 13466, 6.0, 0.6, 1.0, 1.0, "minecraft:red_nether_brick_wall");

  public static final Block SANDSTONE_WALL = new Block("minecraft:sandstone_wall", (short) 13790, 0.8, 0.6, 1.0, 1.0, "minecraft:sandstone_wall");

  public static final Block END_STONE_BRICK_WALL = new Block("minecraft:end_stone_brick_wall", (short) 14114, 9.0, 0.6, 1.0, 1.0, "minecraft:end_stone_brick_wall");

  public static final Block DIORITE_WALL = new Block("minecraft:diorite_wall", (short) 14438, 6.0, 0.6, 1.0, 1.0, "minecraft:diorite_wall");

  public static final Block SCAFFOLDING = new Block("minecraft:scaffolding", (short) 14790, 0.0, 0.6, 1.0, 1.0, "minecraft:scaffolding");

  public static final Block LOOM = new Block("minecraft:loom", (short) 14791, 2.5, 0.6, 1.0, 1.0, "minecraft:loom");

  public static final Block BARREL = new Block("minecraft:barrel", (short) 14796, 2.5, 0.6, 1.0, 1.0, "minecraft:barrel");

  public static final Block SMOKER = new Block("minecraft:smoker", (short) 14808, 3.5, 0.6, 1.0, 1.0, "minecraft:smoker");

  public static final Block BLAST_FURNACE = new Block("minecraft:blast_furnace", (short) 14816, 3.5, 0.6, 1.0, 1.0, "minecraft:blast_furnace");

  public static final Block CARTOGRAPHY_TABLE = new Block("minecraft:cartography_table", (short) 14823, 2.5, 0.6, 1.0, 1.0, "minecraft:cartography_table");

  public static final Block FLETCHING_TABLE = new Block("minecraft:fletching_table", (short) 14824, 2.5, 0.6, 1.0, 1.0, "minecraft:fletching_table");

  public static final Block GRINDSTONE = new Block("minecraft:grindstone", (short) 14829, 6.0, 0.6, 1.0, 1.0, "minecraft:grindstone");

  public static final Block LECTERN = new Block("minecraft:lectern", (short) 14840, 2.5, 0.6, 1.0, 1.0, "minecraft:lectern");

  public static final Block SMITHING_TABLE = new Block("minecraft:smithing_table", (short) 14853, 2.5, 0.6, 1.0, 1.0, "minecraft:smithing_table");

  public static final Block STONECUTTER = new Block("minecraft:stonecutter", (short) 14854, 3.5, 0.6, 1.0, 1.0, "minecraft:stonecutter");

  public static final Block BELL = new Block("minecraft:bell", (short) 14859, 5.0, 0.6, 1.0, 1.0, "minecraft:bell");

  public static final Block LANTERN = new Block("minecraft:lantern", (short) 14893, 3.5, 0.6, 1.0, 1.0, "minecraft:lantern");

  public static final Block SOUL_LANTERN = new Block("minecraft:soul_lantern", (short) 14897, 3.5, 0.6, 1.0, 1.0, "minecraft:soul_lantern");

  public static final Block CAMPFIRE = new Block("minecraft:campfire", (short) 14901, 2.0, 0.6, 1.0, 1.0, "minecraft:campfire");

  public static final Block SOUL_CAMPFIRE = new Block("minecraft:soul_campfire", (short) 14933, 2.0, 0.6, 1.0, 1.0, "minecraft:soul_campfire");

  public static final Block SWEET_BERRY_BUSH = new Block("minecraft:sweet_berry_bush", (short) 14962, 0.0, 0.6, 1.0, 1.0, "minecraft:sweet_berries");

  public static final Block WARPED_STEM = new Block("minecraft:warped_stem", (short) 14967, 2.0, 0.6, 1.0, 1.0, "minecraft:warped_stem");

  public static final Block STRIPPED_WARPED_STEM = new Block("minecraft:stripped_warped_stem", (short) 14970, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_warped_stem");

  public static final Block WARPED_HYPHAE = new Block("minecraft:warped_hyphae", (short) 14973, 2.0, 0.6, 1.0, 1.0, "minecraft:warped_hyphae");

  public static final Block STRIPPED_WARPED_HYPHAE = new Block("minecraft:stripped_warped_hyphae", (short) 14976, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_warped_hyphae");

  public static final Block WARPED_NYLIUM = new Block("minecraft:warped_nylium", (short) 14978, 0.4, 0.6, 1.0, 1.0, "minecraft:warped_nylium");

  public static final Block WARPED_FUNGUS = new Block("minecraft:warped_fungus", (short) 14979, 0.0, 0.6, 1.0, 1.0, "minecraft:warped_fungus");

  public static final Block WARPED_WART_BLOCK = new Block("minecraft:warped_wart_block", (short) 14980, 1.0, 0.6, 1.0, 1.0, "minecraft:warped_wart_block");

  public static final Block WARPED_ROOTS = new Block("minecraft:warped_roots", (short) 14981, 0.0, 0.6, 1.0, 1.0, "minecraft:warped_roots");

  public static final Block NETHER_SPROUTS = new Block("minecraft:nether_sprouts", (short) 14982, 0.0, 0.6, 1.0, 1.0, "minecraft:nether_sprouts");

  public static final Block CRIMSON_STEM = new Block("minecraft:crimson_stem", (short) 14984, 2.0, 0.6, 1.0, 1.0, "minecraft:crimson_stem");

  public static final Block STRIPPED_CRIMSON_STEM = new Block("minecraft:stripped_crimson_stem", (short) 14987, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_crimson_stem");

  public static final Block CRIMSON_HYPHAE = new Block("minecraft:crimson_hyphae", (short) 14990, 2.0, 0.6, 1.0, 1.0, "minecraft:crimson_hyphae");

  public static final Block STRIPPED_CRIMSON_HYPHAE = new Block("minecraft:stripped_crimson_hyphae", (short) 14993, 2.0, 0.6, 1.0, 1.0, "minecraft:stripped_crimson_hyphae");

  public static final Block CRIMSON_NYLIUM = new Block("minecraft:crimson_nylium", (short) 14995, 0.4, 0.6, 1.0, 1.0, "minecraft:crimson_nylium");

  public static final Block CRIMSON_FUNGUS = new Block("minecraft:crimson_fungus", (short) 14996, 0.0, 0.6, 1.0, 1.0, "minecraft:crimson_fungus");

  public static final Block SHROOMLIGHT = new Block("minecraft:shroomlight", (short) 14997, 1.0, 0.6, 1.0, 1.0, "minecraft:shroomlight");

  public static final Block WEEPING_VINES = new Block("minecraft:weeping_vines", (short) 14998, 0.0, 0.6, 1.0, 1.0, "minecraft:weeping_vines");

  public static final Block WEEPING_VINES_PLANT = new Block("minecraft:weeping_vines_plant", (short) 15024, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block TWISTING_VINES = new Block("minecraft:twisting_vines", (short) 15025, 0.0, 0.6, 1.0, 1.0, "minecraft:twisting_vines");

  public static final Block TWISTING_VINES_PLANT = new Block("minecraft:twisting_vines_plant", (short) 15051, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block CRIMSON_ROOTS = new Block("minecraft:crimson_roots", (short) 15052, 0.0, 0.6, 1.0, 1.0, "minecraft:crimson_roots");

  public static final Block CRIMSON_PLANKS = new Block("minecraft:crimson_planks", (short) 15053, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_planks");

  public static final Block WARPED_PLANKS = new Block("minecraft:warped_planks", (short) 15054, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_planks");

  public static final Block CRIMSON_SLAB = new Block("minecraft:crimson_slab", (short) 15058, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_slab");

  public static final Block WARPED_SLAB = new Block("minecraft:warped_slab", (short) 15064, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_slab");

  public static final Block CRIMSON_PRESSURE_PLATE = new Block("minecraft:crimson_pressure_plate", (short) 15068, 0.5, 0.6, 1.0, 1.0, "minecraft:crimson_pressure_plate");

  public static final Block WARPED_PRESSURE_PLATE = new Block("minecraft:warped_pressure_plate", (short) 15070, 0.5, 0.6, 1.0, 1.0, "minecraft:warped_pressure_plate");

  public static final Block CRIMSON_FENCE = new Block("minecraft:crimson_fence", (short) 15102, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_fence");

  public static final Block WARPED_FENCE = new Block("minecraft:warped_fence", (short) 15134, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_fence");

  public static final Block CRIMSON_TRAPDOOR = new Block("minecraft:crimson_trapdoor", (short) 15150, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_trapdoor");

  public static final Block WARPED_TRAPDOOR = new Block("minecraft:warped_trapdoor", (short) 15214, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_trapdoor");

  public static final Block CRIMSON_FENCE_GATE = new Block("minecraft:crimson_fence_gate", (short) 15270, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_fence_gate");

  public static final Block WARPED_FENCE_GATE = new Block("minecraft:warped_fence_gate", (short) 15302, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_fence_gate");

  public static final Block CRIMSON_STAIRS = new Block("minecraft:crimson_stairs", (short) 15338, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_stairs");

  public static final Block WARPED_STAIRS = new Block("minecraft:warped_stairs", (short) 15418, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_stairs");

  public static final Block CRIMSON_BUTTON = new Block("minecraft:crimson_button", (short) 15496, 0.5, 0.6, 1.0, 1.0, "minecraft:crimson_button");

  public static final Block WARPED_BUTTON = new Block("minecraft:warped_button", (short) 15520, 0.5, 0.6, 1.0, 1.0, "minecraft:warped_button");

  public static final Block CRIMSON_DOOR = new Block("minecraft:crimson_door", (short) 15546, 3.0, 0.6, 1.0, 1.0, "minecraft:crimson_door");

  public static final Block WARPED_DOOR = new Block("minecraft:warped_door", (short) 15610, 3.0, 0.6, 1.0, 1.0, "minecraft:warped_door");

  public static final Block CRIMSON_SIGN = new Block("minecraft:crimson_sign", (short) 15664, 1.0, 0.6, 1.0, 1.0, "minecraft:crimson_sign");

  public static final Block WARPED_SIGN = new Block("minecraft:warped_sign", (short) 15696, 1.0, 0.6, 1.0, 1.0, "minecraft:warped_sign");

  public static final Block CRIMSON_WALL_SIGN = new Block("minecraft:crimson_wall_sign", (short) 15728, 1.0, 0.6, 1.0, 1.0, "minecraft:crimson_sign");

  public static final Block WARPED_WALL_SIGN = new Block("minecraft:warped_wall_sign", (short) 15736, 1.0, 0.6, 1.0, 1.0, "minecraft:warped_sign");

  public static final Block STRUCTURE_BLOCK = new Block("minecraft:structure_block", (short) 15743, 3600000.0, 0.6, 1.0, 1.0, "minecraft:structure_block");

  public static final Block JIGSAW = new Block("minecraft:jigsaw", (short) 15757, 3600000.0, 0.6, 1.0, 1.0, "minecraft:jigsaw");

  public static final Block COMPOSTER = new Block("minecraft:composter", (short) 15759, 0.6, 0.6, 1.0, 1.0, "minecraft:composter");

  public static final Block TARGET = new Block("minecraft:target", (short) 15768, 0.5, 0.6, 1.0, 1.0, "minecraft:target");

  public static final Block BEE_NEST = new Block("minecraft:bee_nest", (short) 15784, 0.3, 0.6, 1.0, 1.0, "minecraft:bee_nest");

  public static final Block BEEHIVE = new Block("minecraft:beehive", (short) 15808, 0.6, 0.6, 1.0, 1.0, "minecraft:beehive");

  public static final Block HONEY_BLOCK = new Block("minecraft:honey_block", (short) 15832, 0.0, 0.6, 0.4, 0.5, "minecraft:honey_block");

  public static final Block HONEYCOMB_BLOCK = new Block("minecraft:honeycomb_block", (short) 15833, 0.6, 0.6, 1.0, 1.0, "minecraft:honeycomb_block");

  public static final Block NETHERITE_BLOCK = new Block("minecraft:netherite_block", (short) 15834, 1200.0, 0.6, 1.0, 1.0, "minecraft:netherite_block");

  public static final Block ANCIENT_DEBRIS = new Block("minecraft:ancient_debris", (short) 15835, 1200.0, 0.6, 1.0, 1.0, "minecraft:ancient_debris");

  public static final Block CRYING_OBSIDIAN = new Block("minecraft:crying_obsidian", (short) 15836, 1200.0, 0.6, 1.0, 1.0, "minecraft:crying_obsidian");

  public static final Block RESPAWN_ANCHOR = new Block("minecraft:respawn_anchor", (short) 15837, 1200.0, 0.6, 1.0, 1.0, "minecraft:respawn_anchor");

  public static final Block POTTED_CRIMSON_FUNGUS = new Block("minecraft:potted_crimson_fungus", (short) 15842, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_WARPED_FUNGUS = new Block("minecraft:potted_warped_fungus", (short) 15843, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_CRIMSON_ROOTS = new Block("minecraft:potted_crimson_roots", (short) 15844, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block POTTED_WARPED_ROOTS = new Block("minecraft:potted_warped_roots", (short) 15845, 0.0, 0.6, 1.0, 1.0, null);

  public static final Block LODESTONE = new Block("minecraft:lodestone", (short) 15846, 3.5, 0.6, 1.0, 1.0, "minecraft:lodestone");

  public static final Block BLACKSTONE = new Block("minecraft:blackstone", (short) 15847, 6.0, 0.6, 1.0, 1.0, "minecraft:blackstone");

  public static final Block BLACKSTONE_STAIRS = new Block("minecraft:blackstone_stairs", (short) 15859, 6.0, 0.6, 1.0, 1.0, "minecraft:blackstone_stairs");

  public static final Block BLACKSTONE_WALL = new Block("minecraft:blackstone_wall", (short) 15931, 6.0, 0.6, 1.0, 1.0, "minecraft:blackstone_wall");

  public static final Block BLACKSTONE_SLAB = new Block("minecraft:blackstone_slab", (short) 16255, 6.0, 0.6, 1.0, 1.0, "minecraft:blackstone_slab");

  public static final Block POLISHED_BLACKSTONE = new Block("minecraft:polished_blackstone", (short) 16258, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone");

  public static final Block POLISHED_BLACKSTONE_BRICKS = new Block("minecraft:polished_blackstone_bricks", (short) 16259, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_bricks");

  public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS = new Block("minecraft:cracked_polished_blackstone_bricks", (short) 16260, 6.0, 0.6, 1.0, 1.0, "minecraft:cracked_polished_blackstone_bricks");

  public static final Block CHISELED_POLISHED_BLACKSTONE = new Block("minecraft:chiseled_polished_blackstone", (short) 16261, 6.0, 0.6, 1.0, 1.0, "minecraft:chiseled_polished_blackstone");

  public static final Block POLISHED_BLACKSTONE_BRICK_SLAB = new Block("minecraft:polished_blackstone_brick_slab", (short) 16265, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_brick_slab");

  public static final Block POLISHED_BLACKSTONE_BRICK_STAIRS = new Block("minecraft:polished_blackstone_brick_stairs", (short) 16279, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_brick_stairs");

  public static final Block POLISHED_BLACKSTONE_BRICK_WALL = new Block("minecraft:polished_blackstone_brick_wall", (short) 16351, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_brick_wall");

  public static final Block GILDED_BLACKSTONE = new Block("minecraft:gilded_blackstone", (short) 16672, 6.0, 0.6, 1.0, 1.0, "minecraft:gilded_blackstone");

  public static final Block POLISHED_BLACKSTONE_STAIRS = new Block("minecraft:polished_blackstone_stairs", (short) 16684, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_stairs");

  public static final Block POLISHED_BLACKSTONE_SLAB = new Block("minecraft:polished_blackstone_slab", (short) 16756, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_slab");

  public static final Block POLISHED_BLACKSTONE_PRESSURE_PLATE = new Block("minecraft:polished_blackstone_pressure_plate", (short) 16760, 0.5, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_pressure_plate");

  public static final Block POLISHED_BLACKSTONE_BUTTON = new Block("minecraft:polished_blackstone_button", (short) 16770, 0.5, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_button");

  public static final Block POLISHED_BLACKSTONE_WALL = new Block("minecraft:polished_blackstone_wall", (short) 16788, 6.0, 0.6, 1.0, 1.0, "minecraft:polished_blackstone_wall");

  public static final Block CHISELED_NETHER_BRICKS = new Block("minecraft:chiseled_nether_bricks", (short) 17109, 6.0, 0.6, 1.0, 1.0, "minecraft:chiseled_nether_bricks");

  public static final Block CRACKED_NETHER_BRICKS = new Block("minecraft:cracked_nether_bricks", (short) 17110, 6.0, 0.6, 1.0, 1.0, "minecraft:cracked_nether_bricks");

  public static final Block QUARTZ_BRICKS = new Block("minecraft:quartz_bricks", (short) 17111, 0.8, 0.6, 1.0, 1.0, "minecraft:quartz_bricks");

  static {
    Air.initStates();
    Stone.initStates();
    Granite.initStates();
    PolishedGranite.initStates();
    Diorite.initStates();
    PolishedDiorite.initStates();
    Andesite.initStates();
    PolishedAndesite.initStates();
    GrassBlock.initStates();
    Dirt.initStates();
    CoarseDirt.initStates();
    Podzol.initStates();
    Cobblestone.initStates();
    OakPlanks.initStates();
    SprucePlanks.initStates();
    BirchPlanks.initStates();
    JunglePlanks.initStates();
    AcaciaPlanks.initStates();
    DarkOakPlanks.initStates();
    OakSapling.initStates();
    SpruceSapling.initStates();
    BirchSapling.initStates();
    JungleSapling.initStates();
    AcaciaSapling.initStates();
    DarkOakSapling.initStates();
    Bedrock.initStates();
    Water.initStates();
    Lava.initStates();
    Sand.initStates();
    RedSand.initStates();
    Gravel.initStates();
    GoldOre.initStates();
    IronOre.initStates();
    CoalOre.initStates();
    NetherGoldOre.initStates();
    OakLog.initStates();
    SpruceLog.initStates();
    BirchLog.initStates();
    JungleLog.initStates();
    AcaciaLog.initStates();
    DarkOakLog.initStates();
    StrippedSpruceLog.initStates();
    StrippedBirchLog.initStates();
    StrippedJungleLog.initStates();
    StrippedAcaciaLog.initStates();
    StrippedDarkOakLog.initStates();
    StrippedOakLog.initStates();
    OakWood.initStates();
    SpruceWood.initStates();
    BirchWood.initStates();
    JungleWood.initStates();
    AcaciaWood.initStates();
    DarkOakWood.initStates();
    StrippedOakWood.initStates();
    StrippedSpruceWood.initStates();
    StrippedBirchWood.initStates();
    StrippedJungleWood.initStates();
    StrippedAcaciaWood.initStates();
    StrippedDarkOakWood.initStates();
    OakLeaves.initStates();
    SpruceLeaves.initStates();
    BirchLeaves.initStates();
    JungleLeaves.initStates();
    AcaciaLeaves.initStates();
    DarkOakLeaves.initStates();
    Sponge.initStates();
    WetSponge.initStates();
    Glass.initStates();
    LapisOre.initStates();
    LapisBlock.initStates();
    Dispenser.initStates();
    Sandstone.initStates();
    ChiseledSandstone.initStates();
    CutSandstone.initStates();
    NoteBlock.initStates();
    WhiteBed.initStates();
    OrangeBed.initStates();
    MagentaBed.initStates();
    LightBlueBed.initStates();
    YellowBed.initStates();
    LimeBed.initStates();
    PinkBed.initStates();
    GrayBed.initStates();
    LightGrayBed.initStates();
    CyanBed.initStates();
    PurpleBed.initStates();
    BlueBed.initStates();
    BrownBed.initStates();
    GreenBed.initStates();
    RedBed.initStates();
    BlackBed.initStates();
    PoweredRail.initStates();
    DetectorRail.initStates();
    StickyPiston.initStates();
    Cobweb.initStates();
    Grass.initStates();
    Fern.initStates();
    DeadBush.initStates();
    Seagrass.initStates();
    TallSeagrass.initStates();
    Piston.initStates();
    PistonHead.initStates();
    WhiteWool.initStates();
    OrangeWool.initStates();
    MagentaWool.initStates();
    LightBlueWool.initStates();
    YellowWool.initStates();
    LimeWool.initStates();
    PinkWool.initStates();
    GrayWool.initStates();
    LightGrayWool.initStates();
    CyanWool.initStates();
    PurpleWool.initStates();
    BlueWool.initStates();
    BrownWool.initStates();
    GreenWool.initStates();
    RedWool.initStates();
    BlackWool.initStates();
    MovingPiston.initStates();
    Dandelion.initStates();
    Poppy.initStates();
    BlueOrchid.initStates();
    Allium.initStates();
    AzureBluet.initStates();
    RedTulip.initStates();
    OrangeTulip.initStates();
    WhiteTulip.initStates();
    PinkTulip.initStates();
    OxeyeDaisy.initStates();
    Cornflower.initStates();
    WitherRose.initStates();
    LilyOfTheValley.initStates();
    BrownMushroom.initStates();
    RedMushroom.initStates();
    GoldBlock.initStates();
    IronBlock.initStates();
    Bricks.initStates();
    Tnt.initStates();
    Bookshelf.initStates();
    MossyCobblestone.initStates();
    Obsidian.initStates();
    Torch.initStates();
    WallTorch.initStates();
    Fire.initStates();
    SoulFire.initStates();
    Spawner.initStates();
    OakStairs.initStates();
    Chest.initStates();
    RedstoneWire.initStates();
    DiamondOre.initStates();
    DiamondBlock.initStates();
    CraftingTable.initStates();
    Wheat.initStates();
    Farmland.initStates();
    Furnace.initStates();
    OakSign.initStates();
    SpruceSign.initStates();
    BirchSign.initStates();
    AcaciaSign.initStates();
    JungleSign.initStates();
    DarkOakSign.initStates();
    OakDoor.initStates();
    Ladder.initStates();
    Rail.initStates();
    CobblestoneStairs.initStates();
    OakWallSign.initStates();
    SpruceWallSign.initStates();
    BirchWallSign.initStates();
    AcaciaWallSign.initStates();
    JungleWallSign.initStates();
    DarkOakWallSign.initStates();
    Lever.initStates();
    StonePressurePlate.initStates();
    IronDoor.initStates();
    OakPressurePlate.initStates();
    SprucePressurePlate.initStates();
    BirchPressurePlate.initStates();
    JunglePressurePlate.initStates();
    AcaciaPressurePlate.initStates();
    DarkOakPressurePlate.initStates();
    RedstoneOre.initStates();
    RedstoneTorch.initStates();
    RedstoneWallTorch.initStates();
    StoneButton.initStates();
    Snow.initStates();
    Ice.initStates();
    SnowBlock.initStates();
    Cactus.initStates();
    Clay.initStates();
    SugarCane.initStates();
    Jukebox.initStates();
    OakFence.initStates();
    Pumpkin.initStates();
    Netherrack.initStates();
    SoulSand.initStates();
    SoulSoil.initStates();
    Basalt.initStates();
    PolishedBasalt.initStates();
    SoulTorch.initStates();
    SoulWallTorch.initStates();
    Glowstone.initStates();
    NetherPortal.initStates();
    CarvedPumpkin.initStates();
    JackOLantern.initStates();
    Cake.initStates();
    Repeater.initStates();
    WhiteStainedGlass.initStates();
    OrangeStainedGlass.initStates();
    MagentaStainedGlass.initStates();
    LightBlueStainedGlass.initStates();
    YellowStainedGlass.initStates();
    LimeStainedGlass.initStates();
    PinkStainedGlass.initStates();
    GrayStainedGlass.initStates();
    LightGrayStainedGlass.initStates();
    CyanStainedGlass.initStates();
    PurpleStainedGlass.initStates();
    BlueStainedGlass.initStates();
    BrownStainedGlass.initStates();
    GreenStainedGlass.initStates();
    RedStainedGlass.initStates();
    BlackStainedGlass.initStates();
    OakTrapdoor.initStates();
    SpruceTrapdoor.initStates();
    BirchTrapdoor.initStates();
    JungleTrapdoor.initStates();
    AcaciaTrapdoor.initStates();
    DarkOakTrapdoor.initStates();
    StoneBricks.initStates();
    MossyStoneBricks.initStates();
    CrackedStoneBricks.initStates();
    ChiseledStoneBricks.initStates();
    InfestedStone.initStates();
    InfestedCobblestone.initStates();
    InfestedStoneBricks.initStates();
    InfestedMossyStoneBricks.initStates();
    InfestedCrackedStoneBricks.initStates();
    InfestedChiseledStoneBricks.initStates();
    BrownMushroomBlock.initStates();
    RedMushroomBlock.initStates();
    MushroomStem.initStates();
    IronBars.initStates();
    Chain.initStates();
    GlassPane.initStates();
    Melon.initStates();
    AttachedPumpkinStem.initStates();
    AttachedMelonStem.initStates();
    PumpkinStem.initStates();
    MelonStem.initStates();
    Vine.initStates();
    OakFenceGate.initStates();
    BrickStairs.initStates();
    StoneBrickStairs.initStates();
    Mycelium.initStates();
    LilyPad.initStates();
    NetherBricks.initStates();
    NetherBrickFence.initStates();
    NetherBrickStairs.initStates();
    NetherWart.initStates();
    EnchantingTable.initStates();
    BrewingStand.initStates();
    Cauldron.initStates();
    EndPortal.initStates();
    EndPortalFrame.initStates();
    EndStone.initStates();
    DragonEgg.initStates();
    RedstoneLamp.initStates();
    Cocoa.initStates();
    SandstoneStairs.initStates();
    EmeraldOre.initStates();
    EnderChest.initStates();
    TripwireHook.initStates();
    Tripwire.initStates();
    EmeraldBlock.initStates();
    SpruceStairs.initStates();
    BirchStairs.initStates();
    JungleStairs.initStates();
    CommandBlock.initStates();
    Beacon.initStates();
    CobblestoneWall.initStates();
    MossyCobblestoneWall.initStates();
    FlowerPot.initStates();
    PottedOakSapling.initStates();
    PottedSpruceSapling.initStates();
    PottedBirchSapling.initStates();
    PottedJungleSapling.initStates();
    PottedAcaciaSapling.initStates();
    PottedDarkOakSapling.initStates();
    PottedFern.initStates();
    PottedDandelion.initStates();
    PottedPoppy.initStates();
    PottedBlueOrchid.initStates();
    PottedAllium.initStates();
    PottedAzureBluet.initStates();
    PottedRedTulip.initStates();
    PottedOrangeTulip.initStates();
    PottedWhiteTulip.initStates();
    PottedPinkTulip.initStates();
    PottedOxeyeDaisy.initStates();
    PottedCornflower.initStates();
    PottedLilyOfTheValley.initStates();
    PottedWitherRose.initStates();
    PottedRedMushroom.initStates();
    PottedBrownMushroom.initStates();
    PottedDeadBush.initStates();
    PottedCactus.initStates();
    Carrots.initStates();
    Potatoes.initStates();
    OakButton.initStates();
    SpruceButton.initStates();
    BirchButton.initStates();
    JungleButton.initStates();
    AcaciaButton.initStates();
    DarkOakButton.initStates();
    SkeletonSkull.initStates();
    SkeletonWallSkull.initStates();
    WitherSkeletonSkull.initStates();
    WitherSkeletonWallSkull.initStates();
    ZombieHead.initStates();
    ZombieWallHead.initStates();
    PlayerHead.initStates();
    PlayerWallHead.initStates();
    CreeperHead.initStates();
    CreeperWallHead.initStates();
    DragonHead.initStates();
    DragonWallHead.initStates();
    Anvil.initStates();
    ChippedAnvil.initStates();
    DamagedAnvil.initStates();
    TrappedChest.initStates();
    LightWeightedPressurePlate.initStates();
    HeavyWeightedPressurePlate.initStates();
    Comparator.initStates();
    DaylightDetector.initStates();
    RedstoneBlock.initStates();
    NetherQuartzOre.initStates();
    Hopper.initStates();
    QuartzBlock.initStates();
    ChiseledQuartzBlock.initStates();
    QuartzPillar.initStates();
    QuartzStairs.initStates();
    ActivatorRail.initStates();
    Dropper.initStates();
    WhiteTerracotta.initStates();
    OrangeTerracotta.initStates();
    MagentaTerracotta.initStates();
    LightBlueTerracotta.initStates();
    YellowTerracotta.initStates();
    LimeTerracotta.initStates();
    PinkTerracotta.initStates();
    GrayTerracotta.initStates();
    LightGrayTerracotta.initStates();
    CyanTerracotta.initStates();
    PurpleTerracotta.initStates();
    BlueTerracotta.initStates();
    BrownTerracotta.initStates();
    GreenTerracotta.initStates();
    RedTerracotta.initStates();
    BlackTerracotta.initStates();
    WhiteStainedGlassPane.initStates();
    OrangeStainedGlassPane.initStates();
    MagentaStainedGlassPane.initStates();
    LightBlueStainedGlassPane.initStates();
    YellowStainedGlassPane.initStates();
    LimeStainedGlassPane.initStates();
    PinkStainedGlassPane.initStates();
    GrayStainedGlassPane.initStates();
    LightGrayStainedGlassPane.initStates();
    CyanStainedGlassPane.initStates();
    PurpleStainedGlassPane.initStates();
    BlueStainedGlassPane.initStates();
    BrownStainedGlassPane.initStates();
    GreenStainedGlassPane.initStates();
    RedStainedGlassPane.initStates();
    BlackStainedGlassPane.initStates();
    AcaciaStairs.initStates();
    DarkOakStairs.initStates();
    SlimeBlock.initStates();
    Barrier.initStates();
    IronTrapdoor.initStates();
    Prismarine.initStates();
    PrismarineBricks.initStates();
    DarkPrismarine.initStates();
    PrismarineStairs.initStates();
    PrismarineBrickStairs.initStates();
    DarkPrismarineStairs.initStates();
    PrismarineSlab.initStates();
    PrismarineBrickSlab.initStates();
    DarkPrismarineSlab.initStates();
    SeaLantern.initStates();
    HayBlock.initStates();
    WhiteCarpet.initStates();
    OrangeCarpet.initStates();
    MagentaCarpet.initStates();
    LightBlueCarpet.initStates();
    YellowCarpet.initStates();
    LimeCarpet.initStates();
    PinkCarpet.initStates();
    GrayCarpet.initStates();
    LightGrayCarpet.initStates();
    CyanCarpet.initStates();
    PurpleCarpet.initStates();
    BlueCarpet.initStates();
    BrownCarpet.initStates();
    GreenCarpet.initStates();
    RedCarpet.initStates();
    BlackCarpet.initStates();
    Terracotta.initStates();
    CoalBlock.initStates();
    PackedIce.initStates();
    Sunflower.initStates();
    Lilac.initStates();
    RoseBush.initStates();
    Peony.initStates();
    TallGrass.initStates();
    LargeFern.initStates();
    WhiteBanner.initStates();
    OrangeBanner.initStates();
    MagentaBanner.initStates();
    LightBlueBanner.initStates();
    YellowBanner.initStates();
    LimeBanner.initStates();
    PinkBanner.initStates();
    GrayBanner.initStates();
    LightGrayBanner.initStates();
    CyanBanner.initStates();
    PurpleBanner.initStates();
    BlueBanner.initStates();
    BrownBanner.initStates();
    GreenBanner.initStates();
    RedBanner.initStates();
    BlackBanner.initStates();
    WhiteWallBanner.initStates();
    OrangeWallBanner.initStates();
    MagentaWallBanner.initStates();
    LightBlueWallBanner.initStates();
    YellowWallBanner.initStates();
    LimeWallBanner.initStates();
    PinkWallBanner.initStates();
    GrayWallBanner.initStates();
    LightGrayWallBanner.initStates();
    CyanWallBanner.initStates();
    PurpleWallBanner.initStates();
    BlueWallBanner.initStates();
    BrownWallBanner.initStates();
    GreenWallBanner.initStates();
    RedWallBanner.initStates();
    BlackWallBanner.initStates();
    RedSandstone.initStates();
    ChiseledRedSandstone.initStates();
    CutRedSandstone.initStates();
    RedSandstoneStairs.initStates();
    OakSlab.initStates();
    SpruceSlab.initStates();
    BirchSlab.initStates();
    JungleSlab.initStates();
    AcaciaSlab.initStates();
    DarkOakSlab.initStates();
    StoneSlab.initStates();
    SmoothStoneSlab.initStates();
    SandstoneSlab.initStates();
    CutSandstoneSlab.initStates();
    PetrifiedOakSlab.initStates();
    CobblestoneSlab.initStates();
    BrickSlab.initStates();
    StoneBrickSlab.initStates();
    NetherBrickSlab.initStates();
    QuartzSlab.initStates();
    RedSandstoneSlab.initStates();
    CutRedSandstoneSlab.initStates();
    PurpurSlab.initStates();
    SmoothStone.initStates();
    SmoothSandstone.initStates();
    SmoothQuartz.initStates();
    SmoothRedSandstone.initStates();
    SpruceFenceGate.initStates();
    BirchFenceGate.initStates();
    JungleFenceGate.initStates();
    AcaciaFenceGate.initStates();
    DarkOakFenceGate.initStates();
    SpruceFence.initStates();
    BirchFence.initStates();
    JungleFence.initStates();
    AcaciaFence.initStates();
    DarkOakFence.initStates();
    SpruceDoor.initStates();
    BirchDoor.initStates();
    JungleDoor.initStates();
    AcaciaDoor.initStates();
    DarkOakDoor.initStates();
    EndRod.initStates();
    ChorusPlant.initStates();
    ChorusFlower.initStates();
    PurpurBlock.initStates();
    PurpurPillar.initStates();
    PurpurStairs.initStates();
    EndStoneBricks.initStates();
    Beetroots.initStates();
    GrassPath.initStates();
    EndGateway.initStates();
    RepeatingCommandBlock.initStates();
    ChainCommandBlock.initStates();
    FrostedIce.initStates();
    MagmaBlock.initStates();
    NetherWartBlock.initStates();
    RedNetherBricks.initStates();
    BoneBlock.initStates();
    StructureVoid.initStates();
    Observer.initStates();
    ShulkerBox.initStates();
    WhiteShulkerBox.initStates();
    OrangeShulkerBox.initStates();
    MagentaShulkerBox.initStates();
    LightBlueShulkerBox.initStates();
    YellowShulkerBox.initStates();
    LimeShulkerBox.initStates();
    PinkShulkerBox.initStates();
    GrayShulkerBox.initStates();
    LightGrayShulkerBox.initStates();
    CyanShulkerBox.initStates();
    PurpleShulkerBox.initStates();
    BlueShulkerBox.initStates();
    BrownShulkerBox.initStates();
    GreenShulkerBox.initStates();
    RedShulkerBox.initStates();
    BlackShulkerBox.initStates();
    WhiteGlazedTerracotta.initStates();
    OrangeGlazedTerracotta.initStates();
    MagentaGlazedTerracotta.initStates();
    LightBlueGlazedTerracotta.initStates();
    YellowGlazedTerracotta.initStates();
    LimeGlazedTerracotta.initStates();
    PinkGlazedTerracotta.initStates();
    GrayGlazedTerracotta.initStates();
    LightGrayGlazedTerracotta.initStates();
    CyanGlazedTerracotta.initStates();
    PurpleGlazedTerracotta.initStates();
    BlueGlazedTerracotta.initStates();
    BrownGlazedTerracotta.initStates();
    GreenGlazedTerracotta.initStates();
    RedGlazedTerracotta.initStates();
    BlackGlazedTerracotta.initStates();
    WhiteConcrete.initStates();
    OrangeConcrete.initStates();
    MagentaConcrete.initStates();
    LightBlueConcrete.initStates();
    YellowConcrete.initStates();
    LimeConcrete.initStates();
    PinkConcrete.initStates();
    GrayConcrete.initStates();
    LightGrayConcrete.initStates();
    CyanConcrete.initStates();
    PurpleConcrete.initStates();
    BlueConcrete.initStates();
    BrownConcrete.initStates();
    GreenConcrete.initStates();
    RedConcrete.initStates();
    BlackConcrete.initStates();
    WhiteConcretePowder.initStates();
    OrangeConcretePowder.initStates();
    MagentaConcretePowder.initStates();
    LightBlueConcretePowder.initStates();
    YellowConcretePowder.initStates();
    LimeConcretePowder.initStates();
    PinkConcretePowder.initStates();
    GrayConcretePowder.initStates();
    LightGrayConcretePowder.initStates();
    CyanConcretePowder.initStates();
    PurpleConcretePowder.initStates();
    BlueConcretePowder.initStates();
    BrownConcretePowder.initStates();
    GreenConcretePowder.initStates();
    RedConcretePowder.initStates();
    BlackConcretePowder.initStates();
    Kelp.initStates();
    KelpPlant.initStates();
    DriedKelpBlock.initStates();
    TurtleEgg.initStates();
    DeadTubeCoralBlock.initStates();
    DeadBrainCoralBlock.initStates();
    DeadBubbleCoralBlock.initStates();
    DeadFireCoralBlock.initStates();
    DeadHornCoralBlock.initStates();
    TubeCoralBlock.initStates();
    BrainCoralBlock.initStates();
    BubbleCoralBlock.initStates();
    FireCoralBlock.initStates();
    HornCoralBlock.initStates();
    DeadTubeCoral.initStates();
    DeadBrainCoral.initStates();
    DeadBubbleCoral.initStates();
    DeadFireCoral.initStates();
    DeadHornCoral.initStates();
    TubeCoral.initStates();
    BrainCoral.initStates();
    BubbleCoral.initStates();
    FireCoral.initStates();
    HornCoral.initStates();
    DeadTubeCoralFan.initStates();
    DeadBrainCoralFan.initStates();
    DeadBubbleCoralFan.initStates();
    DeadFireCoralFan.initStates();
    DeadHornCoralFan.initStates();
    TubeCoralFan.initStates();
    BrainCoralFan.initStates();
    BubbleCoralFan.initStates();
    FireCoralFan.initStates();
    HornCoralFan.initStates();
    DeadTubeCoralWallFan.initStates();
    DeadBrainCoralWallFan.initStates();
    DeadBubbleCoralWallFan.initStates();
    DeadFireCoralWallFan.initStates();
    DeadHornCoralWallFan.initStates();
    TubeCoralWallFan.initStates();
    BrainCoralWallFan.initStates();
    BubbleCoralWallFan.initStates();
    FireCoralWallFan.initStates();
    HornCoralWallFan.initStates();
    SeaPickle.initStates();
    BlueIce.initStates();
    Conduit.initStates();
    BambooSapling.initStates();
    Bamboo.initStates();
    PottedBamboo.initStates();
    VoidAir.initStates();
    CaveAir.initStates();
    BubbleColumn.initStates();
    PolishedGraniteStairs.initStates();
    SmoothRedSandstoneStairs.initStates();
    MossyStoneBrickStairs.initStates();
    PolishedDioriteStairs.initStates();
    MossyCobblestoneStairs.initStates();
    EndStoneBrickStairs.initStates();
    StoneStairs.initStates();
    SmoothSandstoneStairs.initStates();
    SmoothQuartzStairs.initStates();
    GraniteStairs.initStates();
    AndesiteStairs.initStates();
    RedNetherBrickStairs.initStates();
    PolishedAndesiteStairs.initStates();
    DioriteStairs.initStates();
    PolishedGraniteSlab.initStates();
    SmoothRedSandstoneSlab.initStates();
    MossyStoneBrickSlab.initStates();
    PolishedDioriteSlab.initStates();
    MossyCobblestoneSlab.initStates();
    EndStoneBrickSlab.initStates();
    SmoothSandstoneSlab.initStates();
    SmoothQuartzSlab.initStates();
    GraniteSlab.initStates();
    AndesiteSlab.initStates();
    RedNetherBrickSlab.initStates();
    PolishedAndesiteSlab.initStates();
    DioriteSlab.initStates();
    BrickWall.initStates();
    PrismarineWall.initStates();
    RedSandstoneWall.initStates();
    MossyStoneBrickWall.initStates();
    GraniteWall.initStates();
    StoneBrickWall.initStates();
    NetherBrickWall.initStates();
    AndesiteWall.initStates();
    RedNetherBrickWall.initStates();
    SandstoneWall.initStates();
    EndStoneBrickWall.initStates();
    DioriteWall.initStates();
    Scaffolding.initStates();
    Loom.initStates();
    Barrel.initStates();
    Smoker.initStates();
    BlastFurnace.initStates();
    CartographyTable.initStates();
    FletchingTable.initStates();
    Grindstone.initStates();
    Lectern.initStates();
    SmithingTable.initStates();
    Stonecutter.initStates();
    Bell.initStates();
    Lantern.initStates();
    SoulLantern.initStates();
    Campfire.initStates();
    SoulCampfire.initStates();
    SweetBerryBush.initStates();
    WarpedStem.initStates();
    StrippedWarpedStem.initStates();
    WarpedHyphae.initStates();
    StrippedWarpedHyphae.initStates();
    WarpedNylium.initStates();
    WarpedFungus.initStates();
    WarpedWartBlock.initStates();
    WarpedRoots.initStates();
    NetherSprouts.initStates();
    CrimsonStem.initStates();
    StrippedCrimsonStem.initStates();
    CrimsonHyphae.initStates();
    StrippedCrimsonHyphae.initStates();
    CrimsonNylium.initStates();
    CrimsonFungus.initStates();
    Shroomlight.initStates();
    WeepingVines.initStates();
    WeepingVinesPlant.initStates();
    TwistingVines.initStates();
    TwistingVinesPlant.initStates();
    CrimsonRoots.initStates();
    CrimsonPlanks.initStates();
    WarpedPlanks.initStates();
    CrimsonSlab.initStates();
    WarpedSlab.initStates();
    CrimsonPressurePlate.initStates();
    WarpedPressurePlate.initStates();
    CrimsonFence.initStates();
    WarpedFence.initStates();
    CrimsonTrapdoor.initStates();
    WarpedTrapdoor.initStates();
    CrimsonFenceGate.initStates();
    WarpedFenceGate.initStates();
    CrimsonStairs.initStates();
    WarpedStairs.initStates();
    CrimsonButton.initStates();
    WarpedButton.initStates();
    CrimsonDoor.initStates();
    WarpedDoor.initStates();
    CrimsonSign.initStates();
    WarpedSign.initStates();
    CrimsonWallSign.initStates();
    WarpedWallSign.initStates();
    StructureBlock.initStates();
    Jigsaw.initStates();
    Composter.initStates();
    Target.initStates();
    BeeNest.initStates();
    Beehive.initStates();
    HoneyBlock.initStates();
    HoneycombBlock.initStates();
    NetheriteBlock.initStates();
    AncientDebris.initStates();
    CryingObsidian.initStates();
    RespawnAnchor.initStates();
    PottedCrimsonFungus.initStates();
    PottedWarpedFungus.initStates();
    PottedCrimsonRoots.initStates();
    PottedWarpedRoots.initStates();
    Lodestone.initStates();
    Blackstone.initStates();
    BlackstoneStairs.initStates();
    BlackstoneWall.initStates();
    BlackstoneSlab.initStates();
    PolishedBlackstone.initStates();
    PolishedBlackstoneBricks.initStates();
    CrackedPolishedBlackstoneBricks.initStates();
    ChiseledPolishedBlackstone.initStates();
    PolishedBlackstoneBrickSlab.initStates();
    PolishedBlackstoneBrickStairs.initStates();
    PolishedBlackstoneBrickWall.initStates();
    GildedBlackstone.initStates();
    PolishedBlackstoneStairs.initStates();
    PolishedBlackstoneSlab.initStates();
    PolishedBlackstonePressurePlate.initStates();
    PolishedBlackstoneButton.initStates();
    PolishedBlackstoneWall.initStates();
    ChiseledNetherBricks.initStates();
    CrackedNetherBricks.initStates();
    QuartzBricks.initStates();
  }

  @NotNull
  private final String id;

  private final short defaultBlockState;

  private final double explosionResistance;

  private final double friction;

  private final double speedFactor;

  private final double jumpFactor;

  @Nullable
  private final String itemId;

  @NotNull
  private final List<BlockState> blockStates = new ArrayList<>();

  protected Block(@NotNull String id, short defaultBlockState, double explosionResistance,
      double friction, double speedFactor, double jumpFactor, @Nullable String itemId) {
    this.id = id;
    this.defaultBlockState = defaultBlockState;
    this.explosionResistance = explosionResistance;
    this.friction = friction;
    this.speedFactor = speedFactor;
    this.jumpFactor = jumpFactor;
    this.itemId = itemId;
  }

  public final void addBlockState(@NotNull BlockState blockState) {
    this.blockStates.add(blockState);
  }
}
