package TestMod_6;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "tmv6", name = "Test Mode v6", version = "1.0")
public class TestMode_6 {
	
	public static Item itemTable;
	public static Item itemStoll;
	public static Item itemStoleshnica;
	
	public static Item Look;
	
	 @EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
	    itemTable = new ItemTable().setUnlocalizedName("ItemTable");
	    itemStoll = new ItemStoll().setUnlocalizedName("ItemStoll");
	    Look = new ItemStoll();
	    
	    
	    GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(itemStoll, itemStoll.getUnlocalizedName().substring(5));
	  }
	  
	  @EventHandler
	  public void init(FMLInitializationEvent event){
	    
	  }
	  
	  @EventHandler
	  public void postInit(FMLPostInitializationEvent event){
	  
	  }
}
