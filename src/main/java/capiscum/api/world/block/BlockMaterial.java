package capiscum.api.world.block;

import capiscum.api.world.Material;

public interface BlockMaterial extends Material {

    @Override
    default boolean isBlock() {
        return true;
    }

    @Override
    default boolean isEdible() {
        return false;
    }

    boolean isOpaque();

    default boolean isTransparent() {
        return !isOpaque();
    }

    BlockMetadata getMetadata();

}
