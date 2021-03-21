package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DamagedAnvil {
  public static final BlockState DAMAGED_ANVIL_0 = new BlockState((short) 6622, Block.DAMAGED_ANVIL);

  public static final BlockState DAMAGED_ANVIL_1 = new BlockState((short) 6623, Block.DAMAGED_ANVIL);

  public static final BlockState DAMAGED_ANVIL_2 = new BlockState((short) 6624, Block.DAMAGED_ANVIL);

  public static final BlockState DAMAGED_ANVIL_3 = new BlockState((short) 6625, Block.DAMAGED_ANVIL);

  public static void initStates() {
    Block.DAMAGED_ANVIL.addBlockState(DAMAGED_ANVIL_0);
    Block.DAMAGED_ANVIL.addBlockState(DAMAGED_ANVIL_1);
    Block.DAMAGED_ANVIL.addBlockState(DAMAGED_ANVIL_2);
    Block.DAMAGED_ANVIL.addBlockState(DAMAGED_ANVIL_3);
  }
}
