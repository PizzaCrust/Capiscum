package capiscum.impl.world.block;

import net.minecraft.block.Block;

import capiscum.api.world.block.BlockMaterial;
import capiscum.api.world.block.BlockMetadata;

public class NMSBlockMaterial implements BlockMaterial {

    private final Block block;

    public NMSBlockMaterial(Block block) {
        this.block = block;
    }

    @Override
    public int getNumericalId() {
        return Block.getIdFromBlock(block);
    }

    @Override
    public String getName() {
        return block.getTrueUnlocalizedName();
    }

    @Override
    public boolean isOpaque() {
        return block.getMaterial(null).isOpaque();
    }

    @Override
    public BlockMetadata getMetadata() {
        return new BlockMetadata() {}; //TODO
    }

}
