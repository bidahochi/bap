package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelOWO60Verticube;
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

public class OWO60Verticube extends GenericRailTransport {

    public OWO60Verticube(World worldObj) {
        super(worldObj);
    }

    public OWO60Verticube(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new OWO60Verticube((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "OWO 60 Verticube";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "Early 2000s Onwards";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 50950f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelOWO60Verticube()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};} //-0.1875
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_green_logo.png","textures/bogies/70TonTruck_Black.png","OWO 'Verti-Cube'", "description.owo60.verticube");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_green_wr.png","textures/bogies/70TonTruck_Black.png","OWO 'Washaska Resources'", "description.owo60.wr");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_green_logo_new.png","textures/bogies/70TonTruck_Black.png","OWO 'Big Logo'", "description.owo60.biglogo");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_green_simple.png","textures/bogies/70TonTruck_Black.png","OWO 'Simple'", "description.owo60.simple");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_white_logo.png","textures/bogies/70TonTruck_Black.png","OWO 'Big Logo White'", "description.owo60.biglogowhite");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/owo60verticube_white_wr.png","textures/bogies/70TonTruck_Black.png","OWO 'Washaska Resources White'", "description.owo60.whitewr");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"OWO 'Verti-Cube'";
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
    public float[] getHitboxSize(){return new float[]{5.7f,2.6f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.6f, -1.6f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.6f,0f,0f),
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