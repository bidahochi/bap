package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelCF7;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelTypeB;
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

import java.util.List;
import java.util.UUID;

public class CF7 extends EntityTrainCore {

    public CF7(World worldObj) {
        super(worldObj);
    }

    public CF7(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new CF7((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "EMD CF7";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1969-1978";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 112945f;}//in kg

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelCF7()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, 0.0f, 0.0f}};} //-1.5, 0.15, 0
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_ATSF.png","textures/bogies/blombergB_LightGrey.png","Santa Fe Freightbonnet", "description.cf7.atsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_WCRC.png","textures/bogies/blombergB_Black.png","Washington Central", "description.cf7.wcrc");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_FURRX.png","textures/bogies/typeb_LightGrey.png","FurrX", "description.cf7.furrx");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_ANE.png","textures/bogies/blombergB_Black.png","Avanste Northeastern", "description.cf7.ane");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_Watco2633.png","textures/bogies/blombergB_LightGrey.png","Watco 2633", "description.cf7.watco2633");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_Watco6.png","textures/bogies/blombergB_Black.png","Watco 6", "description.cf7.watco6");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_Watco7.png","textures/bogies/blombergB_Black.png","Watco 7", "description.cf7.watco7");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_Watco11.png","textures/bogies/blombergB_LightGrey.png","Watco 11", "description.cf7.watco11");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_Wamx7108.png","textures/bogies/blombergB_LightGrey.png","Wamx 7108", "description.cf7.wamx7108");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_CAGY.png","textures/bogies/blombergB_Black.png","Columbus & Greenville", "description.cf7.cagy");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_FWWR.png","textures/bogies/blombergB_Black.png","Fort Worth & Western", "description.cf7.fwwr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_TCW.png","textures/bogies/blombergB_Black.png","Twin Cities & Western", "description.cf7.tcw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_OWO19.png","textures/bogies/blombergB_DarkerGrey.png","Washaska & Old Fox 19", "description.cf7.owo19");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_OWO20.png","textures/bogies/typeb_Black.png","Washaska & Old Fox 20", "description.cf7.owo20");// needs type b trucc
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/cf7_MTS.png","textures/bogies/blombergB_Black.png","Messicrew Tenneva & Southern", "description.cf7.mts");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Santa Fe Freightbonnet";
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
    public float[][] getRiderOffsets(){return new float[][]{{-1.3f ,1.3f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.899999976158142f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.25f, -1.25f};}
    /*@SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelBlombergB(), 1.25f,0f,0f),
                new Bogie(new ModelBlombergB(),-1.25f,0f,0f),//this needs to be rotated 180 but like, that doesnt exist yet
        };
    }*/
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Washaska & Old Fox 20") || getCurrentSkin().name.equals("FurrX")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.25f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.25f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.25f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.25f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1500;}
    @Override
    public float transportTopSpeed(){return 116;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{5000};}

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