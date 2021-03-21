package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PurpurPillar {
  public static final BlockState PURPUR_PILLAR_0 = new BlockState((short) 9139, Block.PURPUR_PILLAR);

  public static final BlockState PURPUR_PILLAR_1 = new BlockState((short) 9140, Block.PURPUR_PILLAR);

  public static final BlockState PURPUR_PILLAR_2 = new BlockState((short) 9141, Block.PURPUR_PILLAR);

  public static void initStates() {
    Block.PURPUR_PILLAR.addBlockState(PURPUR_PILLAR_0);
    Block.PURPUR_PILLAR.addBlockState(PURPUR_PILLAR_1);
    Block.PURPUR_PILLAR.addBlockState(PURPUR_PILLAR_2);
  }
}
