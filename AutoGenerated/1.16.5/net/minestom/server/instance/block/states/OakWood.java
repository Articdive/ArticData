package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakWood {
  public static final BlockState OAK_WOOD_0 = new BlockState((short) 109, Block.OAK_WOOD);

  public static final BlockState OAK_WOOD_1 = new BlockState((short) 110, Block.OAK_WOOD);

  public static final BlockState OAK_WOOD_2 = new BlockState((short) 111, Block.OAK_WOOD);

  public static void initStates() {
    Block.OAK_WOOD.addBlockState(OAK_WOOD_0);
    Block.OAK_WOOD.addBlockState(OAK_WOOD_1);
    Block.OAK_WOOD.addBlockState(OAK_WOOD_2);
  }
}
