package ebf.bap.entities.electrics;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelEP1A;
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

public class EP1A extends EntityTrainCore {

    public EP1A(World worldObj) {
        super(worldObj);
    }

    public EP1A(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EP1A((World)null), BAP.MODID, BAP.creativeTabElectric);


    //main stats
    @Override
    public String transportName(){return "EP1A";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1953-1973";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 128820f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelEP1A()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/electrics/ep1a_milw_orange_maroon_passenger.png",new String[]{"textures/bogies/ef1d_black.png","textures/bogies/ef1tp_black.png", "textures/bogies/ef1tp_black.png"},"MILW Passenger Streamlined", "description.ep1a.milwpassengerA");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/electrics/ep1a_milw_orange_maroon_passenger_companion.png",new String[]{"textures/bogies/ef1d_black.png","textures/bogies/ef1tp_black.png", "textures/bogies/ef1tp_black.png"},"MILW Passenger Companion", "description.ep1a.milwpassengerB");
    }
    @Override
    public String getDefaultSkin(){ return BAP.MODID+":"+"MILW Passenger Streamlined";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
                /*new ItemStack(ItemIDs.copperWireFine.item, 6), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 3),
                new ItemStack(Items.ingot, 2), null, new ItemStack(ItemIDs.steelcab.item, 3),
                new ItemStack(ItemIDs.transformer.item, 3), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.controls.item, 2)*/        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.9f,1.2f,-0.4f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.707499980926514f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.6267499923706055f, -1.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelEF1_driver_back(),1.5f,0f,0f),
                new Bogie(new ModelEF1_driver_front(),-1.3f,0f,0f).addSubBogie(new ModelEF1_pilot(),-2.03125f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 2500;}
    @Override
    public float transportTopSpeed(){return 120;}
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
