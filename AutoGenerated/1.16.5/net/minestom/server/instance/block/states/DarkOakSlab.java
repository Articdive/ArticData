package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DarkOakSlab {
  public static final BlockState DARK_OAK_SLAB_0 = new BlockState((short) 8334, Block.DARK_OAK_SLAB);

  public static final BlockState DARK_OAK_SLAB_1 = new BlockState((short) 8335, Block.DARK_OAK_SLAB);

  public static final BlockState DARK_OAK_SLAB_2 = new BlockState((short) 8336, Block.DARK_OAK_SLAB);

  public static final BlockState DARK_OAK_SLAB_3 = new BlockState((short) 8337, Block.DARK_OAK_SLAB);

  public static final BlockState DARK_OAK_SLAB_4 = new BlockState((short) 8338, Block.DARK_OAK_SLAB);

  public static final BlockState DARK_OAK_SLAB_5 = new BlockState((short) 8339, Block.DARK_OAK_SLAB);

  public static void initStates() {
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_0);
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_1);
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_2);
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_3);
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_4);
    Block.DARK_OAK_SLAB.addBlockState(DARK_OAK_SLAB_5);
  }
}
