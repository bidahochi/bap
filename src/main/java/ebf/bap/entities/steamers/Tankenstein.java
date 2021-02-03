package ebf.bap.entities.steamers;

import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelTankenstein;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class Tankenstein extends EntityTrainCore {

    public Tankenstein(World worldObj) {
        super(worldObj);
    }

    public Tankenstein(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Tankenstein((World)null), BAP.MODID, BAP.creativeTabSteam);


    //main stats
    @Override
    public String transportName(){return "Tankenstein 0-4-0";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1929";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.STEAM.singleton();
    }
    @Override
    public float weightKg(){return 76789f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelTankenstein()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.0f, 0f, -0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, -0.0f, -0.0f}};}//0.0f, -180.0f, -180.0f
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(BAP.MODID,"textures/steamers/tankenstein_cyan.png","Cyan", "description.tankenstein.cyan"));
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(BAP.MODID,"textures/steamers/tankenstein_red.png","Red", "description.tankenstein.red"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(BAP.MODID,"textures/steamers/tankenstein_brown.png","Brown", "description.tankenstein.brown"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(BAP.MODID,"textures/steamers/tankenstein_light_blue.png","Light Blue", "description.tankenstein.Lblue"));
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Cyan";
    }
    
    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                new ItemStack(Items.iron_ingot, 2), null, null,
                null, null, new ItemStack(Items.coal, 1)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.25f,1.2f, -0.4f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.3f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4500000119209289f, -1.4500000119209289f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "steam";}
    @Override
    public float transportMetricHorsePower(){return 280;}
    @Override
    public float transportTopSpeed(){return 55;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{5000, 1000};}



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