package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class GildedBlackstone {
  public static final BlockState GILDED_BLACKSTONE_0 = new BlockState((short) 16672, Block.GILDED_BLACKSTONE);

  public static void initStates() {
    Block.GILDED_BLACKSTONE.addBlockState(GILDED_BLACKSTONE_0);
  }
}
