package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.Modeldash8_40B;
import ebf.bap.models.locomotives.Modeldash8_40B_B;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelTypeB;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class Dash8_40B_B extends EntityTrainCore {

    public Dash8_40B_B(World worldObj) {
        super(worldObj);
    }

    public Dash8_40B_B(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Dash8_40B_B((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "Dash8-40B_B";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1988-1989";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 127006f;}
    @Override
    public String[] additionalItemText() {
        return new String[]{"ATSF was originally going to buy B units, but opted not to."};
    }

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Modeldash8_40B_B()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/dash8_40b_b_fox.png","textures/bogies/fb2_Grey.png","North Fox & Cascades (Road Version)", "description.b40-8b.foxyboi");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/dash8_40b_b_fox_yard.png","textures/bogies/fb2_Grey.png","North Fox & Cascades (Yard Version)", "description.b40-8b.foxyboi");}
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"North Fox & Cascades (Road Version)";
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
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{5.95f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.65f, -1.65f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("what? I thought all salads were healthy!")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.55f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.55f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelFB2(),1.65f,0f,0f),
                    new Bogie(new ModelFB2(),-1.65f,0f,0f)};
        }
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
        return super.fuelSlot().setOverlay(Items.coal);
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