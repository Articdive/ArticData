package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class StructureVoid {
  public static final BlockState STRUCTURE_VOID_0 = new BlockState((short) 9263, Block.STRUCTURE_VOID);

  public static void initStates() {
    Block.STRUCTURE_VOID.addBlockState(STRUCTURE_VOID_0);
  }
}
