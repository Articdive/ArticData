package de.articdive.articdata.datagen;

import com.google.gson.JsonElement;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class DataGenHolder {
    private static final Map<DataGenType, DataGenerator<?>> generators = new HashMap<>();

    private DataGenHolder() {

    }

    public static void addGenerator(DataGenType type, String dataGeneratorRef) {
        String dataGeneratorReference = "de.articdive.articdata.generators." + dataGeneratorRef;
        try {
            Class<?> dataGeneratorClazz = Class.forName(dataGeneratorReference);
            DataGenerator<?> dg = (DataGenerator<?>) dataGeneratorClazz.getConstructor().newInstance();
            generators.put(type, dg);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void runGenerators(JsonOutputter jsonOutputter) {
        // Extract all names we will need
        for (DataGenerator<?> generator : generators.values()) {
            generator.generateNames();
        }
        // Run actual generators
        for (Map.Entry<DataGenType, DataGenerator<?>> entry : generators.entrySet()) {
            DataGenType type = entry.getKey();
            DataGenerator<?> generator = entry.getValue();

            JsonElement data = generator.generate();
            jsonOutputter.output(data, type.getFileName());
        }
    }

    public static Map<?, String> getNameMap(DataGenType type) {
        return generators.get(type).names;
    }


}
