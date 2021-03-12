package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelHuskyStack53;
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

public class HuskyStack53Wellcar extends GenericRailTransport {

    public HuskyStack53Wellcar(World worldObj) {
        super(worldObj);
    }

    public HuskyStack53Wellcar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new HuskyStack53Wellcar((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "HuskyStack53Wellcar";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "TBD";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 99790f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelHuskyStack53()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//1.875
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/huskystack53_TTX.png","textures/bogies/70TonTruck_Black.png","TTX Yellow", "description.huskystack.ttx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/huskystack53_TTX_cancer.png","textures/bogies/70TonTruck_Black.png","TTX Cure Pink", "description.huskystack.ttx2");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"TTX Yellow";
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
    public float[] bogieLengthFromCenter() {return new float[]{2.5f, -2.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),2.5f,0f,0f),
                new Bogie(new Model70TonTruck(),-2.5f,0f,0f),
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