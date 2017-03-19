package capiscum.api.world;

import capiscum.api.world.block.BlockLocation;
import capiscum.api.world.block.BlockMaterial;

public interface World {

    Chunk getChunkAt(int x, int z);

    default BlockMaterial getBlockAt(BlockLocation blockLocation) {
        return getChunkAt(blockLocation.getX() >> 4, blockLocation.getZ() >> 4).getBlockAt
                (blockLocation);
    }

}
