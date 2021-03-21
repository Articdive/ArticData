package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StrippedDarkOakWood {
  public static final BlockState STRIPPED_DARK_OAK_WOOD_0 = new BlockState((short) 142, Block.STRIPPED_DARK_OAK_WOOD);

  public static final BlockState STRIPPED_DARK_OAK_WOOD_1 = new BlockState((short) 143, Block.STRIPPED_DARK_OAK_WOOD);

  public static final BlockState STRIPPED_DARK_OAK_WOOD_2 = new BlockState((short) 144, Block.STRIPPED_DARK_OAK_WOOD);

  public static void initStates() {
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_0);
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_1);
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_2);
  }
}
