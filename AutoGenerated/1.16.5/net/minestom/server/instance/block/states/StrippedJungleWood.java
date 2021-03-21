package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedJungleWood {
  public static final BlockState STRIPPED_JUNGLE_WOOD_0 = new BlockState((short) 136, Block.STRIPPED_JUNGLE_WOOD);

  public static final BlockState STRIPPED_JUNGLE_WOOD_1 = new BlockState((short) 137, Block.STRIPPED_JUNGLE_WOOD);

  public static final BlockState STRIPPED_JUNGLE_WOOD_2 = new BlockState((short) 138, Block.STRIPPED_JUNGLE_WOOD);

  public static void initStates() {
    Block.STRIPPED_JUNGLE_WOOD.addBlockState(STRIPPED_JUNGLE_WOOD_0);
    Block.STRIPPED_JUNGLE_WOOD.addBlockState(STRIPPED_JUNGLE_WOOD_1);
    Block.STRIPPED_JUNGLE_WOOD.addBlockState(STRIPPED_JUNGLE_WOOD_2);
  }
}
