package ebf.bap.entities.passengers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelBilevelCar;
import ebf.bap.models.rollingstock.ModelPEcoach;
import ebf.bap.models.trucks.ModelPEtrucc;
import ebf.bap.models.trucks.Modelbilevel_bogie;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class BilevelCoach extends GenericRailTransport {

    public BilevelCoach(World worldObj) {
        super(worldObj);
    }

    public BilevelCoach(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new BilevelCoach((World)null), BAP.MODID, BAP.creativeTabPassenger);


    //main stats
    @Override
    public String transportName(){return "BilevelCoach";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1976-Current";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 110000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelBilevelCar()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/bilevelcoach_sounder.png","textures/bogies/bilevel_trucc.png","Sound Transit (Sounder)", "description.bilevel.sounder");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/bilevelcoach_tre.png","textures/bogies/bilevel_trucc.png","Trinity Railway Express (TRE)", "description.bilevel.tre");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Sound Transit (Sounder)";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.9f,1.0f, 0.45f},{2.9f,1.0f, 0.45f},{1.4f,1.6f, 0.35f},{-0.5f,0.6f, 0.35f}};}//f r tr bc
    //{-0.5f,0.6f, 0.35f},{1.4f,1.6f, 0.35f},{2.9f,1.0f, 0.45f},{-2.9f,1.0f, 0.45f}//bc tr r f
    @Override
    public float[] getHitboxSize(){return new float[]{7.7f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.1f, -2.1f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Modelbilevel_bogie(), 2.1f,0f,0f),
                new Bogie(new Modelbilevel_bogie(),-2.1f,0f,0f),
        };
    }

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