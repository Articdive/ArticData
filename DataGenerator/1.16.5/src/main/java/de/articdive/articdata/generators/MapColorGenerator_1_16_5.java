package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.world.level.material.MaterialColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public final class MapColorGenerator_1_16_5 extends DataGenerator_1_16_5<MaterialColor> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MapColorGenerator_1_16_5.class);

    @Override
    public void generateNames() {
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
    }

    @Override
    public JsonArray generate() {
        JsonArray mapColors = new JsonArray();

        for (MaterialColor mc : MaterialColor.MATERIAL_COLORS) {
            if (mc == null) {
                continue;
            }
            JsonObject mapColor = new JsonObject();

            mapColor.addProperty("id", mc.id);
            mapColor.addProperty("mojangName", names.get(mc));
            mapColor.addProperty("color", mc.col);

            mapColors.add(mapColor);
        }
        return mapColors;
    }
}
