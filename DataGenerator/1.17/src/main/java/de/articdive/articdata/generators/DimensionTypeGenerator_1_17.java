package de.articdive.articdata.generators;

import com.google.gson.JsonObject;
import de.articdive.articdata.generators.common.DataGenerator_1_17;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.DimensionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public final class DimensionTypeGenerator_1_17 extends DataGenerator_1_17<DimensionType> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DimensionTypeGenerator_1_17.class);

    @Override
    public void generateNames() {
        // Not required for dimension types.
    }

    @Override
    public JsonObject generate() {
        Registry<DimensionType> dimensionTypeRegistry = RegistryAccess.RegistryHolder.builtin().ownedRegistry(Registry.DIMENSION_TYPE_REGISTRY).orElse(null);
        if (dimensionTypeRegistry == null) {
            LOGGER.error("Failed to hook into dimension type registry. Dimension types will be skipped!");
            return new JsonObject();
        }
        Set<ResourceLocation> dimensionTypeRLs = dimensionTypeRegistry.keySet();
        JsonObject dimensionTypes = new JsonObject();

        for (ResourceLocation dimensionTypeRL : dimensionTypeRLs) {
            DimensionType dt = dimensionTypeRegistry.get(dimensionTypeRL);
            if (dt == null) {
                continue;
            }
            JsonObject dimensionType = new JsonObject();

            dimensionType.addProperty("bedWorks", dt.bedWorks());
            dimensionType.addProperty("coordinateScale", dt.coordinateScale());
            dimensionType.addProperty("ceiling", dt.hasCeiling());
            dimensionType.addProperty("fixedTime", dt.hasFixedTime());
            dimensionType.addProperty("raids", dt.hasRaids());
            dimensionType.addProperty("skyLight", dt.hasSkyLight());
            dimensionType.addProperty("piglinSafe", dt.piglinSafe());
            dimensionType.addProperty("logicalHeight", dt.logicalHeight());
            dimensionType.addProperty("natural", dt.natural());
            dimensionType.addProperty("ultraWarm", dt.ultraWarm());
            dimensionType.addProperty("respawnAnchorWorks", dt.respawnAnchorWorks());
            dimensionType.addProperty("minY", dt.minY());
            dimensionType.addProperty("height", dt.height());

            dimensionTypes.add(dimensionTypeRL.toString(), dimensionType);
        }
        return dimensionTypes;
    }
}
