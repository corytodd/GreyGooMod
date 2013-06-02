package StevenGreyGoo.mod_GreyGooClient;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import StevenGreyGoo.mod_GreyGoo.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{

		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(ITEM_PNG);
	//	MinecraftForgeClient.preloadTexture(WARP_PNG);
		RenderingRegistry.registerEntityRenderingHandler(EntityFallingGravityGoo.class, new RenderFallingGravityGoo());
		RenderingRegistry.registerEntityRenderingHandler(EntityTGDGolem.class, new RenderTGDGolem(new ModelTGDGolem(), 0.5F));
		RenderingRegistry.registerBlockHandler(new RenderOrangeWhiteGoo());
	}
	
	
	@Override
	public void loadTextures()
	{

		/*mod_GreyGoo.ItemNanoLens.setIconIndex(62).setUnlocalizedName("NanoLens");  
		    
	    mod_GreyGoo.ItemNanoLathe.setIconIndex(63).setUnlocalizedName("NanoLathe");  

	    mod_GreyGoo.ItemModifierGrey.setIconIndex(31).setUnlocalizedName("erfgdsfsdfg");  

	    mod_GreyGoo.ItemModifierRed.setIconIndex(45).setUnlocalizedName("erfgsdfg");  
	    
	    mod_GreyGoo.ItemModifierYellow.setIconIndex(47).setUnlocalizedName("Browadfanwgoo");  

	    mod_GreyGoo.ItemModifierPurple.setIconIndex(44).setUnlocalizedName("aerew");  

	    mod_GreyGoo.ItemModifierOrange.setIconIndex(43).setUnlocalizedName("ererw");  

	    mod_GreyGoo.ItemModifierBlue.setIconIndex(28).setUnlocalizedName("adfadf"); 
	    
	    mod_GreyGoo.ItemModifierWhite.setIconIndex(46).setUnlocalizedName("adadd"); 
	    
	    mod_GreyGoo.ItemModifierGreen.setIconIndex(30).setUnlocalizedName("adfa");  
	    
	    mod_GreyGoo.ItemModifierBrown.setIconIndex(29).setUnlocalizedName("Brownwgoo");
	   
	    
		mod_GreyGoo.ItemMatrixRainbow.setIconIndex(61).setUnlocalizedName("Rainbow Matrix");  

	    mod_GreyGoo.ItemMatrixRed.setIconIndex(38).setUnlocalizedName("erfgsd4fg");  
	    
	    mod_GreyGoo.ItemMatrixYellow.setIconIndex(41).setUnlocalizedName("Browad4fanwgoo");  

	    mod_GreyGoo.ItemMatrixPurple.setIconIndex(34).setUnlocalizedName("ae4rew");  

	    mod_GreyGoo.ItemMatrixOrange.setIconIndex(17).setUnlocalizedName("er4erw");  

	    mod_GreyGoo.ItemMatrixBlue.setIconIndex(9).setUnlocalizedName("adf4adf"); 
	    
	    mod_GreyGoo.ItemMatrixWhite.setIconIndex(39).setUnlocalizedName("a4dadd"); 
	    
	    mod_GreyGoo.ItemMatrixGreen.setIconIndex(20).setUnlocalizedName("ad4fa");  
	    
	    mod_GreyGoo.ItemMatrixBrown.setIconIndex(25).setUnlocalizedName("Bro4wnwgoo"); 
	    
	    mod_GreyGoo.ItemMatrixWhiteGreen.setIconIndex(1).setUnlocalizedName("a4dffdadd"); 
	    
	    mod_GreyGoo.ItemMatrixBrownRed.setIconIndex(21).setUnlocalizedName("a4ggffdadd"); 
	    
	    mod_GreyGoo.ItemMatrixBlueRed.setIconIndex(22).setUnlocalizedName("a4dghdadd"); 
	    
	    mod_GreyGoo.ItemMatrixOrangeRed .setIconIndex(16).setUnlocalizedName("a4wwghgdadd"); 

	    mod_GreyGoo.ItemMatrixOrangeWhite .setIconIndex(32).setUnlocalizedName("a4ghrergdadd"); 

	    mod_GreyGoo.ItemMatrixOrangePurple.setIconIndex(35).setUnlocalizedName("a4ereghgdadd"); 

	    mod_GreyGoo.ItemMatrixYellowRed .setIconIndex(15).setUnlocalizedName("Browad4fanwswegoo");  

	    mod_GreyGoo.ItemMatrixPurpleRed.setIconIndex(36).setUnlocalizedName("Browad4fasfnwswegoo");  

	    mod_GreyGoo.ItemMatrixGrey.setIconIndex(0).setUnlocalizedName("Browad4fasfnwserwerwegoo");  

	    mod_GreyGoo.ItemMatrixGreenRed .setIconIndex(2).setUnlocalizedName("a4dghasddadd"); */
	}
	@Override
	public  void printStringClient(String string)
	{
		
		ModLoader.getMinecraftInstance().ingameGUI.getChatGUI().printChatMessage(string);
	}
	
}