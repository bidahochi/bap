package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelGP7;
import ebf.bap.models.trucks.*;
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
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class GP7 extends EntityTrainCore {

    public GP7(World worldObj) {
        super(worldObj);
    }

    public GP7(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GP7((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "GP7";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1949-1954";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 112000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelGP7()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.0f, 0.0f, 0.0f}};}//-1.5
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_BAP.png","textures/bogies/blombergB_Black.png","Butte, Anaconda & Pacific", "description.gp7.bap");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_ANE.png","textures/bogies/typeb_Grey.png","Avanste North Eastern", "description.gp7.ane");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_ATSFpin.png","textures/bogies/blombergB_Black.png","ATSF Pinstripe", "description.gp7.atsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_FWWR.png","textures/bogies/blombergB_Black.png","Fort Worth & Western Railway", "description.gp7.fwwr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_MKT.png","textures/bogies/blombergB_Black.png","Missouri–Kansas–Texas", "description.gp7.mkt");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_NP.png","textures/bogies/blombergB_Black.png","Northern Pacific", "description.gp7.np");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_NYC.png","textures/bogies/blombergB_Black.png","New York Central", "description.gp7.nyc");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_ssw.png","textures/bogies/blombergB_Black.png","Cotton Belt", "description.gp7.ssw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_FurrX.png","textures/bogies/typea_LightGrey.png","FurrX", "description.gp7.fur");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_DRGW_EARLY.png","textures/bogies/blombergB_Black.png","Denver & Rio Grande Western (Early)", "description.gp7.drgw1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_DRGW.png","textures/bogies/blombergB_Black.png","Denver & Rio Grande Western", "description.gp7.drgw2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7_DRGW_LATE.png","textures/bogies/blombergB_Black.png","Denver & Rio Grande Western (Late)", "description.gp7.drgw3");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Butte, Anaconda & Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMItems.generator, 4)        };
    }//332211443

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.05f,1.2f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.1f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4f, -1.4f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Avanste North Eastern")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.4f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.4f,0f,0f)};
        } else if (getCurrentSkin()==null || getCurrentSkin().name.equals("FurrX")) {
            return new Bogie[]{new Bogie(new ModelTypeA(),1.4f,0f,0f),
                    new Bogie(new ModelTypeA(),-1.4f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.4f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.4f,0f,0f)};
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