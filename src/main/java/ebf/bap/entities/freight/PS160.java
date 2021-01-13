package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelPS160;
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

import java.util.List;
import java.util.UUID;

public class PS160 extends GenericRailTransport {

    public PS160(World worldObj) {
        super(worldObj);
    }

    public PS160(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new PS160((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "Pullman Standard PS1 60 Foot Boxcar";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1947";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 10f;}//86400 pounds

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelPS160()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//1.875
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps160_GT.png","textures/bogies/70TonTruck_Black.png","Grand Trunk", "description.ps160_");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps160_IC.png","textures/bogies/70TonTruck_Black.png","Illinois Central", "description.ps160_");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps160_Washaska1.png","textures/bogies/70TonTruck_Black.png","Washaska & Old Fox", "Standard OWO PS160 boxcar");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps160_Washaska2.png","textures/bogies/70TonTruck_Black.png","Washaska & Old Fox White End", "Standard OWO PS160 boxcar");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Grand Trunk";
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
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.6f, -1.6f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.6f,0f,0f),//.addSubBogie(Model,offsetX,offsetY,offsetZ)
                new Bogie(new Model70TonTruck(),-1.6f,0f,0f),
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