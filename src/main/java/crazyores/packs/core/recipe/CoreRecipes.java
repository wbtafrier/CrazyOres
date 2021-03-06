package crazyores.packs.core.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import crazyores.packs.core.block.CoreBlocks;
import crazyores.packs.core.item.CoreItems;

public class CoreRecipes {

	public static void initCraftingRecipes() {
		initFurnaceRecipes();
		
		initPickaxeRecipes();
		initAxeRecipes();
		initShovelRecipes();
		initSwordRecipes();
		initHoeRecipes();
		initHelmetRecipes();
		initChestplateRecipes();
		initLeggingsRecipes();
		initBootsRecipes();
		initBlockRecipes();
		initBowArrowRecipes();
		initMisc();
	}
	
	private static void initFurnaceRecipes() {
		GameRegistry.addSmelting(CoreBlocks.meteoriteOre, new ItemStack(CoreItems.meteoriteCoal), 0.6f);
		GameRegistry.addSmelting(CoreBlocks.copperOre, new ItemStack(CoreItems.copperIngot), 0.4f);
		GameRegistry.addSmelting(CoreBlocks.adamiteOre, new ItemStack(CoreItems.adamiteShard), 0.7f);
		GameRegistry.addSmelting(CoreBlocks.sapphireOre, new ItemStack(CoreItems.sapphireGem), 0.5f);
		GameRegistry.addSmelting(CoreBlocks.rubyOre, new ItemStack(CoreItems.rubyGem), 0.5f);
		GameRegistry.addSmelting(CoreBlocks.foolsRubyOre, new ItemStack(CoreItems.foolsRubyMush), 0.2f);
		GameRegistry.addSmelting(CoreBlocks.zectiumOre, new ItemStack(CoreItems.zectiumIngot), 1.0f);
		GameRegistry.addSmelting(CoreBlocks.osmoniumOre, new ItemStack(CoreItems.osmoniumIngot), 1.1f);
		GameRegistry.addSmelting(CoreBlocks.starconiumOre, new ItemStack(CoreItems.starconiumGem), 1.4f);
		GameRegistry.addSmelting(CoreBlocks.experiumOre, new ItemStack(CoreItems.experiumOrb), 2.0f);
		
		GameRegistry.addSmelting(CoreBlocks.darkstoneOre, new ItemStack(CoreItems.darkstoneIngot), 0.4f);
		GameRegistry.addSmelting(CoreBlocks.demoniteOre, new ItemStack(CoreItems.demoniteOrb), 0.6f);
		GameRegistry.addSmelting(CoreBlocks.invisiumOre, new ItemStack(CoreItems.invisiumIngot), 0.7f);
		GameRegistry.addSmelting(CoreBlocks.enderOre, new ItemStack(CoreItems.enderGem), 1.8f);
		
		GameRegistry.addSmelting(CoreItems.rawSharkMeat, new ItemStack(CoreItems.cookedSharkMeat), 0.5f);
		
		GameRegistry.addSmelting(CoreBlocks.reinforcedGlass, new ItemStack(CoreBlocks.smoothReinforcedGlass), 0.2f);
	}
	
