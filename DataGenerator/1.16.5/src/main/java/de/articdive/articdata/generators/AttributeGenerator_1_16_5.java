package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class AttributeGenerator_1_16_5 extends DataGenerator_1_16_5<Attribute> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AttributeGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Attributes.class.getDeclaredFields()) {
            if (!Attribute.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Attribute a = (Attribute) declaredField.get(null);
                names.put(a, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map attribute naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> attributeRLs = Registry.ATTRIBUTE.keySet();
        JsonObject attributes = new JsonObject();

        for (ResourceLocation attributeRL : attributeRLs) {
            Attribute a = Registry.ATTRIBUTE.get(attributeRL);

            JsonObject attribute = new JsonObject();
            if (a == null) {
                continue;
            }
            attribute.addProperty("mojangName", names.get(a));
            attribute.addProperty("translationKey", a.getDescriptionId());
            attribute.addProperty("defaultValue", a.getDefaultValue());
            attribute.addProperty("clientSync", a.isClientSyncable());
            if (a instanceof RangedAttribute ra) {
                // Unfortuantely get via reflection
                JsonObject range = new JsonObject();
                try {
                    Field maxV = RangedAttribute.class.getDeclaredField("maxValue");
                    maxV.setAccessible(true);
                    range.addProperty("maxValue", maxV.getDouble(ra));
                    Field minV = RangedAttribute.class.getDeclaredField("minValue");
                    minV.setAccessible(true);
                    range.addProperty("minValue", minV.getDouble(ra));
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    LOGGER.error("Failed to get attribute ranges, skipping attrobite with ID '" + attributeRL + "'.", e);
                }
                attribute.add("range", range);
            }

            attributes.add(attributeRL.toString(), attribute);
        }
        return attributes;
    }
}
