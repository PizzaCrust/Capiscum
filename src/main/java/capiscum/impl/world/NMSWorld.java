package capiscum.impl.world;


import capiscum.api.world.Chunk;
import capiscum.api.world.World;

public class NMSWorld implements World {

    private final net.minecraft.world.World world;

    public NMSWorld(net.minecraft.world.World world) {
        this.world = world;
    }

    @Override
    public Chunk getChunk(int x, int z) {
        return new NMSChunk(world.getChunkFromChunkCoords(x, z));
    }

}
