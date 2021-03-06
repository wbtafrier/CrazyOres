package crazyores.packs.core.util;

import java.io.File;

import net.minecraft.util.ResourceLocation;
import crazyores.manager.pack.COPackManager;

public class CoreResourceHandler {
	
	private static String sep = "/";
	
	private static final String texturesPath = "textures" + sep;
	private static final String modelsPath = texturesPath + "models" + sep;
	private static final String golemPath = modelsPath + "mobs" + sep + "golems" + sep;
	private static final String evilPath = modelsPath + "mobs" + sep + "evil" + sep;
	private static final String chestsPath = modelsPath + "chests" + sep;
	
	private static final String guiPath = texturesPath + "gui" + sep;
	
	private static final String arrowPath = modelsPath + "arrows" + sep;
	
	public static final ResourceLocation UNKNOWN_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), modelsPath + "unknown_texture.png");
	public static final ResourceLocation TAPAZITE_CRYSTAL_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), modelsPath + "tapazite_crystal_model.png");
	public static final ResourceLocation DEMONITE_FURNACE_GUI_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), guiPath + "demonite_furnace_gui.png");
	
	public static final ResourceLocation COPPER_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "copper_golem.png");
	public static final ResourceLocation SAPPHIRE_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "sapphire_golem.png");
	public static final ResourceLocation ADAMITE_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "adamite_golem.png");
	public static final ResourceLocation RUBY_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "ruby_golem.png");
	public static final ResourceLocation FOOLS_RUBY_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "fools_ruby_golem.png");
	public static final ResourceLocation ZECTIUM_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "zectium_golem.png");
	public static final ResourceLocation TAPAZITE_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "tapazite_golem.png");
	public static final ResourceLocation OSMONIUM_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "osmonium_golem.png");
	public static final ResourceLocation STARCONIUM_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "starconium_golem.png");
	public static final ResourceLocation DEMONITE_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "demonite_golem.png");
	public static final ResourceLocation ENDER_GOLEM_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), golemPath + "ender_golem.png");
	
	public static final ResourceLocation ZECTIUM_PROTECTOR_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), evilPath + "zectium_protector.png");
	
	public static final ResourceLocation GREAT_WHITE_SHARK_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), evilPath + "great_white_shark.png");
	public static final ResourceLocation ADAMITE_SHARK_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), evilPath + "adamite_shark.png");
	
	public static final ResourceLocation FLAMING_ARROW_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), arrowPath + "flaming_arrow.png");
	public static final ResourceLocation EXPLOSIVE_ARROW_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), arrowPath + "explosive_arrow.png");
	public static final ResourceLocation ELECTRIC_ARROW_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), arrowPath + "lightning_arrow.png");
	public static final ResourceLocation FREEZING_ARROW_TEXTURE = new ResourceLocation(COPackManager.corePack.getPackID(), arrowPath + "frozen_arrow.png");
	
	public static final ResourceLocation REINFORCED_SINGLE_CHEST = new ResourceLocation(COPackManager.corePack.getPackID(), chestsPath + "reinforced_single_chest.png");
	public static final ResourceLocation REINFORCED_DOUBLE_CHEST = new ResourceLocation(COPackManager.corePack.getPackID(), chestsPath + "reinforced_double_chest.png");
}
