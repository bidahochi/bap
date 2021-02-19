package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelGP30;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelTypeB;
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

public class GP30 extends EntityTrainCore {

    public GP30(World worldObj) {
        super(worldObj);
    }

    public GP30(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GP30((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "GP30";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1961-1963";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 111130f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelGP30()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}//-1.5f, -0.155f, 0.0f
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){

        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_EMD_DEMO.png","textures/bogies/blombergB_Black.png","EMD Demonstrator", "description.gp30.emd");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_DRGW.png","textures/bogies/blombergB_Black.png","Denver & Rio Grande", "description.gp30.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_ARR.png","textures/bogies/blombergB_Black.png","Alaska RailRoad", "description.gp30.arr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_MILW.png","textures/bogies/typeb_Black.png","Milwaukee Road", "description.gp30.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_SOO.png","textures/bogies/typeb_Black.png","Soo Line", "description.gp30.soo");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_ATSF1.png","textures/bogies/blombergB_LightGrey.png","AT&SF Freightbonnet", "description.gp30.atsf1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_ATSF2.png","textures/bogies/blombergB_Black.png","AT&SF Pinstripe", "description.gp30.atsf2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_ATSF3.png","textures/bogies/blombergB_LightGrey.png","AT&SF Kodachrome", "description.gp30.atsf3");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp30_CP.png","textures/bogies/blombergB_Black.png","Canadian Pacific", "description.gp30.cp");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"EMD Demonstrator";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 4)        };
    }//2 4 4 2 2 2 4 4 4

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.45f,1.25f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.500000095367431f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.5f, -1.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Milwaukee Road") || getCurrentSkin().name.equals("Soo Line")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.5f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.5f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.5f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.5f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2250;}
    @Override
    public float transportTopSpeed(){return 114;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{7000};}

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