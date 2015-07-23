package crazyores.manager.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public abstract class CrazyOresTabs {
	
	//Generic Tab Names
	public static final String crazyOresBlocks = "crazyOresBlocks";
	public static final String crazyOresItems = "crazyOresItems";
	
	public static void initTabs() {
		createCrazyOresBlocksTab();
		createCrazyOresItemsTab();
	}
	
	public static void createCrazyOresBlocksTab() {
		COTabList.crazyOresBlocksTab = new CreativeTabs(crazyOresBlocks) {
			
			@Override
			public Item getTabIconItem() {
				
				//TODO: Replace with a cool block from the core pack
				return Item.getItemFromBlock(Blocks.cobblestone);
			}
		};
	}
	
	public static void createCrazyOresItemsTab() {
		COTabList.crazyOresItemsTab = new CreativeTabs(crazyOresItems) {
			
			@Override
			public Item getTabIconItem() {
				
				//TODO: Replace with a cool block from the core pack
				return Item.getItemFromBlock(Blocks.cactus);
			}
		};
	}
}
