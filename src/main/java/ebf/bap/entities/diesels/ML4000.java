package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelC424;
import ebf.bap.models.locomotives.ModelML4000;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelML4000_Truck;
import ebf.bap.models.trucks.ModelTypeB;
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

public class ML4000 extends EntityTrainCore {

    public ML4000(World worldObj) {
        super(worldObj);
    }

    public ML4000(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new ML4000((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "ML4000";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1961-1969";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 156035f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelML4000()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/ML4000.png","textures/bogies/ML4000_Truck.png","Southern Pacific", "description.ml4000.sp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/ML4000_rebuilt.png","textures/bogies/ML4000_Truck.png","Southern Pacific (Rebuilt)", "description.ml4000.sp2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/ML4000_SP9010.png","textures/bogies/ML4000_Truck_SP9010.png","Southern Pacific (9010)", "description.ml4000.sp3");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Southern Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.hydraulicTransmission, 2), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMOres.ingotSteel, 2)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.8f,1.3f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.75f, -1.75f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelML4000_Truck(), 1.75f,0f,0f),
                new Bogie(new ModelML4000_Truck(), 1.75f,0f,0f).setRotation(0,180,0),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 3540;}
    @Override
    public float transportTopSpeed(){return 110;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{6000};}

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