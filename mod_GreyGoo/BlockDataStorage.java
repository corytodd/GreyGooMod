package StevenGreyGoo.mod_GreyGoo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockDataStorage extends Block
{
    protected BlockDataStorage(int i, int j)
    {
        super(i, Material.ground);
        setTickRandomly(false);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
             this.blockIcon = par1IconRegister.registerIcon("greygoo:top_1");
    }
}
