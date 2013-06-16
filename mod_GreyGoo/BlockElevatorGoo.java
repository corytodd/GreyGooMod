package StevenGreyGoo.mod_GreyGoo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockElevatorGoo extends Block
{
    protected BlockElevatorGoo(int i, int j)
    {
        super(i, Material.ground);
        setTickRandomly(false);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
             this.blockIcon = par1IconRegister.registerIcon("greygoo:ElevatorGoo");
    }

    private void elevate(World world, int i, int j, int k)
    {
        if (!world.isAirBlock(i, j + 5, k))
        {
            world.setBlock(i, j - 1, k, 0);
            world.setBlock(i, j + 2, k, 0);
            world.setBlock(i, j + 3, k, 0);
            world.setBlock(i, j + 1, k, blockID);
        }
    }

    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
        elevate(world, i, j, k);
    }
}
