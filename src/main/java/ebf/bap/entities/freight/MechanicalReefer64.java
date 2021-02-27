package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelPS160;
import ebf.bap.models.rollingstock.Modelmechanicalreefer64;
import ebf.bap.models.trucks.Model70TonTruck;
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

public class MechanicalReefer64 extends GenericRailTransport {

    public MechanicalReefer64(World worldObj) {
        super(worldObj);
    }

    public MechanicalReefer64(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new MechanicalReefer64((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "64 Foot Mechanical Reefer";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "2003-Onwards";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 42500f;}//86400 pounds, game runs in kg, so 39190 kg

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Modelmechanicalreefer64()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//1.875
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/reefer_64_ARMN.png","textures/bogies/70TonTruck_Black.png","ARMN (Union Pacific)", "description.reef64.armn");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/reefer_64_naked.png","textures/bogies/70TonTruck_Black.png","Naked Juice", "description.reef64.nude");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/reefer_64_tropicana.png","textures/bogies/70TonTruck_Black.png","Tropicana Juice", "description.reef64.trop");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/reefer_64_OWO.png","textures/bogies/70TonTruck_Black.png","Washaska & Old Fox", "description.reef64.owo");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"ARMN (Union Pacific)";
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
    public float[] getHitboxSize(){return new float[]{6.9f,2.1f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.85f, -1.85f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.85f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.85f,0f,0f),
        };
    }

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