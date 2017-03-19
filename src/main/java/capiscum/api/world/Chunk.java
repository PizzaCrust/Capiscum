package capiscum.api.world;

import capiscum.api.world.block.BlockLocation;
import capiscum.api.world.block.BlockMaterial;

public interface Chunk {

    int getX();

    int getZ();

    BlockMaterial getBlockAt(BlockLocation blockLocation);

    World getWorld();

    default BlockMaterial getBlockAt(int x, int y, int z) {
        return getBlockAt(new BlockLocation(getWorld(), x, y, z));
    }

}
