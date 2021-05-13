package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSD70Ace;
import ebf.bap.models.locomotives.Modeldash8_40C;
import ebf.bap.models.trucks.ModelFB3;
import ebf.bap.models.trucks.ModelHTSCTruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class SD70Ace extends EntityTrainCore {

    public SD70Ace(World worldObj) {
        super(worldObj);
    }

    public SD70Ace(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SD70Ace((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "SD70Ace";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "2004-Current";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 190508f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSD70Ace()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_PEETAH.png","textures/bogies/htsctruck_Black.png","hey louis", "description.ace.peetah");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_4141.png","textures/bogies/htsctruck_LightGrey.png","George Bush 4141", "description.ace.4141");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_DRGW.png","textures/bogies/htsctruck_LightGrey.png","DRGW Heritage Unit", "description.ace.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_Southern_Pacific.png","textures/bogies/htsctruck_LightGrey.png","SP Heritage Unit", "description.ace.sp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_Western_Pacific.png","textures/bogies/htsctruck_LightGrey.png","WP Heritage Unit", "description.ace.wp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/SD70ACe_Katy.png","textures/bogies/htsctruck_LightGrey.png","Katy Heritage Unit", "description.ace.katy");}
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"hey louis";
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
    public float[][] getRiderOffsets(){return new float[][]{{-1.9f,1.4f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{6.5f,2.3f,1.5f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.9f, -1.9f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelHTSCTruck(), 1.9f,0f,0f),
                new Bogie(new ModelHTSCTruck(),1.9f,0f,0f).setRotation(0,180,0),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 4500;}
    @Override
    public float transportTopSpeed(){return 121;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(TiMOres.ingotSteel);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{18000};}

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