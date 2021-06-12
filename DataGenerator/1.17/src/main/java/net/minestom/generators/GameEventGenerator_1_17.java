package net.minestom.generators;

import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minestom.generators.common.DataGenerator_1_17;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

public final class GameEventGenerator_1_17 extends DataGenerator_1_17<GameEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameEventGenerator_1_17.class);

    @Override
    public void generateNames() {
        for (Field declaredField : GameEvent.class.getDeclaredFields()) {
            if (!GameEvent.class.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            try {
                GameEvent ge = (GameEvent) declaredField.get(null);
                names.put(ge, declaredField.getName());
            } catch (IllegalAccessException e) {
                LOGGER.error("Failed to map game event naming system", e);
                return;
            }
        }
    }

    @Override
    public JsonObject generate() {
        Set<ResourceLocation> gameEventRLs = Registry.GAME_EVENT.keySet();
        JsonObject gameEvents = new JsonObject();

        for (ResourceLocation gameEventRL : gameEventRLs) {
            GameEvent ge = Registry.GAME_EVENT.get(gameEventRL);
            JsonObject gameEvent = new JsonObject();

            gameEvent.addProperty("mojangName", names.get(ge));
            gameEvent.addProperty("notificationRadius", ge.getNotificationRadius());
            gameEvents.add(gameEventRL.toString(), gameEvent);
        }
        return gameEvents;
    }
}
