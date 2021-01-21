package ebf.bap.entities.passengers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelPEobserve;
import ebf.bap.models.trucks.ModelPEtrucc;
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

public class PEobserve extends GenericRailTransport {

    public PEobserve(World worldObj) {
        super(worldObj);
    }

    public PEobserve(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new PEobserve((World)null), BAP.MODID, BAP.creativeTabPassenger);


    //main stats
    @Override
    public String transportName(){return "PEobserve";}
    @Override
    public String transportcountry(){return "North Pole";}
    @Override
    public String transportYear(){return "1940s";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 77111f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelPEobserve()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.1f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PEObserve_logo.png","textures/bogies/pe_truccs.png","Polar Express Observation (With Logo)", "description.peobserve.waw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PEObserve_nologo.png","textures/bogies/pe_truccs.png","Polar Express Observation (Without Logo)", "description.peobserve.wawnt");
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Polar Express Observation (With Logo)";// for whatever reason the default skin just breaks for no reason
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
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{7.7f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.1f, -2.1f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelPEtrucc(), 2.1f,0f,0f),
                new Bogie(new ModelPEtrucc(),-2.1f,0f,0f),
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