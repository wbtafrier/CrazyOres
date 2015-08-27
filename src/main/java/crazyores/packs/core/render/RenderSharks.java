package crazyores.packs.core.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import crazyores.packs.core.entity.ai.CoreEntityAILookAtVillager;
import crazyores.packs.core.entity.golem.EntityAdamiteGolem;
import crazyores.packs.core.entity.golem.EntityCopperGolem;
import crazyores.packs.core.entity.golem.EntityDemoniteGolem;
import crazyores.packs.core.entity.golem.EntityEnderGolem;
import crazyores.packs.core.entity.golem.EntityFoolsRubyGolem;
import crazyores.packs.core.entity.golem.EntityOsmoniumGolem;
import crazyores.packs.core.entity.golem.EntityRubyGolem;
import crazyores.packs.core.entity.golem.EntitySapphireGolem;
import crazyores.packs.core.entity.golem.EntityStarconiumGolem;
import crazyores.packs.core.entity.golem.EntityZectiumGolem;
import crazyores.packs.core.entity.mob.EntityShark;
import crazyores.packs.core.util.CoreResourceHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

public class RenderSharks extends RenderLiving {

	public RenderSharks(ModelBase model) {
		super(model, 0.5f);
	}

	protected void rotateCorpse(EntityShark protector, float x, float y, float z) {
        super.rotateCorpse(protector, x, y, z);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		EntityShark s = (EntityShark)entity;
		
		if (s.getType().equals(EntityShark.EnumSharkType.GREAT_WHITE))
			return CoreResourceHandler.GREAT_WHITE_SHARK_TEXTURE;
		else if (s.getType().equals(EntityShark.EnumSharkType.ADAMITE))
			return CoreResourceHandler.ADAMITE_SHARK_TEXTURE;
		else
			return CoreResourceHandler.UNKNOWN_TEXTURE;
	}
	
	public void doRender(EntityShark protector, double par2, double par4, double par6, float par8, float par9) {
		super.doRender(protector, par2, par4, par6, par8, par9);
	}
	
	@Override
	public void doRender(EntityLiving entity, double x, double y, double z, float f1, float f2) {
    	this.doRender((EntityShark)entity, x, y, z, f1, f2);
    }
	
	@Override
	public void doRender(EntityLivingBase entity, double x, double y, double z, float f1, float f2) {
        this.doRender((EntityShark)entity, x, y, z, f1, f2);
    }
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float f1, float f2) {
        this.doRender((EntityShark)entity, x, y, z, f1, f2);
    }

	@Override
    protected void rotateCorpse(EntityLivingBase entity, float x, float y, float z) {
        this.rotateCorpse((EntityShark)entity, x, y, z);
    }
	
	@Override
    protected void preRenderCallback(EntityLivingBase entity, float par2) {
		EntityShark protector = (EntityShark)entity;
		this.scale(protector, protector.getScale());
    }
    
	protected void scale(EntityShark entity, float scale) {
		GL11.glScalef(scale, scale, scale);
//		entity.updateSize();
    }
}
