package net.minestom.datagen;

import com.google.gson.JsonArray;

import java.util.HashMap;
import java.util.Map;

public abstract class DataGenerator<T> {
    protected final Map<T, String> names = new HashMap<>();

    public abstract void generateNames();

    public abstract JsonArray generate();

    public String getName(T object) {
        return names.get(object);
    }

}
