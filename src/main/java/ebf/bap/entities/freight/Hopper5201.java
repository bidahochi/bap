package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelHopper5201;
import ebf.bap.models.rollingstock.Modelmechanicalreefer64;
import ebf.bap.models.trucks.Model70TonTruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class Hopper5201 extends GenericRailTransport {

    public Hopper5201(World worldObj) {
        super(worldObj);
    }

    public Hopper5201(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Hopper5201((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "5201 Cu Foot Hopper";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "TBD";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 26535f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelHopper5201()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/5201_Generic.png","textures/bogies/70TonTruck_Black.png","Generic", "description.5201.generic");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/5201_GBRX.png","textures/bogies/70TonTruck_Black.png","Greenbrier Companies", "description.5201.gbrx");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Generic";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 5), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 2), null, null,
                null, null, null        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{4.4f,2.1f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.55f, -1.55f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.55f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.55f,0f,0f),
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