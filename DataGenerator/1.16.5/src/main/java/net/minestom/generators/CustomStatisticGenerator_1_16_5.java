package net.minestom.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minestom.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class CustomStatisticGenerator_1_16_5 extends DataGenerator_1_16_5<ResourceLocation> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomStatisticGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Stats.class.getDeclaredFields()) {
            if (!ResourceLocation.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                ResourceLocation rl = (ResourceLocation) declaredField.get(null);
                names.put(rl, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map custom statistics naming system", e);
                return;
            }
        }
    }

    @Override
    public JsonArray generate() {
        Set<ResourceLocation> customStatisticsRLs = Registry.CUSTOM_STAT.keySet();
        JsonArray customStatistics = new JsonArray();

        for (ResourceLocation customStatisticRL : customStatisticsRLs) {
            ResourceLocation rl = Registry.CUSTOM_STAT.get(customStatisticRL);

            JsonObject customStatistic = new JsonObject();
            customStatistic.addProperty("id", customStatisticRL.toString());
            customStatistic.addProperty("name", names.get(rl));

            customStatistics.add(customStatistic);
        }
        return customStatistics;
    }
}
