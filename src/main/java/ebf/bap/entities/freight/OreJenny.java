package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelOreJenny;
import ebf.bap.models.trucks.Model70TonTruck;
import ebf.bap.models.trucks.ModelOreJennyTrucc;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
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

public class OreJenny extends GenericRailTransport {

    public OreJenny(World worldObj) {
        super(worldObj);
    }

    public OreJenny(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new OreJenny((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "Ore Jenny";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1928-1930";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 2;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 19731f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelOreJenny()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//{0.0f, -0.2f, 0.0f}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/orejenny_ORGY.png","textures/bogies/orejennytrucc.png","ORGY (BAWX)", "description.jenni.orgy");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/orejenny_DMIR.png","textures/bogies/orejennytrucc.png","Duluth, Missabe and Iron Range", "description.jenni.dmir");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/orejenny_MILW.png","textures/bogies/orejennytrucc.png","Milwaukee Road (Limestone)", "description.jenni.milw");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/orejenny_WETX.png","textures/bogies/orejennytrucc.png","Washaska Eastern Taconite Co", "description.jenni.wetx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/orejenny_RDX.png","textures/bogies/orejennytrucc.png","Redstone Cargo (JCIR)", "description.jenni.rer");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"ORGY (BAWX)";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), null, null, new ItemStack(Blocks.hopper, 3), new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_ingot, 2)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{worldObj==null?3.0f:2.2f,1.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.6f, -0.6f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelOreJennyTrucc(),0.6f,0f,0f),
                new Bogie(new ModelOreJennyTrucc(),-0.6f,0f,0f),
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