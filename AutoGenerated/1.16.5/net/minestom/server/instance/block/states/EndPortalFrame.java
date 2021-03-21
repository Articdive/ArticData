package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;

@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class EndPortalFrame {
  public static final BlockState END_PORTAL_FRAME_0 = new BlockState((short) 5150, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_1 = new BlockState((short) 5151, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_2 = new BlockState((short) 5152, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_3 = new BlockState((short) 5153, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_4 = new BlockState((short) 5154, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_5 = new BlockState((short) 5155, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_6 = new BlockState((short) 5156, Block.END_PORTAL_FRAME);

  public static final BlockState END_PORTAL_FRAME_7 = new BlockState((short) 5157, Block.END_PORTAL_FRAME);

  public static void initStates() {
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_0);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_1);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_2);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_3);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_4);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_5);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_6);
    Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_7);
  }
}
