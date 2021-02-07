package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSW1;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelTypeASmol;
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

public class SW1 extends EntityTrainCore {

    public SW1(World worldObj) {
        super(worldObj);
    }

    public SW1(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SW1((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "SW1";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1938-1953";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 89000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSW1()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_MILW.png","textures/bogies/typeasmol_Black.png","Milwaukee Road", "description.sw1.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_BN.png","textures/bogies/typeasmol_Black.png","Burlington Northern", "description.sw1.bn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_EMD.png","textures/bogies/typeasmol_Black.png","EMD Demo", "description.sw1.emd");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_GN.png","textures/bogies/typeasmol_Black.png","Great Northern", "description.sw1.gn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_SNC.png","textures/bogies/typeasmol_Black.png","Seattle & North Coast", "description.sw1.snc");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_AMTK.png","textures/bogies/typeasmol_Black.png","Amtrak", "description.sw1.amtk");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_FKIX.png","textures/bogies/blunttruck_Brown.png","FKIX", "description.sw1.fkix");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1_MTS.png","textures/bogies/typeasmol_Black.png","Messicrew Tenneva & Southern", "description.sw1.mts");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Milwaukee Road";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand,2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 1), new ItemStack(TiMItems.generator, 3)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.9f,1.2f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.2000000953674315f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.0f, -1.0f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("FKIX")) {
            return new Bogie[]{new Bogie(new ModelBluntTruck(),1.0f,0f,0f),
                    new Bogie(new ModelBluntTruck(),-1.0f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeASmol(),1.0f,0f,0f),
                    new Bogie(new ModelTypeASmol(),-1.0f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 600;}
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