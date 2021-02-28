package com.minestom.data_generator;

import com.minestom.data_generator.GeneratedBlock.GeneratedBlockState;
import com.minestom.data_generator.GeneratedBlock.GeneratedBlockState.GeneratedBlockStateMaterial;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class DataGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator.class);
    private static JsonGenerator jsonGenerator;

    public static void main(String[] args) {
        if (args.length == 0) {
            LOGGER.info("You must specify a version to generate data for.");
            return;
        }
        String version = args[0];
        jsonGenerator = new JsonGenerator(version);
        generateBlocks();
        generateEntities();
        generateBlockEntities();
        generateItems();
        generateMapColors();
        LOGGER.info("Output data in: ./DataGenerator/output/");
    }


    public static void generateBlocks() {
        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        List<GeneratedBlock> generatedBlocks = new ArrayList<>();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);
            List<GeneratedBlockState> blockStates = new ArrayList<>();

            for (BlockState possibleState : b.getStateDefinition().getPossibleStates()) {
                GeneratedBlockStateMaterial generatedBlockStateMaterial = new GeneratedBlockStateMaterial(
                        possibleState.getMaterial().getPushReaction().toString(),
                        possibleState.getMaterial().blocksMotion(),
                        possibleState.getMaterial().isFlammable(),
                        possibleState.getMaterial().isLiquid(),
                        possibleState.getMaterial().isReplaceable(),
                        possibleState.getMaterial().isSolid(),
                        possibleState.getMaterial().isSolidBlocking(),
                        possibleState.getMaterial().getColor().id,
                        possibleState.getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString()
                );
                GeneratedBlockState generatedBlockState = new GeneratedBlockState(
                        Block.BLOCK_STATE_REGISTRY.getId(possibleState),
                        possibleState.getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO),
                        possibleState.getLightEmission(),
                        possibleState.canOcclude(),
                        generatedBlockStateMaterial
                );

                blockStates.add(generatedBlockState);
            }

            GeneratedBlock gb = new GeneratedBlock(
                    blockRL.toString(),
                    b.getExplosionResistance(),
                    b.getFriction(),
                    b.getSpeedFactor(),
                    b.getJumpFactor(),
                    Registry.ITEM.getKey(Item.BY_BLOCK.getOrDefault(b, Items.AIR)).toString(),
                    blockStates
            );
            generatedBlocks.add(gb);
        }
        jsonGenerator.outputBlocks(generatedBlocks);
    }

    private static void generateEntities() {
        Set<ResourceLocation> entityRLs = Registry.ENTITY_TYPE.keySet();
        List<GeneratedEntity> generatedEntities = new ArrayList<>();
        for (ResourceLocation entityRL : entityRLs) {
            EntityType<?> e = Registry.ENTITY_TYPE.get(entityRL);
            GeneratedEntity generatedEntity = new GeneratedEntity(
                    entityRL.toString(),
                    e.getCategory().toString(),
                    e.fireImmune(),
                    e.getHeight(),
                    e.getWidth(),
                    e.getDimensions().fixed
            );

            generatedEntities.add(generatedEntity);
        }
        jsonGenerator.outputEntities(generatedEntities);
    }

    private static void generateBlockEntities() {
        Set<ResourceLocation> blockEntityRLs = Registry.BLOCK_ENTITY_TYPE.keySet();
        List<GeneratedBlockEntity> generatedBlockEntities = new ArrayList<>();
        for (ResourceLocation blockEntityRL : blockEntityRLs) {
            BlockEntityType<?> be = Registry.BLOCK_ENTITY_TYPE.get(blockEntityRL);
            GeneratedBlockEntity generatedBlockEntity = new GeneratedBlockEntity(
                    blockEntityRL.toString()
            );
            generatedBlockEntities.add(generatedBlockEntity);
        }
        jsonGenerator.outputBlockEntites(generatedBlockEntities);
    }

    private static void generateItems() {
        Set<ResourceLocation> itemRLs = Registry.ITEM.keySet();
        List<GeneratedItem> generatedItems = new ArrayList<>();
        for (ResourceLocation itemRL : itemRLs) {
            Item i = Registry.ITEM.get(itemRL);
            GeneratedItem.GeneratedItemFoodProperties generatedItemFoodProperties = null;
            if (i.isEdible() && i.getFoodProperties() != null) {
                FoodProperties foodProperties = i.getFoodProperties();
                generatedItemFoodProperties = new GeneratedItem.GeneratedItemFoodProperties(
                        foodProperties.canAlwaysEat(),
                        foodProperties.isFastFood(),
                        foodProperties.getNutrition(),
                        foodProperties.getSaturationModifier(),
                        // TODO: Make these into dedicated classes that share classes in the POTION & MOBEFFECT Registry.
                        foodProperties.getEffects().toString()
                );
            }

            GeneratedItem generatedItem = new GeneratedItem(
                    itemRL.toString(),
                    i.getItemCategory() == null ? "none" : i.getItemCategory().getRecipeFolderName(),
                    i.canBeDepleted(),
                    i.getMaxStackSize(),
                    i.getMaxDamage(),
                    i.isComplex(),
                    i.isEdible(),
                    i.isFireResistant(),
                    generatedItemFoodProperties
            );
            generatedItems.add(generatedItem);
        }
        jsonGenerator.outputItems(generatedItems);
    }

    private static void generateMapColors() {
        HashMap<MaterialColor, String> names = new HashMap<>();
        // Map field name to material color.
        for (Field declaredField : MaterialColor.class.getDeclaredFields()) {
            if (declaredField.getName().equals("MATERIAL_COLORS") || declaredField.getType() != MaterialColor.class) {
                continue;
            }
            try {
                MaterialColor mc = (MaterialColor) declaredField.get(null);
                names.put(mc, declaredField.getName());
            } catch (IllegalAccessException e) {
                // Just stop I guess
                LOGGER.error("Failed to access map color naming system", e);
                return;
            }
        }

        List<GeneratedMapColor> generatedMapColors = new ArrayList<>();
        for (MaterialColor materialColor : MaterialColor.MATERIAL_COLORS) {
            if (materialColor == null) {
                continue;
            }
            String name = names.get(materialColor);
            // Get the colour's name using reflection
            if (name == null) {
                LOGGER.error("Failed to get name for a color, it will be skipped!");
                continue;
            }
            GeneratedMapColor generatedMapColor = new GeneratedMapColor(
                    name,
                    materialColor.id,
                    materialColor.col
            );
            generatedMapColors.add(generatedMapColor);
        }
        jsonGenerator.outputMapColors(generatedMapColors);
    }
}
