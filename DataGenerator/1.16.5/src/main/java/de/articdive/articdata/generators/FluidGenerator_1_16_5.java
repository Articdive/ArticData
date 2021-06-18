package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class FluidGenerator_1_16_5 extends DataGenerator_1_16_5<Fluid> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FluidGenerator_1_16_5.class);

    @Override
    public void generateNames() {
        for (Field declaredField : Fluids.class.getDeclaredFields()) {
            if (!Fluid.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                Fluid f = (Fluid) declaredField.get(null);
                names.put(f, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map fluid naming system.", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> fluidRLs = Registry.FLUID.keySet();
        JsonObject fluids = new JsonObject();

        for (ResourceLocation fluidRL : fluidRLs) {
            Fluid f = Registry.FLUID.get(fluidRL);

            JsonObject fluid = new JsonObject();
            fluid.addProperty("mojangName", names.get(f));
            fluid.addProperty("bucketId", Registry.ITEM.getKey(f.getBucket()).toString());

            fluids.add(fluidRL.toString(), fluid);
        }
        return fluids;
    }
}
