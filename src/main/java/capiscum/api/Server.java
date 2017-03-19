package capiscum.api;

import capiscum.api.command.CommandSender;
import capiscum.api.world.Location;
import capiscum.api.world.block.BlockLocation;

public interface Server extends CommandSender {

    BlockLocation estimate(Location location);

}
