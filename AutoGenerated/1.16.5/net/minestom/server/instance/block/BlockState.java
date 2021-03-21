package net.minestom.server.instance.block;

public class BlockState {
  private final short id;

  private final Block block;

  public BlockState(short id, Block block) {
    this.id = id;
    this.block = block;
  }
}
