package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class PotionGenerator_1_16_5 extends DataGenerator_1_16_5<Potion> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PotionGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Potions.class.getDeclaredFields()) {
            if (!Potion.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Potion p = (Potion) declaredField.get(null);
                names.put(p, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map potion naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> effectRLs = Registry.POTION.keySet();
        JsonObject potions = new JsonObject();

        for (ResourceLocation effectRL : effectRLs) {
            Potion p = Registry.POTION.get(effectRL);

            JsonObject effect = new JsonObject();
            // Null safety check.
            effect.addProperty("mojangName", names.get(p));

            potions.add(effectRL.toString(), effect);
        }
        return potions;
    }
}
