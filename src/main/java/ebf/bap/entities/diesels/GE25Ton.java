package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.Model25Ton;
import ebf.bap.models.locomotives.ModelHH660;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class GE25Ton extends EntityTrainCore {

    public GE25Ton(World worldObj) {
        super(worldObj);
    }

    public GE25Ton(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GE25Ton((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "25Ton";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1941-1974";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 1134f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Model25Ton()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/25ton_park_service.png","","Park Service", "description.25T.ps");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/25ton_clifford_hill.png","","Clifford Hill Company", "description.25T.ch");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/25ton_pw.png","","Providence & Worcester", "description.25T.pw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/25ton_duke_power_co.png","","Duke Power Co. #10", "description.25T.duke");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Park Service";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 1),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 1), new ItemStack(TiMItems.smallDieselEngine, 2), new ItemStack(TiMItems.generator, 1)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.4f,0.9f, -0.4f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{2.0f,1.7f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.4f, -0.4f};}

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 150;}
    @Override
    public float transportTopSpeed(){return 32;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{1000};}

    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}