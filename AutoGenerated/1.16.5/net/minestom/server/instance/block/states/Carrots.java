package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Carrots {
  public static final BlockState CARROTS_0 = new BlockState((short) 6334, Block.CARROTS);

  public static final BlockState CARROTS_1 = new BlockState((short) 6335, Block.CARROTS);

  public static final BlockState CARROTS_2 = new BlockState((short) 6336, Block.CARROTS);

  public static final BlockState CARROTS_3 = new BlockState((short) 6337, Block.CARROTS);

  public static final BlockState CARROTS_4 = new BlockState((short) 6338, Block.CARROTS);

  public static final BlockState CARROTS_5 = new BlockState((short) 6339, Block.CARROTS);

  public static final BlockState CARROTS_6 = new BlockState((short) 6340, Block.CARROTS);

  public static final BlockState CARROTS_7 = new BlockState((short) 6341, Block.CARROTS);

  public static void initStates() {
    Block.CARROTS.addBlockState(CARROTS_0);
    Block.CARROTS.addBlockState(CARROTS_1);
    Block.CARROTS.addBlockState(CARROTS_2);
    Block.CARROTS.addBlockState(CARROTS_3);
    Block.CARROTS.addBlockState(CARROTS_4);
    Block.CARROTS.addBlockState(CARROTS_5);
    Block.CARROTS.addBlockState(CARROTS_6);
    Block.CARROTS.addBlockState(CARROTS_7);
  }
}
