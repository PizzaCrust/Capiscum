package capiscum.impl;

import net.minecraft.util.math.BlockPos;

import capiscum.api.world.block.BlockLocation;

public class ValueConverter {

    public static BlockPos fromLocation(BlockLocation blockLocation) {
        return new BlockPos(blockLocation.getX(), blockLocation.getY(), blockLocation.getZ());
    }

}
