package crazyores.packs.core.entity.golem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import crazyores.packs.core.entity.ai.CoreEntityAIAttackOnCollide;
import crazyores.packs.core.entity.ai.CoreEntityAIDefendVillage;
import crazyores.packs.core.entity.ai.CoreEntityAILookAtVillager;
import crazyores.packs.core.entity.ai.GolemTargets;

public class EntityCopperGolem extends CoreEntityGolem {

	protected CoreEntityAILookAtVillager c;
	
	public EntityCopperGolem(World world) {
		super(world, 1.4f, 2.90f);
	}
	
	public EntityCopperGolem(World world, float scale) {
		super(world, 1.4f, 2.9f, scale);
	}
	
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(106.0d);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25d);
    }

	@Override
	protected void setAbilities() {
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new CoreEntityAIAttackOnCollide(this, 1.0d, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9d, 32.0f));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6d, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0d));
        this.tasks.addTask(5, c = new CoreEntityAILookAtVillager(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new CoreEntityAIDefendVillage(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, new GolemTargets(EnumGolemType.COPPER).mobSelector));
	}
	
	@Override
	public void setHoldingRose(boolean shouldHoldRose) {
		System.out.println("HELLO?");
		
        this.holdRoseTick = shouldHoldRose ? 50 : 0;
        this.worldObj.setEntityState(this, (byte)11);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte b) {
		System.out.println("HELLO??? : " + b);
		
        if (b == 4) {
            this.attackTimer = 10;
            System.out.println("PLAY THROW SONG");
            this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
        }
        else if (b == 11) {
            this.holdRoseTick = 50;
        }
        else {
            super.handleHealthUpdate(b);
        }
    }
	
	public CoreEntityAILookAtVillager getAILookAtVillagerTask() {
		return c;
	}
}
