package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Bedrock {
  public static final BlockState BEDROCK_0 = new BlockState((short) 33, Block.BEDROCK);

  public static void initStates() {
    Block.BEDROCK.addBlockState(BEDROCK_0);
  }
}
