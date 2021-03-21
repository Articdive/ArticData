package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PetrifiedOakSlab {
  public static final BlockState PETRIFIED_OAK_SLAB_0 = new BlockState((short) 8364, Block.PETRIFIED_OAK_SLAB);

  public static final BlockState PETRIFIED_OAK_SLAB_1 = new BlockState((short) 8365, Block.PETRIFIED_OAK_SLAB);

  public static final BlockState PETRIFIED_OAK_SLAB_2 = new BlockState((short) 8366, Block.PETRIFIED_OAK_SLAB);

  public static final BlockState PETRIFIED_OAK_SLAB_3 = new BlockState((short) 8367, Block.PETRIFIED_OAK_SLAB);

  public static final BlockState PETRIFIED_OAK_SLAB_4 = new BlockState((short) 8368, Block.PETRIFIED_OAK_SLAB);

  public static final BlockState PETRIFIED_OAK_SLAB_5 = new BlockState((short) 8369, Block.PETRIFIED_OAK_SLAB);

  public static void initStates() {
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_0);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_1);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_2);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_3);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_4);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_5);
  }
}
