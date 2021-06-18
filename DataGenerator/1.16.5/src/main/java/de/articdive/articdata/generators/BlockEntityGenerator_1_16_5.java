package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class BlockEntityGenerator_1_16_5 extends DataGenerator_1_16_5<BlockEntityType> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockEntityGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : BlockEntityType.class.getDeclaredFields()) {
            if (!BlockEntityType.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                BlockEntityType<?> bet = (BlockEntityType<?>) declaredField.get(null);
                names.put(bet, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map block entity naming system.", e);
                return;
            }
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public JsonObject generate() {
        Set<ResourceLocation> blockEntityRLs = Registry.BLOCK_ENTITY_TYPE.keySet();
        JsonObject blockEntities = new JsonObject();

        for (ResourceLocation blockEntityRL : blockEntityRLs) {
            BlockEntityType<?> bet = Registry.BLOCK_ENTITY_TYPE.get(blockEntityRL);

            JsonObject blockEntity = new JsonObject();
            blockEntity.addProperty("mojangName", names.get(bet));

            // Use reflection to get valid blocks
            {
                JsonArray beBlocks = new JsonArray();
                try {
                    Field fcField = BlockEntityType.class.getDeclaredField("validBlocks");

                    fcField.setAccessible(true);

                    Set<Block> validBlocks = (Set<Block>) fcField.get(bet);
                    for (Block validBlock : validBlocks) {
                        JsonObject beBlock = new JsonObject();
                        beBlock.addProperty("id", Registry.BLOCK.getKey(validBlock).toString());

                        beBlocks.add(beBlock);
                    }
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    LOGGER.error("Failed to get block-entity blocks, skipping block-entity with ID '" + blockEntityRL + "'.", e);
                    continue;
                }
                blockEntity.add("blocks", beBlocks);
            }
            blockEntities.add(blockEntityRL.toString(), blockEntity);
        }
        return blockEntities;
    }
}
