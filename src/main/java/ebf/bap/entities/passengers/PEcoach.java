package ebf.bap.entities.passengers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelPEcoach;
import ebf.bap.models.trucks.ModelBluntTruck;
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

import java.util.List;
import java.util.UUID;

public class PEcoach extends GenericRailTransport {

    public PEcoach(World worldObj) {
        super(worldObj);
    }

    public PEcoach(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new PEcoach((World)null), BAP.MODID, BAP.creativeTabPassenger);


    //main stats
    @Override
    public String transportName(){return "PEcoach";}
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
    public ModelBase[] getModel(){return new ModelBase[]{new ModelPEcoach()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.1f, 0.0f}};}//-0.105
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PECoach_logo.png","textures/bogies/pe_truccs.png","Polar Express Coach (With Logo)", "description.pecoach.waw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID, "textures/passengers/PECoach_nologo.png","textures/bogies/pe_truccs.png","Polar Express Coach (Without Logo)", "description.pecoach.wawnt");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Polar Express Coach (With Logo)";
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
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f},{1.5f,1.2f, 0f},{-1.5f,1.2f, 0f}};}
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