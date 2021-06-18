package de.articdive.articdata.generators.common;

import net.minecraft.SharedConstants;
import de.articdive.articdata.datagen.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public abstract class DataGenerator_1_17<T> extends DataGenerator<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator_1_17.class);
    protected static File dataFolder;

    public static void prepare() {
        SharedConstants.tryDetectVersion();
        DataGenerator_1_16_5.prepare();
    }
}
