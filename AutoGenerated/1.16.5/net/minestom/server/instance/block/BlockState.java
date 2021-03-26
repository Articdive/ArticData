package net.minestom.server.instance.block;

import org.jetbrains.annotations.NotNull;

public class BlockState {
  private final short id;

  @NotNull
  private final Block block;

  public BlockState(short id, @NotNull Block block) {
    this.id = id;
    this.block = block;
  }
}
