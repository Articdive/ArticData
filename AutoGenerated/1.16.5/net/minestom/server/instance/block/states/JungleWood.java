package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JungleWood {
  public static final BlockState JUNGLE_WOOD_0 = new BlockState((short) 118, Block.JUNGLE_WOOD);

  public static final BlockState JUNGLE_WOOD_1 = new BlockState((short) 119, Block.JUNGLE_WOOD);

  public static final BlockState JUNGLE_WOOD_2 = new BlockState((short) 120, Block.JUNGLE_WOOD);

  public static void initStates() {
    Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_0);
    Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_1);
    Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_2);
  }
}
