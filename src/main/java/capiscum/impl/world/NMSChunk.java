package capiscum.impl.world;

import capiscum.api.world.Chunk;
import capiscum.api.world.World;
import capiscum.api.world.block.BlockLocation;
import capiscum.api.world.block.BlockMaterial;
import capiscum.impl.ValueConverter;
import capiscum.impl.world.block.NMSBlockMaterial;

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

    @Override
    public BlockMaterial getBlockAt(BlockLocation blockLocation) {
        return new NMSBlockMaterial(chunk.getBlockState(ValueConverter.fromLocation(blockLocation)).getBlock());
    }

    @Override
    public World getWorld() {
        return new NMSWorld(chunk.getWorld());
    }

}
