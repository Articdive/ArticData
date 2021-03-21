package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EnderChest {
  public static final BlockState ENDER_CHEST_0 = new BlockState((short) 5255, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_1 = new BlockState((short) 5256, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_2 = new BlockState((short) 5257, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_3 = new BlockState((short) 5258, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_4 = new BlockState((short) 5259, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_5 = new BlockState((short) 5260, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_6 = new BlockState((short) 5261, Block.ENDER_CHEST);

  public static final BlockState ENDER_CHEST_7 = new BlockState((short) 5262, Block.ENDER_CHEST);

  public static void initStates() {
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_0);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_1);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_2);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_3);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_4);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_5);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_6);
    Block.ENDER_CHEST.addBlockState(ENDER_CHEST_7);
  }
}
