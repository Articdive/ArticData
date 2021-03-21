package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChorusFlower {
  public static final BlockState CHORUS_FLOWER_0 = new BlockState((short) 9132, Block.CHORUS_FLOWER);

  public static final BlockState CHORUS_FLOWER_1 = new BlockState((short) 9133, Block.CHORUS_FLOWER);

  public static final BlockState CHORUS_FLOWER_2 = new BlockState((short) 9134, Block.CHORUS_FLOWER);

  public static final BlockState CHORUS_FLOWER_3 = new BlockState((short) 9135, Block.CHORUS_FLOWER);

  public static final BlockState CHORUS_FLOWER_4 = new BlockState((short) 9136, Block.CHORUS_FLOWER);

  public static final BlockState CHORUS_FLOWER_5 = new BlockState((short) 9137, Block.CHORUS_FLOWER);

  public static void initStates() {
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_0);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_1);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_2);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_3);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_4);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_5);
  }
}
