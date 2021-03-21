package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DragonEgg {
  public static final BlockState DRAGON_EGG_0 = new BlockState((short) 5159, Block.DRAGON_EGG);

  public static void initStates() {
    Block.DRAGON_EGG.addBlockState(DRAGON_EGG_0);
  }
}
