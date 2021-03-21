package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Beetroots {
  public static final BlockState BEETROOTS_0 = new BlockState((short) 9223, Block.BEETROOTS);

  public static final BlockState BEETROOTS_1 = new BlockState((short) 9224, Block.BEETROOTS);

  public static final BlockState BEETROOTS_2 = new BlockState((short) 9225, Block.BEETROOTS);

  public static final BlockState BEETROOTS_3 = new BlockState((short) 9226, Block.BEETROOTS);

  public static void initStates() {
    Block.BEETROOTS.addBlockState(BEETROOTS_0);
    Block.BEETROOTS.addBlockState(BEETROOTS_1);
    Block.BEETROOTS.addBlockState(BEETROOTS_2);
    Block.BEETROOTS.addBlockState(BEETROOTS_3);
  }
}
