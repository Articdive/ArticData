package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndRod {
  public static final BlockState END_ROD_0 = new BlockState((short) 9062, Block.END_ROD);

  public static final BlockState END_ROD_1 = new BlockState((short) 9063, Block.END_ROD);

  public static final BlockState END_ROD_2 = new BlockState((short) 9064, Block.END_ROD);

  public static final BlockState END_ROD_3 = new BlockState((short) 9065, Block.END_ROD);

  public static final BlockState END_ROD_4 = new BlockState((short) 9066, Block.END_ROD);

  public static final BlockState END_ROD_5 = new BlockState((short) 9067, Block.END_ROD);

  public static void initStates() {
    Block.END_ROD.addBlockState(END_ROD_0);
    Block.END_ROD.addBlockState(END_ROD_1);
    Block.END_ROD.addBlockState(END_ROD_2);
    Block.END_ROD.addBlockState(END_ROD_3);
    Block.END_ROD.addBlockState(END_ROD_4);
    Block.END_ROD.addBlockState(END_ROD_5);
  }
}
