package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.Model60centerbeam;
import ebf.bap.models.trucks.Model70TonTruck;
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

public class Centerbeam60ft extends GenericRailTransport {

    public Centerbeam60ft(World worldObj) {
        super(worldObj);
    }

    public Centerbeam60ft(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Centerbeam60ft((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "60centerbeam";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1983";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 28576.3f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Model60centerbeam()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/60ftcb_UP.png","textures/bogies/70TonTruck_Black.png","Union Pacific", "description.centerboomer60.up");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/60ftcb_BCRail.png","textures/bogies/70TonTruck_Black.png","BCRail", "description.centerboomer60.bcr");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/60ftcb_Centex.png","textures/bogies/70TonTruck_Black.png","Centex", "description.centerboomer60.centex");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/60ftcb_Black.png","textures/bogies/70TonTruck_Black.png","Generic Black", "description.centerboomer60.black");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Union Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.iron_bars, 2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), null, new ItemStack(Blocks.iron_bars, 2),
                null, null, new ItemStack(TiMOres.ingotSteel, 2)        };
    }//243 22 3

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{6.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.2f, -2.2f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),2.2f,0f,0f),
                new Bogie(new Model70TonTruck(),-2.2f,0f,0f),
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