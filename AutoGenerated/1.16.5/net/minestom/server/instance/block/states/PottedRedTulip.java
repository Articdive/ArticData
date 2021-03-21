package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedRedTulip {
  public static final BlockState POTTED_RED_TULIP_0 = new BlockState((short) 6322, Block.POTTED_RED_TULIP);

  public static void initStates() {
    Block.POTTED_RED_TULIP.addBlockState(POTTED_RED_TULIP_0);
  }
}
