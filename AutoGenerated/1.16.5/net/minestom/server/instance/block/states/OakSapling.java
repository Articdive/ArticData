package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakSapling {
  public static final BlockState OAK_SAPLING_0 = new BlockState((short) 21, Block.OAK_SAPLING);

  public static final BlockState OAK_SAPLING_1 = new BlockState((short) 22, Block.OAK_SAPLING);

  public static void initStates() {
    Block.OAK_SAPLING.addBlockState(OAK_SAPLING_0);
    Block.OAK_SAPLING.addBlockState(OAK_SAPLING_1);
  }
}
