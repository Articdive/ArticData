package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CarvedPumpkin {
  public static final BlockState CARVED_PUMPKIN_0 = new BlockState((short) 4016, Block.CARVED_PUMPKIN);

  public static final BlockState CARVED_PUMPKIN_1 = new BlockState((short) 4017, Block.CARVED_PUMPKIN);

  public static final BlockState CARVED_PUMPKIN_2 = new BlockState((short) 4018, Block.CARVED_PUMPKIN);

  public static final BlockState CARVED_PUMPKIN_3 = new BlockState((short) 4019, Block.CARVED_PUMPKIN);

  public static void initStates() {
    Block.CARVED_PUMPKIN.addBlockState(CARVED_PUMPKIN_0);
    Block.CARVED_PUMPKIN.addBlockState(CARVED_PUMPKIN_1);
    Block.CARVED_PUMPKIN.addBlockState(CARVED_PUMPKIN_2);
    Block.CARVED_PUMPKIN.addBlockState(CARVED_PUMPKIN_3);
  }
}
