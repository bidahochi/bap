package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelNRE3gs21b;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelTypeA;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import train.render.models.*;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class NRE3gs21b extends EntityTrainCore {

    public NRE3gs21b(World worldObj) {
        super(worldObj);
    }

    public NRE3gs21b(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new NRE3gs21b((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "NRE3gs21b";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "2006-current";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 124161f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelNRE3gs21b()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/3gs21b_UP.png","textures/bogies/blombergB_spooki_up_trash.png","Union Pacific", "description.3gs21b.up");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/3gs21b_BNSF.png","textures/bogies/blombergB_Black.png","Burlington Northern Santa Fe", "description.3gs21b.bnsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/3gs21b_Furrx1.png","textures/bogies/blombergB_Black.png","FurrX (Plow)", "description.3gs21b.furr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/3gs21b_Furrx2.png","textures/bogies/blombergB_Black.png","FurrX (No Plow)", "description.3gs21b.furr");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Union Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 3), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 6), new ItemStack(TiMItems.generator, 6)        };
    }//3 4 3 4 3 1 4 6 6

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.5f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.5f, -1.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelBlombergB(), 1.5f,0f,0f),
                new Bogie(new ModelBlombergB(),-1.5f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2100;}
    @Override
    public float transportTopSpeed(){return 104;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{11000};}

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