package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class FrostedIce {
  public static final BlockState FROSTED_ICE_0 = new BlockState((short) 9253, Block.FROSTED_ICE);

  public static final BlockState FROSTED_ICE_1 = new BlockState((short) 9254, Block.FROSTED_ICE);

  public static final BlockState FROSTED_ICE_2 = new BlockState((short) 9255, Block.FROSTED_ICE);

  public static final BlockState FROSTED_ICE_3 = new BlockState((short) 9256, Block.FROSTED_ICE);

  public static void initStates() {
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_0);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_1);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_2);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_3);
  }
}
