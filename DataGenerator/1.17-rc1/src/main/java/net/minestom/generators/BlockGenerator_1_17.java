package net.minestom.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minestom.datagen.DataGenHolder;
import net.minestom.datagen.DataGenType;
import net.minestom.generators.common.DataGenerator_1_17;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public final class BlockGenerator_1_17 extends DataGenerator_1_17<Block> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockGenerator_1_17.class);

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
    public JsonArray generate() {
        Map<Property<?>, String> bsPropertyNames = (Map<Property<?>, String>) DataGenHolder.getNameMap(DataGenType.BLOCK_PROPERTIES);

        Set<ResourceLocation> blockRLs = Registry.BLOCK.keySet();
        JsonArray blocks = new JsonArray();
        for (ResourceLocation blockRL : blockRLs) {
            Block b = Registry.BLOCK.get(blockRL);

            JsonObject block = new JsonObject();
            block.addProperty("id", blockRL.toString());
            block.addProperty("numericalID", Registry.BLOCK.getId(b));
            block.addProperty("name", names.get(b));
            // block.addProperty("langId", b.getDescriptionId());
            block.addProperty("explosionResistance", b.getExplosionResistance());
            block.addProperty("friction", b.getFriction());
            block.addProperty("speedFactor", b.getSpeedFactor());
            block.addProperty("jumpFactor", b.getJumpFactor());
            block.addProperty("defaultBlockState", Block.BLOCK_STATE_REGISTRY.getId(b.defaultBlockState()));
            block.addProperty("itemId", Registry.ITEM.getKey(Item.BY_BLOCK.getOrDefault(b, Items.AIR)).toString());
            block.addProperty("blockEntity", b instanceof EntityBlock);

            // Block proprties
            {
                JsonArray properties = new JsonArray();
                for (Property<?> p : b.getStateDefinition().getProperties()) {
                    properties.add(bsPropertyNames.get(p).toLowerCase());
                }
                block.add("properties", properties);
            }
            {
                // Block states
                JsonArray blockStates = new JsonArray();
                for (BlockState bs : b.getStateDefinition().getPossibleStates()) {
                    JsonObject state = new JsonObject();
                    state.addProperty("id", Block.BLOCK_STATE_REGISTRY.getId(bs));
                    state.addProperty("destroySpeed", bs.getDestroySpeed(EmptyBlockGetter.INSTANCE, BlockPos.ZERO));
                    state.addProperty("lightEmission", bs.getLightEmission());
                    state.addProperty("doesOcclude", bs.canOcclude());

                    // Properties
                    {
                        JsonObject properties = new JsonObject();
                        for (Map.Entry<Property<?>, Comparable<?>> entry : bs.getValues().entrySet()) {
                            properties.addProperty(entry.getKey().getName(), String.valueOf(entry.getValue()));
                        }
                        state.add("properties", properties);
                    }

                    state.addProperty("pushReaction", bs.getMaterial().getPushReaction().toString());
                    state.addProperty("blocksMotion", bs.getMaterial().blocksMotion());
                    state.addProperty("isFlammable", bs.getMaterial().isFlammable());
                    state.addProperty("isAir", bs.isAir());
                    state.addProperty("isLiquid", bs.getMaterial().isLiquid());
                    state.addProperty("isReplaceable", bs.getMaterial().isReplaceable());
                    state.addProperty("isSolid", bs.getMaterial().isSolid());
                    state.addProperty("isSolidBlocking", bs.getMaterial().isSolidBlocking());
                    state.addProperty("mapColorId", bs.getMaterial().getColor().id);

                    state.addProperty("shape", bs.getShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());

                    state.addProperty("collisionShape", bs.getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());

                    state.addProperty("interactionShape", bs.getInteractionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());

                    state.addProperty("occlusionShape", bs.getOcclusionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());

                    state.addProperty("visualShape", bs.getOcclusionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO).toAabbs().toString());
                    blockStates.add(state);
                }
                block.add("states", blockStates);
            }

            blocks.add(block);
        }
        return blocks;
    }
}
