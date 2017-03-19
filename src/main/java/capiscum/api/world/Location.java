package capiscum.api.world;

public class Location {

    private final World world;
    private final double x, y, z;

    public Location(World world, double x, double y, double z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public World getWorld() {
        return world;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Location withX(int x) {
        return new Location(world, x, y, z);
    }

    public Location withY(int y) {
        return new Location(world, x, y, z);
    }

    public Location withZ(int z) {
        return new Location(world, x, y, z);
    }

    public Location withWorld(World world) {
        return new Location(world, x, y, z);
    }

}
