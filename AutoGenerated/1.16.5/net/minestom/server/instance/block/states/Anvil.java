package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Anvil {
  public static final BlockState ANVIL_0 = new BlockState((short) 6614, Block.ANVIL);

  public static final BlockState ANVIL_1 = new BlockState((short) 6615, Block.ANVIL);

  public static final BlockState ANVIL_2 = new BlockState((short) 6616, Block.ANVIL);

  public static final BlockState ANVIL_3 = new BlockState((short) 6617, Block.ANVIL);

  public static void initStates() {
    Block.ANVIL.addBlockState(ANVIL_0);
    Block.ANVIL.addBlockState(ANVIL_1);
    Block.ANVIL.addBlockState(ANVIL_2);
    Block.ANVIL.addBlockState(ANVIL_3);
  }
}
