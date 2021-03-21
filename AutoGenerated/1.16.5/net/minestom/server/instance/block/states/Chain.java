package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Chain {
  public static final BlockState CHAIN_0 = new BlockState((short) 4729, Block.CHAIN);

  public static final BlockState CHAIN_1 = new BlockState((short) 4730, Block.CHAIN);

  public static final BlockState CHAIN_2 = new BlockState((short) 4731, Block.CHAIN);

  public static final BlockState CHAIN_3 = new BlockState((short) 4732, Block.CHAIN);

  public static final BlockState CHAIN_4 = new BlockState((short) 4733, Block.CHAIN);

  public static final BlockState CHAIN_5 = new BlockState((short) 4734, Block.CHAIN);

  public static void initStates() {
    Block.CHAIN.addBlockState(CHAIN_0);
    Block.CHAIN.addBlockState(CHAIN_1);
    Block.CHAIN.addBlockState(CHAIN_2);
    Block.CHAIN.addBlockState(CHAIN_3);
    Block.CHAIN.addBlockState(CHAIN_4);
    Block.CHAIN.addBlockState(CHAIN_5);
  }
}
