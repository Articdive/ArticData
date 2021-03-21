package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedOakWood {
  public static final BlockState STRIPPED_OAK_WOOD_0 = new BlockState((short) 127, Block.STRIPPED_OAK_WOOD);

  public static final BlockState STRIPPED_OAK_WOOD_1 = new BlockState((short) 128, Block.STRIPPED_OAK_WOOD);

  public static final BlockState STRIPPED_OAK_WOOD_2 = new BlockState((short) 129, Block.STRIPPED_OAK_WOOD);

  public static void initStates() {
    Block.STRIPPED_OAK_WOOD.addBlockState(STRIPPED_OAK_WOOD_0);
    Block.STRIPPED_OAK_WOOD.addBlockState(STRIPPED_OAK_WOOD_1);
    Block.STRIPPED_OAK_WOOD.addBlockState(STRIPPED_OAK_WOOD_2);
  }
}
