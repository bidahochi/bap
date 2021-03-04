package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSD9;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFlexicoilC1;
import ebf.bap.models.trucks.ModelTypeA;
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

public class SD9 extends EntityTrainCore {

    public SD9(World worldObj) {
        super(worldObj);
    }

    public SD9(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SD9((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "SD9";}
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
    public float weightKg(){return 163293f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSD9()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}//-1.6
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_potb.png","textures/bogies/Flexi_C1_LightGrey.png","Port of Tillamook Bay", "description.sd9.potb1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_potb2.png","textures/bogies/Flexi_C1_black.png","Port of Tillamook Bay BN Patch", "description.sd9.potb2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_bn.png","textures/bogies/Flexi_C1_black.png","Burlington Northern", "description.sd9.bn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_milw.png","textures/bogies/Flexi_C1_black.png","Milwaukee Road", "description.sd9.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_bnsf.png","textures/bogies/Flexi_C1_bnsf_h1.png","Burlington Northern Santa Fe H1", "description.sd9.bnsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_wetx.png","textures/bogies/Flexi_C1_LightGrey.png","Washaska Eastern Taconite Co", "description.sd9.wetx");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_DRGW.png","textures/bogies/Flexi_C1_black.png","Denver & Rio Grande Western", "description.sd9.drgw1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_DRGW_early.png","textures/bogies/Flexi_C1_black.png","Denver & Rio Grande Western (Early)", "description.sd9.drgw2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD9_DRGW_late.png","textures/bogies/Flexi_C1_black.png","Denver & Rio Grande Western (Late)", "description.sd9.drgw3");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Port of Tillamook Bay";
    }
//LIGHT USAGE ONCE LIGHTS ARE WORKING
/*
potb black- headlights 2,3, ditchlights front, rearlights 3,4, beacon 2, markerlights
potb green- headlights 1,2, ditchlights rear, rearlights 1,2, beacon 3, markerlights
beansniff- headlights 2,3, ditchglights front and rear, rearlights 2,3
bn- headlights 1,2, rearlights 1,2, beacon 3, markerlights
milw- headlights 1,2, rearlights 1,2, markerlights
wetx- headlights 6,7, ditchlights front and rear, rearlights 1,2, beacon 4, markerlights
*/
    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 4), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.mediumDieselEngine, 3), new ItemStack(TiMItems.generator, 4)        };
    }//2 6 5 4 4 1 4 4 2

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){
        return new float[][]{{-1.25f,1.2f, -0.45f}};}//-0.25 for low nose skins
   /*     if(getCurrentSkin().name.equals("Washaska Eastern Taconite Co")) {
            return new float[][]{{-1.25f,1.2f, -0.25f}};
        } else {
            return new float[][]{{-1.25f,1.2f, -0.45f}};
        }
    }*/
    @Override
    public float[] getHitboxSize(){return new float[]{5.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.6f, -1.6f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelFlexicoilC1(), 1.6f,0f,0f),
                new Bogie(new ModelFlexicoilC1(),-1.56f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1750;}
    @Override
    public float transportTopSpeed(){return 104;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{9000};}

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