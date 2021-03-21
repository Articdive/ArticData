package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulFire {
  public static final BlockState SOUL_FIRE_0 = new BlockState((short) 1952, Block.SOUL_FIRE);

  public static void initStates() {
    Block.SOUL_FIRE.addBlockState(SOUL_FIRE_0);
  }
}
