package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class SoulSoil {
  public static final BlockState SOUL_SOIL_0 = new BlockState((short) 4001, Block.SOUL_SOIL);

  public static void initStates() {
    Block.SOUL_SOIL.addBlockState(SOUL_SOIL_0);
  }
}
