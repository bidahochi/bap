package ebf.bap.entities.electrics;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.ModelEmpty;
import ebf.bap.models.locomotives.ModelEF1;
import ebf.bap.models.trucks.Model70TonTruck;
import ebf.bap.models.trucks.ModelEF1_driver_back;
import ebf.bap.models.trucks.ModelEF1_driver_front;
import ebf.bap.models.trucks.ModelEF1_pilot;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
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

public class EF1 extends EntityTrainCore {

    public EF1(World worldObj) {
        super(worldObj);
    }

    public EF1(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EF1((World)null), BAP.MODID, BAP.creativeTabElectric);


    //main stats
    @Override
    public String transportName(){return "EF1";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1915-1974";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelEF1()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, -0.0f, 0.0f}};}// -1.6, -0.1875
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_orange.png","textures/bogies/ef1tp_black.png", "textures/bogies/ef1d_black.png","MILW Orange", "description.ef1.milworange");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_orange_b.png","textures/bogies/ef1tp_black.png", "textures/bogies/ef1d_black.png","MILW Orange B Unit", "description.ef1.milworangeb");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_black.png","textures/bogies/ef1d_black.png", "textures/bogies/ef1d_black.png","MILW Original Black", "description.ef1.milwblack");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_black_b.png","textures/bogies/ef1d_black.png", "textures/bogies/ef1d_black.png","MILW Original Black B Unit", "description.ef1.milwblackb");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_orange_maroon.png","textures/bogies/ef1d_black.png", "textures/bogies/ef1d_black.png","MILW Orange-Maroon", "description.ef1.milworangemaroon");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/electrics/ef1_milw_orange_maroon_b.png","textures/bogies/ef1d_black.png", "textures/bogies/ef1d_black.png","MILW Orange-Maroon B Unit", "description.ef1.milworangemaroonb");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"MILW Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.707499980926514f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.6267499923706055f, -1.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelEmpty(),-1.5f,0f,0f).addSubBogie(new ModelEmpty(),-0.0f,0f,0f).addSubBogie(new ModelEF1_driver_back(),-1.0f,0f,0f),
                new Bogie(new ModelEF1_driver_front(),1.3f,0f,0f).addSubBogie(new ModelEF1_pilot(),0.6f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 1720;}
    @Override
    public float transportTopSpeed(){return 64;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{12500};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}