package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OakSlab {
  public static final BlockState OAK_SLAB_0 = new BlockState((short) 8304, Block.OAK_SLAB);

  public static final BlockState OAK_SLAB_1 = new BlockState((short) 8305, Block.OAK_SLAB);

  public static final BlockState OAK_SLAB_2 = new BlockState((short) 8306, Block.OAK_SLAB);

  public static final BlockState OAK_SLAB_3 = new BlockState((short) 8307, Block.OAK_SLAB);

  public static final BlockState OAK_SLAB_4 = new BlockState((short) 8308, Block.OAK_SLAB);

  public static final BlockState OAK_SLAB_5 = new BlockState((short) 8309, Block.OAK_SLAB);

  public static void initStates() {
    Block.OAK_SLAB.addBlockState(OAK_SLAB_0);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_1);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_2);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_3);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_4);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_5);
  }
}
