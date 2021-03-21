package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Composter {
  public static final BlockState COMPOSTER_0 = new BlockState((short) 15759, Block.COMPOSTER);

  public static final BlockState COMPOSTER_1 = new BlockState((short) 15760, Block.COMPOSTER);

  public static final BlockState COMPOSTER_2 = new BlockState((short) 15761, Block.COMPOSTER);

  public static final BlockState COMPOSTER_3 = new BlockState((short) 15762, Block.COMPOSTER);

  public static final BlockState COMPOSTER_4 = new BlockState((short) 15763, Block.COMPOSTER);

  public static final BlockState COMPOSTER_5 = new BlockState((short) 15764, Block.COMPOSTER);

  public static final BlockState COMPOSTER_6 = new BlockState((short) 15765, Block.COMPOSTER);

  public static final BlockState COMPOSTER_7 = new BlockState((short) 15766, Block.COMPOSTER);

  public static final BlockState COMPOSTER_8 = new BlockState((short) 15767, Block.COMPOSTER);

  public static void initStates() {
    Block.COMPOSTER.addBlockState(COMPOSTER_0);
    Block.COMPOSTER.addBlockState(COMPOSTER_1);
    Block.COMPOSTER.addBlockState(COMPOSTER_2);
    Block.COMPOSTER.addBlockState(COMPOSTER_3);
    Block.COMPOSTER.addBlockState(COMPOSTER_4);
    Block.COMPOSTER.addBlockState(COMPOSTER_5);
    Block.COMPOSTER.addBlockState(COMPOSTER_6);
    Block.COMPOSTER.addBlockState(COMPOSTER_7);
    Block.COMPOSTER.addBlockState(COMPOSTER_8);
  }
}
