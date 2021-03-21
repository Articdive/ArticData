package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class NetherWart {
  public static final BlockState NETHER_WART_0 = new BlockState((short) 5132, Block.NETHER_WART);

  public static final BlockState NETHER_WART_1 = new BlockState((short) 5133, Block.NETHER_WART);

  public static final BlockState NETHER_WART_2 = new BlockState((short) 5134, Block.NETHER_WART);

  public static final BlockState NETHER_WART_3 = new BlockState((short) 5135, Block.NETHER_WART);

  public static void initStates() {
    Block.NETHER_WART.addBlockState(NETHER_WART_0);
    Block.NETHER_WART.addBlockState(NETHER_WART_1);
    Block.NETHER_WART.addBlockState(NETHER_WART_2);
    Block.NETHER_WART.addBlockState(NETHER_WART_3);
  }
}
