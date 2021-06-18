package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public final class EntityDataSerializerGenerator_1_16_5 extends DataGenerator_1_16_5<EntityDataSerializer<?>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntityDataSerializerGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : EntityDataSerializers.class.getDeclaredFields()) {
            if (!EntityDataSerializer.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                EntityDataSerializer<?> eds = (EntityDataSerializer<?>) declaredField.get(null);
                names.put(eds, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map entity data serializer system.", e);
                return;
            }
        }
    }

    @Override
    public JsonArray generate() {
        JsonArray entityDataSerializers = new JsonArray();
        for (Field declaredField : EntityDataSerializers.class.getDeclaredFields()) {
            if (!EntityDataSerializer.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            JsonObject entityDataSerializer = new JsonObject();
            try {
                EntityDataSerializer<?> eds = (EntityDataSerializer<?>) declaredField.get(null);

                String fieldName = declaredField.getName();
                entityDataSerializer.addProperty("id", EntityDataSerializers.getSerializedId(eds));
                entityDataSerializer.addProperty("type", fieldName);

                entityDataSerializers.add(entityDataSerializer);
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to get entity data serializer from the entity data serializer mapping system.", e);
            }
        }
        return entityDataSerializers;
    }
}
