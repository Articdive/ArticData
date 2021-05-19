package net.minestom.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.player.Player;
import net.minestom.generators.common.DataGenerator_1_16_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class EntityGenerator_1_16_5 extends DataGenerator_1_16_5<EntityType<?>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntityGenerator_1_16_5.class);
    private static final Map<EntityType<?>, Class<?>> entityClasses = new HashMap<>();

    @Override
    public void generateNames() {
        for (Field declaredField : EntityType.class.getDeclaredFields()) {
            if (!EntityType.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                EntityType<?> et = (EntityType<?>) declaredField.get(null);
                // FIeld name
                names.put(et, declaredField.getName());
                entityClasses.put(et, (Class<?>) ((ParameterizedType) declaredField.getGenericType()).getActualTypeArguments()[0]);
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map entity naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonArray generate() {
        Set<ResourceLocation> entityRLs = Registry.ENTITY_TYPE.keySet();
        JsonArray entities = new JsonArray();

        for (ResourceLocation entityRL : entityRLs) {
            EntityType<?> et = Registry.ENTITY_TYPE.get(entityRL);

            // Complicated but we need to get the Entity class of EntityType.
            // E.g. EntityType<T> we need to get T and check what classes T implements.

            Class<?> entityClass = entityClasses.get(et);
            String packetType;
            if (Player.class.isAssignableFrom(entityClass)) {
                packetType = "PLAYER";
            } else if (LivingEntity.class.isAssignableFrom(entityClass)) {
                packetType = "LIVING";
            } else if (Painting.class.isAssignableFrom(entityClass)) {
                packetType = "PAINTING";
            } else if (ExperienceOrb.class.isAssignableFrom(entityClass)) {
                packetType = "EXPERIENCE_ORB";
            } else {
                packetType = "BASE";
            }

            JsonObject entity = new JsonObject();
            entity.addProperty("id", entityRL.toString());
            entity.addProperty("name", names.get(et));
            // entity.addProperty("langId", et.getDescriptionId());
            // entity.addProperty("category", et.getCategory().toString()); basically useless
            entity.addProperty("packetType", packetType);
            entity.addProperty("fireImmune", et.fireImmune());
            entity.addProperty("height", et.getHeight());
            entity.addProperty("width", et.getWidth());
            // entity.addProperty("fixed", et.getDimensions().fixed); also basically useless

            entities.add(entity);
        }
        return entities;
    }
}
