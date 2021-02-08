package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelH1044;
import ebf.bap.models.trucks.ModelTypeA;
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

public class H1044 extends EntityTrainCore {

    public H1044(World worldObj) {
        super(worldObj);
    }

    public H1044(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new H1044((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "H1044";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1944-1950";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 108862f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelH1044()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){

        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_HD11.png","textures/bogies/typea_Black.png","Hallett Dock Company #11", "description.h10.hd");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_UP.png","textures/bogies/typea_LightGrey.png","Union Pacific", "description.h10.up");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_DRGW.png","textures/bogies/typea_Black.png","Rio Grande", "description.h10.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_ATSF.png","textures/bogies/typea_Black.png","ATSF Pinstripe", "description.h10.atsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_MILW.png","textures/bogies/typea_Black.png","Milwaukee Road", "description.h10.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_Appache.png","textures/bogies/typea_Black.png","Apache Railway", "description.h10.ap");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_Frisco.png","textures/bogies/typea_Black.png","Frisco Railway", "description.h10.fric");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_NYC.png","textures/bogies/typea_Black.png","New York Central", "description.h10.nyc");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_FURRX.png","textures/bogies/typea_LightGrey.png","FurrX", "description.h10.fur");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/h10-44_CNW.png","textures/bogies/typea_Black.png","Chicago North Western", "description.h10.cnw");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Hallett Dock Company #11";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 2), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 3), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMItems.generator, 3)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.4f,1.2f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.400000047683716f,2.1f,1.1f};}
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
    public float transportTopSpeed(){return 97;}
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