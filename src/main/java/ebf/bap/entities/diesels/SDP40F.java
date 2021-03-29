package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSDP40F;
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

public class SDP40F extends EntityTrainCore {

    public SDP40F(World worldObj) {
        super(worldObj);
    }

    public SDP40F(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SDP40F((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "SDP40F";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1973-1974";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 179623f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSDP40F()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.0f, 0.0f, 0.0f}};}//-2.0f, 0.14f, 0.0f
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sdp40f_EMD.png","textures/bogies/flexicoil_c2h_BlueOTHER.png","EMD Demonstrator", "description.sdp40f.emd");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sdp40f_Amsnacc_p1.png","textures/bogies/flexicoil_c2h_Black.png","Amtrak Phase 1", "description.sdp40f.amtk1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sdp40f_Amsnacc_p2.png","textures/bogies/flexicoil_c2h_Black.png","Amtrak Phase 2", "description.sdp40f.amtk2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sdp40f_Amsnacc_p3.png","textures/bogies/flexicoil_c2h_Black.png","Amtrak Phase 3", "description.sdp40f.amtk3");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sdp40f_ATSF.png","textures/bogies/flexicoil_c2h_LightGrey2.png.png","AT&SF", "description.sdp40f.atsf");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"EMD Demonstrator";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand,3), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 4), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 4),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 3)        };
    }//353 434 644

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2,1.35f, -0.3f}, {-2,1.35f, 0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.65f,2.1f,1.1f};}
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
    public float transportMetricHorsePower(){return 3000;}
    @Override
    public float transportTopSpeed(){return 160;}
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