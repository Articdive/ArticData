package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedPinkTulip {
  public static final BlockState POTTED_PINK_TULIP_0 = new BlockState((short) 6325, Block.POTTED_PINK_TULIP);

  public static void initStates() {
    Block.POTTED_PINK_TULIP.addBlockState(POTTED_PINK_TULIP_0);
  }
}
