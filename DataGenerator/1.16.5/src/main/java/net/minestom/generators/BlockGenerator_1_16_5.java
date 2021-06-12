package net.minestom.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.PushReaction;
import net.minestom.datagen.DataGenHolder;
import net.minestom.datagen.DataGenType;
import net.minestom.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public final class BlockGenerator_1_16_5 extends DataGenerator_1_16_5<Block> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Blocks.class.getDeclaredFields()) {
            if (!Block.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Block b = (Block) declaredField.get(null);
                names.put(b, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map block naming system.", e);
                return;
            }
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public JsonObject generate() {
        Map<Property<?>, String> bsPropertyNames = (Map<Property<?>, String>) DataGenHolder.getNameMap(DataGenType.BLOCK_PROPERTIES);

        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        JsonObject blocks = new JsonObject();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);

            JsonObject block = new JsonObject();
            block.addProperty("id", Registry.BLOCK.getId(b));
            block.addProperty("mojangName", names.get(b));
            // block.addProperty("langId", b.getDescriptionId());
            block.addProperty("explosionResistance", b.getExplosionResistance());
            block.addProperty("friction", b.getFriction());
            block.addProperty("speedFactor", b.getSpeedFactor());
            block.addProperty("jumpFactor", b.getJumpFactor());
            block.addProperty("defaultStateId", Block.BLOCK_STATE_REGISTRY.getId(b.defaultBlockState()));
            Item correspondingItem = Item.BY_BLOCK.getOrDefault(b, null);
            if (correspondingItem != null) {
                block.addProperty("correspondingItem", Registry.ITEM.getKey(correspondingItem).toString());
            }
            block.addProperty("blockEntity", b instanceof EntityBlock);

            // Default values
            double defaultHardness = b.defaultBlockState().getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO);
            block.addProperty("hardness", defaultHardness);

            int defaultLightEmission = b.defaultBlockState().getLightEmission();
            block.addProperty("lightEmission", defaultLightEmission);

            PushReaction defaultPushReaction = b.defaultBlockState().getPistonPushReaction();
            block.addProperty("pushReaction", defaultPushReaction.name());

            int defaultMapColorId = b.defaultBlockState().getMapColor(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).id;
            block.addProperty("mapColorId", defaultMapColorId);

            boolean defaultOccludes = b.defaultBlockState().canOcclude();
            block.addProperty("occludes", defaultOccludes);

            boolean defaultBlocksMotion = b.defaultBlockState().getMaterial().blocksMotion();
            block.addProperty("blocksMotion", defaultBlocksMotion);

            boolean defaultFlammable = b.defaultBlockState().getMaterial().isFlammable();
            block.addProperty("flammable", defaultFlammable);

            boolean defaultAir = b.defaultBlockState().isAir();
            block.addProperty("air", defaultAir);

            boolean defaultLiquid = b.defaultBlockState().getMaterial().isLiquid();
            block.addProperty("liquid", defaultLiquid);

            boolean defaultReplaceable = b.defaultBlockState().getMaterial().isReplaceable();
            block.addProperty("replaceable", defaultReplaceable);

            boolean defaultSolid = b.defaultBlockState().getMaterial().isSolid();
            block.addProperty("solid", defaultSolid);

            boolean defaultSolidBlocking = b.defaultBlockState().getMaterial().isSolidBlocking();
            block.addProperty("solidBlocking", defaultSolidBlocking);

            // Block proprties
            {
                JsonArray properties = new JsonArray();
                for (Property<?> p : b.getStateDefinition().getProperties()) {
                    properties.add(bsPropertyNames.get(p));
                }
                block.add("properties", properties);
            }
            {
                // Block states
                JsonObject blockStates = new JsonObject();
                for (BlockState bs : b.getStateDefinition().getPossibleStates()) {
                    JsonObject state = new JsonObject();

                    // Properties in the mapping name.
                    StringBuilder stateId = new StringBuilder("[");
                    for (Map.Entry<Property<?>, Comparable<?>> entry : bs.getValues().entrySet()) {
                        stateId.append(entry.getKey().getName()).append("=").append(entry.getValue());
                        stateId.append(",");
                    }
                    if (bs.getValues().entrySet().size() > 0) {
                        // Remove last comma
                        stateId.deleteCharAt(stateId.length() - 1);
                    }
                    stateId.append("]");

                    state.addProperty("stateId", Block.BLOCK_STATE_REGISTRY.getId(bs));

                    // Default values
                    double hardness = bs.getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO);
                    if (hardness != defaultHardness) {
                        state.addProperty("hardness", hardness);
                    }
                    int lightEmission = bs.getLightEmission();
                    if (lightEmission != defaultLightEmission) {
                        state.addProperty("lightEmission", lightEmission);
                    }
                    PushReaction pushReaction = bs.getPistonPushReaction();
                    if (pushReaction != defaultPushReaction) {
                        state.addProperty("pushReaction", pushReaction.name());
                    }
                    int mapColorId = bs.getMapColor(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).id;
                    if (mapColorId != defaultMapColorId) {
                        state.addProperty("mapColorId", mapColorId);
                    }
                    boolean doesOcclude = bs.canOcclude();
                    if (doesOcclude != defaultOccludes) {
                        state.addProperty("occludes", doesOcclude);
                    }

                    boolean blocksMotion = bs.getMaterial().blocksMotion();
                    if (blocksMotion != defaultBlocksMotion) {
                        state.addProperty("blocksMotion", blocksMotion);
                    }

                    boolean flammable = bs.getMaterial().isFlammable();
                    if (flammable != defaultFlammable) {
                        state.addProperty("flammable", flammable);
                    }

                    boolean air = bs.isAir();
                    if (air != defaultAir) {
                        state.addProperty("air", air);
                    }

                    boolean liquid = bs.getMaterial().isLiquid();
                    if (liquid != defaultLiquid) {
                        state.addProperty("liquid", liquid);
                    }

                    boolean replaceable = bs.getMaterial().isReplaceable();
                    if (replaceable != defaultReplaceable) {
                        state.addProperty("replaceable", replaceable);
                    }

                    boolean solid = bs.getMaterial().isSolid();
                    if (solid != defaultSolid) {
                        state.addProperty("solid", solid);
                    }

                    boolean solidBlocking = bs.getMaterial().isSolidBlocking();
                    if (solidBlocking != defaultSolidBlocking) {
                        state.addProperty("solidBlocking", solidBlocking);
                    }

                    // Shapes
                    state.addProperty("shape", bs.getShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                    state.addProperty("collisionShape", bs.getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                    state.addProperty("interactionShape", bs.getInteractionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                    state.addProperty("occlusionShape", bs.getOcclusionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                    state.addProperty("visualShape", bs.getOcclusionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());

                    blockStates.add(stateId.toString(), state);
                }
                block.add("states", blockStates);
            }

            blocks.add(blockRL.toString(), block);
        }
        return blocks;
    }
}
