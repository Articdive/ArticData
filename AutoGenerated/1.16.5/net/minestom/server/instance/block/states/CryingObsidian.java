package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CryingObsidian {
  public static final BlockState CRYING_OBSIDIAN_0 = new BlockState((short) 15836, Block.CRYING_OBSIDIAN);

  public static void initStates() {
    Block.CRYING_OBSIDIAN.addBlockState(CRYING_OBSIDIAN_0);
  }
}
