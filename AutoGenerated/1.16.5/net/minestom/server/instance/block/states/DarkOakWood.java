package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakWood {
  public static final BlockState DARK_OAK_WOOD_0 = new BlockState((short) 124, Block.DARK_OAK_WOOD);

  public static final BlockState DARK_OAK_WOOD_1 = new BlockState((short) 125, Block.DARK_OAK_WOOD);

  public static final BlockState DARK_OAK_WOOD_2 = new BlockState((short) 126, Block.DARK_OAK_WOOD);

  public static void initStates() {
    Block.DARK_OAK_WOOD.addBlockState(DARK_OAK_WOOD_0);
    Block.DARK_OAK_WOOD.addBlockState(DARK_OAK_WOOD_1);
    Block.DARK_OAK_WOOD.addBlockState(DARK_OAK_WOOD_2);
  }
}
