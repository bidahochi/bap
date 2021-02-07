package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelVO1000;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelTypeA;
import ebf.bap.models.trucks.ModelTypeASmol;
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

public class VO1000 extends EntityTrainCore {

    public VO1000(World worldObj) {
        super(worldObj);
    }

    public VO1000(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new VO1000((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "VO1000";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1939-1946";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 109860f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelVO1000()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}//-1.1
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){

        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/vo1000_SPS.png","textures/bogies/typea_Black.png","Spokane, Portland & Seattle", "description.vo1000.sps");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/vo1000_LSBC9.png","textures/bogies/typea_Black.png","The LaSalle and Bureau County Railroad #9", "description.vo1000.lsbc");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/vo1000_ATSF.png","textures/bogies/typea_Black.png","ATSF", "description.vo1000.atsf");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Spokane, Portland & Seattle";
    }

    //recipe
   /* @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 2), 
                new ItemStack(Items.ingot, 1), new ItemStack(ItemIDs.ironChimney.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), 
                new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 2)        };
    }*/

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.4f,1.2f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.2999999046325685f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.1f, -1.1f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelTypeA(), 1.1f,0f,0f),
                new Bogie(new ModelTypeA(),-1.1f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1000;}
    @Override
    public float transportTopSpeed(){return 67;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}

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