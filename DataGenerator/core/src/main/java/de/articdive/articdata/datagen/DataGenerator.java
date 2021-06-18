package de.articdive.articdata.datagen;

import com.google.gson.JsonElement;

import java.util.HashMap;
import java.util.Map;

public abstract class DataGenerator<T> {
    protected final Map<T, String> names = new HashMap<>();

    public abstract void generateNames();

    public abstract JsonElement generate();

    public String getName(T object) {
        return names.get(object);
    }

}
