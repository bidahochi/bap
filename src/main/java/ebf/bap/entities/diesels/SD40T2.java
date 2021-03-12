package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSD40T2;
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

public class SD40T2 extends EntityTrainCore {

    public SD40T2(World worldObj) {
        super(worldObj);
    }

    public SD40T2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SD40T2((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "SD40T-2";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1974-1980";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 167000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSD40T2()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0.0f, -0.0f, 0.0f}};}//{-1.9f, -0.14f, 0.0f}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sd40t2_drgw.png","textures/bogies/flexicoil_c2h_Black.png","Denver & Rio Grande", "description.sd40t-2.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sd40t2_sp.png","textures/bogies/flexicoil_c2h_Black.png","Southern Pacific", "description.sd40t-2.sp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sd40t2_ssw.png","textures/bogies/flexicoil_c2h_Black.png","Cotton Belt", "description.sd40t-2.ssw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sd40t2_ane.png","textures/bogies/flexicoil_c2h_Black.png","Avanste Northeastern", "description.sd40t-2.ane");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sd40t2_rjc.png","textures/bogies/flexicoil_c2h_Black.png","RJ Corman Rayroad Company", "description.sd40t-2.rjc");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Denver & Rio Grande";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 6),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.mediumDieselEngine, 6), new ItemStack(TiMItems.generator, 4)        };
    }//232 211 664

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.6f,1.25f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.3f,2.1f,1.1f};}
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
    public float transportTopSpeed(){return 105;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{12000};}

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