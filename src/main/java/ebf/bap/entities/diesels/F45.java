package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelF45;
import ebf.bap.models.trucks.ModelFlexicoilC2H;
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

public class F45 extends EntityTrainCore {

    public F45(World worldObj) {
        super(worldObj);
    }

    public F45(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new F45((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "F45";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1968-1971";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 174847f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelF45()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, 0.0f, 0.0f}};}//-1.75f, 0.14f, 0.0f
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/f45_GN.png","textures/bogies/flexicoil_c2h_Black.png","Great Northern BSB", "description.f45.gn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/f45_BN.png","textures/bogies/flexicoil_c2h_Black.png","Burlington Northern", "description.f45.bn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/f45_ATSF_pinstripe.png","textures/bogies/flexicoil_c2h_Black.png","AT&SF Pinstripe", "description.f45.atsf1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/f45_ATSF_frieghtbonnet.png","textures/bogies/flexicoil_c2h_LightGrey2.png","AT&SF Freightbonnet", "description.f45.atsf2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/f45_ATSF_kodachrome.png","textures/bogies/flexicoil_c2h_Black.png","AT&SF Kodachrome", "description.f45.atsf3");}
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Great Northern BSB";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand,3), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 4), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 4),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 3)  };
    }//353 433 664

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.9f,1.35f, -0.3f}, {-1.9f,1.35f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.35f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.8f, -1.8f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelFlexicoilC2H(), 1.8f,-0.05f,0f),
                new Bogie(new ModelFlexicoilC2H(), 1.8f,-0.05f,0f).setRotation(0,180,0),
        };
    }
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 3600;}
    @Override
    public float transportTopSpeed(){return 145;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{12000};}

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