	private static void initPickaxeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoritePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamitePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphirePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapazitePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initAxeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initShovelRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperShovel, 1), new Object[] {"#", "S", "S", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteShovel, 1), new Object[] {"#", "S", "S", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteShovel, 1), new Object[] {"#", "S", "S", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireShovel, 1), new Object[] {"#", "S", "S", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyShovel, 1), new Object[] {"#", "S", "S", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotZectium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteShovel, 1), new Object[] {"#", "S", "S", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumShovel, 1), new Object[] {"#", "S", "S", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderShovel, 1), new Object[] {"#", "S", "S", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initSwordRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperSword, 1), new Object[] {"#", "#", "S", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteSword, 1), new Object[] {"#", "#", "S", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteSword, 1), new Object[] {"#", "#", "S", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireSword, 1), new Object[] {"#", "#", "S", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubySword, 1), new Object[] {"#", "#", "S", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumSword, 1), new Object[] {"#", "#", "S", '#', "ingotZectium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteSword, 1), new Object[] {"#", "#", "S", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumSword, 1), new Object[] {"#", "#", "S", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumSword, 1), new Object[] {"#", "#", "S", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumSword, 1), new Object[] {"#", "#", "S", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderSword, 1), new Object[] {"#", "#", "S", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initHoeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initHelmetRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperHelmet, 1), new Object[] {"###", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteHelmet, 1), new Object[] {"###", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteHelmet, 1), new Object[] {"###", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireHelmet, 1), new Object[] {"###", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyHelmet, 1), new Object[] {"###", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumHelmet, 1), new Object[] {"###", "# #", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteHelmet, 1), new Object[] {"###", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumHelmet, 1), new Object[] {"###", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumHelmet, 1), new Object[] {"###", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumHelmet, 1), new Object[] {"###", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderHelmet, 1), new Object[] {"###", "# #", '#', "gemEnder"}));
	}
	
	private static void initChestplateRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteChestplate, 1), new Object[] {"# #", "###", "###", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteChestplate, 1), new Object[] {"# #", "###", "###", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemEnder"}));
	}
	
	private static void initLeggingsRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemEnder"}));
	}
	
	private static void initBootsRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperBoots, 1), new Object[] {"# #", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteBoots, 1), new Object[] {"# #", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteBoots, 1), new Object[] {"# #", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireBoots, 1), new Object[] {"# #", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyBoots, 1), new Object[] {"# #", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumBoots, 1), new Object[] {"# #", "# #", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteBoots, 1), new Object[] {"# #", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumBoots, 1), new Object[] {"# #", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumBoots, 1), new Object[] {"# #", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumBoots, 1), new Object[] {"# #", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderBoots, 1), new Object[] {"# #", "# #", '#', "gemEnder"}));
	}
	
	private static void initBlockRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.copperBlock, 1), new Object[] {"###", "###", "###", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.meteoriteBlock, 1), new Object[] {"###", "###", "###", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.adamiteBlock, 1), new Object[] {"###", "###", "###", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.sapphireBlock, 1), new Object[] {"###", "###", "###", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.rubyBlock, 1), new Object[] {"###", "###", "###", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.foolsRubyBlock, 1), new Object[] {"###", "###", "###", '#', "gemFoolsRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.zectiumBlock, 1), new Object[] {"###", "###", "###", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.tapaziteBlock, 1), new Object[] {"###", "###", "###", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.osmoniumBlock, 1), new Object[] {"###", "###", "###", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.starconiumBlock, 1), new Object[] {"###", "###", "###", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.experiumBlock, 1), new Object[] {"###", "###", "###", '#', "orbExperium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.demoniteBlock, 1), new Object[] {"###", "###", "###", '#', "orbDemonite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.invisiumBlock, 1), new Object[] {"###", "###", "###", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.enderBlock, 1), new Object[] {"###", "###", "###", '#', "gemEnder"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.demoniteFurnace, 1), new Object[] {"###", "#S#", "###", '#', "blockDemonite", 'S', "shardStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.copperGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "ingotCopper", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.sapphireGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "gemSapphire", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.adamiteGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "shardAdamite", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.rubyGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "gemRuby", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.foolsRubyGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "gemFoolsRuby", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.zectiumGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "ingotZectium", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.tapaziteGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "obeliskTapazite", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.osmoniumGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "ingotOsmonium", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.starconiumGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "gemStarconium", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.demoniteGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "orbDemonite", 'R', "dustRedstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.enderGolemHead, 1), new Object[] {"###", "R#R", "###", '#', "gemEnder", 'R', "dustRedstone"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperIngot, 9), new Object[] {"#", '#', "blockCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteGem, 9), new Object[] {"#", '#', "blockMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteShard, 9), new Object[] {"#", '#', "blockAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireGem, 9), new Object[] {"#", '#', "blockSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyGem, 9), new Object[] {"#", '#', "blockRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.foolsRubyGem, 9), new Object[] {"#", '#', "blockFoolsRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumIngot, 9), new Object[] {"#", '#', "blockZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteObelisk, 9), new Object[] {"#", '#', "blockTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumIngot, 9), new Object[] {"#", '#', "blockOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumGem, 9), new Object[] {"#", '#', "blockStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.experiumOrb, 9), new Object[] {"#", '#', "blockExperium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.demoniteOrb, 9), new Object[] {"#", '#', "blockDemonite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumIngot, 9), new Object[] {"#", '#', "blockInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderGem, 9), new Object[] {"#", '#', "blockEnder"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.reinforcedBrick, 4), new Object[] {"##", "##", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.reinforcedBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.reinforcedBrick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalReinforcedBrick, 4), new Object[] {" # ", "# #", " # ", '#', "ingotZectium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalReinforcedBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.diagonalReinforcedBrick}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalBrick, 4), new Object[] {" # ", "# #", " # ", '#', "ingotBrick"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.diagonalBrick}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.adamiteBrick, 4), new Object[] {"##", "##", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.adamiteBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.adamiteBrick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalAdamiteBrick, 4), new Object[] {" # ", "# #", " # ", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalAdamiteBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.diagonalAdamiteBrick}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.lightenedBrick, 4), new Object[] {"##", "##", '#', CoreItems.lightenedBrickItem}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.lightenedBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.lightenedBrick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalLightenedBrick, 4), new Object[] {" # ", "# #", " # ", '#', CoreItems.lightenedBrickItem}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalLightenedBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.diagonalLightenedBrick}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.darkstoneBrick, 4), new Object[] {"##", "##", '#', "ingotDarkstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.darkstoneBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.darkstoneBrick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalDarkstoneBrick, 4), new Object[] {" # ", "# #", " # ", '#', "ingotDarkstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.diagonalDarkstoneBrickStairs, 4), true, new Object[] {"#  ", "## ", "###", '#', CoreBlocks.diagonalDarkstoneBrick}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 0), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 1), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 2), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 3), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 3)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 4), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 4)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 5), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 5)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 6), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 6)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 7), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 7)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 8), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 8)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreBlocks.luminiteStorageBlock, 1, 9), new Object[] {"##", "##", '#', new ItemStack(CoreItems.luminiteCrystal, 1, 9)}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CoreBlocks.luminiteDiscoBlock, 1, 0), new Object[] {
			new ItemStack(CoreItems.luminiteCrystal, 1, 1), new ItemStack(CoreItems.luminiteCrystal, 1, 2), 
			new ItemStack(CoreItems.luminiteCrystal, 1, 3), new ItemStack(CoreItems.luminiteCrystal, 1, 8), 
			"dustRedstone", new ItemStack(CoreItems.luminiteCrystal, 1, 4), 
			new ItemStack(CoreItems.luminiteCrystal, 1, 7), new ItemStack(CoreItems.luminiteCrystal, 1, 6), 
			new ItemStack(CoreItems.luminiteCrystal, 1, 5)
		}));
	}
	
	private static void initBowArrowRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.swiftBow, 1), true, new Object[] {"SO ", "SFO", "SO ", 'S', Items.string, 'F', Items.feather, 'O', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.hellBow, 1), true, new Object[] {"SM ", "SBM", "SM ", 'S', Items.string, 'B', Items.lava_bucket, 'M', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.hellBow, 1), true, new Object[] {"SM ", "SBM", "SM ", 'S', Items.string, 'B', CoreItems.copperBucketLava, 'M', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.dualShotBow, 1), true, new Object[] {"SRR", "S R", "SRR", 'S', Items.string, 'R', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.confusionBow, 1), true, new Object[] {"SE ", "SPE", "SEE", 'S', Items.string, 'P', Items.ender_pearl, 'E', "gemEnder"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.confusionBow, 1), true, new Object[] {"SEE", "SPE", "SE ", 'S', Items.string, 'P', Items.ender_pearl, 'E', "gemEnder"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.flamingArrow, 4), new Object[] {"A", "S", "F", 'A', CoreItems.flamingArrowHead, 'S', Items.stick, 'F', Items.feather}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.explosiveArrow, 4), new Object[] {"A", "S", "F", 'A', CoreItems.explosiveArrowHead, 'S', Items.stick, 'F', Items.feather}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.lightningArrow, 4), new Object[] {"A", "S", "F", 'A', CoreItems.lightningArrowHead, 'S', Items.stick, 'F', Items.feather}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.freezingArrow, 4), new Object[] {"A", "S", "F", 'A', CoreItems.freezingArrowHead, 'S', Items.stick, 'F', Items.feather}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.freezingArrowHead, 1), new Object[] {" S ", "SFS", " S ", 'S', Blocks.snow, 'F', Items.flint}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CoreItems.lightningArrowHead, 1), new Object[] {"dustRedstone", "shardAdamite", Items.flint, "ingotCopper", Items.water_bucket}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CoreItems.lightningArrowHead, 1), new Object[] {"dustRedstone", "shardAdamite", Items.flint, "ingotCopper", CoreItems.copperBucketWater}));
	}
	
	private static void initMisc() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.experience_bottle, 1), new Object[] {"orbExperium", Items.glass_bottle}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.torch, 16), new Object[] {"#", "S", '#', "coalMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.torch, 32), new Object[] {"#", "S", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumShard, 1), new Object[] {"###", "#C#", "###", 'C', "gemStarconium", '#', new ItemStack(CoreItems.luminiteCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumSledgehammer, 1), new Object[] {"###", "#S#", " S ", '#', "shardStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperBucketEmpty, 1), new Object[] {"# #", " # ", '#', "ingotCopper"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.cake, 1), new Object[] {"BBB", "SES", "WWW", 'B', CoreItems.copperBucketMilk, 'S', Items.sugar, 'E', Items.egg, 'W', Items.wheat}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.chocolateCake, 1), new Object[] {" B ", "BCB", " B ", 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.cake}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.strawberryCake, 1), new Object[] {" B ", "BCB", " B ", 'B', new ItemStack(Items.dye, 1, 9), 'C', Items.cake}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.birthdayCake, 1), new Object[] {" B ", "BCB", " B ", 'B', new ItemStack(Items.dye, 1, 12), 'C', Items.cake}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CoreItems.lightenedBrickItem, 1), new Object[] { new ItemStack(Items.dye, 1, 14), "ingotBrick"}));
		
	}
}
