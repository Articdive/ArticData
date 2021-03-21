package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class JackOLantern {
  public static final BlockState JACK_O_LANTERN_0 = new BlockState((short) 4020, Block.JACK_O_LANTERN);

  public static final BlockState JACK_O_LANTERN_1 = new BlockState((short) 4021, Block.JACK_O_LANTERN);

  public static final BlockState JACK_O_LANTERN_2 = new BlockState((short) 4022, Block.JACK_O_LANTERN);

  public static final BlockState JACK_O_LANTERN_3 = new BlockState((short) 4023, Block.JACK_O_LANTERN);

  public static void initStates() {
    Block.JACK_O_LANTERN.addBlockState(JACK_O_LANTERN_0);
    Block.JACK_O_LANTERN.addBlockState(JACK_O_LANTERN_1);
    Block.JACK_O_LANTERN.addBlockState(JACK_O_LANTERN_2);
    Block.JACK_O_LANTERN.addBlockState(JACK_O_LANTERN_3);
  }
}
