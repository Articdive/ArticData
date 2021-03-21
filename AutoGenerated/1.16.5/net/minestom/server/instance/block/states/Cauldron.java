package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Cauldron {
  public static final BlockState CAULDRON_0 = new BlockState((short) 5145, Block.CAULDRON);

  public static final BlockState CAULDRON_1 = new BlockState((short) 5146, Block.CAULDRON);

  public static final BlockState CAULDRON_2 = new BlockState((short) 5147, Block.CAULDRON);

  public static final BlockState CAULDRON_3 = new BlockState((short) 5148, Block.CAULDRON);

  public static void initStates() {
    Block.CAULDRON.addBlockState(CAULDRON_0);
    Block.CAULDRON.addBlockState(CAULDRON_1);
    Block.CAULDRON.addBlockState(CAULDRON_2);
    Block.CAULDRON.addBlockState(CAULDRON_3);
  }
}
