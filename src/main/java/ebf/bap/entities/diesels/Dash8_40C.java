package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.Modeldash8_40C;
import ebf.bap.models.locomotives.Modeldash8_40b;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelFB3;
import ebf.bap.models.trucks.ModelTypeB;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class Dash8_40C extends EntityTrainCore {

    public Dash8_40C(World worldObj) {
        super(worldObj);
    }

    public Dash8_40C(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Dash8_40C((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "Dash8-40C";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1987-1992";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 177600f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Modeldash8_40C()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/dash8_40c_fox.png","textures/bogies/fb3_Grey.png","North Fox & Cascades", "description.c40-8.foxyboi");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"North Fox & Cascades";
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
    public float[] getHitboxSize(){return new float[]{6.5f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.7f, -1.7f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelFB3(), 1.7f,0f,0f),
                new Bogie(new ModelFB3(),-1.7f,0f,0f),
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2250;}
    @Override
    public float transportTopSpeed(){return 113;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(TiMItems.mediumDieselEngine);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}

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