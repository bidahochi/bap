package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSW1500;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFlexi2Axle;
import ebf.bap.models.trucks.ModelTypeASmol;
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

public class SW1500 extends EntityTrainCore {

    public SW1500(World worldObj) {
        super(worldObj);
    }

    public SW1500(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SW1500((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "SW1500";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1966-1974";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 112491f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSW1500()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){

        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_DRIR_1083.png","textures/bogies/flexicoil2_Black.png","Denver Rock Island Railroad #1083", "description.sw1500.drir1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_DRIR_Y1211.png","textures/bogies/flexicoil2_Black.png","Denver Rock Island Railroad #Y1211", "description.sw1500.drir2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_BNSF.png","textures/bogies/typeasmol_Green.png","Burlington Northern Santa Fe", "description.sw1500.bnsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_Generic.png","textures/bogies/typeasmol_Black.png","Generic White", "description.sw1500.generic");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_FURRX.png","textures/bogies/flexicoil2_Black.png","FurrX", "description.sw1500.furrx");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1500_MTS.png","textures/bogies/typeasmol_Black.png","Messicrew Tenneva & Southern", "description.sw1500.mts");
    }
    @Override
    public String getDefaultSkin(){
        return  BAP.MODID+":"+"Denver Rock Island Railroad #1083";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 3)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{01.1f,1.4f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.099999952316284f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.0f, -1.0f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Denver Rock Island Railroad #1083") || getCurrentSkin().name.equals("Denver Rock Island Railroad #Y1211")
                || getCurrentSkin().name.equals("FurrX")) {
            return new Bogie[]{new Bogie(new ModelFlexi2Axle(),1.0f,0f,0f),
                    new Bogie(new ModelFlexi2Axle(),-1.0f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeASmol(),1.0f,0f,0f),
                    new Bogie(new ModelTypeASmol(),-1.0f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1500;}
    @Override
    public float transportTopSpeed(){return 105;}
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