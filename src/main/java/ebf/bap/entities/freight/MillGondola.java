package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelMillGondola;
import ebf.bap.models.trucks.Model70TonTruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
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

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MillGondola extends GenericRailTransport {

    public MillGondola(World worldObj) {
        super(worldObj);
    }

    public MillGondola(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new MillGondola((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "52footMillGondola";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "TBD";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 5;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return Arrays.asList(TrainsInMotion.transportTypes.FREIGHT, TrainsInMotion.transportTypes.HOPPER);
    }
    @Override
    public float weightKg(){return 30980f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelMillGondola()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_WCRC.png","textures/bogies/70TonTruck_Black.png","Washington Central Railway Co.", "description.millgondal.wcrc");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_RBX.png","textures/bogies/70TonTruck_Black.png","Railbox Inc", "description.millgondal.rbx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_OWO.png","textures/bogies/70TonTruck_Black.png","Washaska & Old Fox", "description.millgondal.owo");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_MTS.png","textures/bogies/70TonTruck_Black.png","Messicrew Tenneva & Southern", "description.millgondal.mts");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_fox_test.png","textures/bogies/70TonTruck_Black.png","North Fox & Cascades (Larger Logo)", "description.millgondal.fox");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/MillGondola_fox_test2.png","textures/bogies/70TonTruck_Black.png","North Fox & Cascades (Smaller Logo)", "description.millgondal.fox");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Washington Central Railway Co.";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 6), new ItemStack(TiMItems.wheelIron, 4), new ItemStack(TiMItems.frameIron, 3),
                new ItemStack(Items.iron_ingot, 2), null, null, null, null, new ItemStack(Blocks.hopper, 3)        };
    }//623 200 003

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{4.8f,2.1f,1.1f};}
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