package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelU36C;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFB3;
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

public class U36C extends EntityTrainCore {

    public U36C(World worldObj) {
        super(worldObj);
    }

    public U36C(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new U36C((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "U36C";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1971-1975";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 179396f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelU36C()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}//-2.3125
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u36c_EL.png","textures/bogies/fb3_Black.png","Erie Lackawana", "description.u36c.el");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u36c_MILW.png","textures/bogies/fb3_Black.png","Milwaukee Road", "description.u36c.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u36c_ATSF_pinstripe.png","textures/bogies/fb3_Black.png","ATSF Pinstripe", "description.u36c.atsf1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u36c_ATSF_freightbonnent.png","textures/bogies/fb3_Grey.png","ATSF Freightbonnet", "description.u36c.atsf2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u36c_ATSF_kodachrome.png","textures/bogies/fb3_Grey.png","ATSF Kodachrome", "description.u36c.atsf3");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Erie Lackawana";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 5),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 6)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2f,1.3f, -0.35f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.5f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.8f, -1.8f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelFB3(), 1.8f,0f,0f),
                new Bogie(new ModelFB3(),-1.8f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 3600;}
    @Override
    public float transportTopSpeed(){return 113;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{11000};}

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