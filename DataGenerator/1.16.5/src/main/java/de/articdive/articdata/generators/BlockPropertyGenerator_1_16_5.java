package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public final class BlockPropertyGenerator_1_16_5 extends DataGenerator_1_16_5<Property<?>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockPropertyGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : BlockStateProperties.class.getDeclaredFields()) {
            if (!Property.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Property<?> p = (Property<?>) declaredField.get(null);
                names.put(p, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map block state property naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        JsonObject blockProperties = new JsonObject();
        for (Field declaredField : BlockStateProperties.class.getDeclaredFields()) {
            if (!Property.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            JsonObject property = new JsonObject();
            try {
                Property<?> p = (Property<?>) declaredField.get(null);
                String fieldName = declaredField.getName();
                String propertyKey = p.getName();
                property.addProperty("key", propertyKey);
                // Properties
                JsonArray values = new JsonArray();
                if (p instanceof BooleanProperty) {
                    for (boolean possibleValue : ((BooleanProperty) p).getPossibleValues()) {
                        values.add(possibleValue);
                    }
                } else if (p instanceof IntegerProperty) {
                    for (int possibleValue : ((IntegerProperty) p).getPossibleValues()) {
                        values.add(possibleValue);
                    }
                } else if (p instanceof EnumProperty) {
                    property.addProperty("enumMojangName", p.getValueClass().getSimpleName());
                    for (Enum<? extends Enum<?>> possibleValue : ((EnumProperty<? extends Enum<?>>) p).getPossibleValues()) {
                        values.add(possibleValue.name());
                    }
                }
                property.add("values", values);

                blockProperties.add(fieldName, property);
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to get property from the property mapping system.", e);
            }
        }
        return blockProperties;
    }
}
