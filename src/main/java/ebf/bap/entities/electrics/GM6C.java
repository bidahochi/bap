package ebf.bap.entities.electrics;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelGM6C;
import ebf.bap.models.locomotives.ModelSD40dash2;
import ebf.bap.models.trucks.ModelFlexicoilC2H;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class GM6C extends EntityTrainCore {

    public GM6C(World worldObj) {
        super(worldObj);
    }

    public GM6C(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GM6C((World)null), BAP.MODID, BAP.creativeTabElectric);


    //main stats
    @Override
    public String transportName(){return "GF6C";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1975";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }
    @Override
    public float weightKg(){return 165561f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelGM6C()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}//{-1.9f, 0.14f, 0.0f}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/electrics/GM6C_demo.png","textures/bogies/flexicoil_c2h_LightGrey2.png","EMD Demonstrator Scheme", "description.gm6c.demo");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/electrics/gm6c_fox2.png","textures/bogies/flexicoil_c2h_LightGrey2.png","North Fox & Cascades", "description.gm6c.fox");
}
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"EMD Demonstrator Scheme";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 6), new ItemStack(TiMItems.frameSteel, 6),
                new ItemStack(TiMOres.ingotSteel, 4), null, new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 6), new ItemStack(TiMItems.transformer, 6), new ItemStack(TiMItems.generator, 4)        };
    }//232 211 664

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.1f,1.1f, -0.25f}};}
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
    public String transportFuelType(){return "electric";}
    @Override
    public float transportMetricHorsePower(){return 6000;}
    @Override
    public float transportTopSpeed(){return 74;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.redstone);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{12500};}

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