package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.Model40highcube;
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

public class Highcube40foot extends GenericRailTransport {

    public Highcube40foot(World worldObj) {
        super(worldObj);
    }

    public Highcube40foot(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Highcube40foot((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "40highcube";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1967-Onwards";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 27533f;}//6700 lbs

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Model40highcube()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.05f, 0.0f}};}// -0.15
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_Bawx.png","textures/bogies/70TonTruck_Black.png","BAWX", "description.highcube40.bawx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_NP.png","textures/bogies/70TonTruck_Black.png","Northern Pacific", "description.highcube40.np");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_BN.png","textures/bogies/70TonTruck_Black.png","Burlington Northern", "description.highcube40.bn");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_beep.png","textures/bogies/70TonTruck_Black.png","Beep Boop", "description.highcube40.beep");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_MILW.png","textures/bogies/70TonTruck_Black.png","Milwaukee Road", "description.highcube40.milw");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_IC.png","textures/bogies/70TonTruck_Black.png","Illinois Central", "description.highcube40.ic");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/40highcube_msrx.png","textures/bogies/70TonTruck_Black.png","Messicrew Rail Services", "description.highcube40.msrx");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"BAWX";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, new ItemStack(Blocks.chest, 2)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{4f,2.1f,1.3f};}//3.8
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.0f, -1.0f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.0f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.0f,0f,0f),
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