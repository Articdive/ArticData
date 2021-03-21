package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class ChippedAnvil {
  public static final BlockState CHIPPED_ANVIL_0 = new BlockState((short) 6618, Block.CHIPPED_ANVIL);

  public static final BlockState CHIPPED_ANVIL_1 = new BlockState((short) 6619, Block.CHIPPED_ANVIL);

  public static final BlockState CHIPPED_ANVIL_2 = new BlockState((short) 6620, Block.CHIPPED_ANVIL);

  public static final BlockState CHIPPED_ANVIL_3 = new BlockState((short) 6621, Block.CHIPPED_ANVIL);

  public static void initStates() {
    Block.CHIPPED_ANVIL.addBlockState(CHIPPED_ANVIL_0);
    Block.CHIPPED_ANVIL.addBlockState(CHIPPED_ANVIL_1);
    Block.CHIPPED_ANVIL.addBlockState(CHIPPED_ANVIL_2);
    Block.CHIPPED_ANVIL.addBlockState(CHIPPED_ANVIL_3);
  }
}
