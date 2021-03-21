package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakSapling {
  public static final BlockState DARK_OAK_SAPLING_0 = new BlockState((short) 31, Block.DARK_OAK_SAPLING);

  public static final BlockState DARK_OAK_SAPLING_1 = new BlockState((short) 32, Block.DARK_OAK_SAPLING);

  public static void initStates() {
    Block.DARK_OAK_SAPLING.addBlockState(DARK_OAK_SAPLING_0);
    Block.DARK_OAK_SAPLING.addBlockState(DARK_OAK_SAPLING_1);
  }
}
