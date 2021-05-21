package ebf.bap.entities.passengers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelBilevelCar;
import ebf.bap.models.rollingstock.ModelPS_lightweight_52seat_coach;
import ebf.bap.models.trucks.Model41_N_11_truck;
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

public class PS_lightweight_52seat_coach extends GenericRailTransport {

    public PS_lightweight_52seat_coach(World worldObj) {
        super(worldObj);
    }

    public PS_lightweight_52seat_coach(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new PS_lightweight_52seat_coach((World)null), BAP.MODID, BAP.creativeTabPassenger);


    //main stats
    @Override
    public String transportName(){return "PS_lightweight_52seat_coach";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1950";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 57606f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelPS_lightweight_52seat_coach()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PS_lightweight_52seat_DRGW.png","textures/bogies/41-N-11_truck_silver.png","Denver & Rio Grande Western", "description.PSLightweight52.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PS_lightweight_52seat_NKP.png","textures/bogies/41-N-11_truck_NKP_blue.png","Nickle Plate Road", "description.PSLightweight52.nkp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PS_lightweight_52seat_CO.png","textures/bogies/41-N-11_truck_black.png","Chesapeake & Ohio", "description.PSLightweight52.co");}
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Denver & Rio Grande Western";
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
    public float[][] getRiderOffsets(){return new float[][]{{1.1f,0.9f, 0.45f},{1.1f,0.9f, -0.45f},{-1.1f,0.9f, 0.45f},{-1.1f,0.9f, -0.45f}};}
    //{-2.9f,0.9f, 0.45f}, front tiny room,
    //{1.1f,0.9f, 0.45f},{1.1f,0.9f, -0.45f},{-1.1f,0.9f, 0.45f},{-1.1f,0.9f, -0.45f} left back, right back, left front, right front
    @Override
    public float[] getHitboxSize(){return new float[]{7.9f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.75f, -2.75f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model41_N_11_truck(), 2.75f,0f,0f),
                new Bogie(new Model41_N_11_truck(),-2.75f,0f,0f),
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