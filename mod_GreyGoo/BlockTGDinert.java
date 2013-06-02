package StevenGreyGoo.mod_GreyGoo;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraft.block.Block;
public class BlockTGDinert extends Block
{
    protected BlockTGDinert(int i, int j)
    {
        super(i, Material.ground);
        setTickRandomly(false);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public int quantityDropped(Random par1Random)
    {
        if (par1Random.nextInt(10) == 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
    	
        world.scheduleBlockUpdate(x, y, z, mod_GreyGoo.BlockTGDinertID, 500);
    }

    public void updateTick(World world, int x, int y, int z, Random par5Random)
    {
        if (world.getBlockId(x, y - 1, z) == mod_GreyGoo.BlockTGDinertID)
        {
            if (world.getBlockId(x, y - 2, z) == mod_GreyGoo.BlockTGDinertID)
            {
                if (world.getBlockId(x, y - 3, z) == mod_GreyGoo.BlockTGDinertID)
                {
                    if (world.getBlockId(x + 1, y - 1, z) == mod_GreyGoo.BlockTGDinertID && world.getBlockId(x - 1, y - 1, z) == mod_GreyGoo.BlockTGDinertID || world.getBlockId(x, y - 1, z - 1) == mod_GreyGoo.BlockTGDinertID && world.getBlockId(x, y - 1, z + 1) == mod_GreyGoo.BlockTGDinertID)
                    {
                        world.setBlock(x, y, z, 0);
                        world.setBlock(x, y - 1, z, 0);
                        world.setBlock(x, y - 2, z, 0);
                        world.setBlock(x, y - 3, z, 0);
                        world.setBlock(x - 1, y - 1, z, 0);
                        world.setBlock(x + 1, y - 1, z, 0);
                        world.setBlock(x, y - 1, z - 1, 0);
                        world.setBlock(x, y - 1, z + 1, 0);

                        if (!world.isRemote && mod_GreyGoo.totalnumberofTGDgolems < mod_GreyGoo.maxnumberofTGDgolems)
                        {
                            EntityTGDGolem creeper = new EntityTGDGolem(world);
                            creeper.setLocationAndAngles(x, y, z, 5, 6);
                            world.spawnEntityInWorld(creeper);
                        }
                    }
                }
            }
        }
    }
}
