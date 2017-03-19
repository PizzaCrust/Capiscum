package capiscum.api.world.block;

import capiscum.api.world.World;

public class BlockLocation {

    private final World world;
    private final int x, y, z;

    public BlockLocation(World world, int x, int y, int z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public World getWorld() {
        return world;
    }

    public int getZ() {
        return z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BlockLocation withX(int x) {
        return new BlockLocation(world, x, y, z);
    }

    public BlockLocation withY(int y) {
        return new BlockLocation(world, x, y, z);
    }

    public BlockLocation withZ(int z) {
        return new BlockLocation(world, x, y, z);
    }

    public BlockLocation withWorld(World world) {
        return new BlockLocation(world, x, y, z);
    }

}
