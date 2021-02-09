package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelGP9;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelTypeA;
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

public class GP9 extends EntityTrainCore {

    public GP9(World worldObj) {
        super(worldObj);
    }

    public GP9(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GP9((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "GP9";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1954-1959";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 117700f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelGP9()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_WP.png","textures/bogies/blombergB_Black.png","Western Pacific", "description.gp9.wp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_SP.png","textures/bogies/blombergB_Black.png","Southern Pacific", "description.gp9.sp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_MILW.png","textures/bogies/blombergB_Black.png","Milwaukee Road", "description.gp9.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_CP.png","textures/bogies/blombergB_Black.png","Canadian Pacific", "description.gp9.cp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_SPS.png","textures/bogies/blombergB_Black.png","Spokane Portland & Seattle", "description.gp9.sps");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_RJC_red_lh.png","textures/bogies/blombergB_Black.png","RJ Corman Red (Low Hood)", "description.gp9.rjc1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_RJC_red_hh.png","textures/bogies/blombergB_Black.png","RJ Corman Red (High Hood)", "description.gp9.rjc2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_RJC_gray_lh.png","textures/bogies/blombergB_Black.png","RJ Corman Gray Stripe (Low Hood)", "description.gp9.rjc3");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp9_RJC_gray_hh.png","textures/bogies/blombergB_Black.png","RJ Corman Gray Stripe (High Hood)", "description.gp9.rjc4");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Western Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMItems.generator, 4)        };
    }//332221443

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.05f,1.2f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.1f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4f, -1.4f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("A")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.4f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.4f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.4f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.4f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1750;}
    @Override
    public float transportTopSpeed(){return 100;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{4000};}



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