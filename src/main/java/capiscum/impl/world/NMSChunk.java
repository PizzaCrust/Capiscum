package capiscum.impl.world;

import capiscum.api.world.Chunk;

public class NMSChunk implements Chunk {

    private final net.minecraft.world.chunk.Chunk chunk;

    public NMSChunk(net.minecraft.world.chunk.Chunk chunk) {
        this.chunk = chunk;
    }

    @Override
    public int getX() {
        return chunk.xPosition;
    }

    @Override
    public int getZ() {
        return chunk.zPosition;
    }

}
