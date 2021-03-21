package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class LilyPad {
  public static final BlockState LILY_PAD_0 = new BlockState((short) 5018, Block.LILY_PAD);

  public static void initStates() {
    Block.LILY_PAD.addBlockState(LILY_PAD_0);
  }
}
