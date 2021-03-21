package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class QuartzPillar {
  public static final BlockState QUARTZ_PILLAR_0 = new BlockState((short) 6744, Block.QUARTZ_PILLAR);

  public static final BlockState QUARTZ_PILLAR_1 = new BlockState((short) 6745, Block.QUARTZ_PILLAR);

  public static final BlockState QUARTZ_PILLAR_2 = new BlockState((short) 6746, Block.QUARTZ_PILLAR);

  public static void initStates() {
    Block.QUARTZ_PILLAR.addBlockState(QUARTZ_PILLAR_0);
    Block.QUARTZ_PILLAR.addBlockState(QUARTZ_PILLAR_1);
    Block.QUARTZ_PILLAR.addBlockState(QUARTZ_PILLAR_2);
  }
}
