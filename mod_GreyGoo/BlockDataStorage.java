package StevenGreyGoo.mod_GreyGoo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDataStorage extends Block
{
    protected BlockDataStorage(int i, int j)
    {
        super(i, Material.ground);
        setTickRandomly(false);
    }
}
