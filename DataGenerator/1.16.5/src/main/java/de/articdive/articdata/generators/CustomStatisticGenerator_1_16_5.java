package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
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
    public JsonObject generate() {
        Set<ResourceLocation> customStatisticsRLs = Registry.CUSTOM_STAT.keySet();
        JsonObject customStatistics = new JsonObject();

        for (ResourceLocation customStatisticRL : customStatisticsRLs) {
            ResourceLocation rl = Registry.CUSTOM_STAT.get(customStatisticRL);

            JsonObject customStatistic = new JsonObject();
            customStatistic.addProperty("id", Registry.CUSTOM_STAT.getId(rl));
            customStatistic.addProperty("mojangName", names.get(rl));

            customStatistics.add(customStatisticRL.toString(), customStatistic);
        }
        return customStatistics;
    }
}
