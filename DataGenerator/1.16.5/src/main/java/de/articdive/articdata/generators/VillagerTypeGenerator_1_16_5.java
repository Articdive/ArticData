package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class VillagerTypeGenerator_1_16_5 extends DataGenerator_1_16_5<VillagerType> {
    private static final Logger LOGGER = LoggerFactory.getLogger(VillagerTypeGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : VillagerType.class.getDeclaredFields()) {
            if (!VillagerType.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                VillagerType vt = (VillagerType) declaredField.get(null);
                names.put(vt, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map villager type naming system", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> villagerTypeRLs = Registry.VILLAGER_TYPE.keySet();
        JsonObject villagerTypes = new JsonObject();

        for (ResourceLocation villagerTypeRL : villagerTypeRLs) {
            VillagerType vt = Registry.VILLAGER_TYPE.get(villagerTypeRL);

            JsonObject villagerType = new JsonObject();
            villagerType.addProperty("id", Registry.VILLAGER_TYPE.getId(vt));
            villagerType.addProperty("mojangName", names.get(vt));

            villagerTypes.add(villagerTypeRL.toString(), villagerType);
        }
        return villagerTypes;
    }
}
