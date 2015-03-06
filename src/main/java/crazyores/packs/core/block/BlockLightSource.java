package crazyores.packs.core.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockLightSource extends CoreBlock {

	protected BlockLightSource(String blockReadableName, String unlocalizedName, Material blockMaterial, float hardness, float resistance) {
		super(blockReadableName, unlocalizedName, blockMaterial, hardness, resistance);
		super.setLightLevel(1.0F);
		super.setLightOpacity(0);
	}
	
	@Override
    public int getRenderType() {
        return -1;
    }

	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

	@Override
    public boolean isOpaqueCube() {
        return false;
    }

	@Override
    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_) {
        return false;
    }

	@Override
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {}
}
