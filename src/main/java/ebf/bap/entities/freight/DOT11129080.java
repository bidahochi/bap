package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.Model29080DOT111;
import ebf.bap.models.trucks.Model70TonTruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import train.render.models.*;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class DOT11129080 extends GenericRailTransport {

    public DOT11129080(World worldObj) {
        super(worldObj);
    }

    public DOT11129080(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new DOT11129080((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "DOT29080";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1980s";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.TANKER.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Model29080DOT111()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/dot290K_Generic.png","textures/bogies/70TonTruck_Black.png","Generic Black", "description.dot290K.gen");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/dot290K_LIQX.png","textures/bogies/70TonTruck_Black.png","LIQX", "description.dot290K.liqx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/dot290K_FKIX.png","textures/bogies/70TonTruck_Black.png","FKIX", "description.dot290K.fkix");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/dot290K_FKIX2.png","textures/bogies/70TonTruck_Black.png","FKIX Orange Belly", "description.dot290K.fkix2");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Generic Black";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, new ItemStack(Items.bucket, 6)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.5f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.7f, -1.7f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.7f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.7f,0f,0f),
        };
    }
    @Override
    public int[] getTankCapacity(){return new int[]{110000};}

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