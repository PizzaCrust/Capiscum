package capiscum.impl;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import capiscum.api.Server;
import capiscum.api.world.Location;
import capiscum.api.world.block.BlockLocation;

public class NMSServer implements Server {

    private final MinecraftServer server;

    public NMSServer(MinecraftServer server) {
        this.server = server;
    }

    @Override
    public void sendMessage(String msg) {
        server.sendMessage(new TextComponentString(msg));
    }

    @Override
    public String getName() {
        return server.getName();
    }

    @Override
    public BlockLocation estimate(Location location) {
        return new BlockLocation(location.getWorld(), ((Double)location.getX()).intValue(),
                ((Double)location.getY
                ()).intValue(), ((Double)location
                .getZ()).intValue());
    }

}
