package de.articdive.articdata.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.articdive.articdata.datagen.DataGenHolder;
import de.articdive.articdata.datagen.DataGenType;
import de.articdive.articdata.generators.common.DataGenerator_1_16_5;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    @SuppressWarnings("unchecked")
    public JsonObject generate() {
        final Map<Property<?>, String> fsPropertyNames = (Map<Property<?>, String>) DataGenHolder.getNameMap(DataGenType.FLUID_PROPERTIES);

        Set<ResourceLocation> fluidRLs = Registry.FLUID.keySet();
        JsonObject fluids = new JsonObject();

        for (ResourceLocation fluidRL : fluidRLs) {
            Fluid f = Registry.FLUID.get(fluidRL);

            JsonObject fluid = new JsonObject();
            fluid.addProperty("mojangName", names.get(f));
            fluid.addProperty("bucketId", Registry.ITEM.getKey(f.getBucket()).toString());

            {
                final JsonArray properties = new JsonArray();
                for (final Property<?> p : f.getStateDefinition().getProperties()) {
                    properties.add(fsPropertyNames.get(p));
                }
                fluid.add("properties", properties);
            }
            {
                // Fluid states
                final JsonArray fluidStates = new JsonArray();
                for (final FluidState fs : f.getStateDefinition().getPossibleStates()) {
                    final JsonObject state = new JsonObject();

                    {
                        final JsonObject properties = new JsonObject();
                        for (final Map.Entry<Property<?>, Comparable<?>> entry : fs.getValues().entrySet()) {
                            final Class<?> valClass = entry.getKey().getValueClass();
                            if (valClass.equals(Integer.class)) {
                                properties.addProperty(entry.getKey().getName(), (Integer) entry.getValue());
                            } else if (valClass.equals(Boolean.class)) {
                                properties.addProperty(entry.getKey().getName(), (Boolean) entry.getValue());
                            } else {
                                properties.addProperty(entry.getKey().getName(), String.valueOf(entry.getValue()));
                            }
                        }
                        state.add("properties", properties);
                    }

                    state.addProperty("stateId", Fluid.FLUID_STATE_REGISTRY.getId(fs));

                    // Default values
                    state.addProperty("source", fs.isSource());
                    state.addProperty("empty", fs.isEmpty());
                    state.addProperty("height", fs.getHeight(EmptyBlockGetter.INSTANCE, BlockPos.ZERO));
                    state.addProperty("ownHeight", fs.getOwnHeight());
                    state.addProperty("amount", fs.getAmount());
                    state.addProperty("randomlyTicking", fs.isRandomlyTicking());
                    state.addProperty("explosionResistance", fs.getExplosionResistance());
                    state.addProperty("blockState", Registry.BLOCK.getKey(fs.createLegacyBlock().getBlock()).toString());;

                    fluidStates.add(state);
                }
                fluid.add("states", fluidStates);
            }

            fluids.add(fluidRL.toString(), fluid);
        }
        return fluids;
    }
}
