package StevenGreyGoo.mod_GreyGoo;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
public class BlockSubstrate extends Block
{
    public BlockSubstrate(int i, int j)
    {
        super(i, Material.ground);
        setTickRandomly(false);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
             this.blockIcon = par1IconRegister.registerIcon("greygoo:GreyGoo");
    }
}
