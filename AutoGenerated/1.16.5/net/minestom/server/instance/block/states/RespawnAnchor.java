package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class RespawnAnchor {
  public static final BlockState RESPAWN_ANCHOR_0 = new BlockState((short) 15837, Block.RESPAWN_ANCHOR);

  public static final BlockState RESPAWN_ANCHOR_1 = new BlockState((short) 15838, Block.RESPAWN_ANCHOR);

  public static final BlockState RESPAWN_ANCHOR_2 = new BlockState((short) 15839, Block.RESPAWN_ANCHOR);

  public static final BlockState RESPAWN_ANCHOR_3 = new BlockState((short) 15840, Block.RESPAWN_ANCHOR);

  public static final BlockState RESPAWN_ANCHOR_4 = new BlockState((short) 15841, Block.RESPAWN_ANCHOR);

  public static void initStates() {
    Block.RESPAWN_ANCHOR.addBlockState(RESPAWN_ANCHOR_0);
    Block.RESPAWN_ANCHOR.addBlockState(RESPAWN_ANCHOR_1);
    Block.RESPAWN_ANCHOR.addBlockState(RESPAWN_ANCHOR_2);
    Block.RESPAWN_ANCHOR.addBlockState(RESPAWN_ANCHOR_3);
    Block.RESPAWN_ANCHOR.addBlockState(RESPAWN_ANCHOR_4);
  }
}
