package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.Model73centerbeam;
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

public class Centerbeam73ft extends GenericRailTransport {

    public Centerbeam73ft(World worldObj) {
        super(worldObj);
    }

    public Centerbeam73ft(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new Centerbeam73ft((World)null), BAP.MODID, BAP.creativeTabFreight);

    //main stats
    @Override
    public String transportName(){return "73centerbeam";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "2002";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 28122.7f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Model73centerbeam()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//-0.15
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/73ftcb_HRTX.png","textures/bogies/70TonTruck_Black.png","HRTX", "description.centerboomer73.hrtx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/73ftcb_Washaska.png","textures/bogies/70TonTruck_Black.png","Washaska Resources", "description.centerboomer73.wr2");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/73ftcb_Washaska2.png","textures/bogies/70TonTruck_Black.png","Washaska Resources (Orange)", "description.centerboomer73.wr2");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/73ftcb_Coomer.png","textures/bogies/70TonTruck_Black.png","MRSX", "description.centerboomer73.msrx");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"HRTX";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.iron_bars, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), null, new ItemStack(Blocks.iron_bars, 3),
                null, null, new ItemStack(TiMOres.ingotSteel, 4)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{7.75f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{2.7f, -2.7f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),2.7f,0f,0f),
                new Bogie(new Model70TonTruck(),-2.7f,0f,0f),
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