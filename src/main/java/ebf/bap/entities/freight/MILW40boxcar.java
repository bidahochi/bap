package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelMILW40boxcar;
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

public class MILW40boxcar extends GenericRailTransport {

    public MILW40boxcar(World worldObj) {
        super(worldObj);
    }

    public MILW40boxcar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new MILW40boxcar((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "MILW40boxcar";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1932-1980s";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 20048f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelMILW40boxcar()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_RouteHiawatha_full.png","textures/bogies/70TonTruck_Black.png","Route Of The Hiawatha Full Ribbing", "description.milw40.1");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_RouteHiawatha_less.png","textures/bogies/70TonTruck_Black.png","Route Of The Hiawatha Less Ribbing", "description.milw40.2");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_RouteEOlympian_full.png","textures/bogies/70TonTruck_Black.png","Route Of The Electrified Olympian Full Ribbing", "description.milw40.3");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_RouteEOlympian_less.png","textures/bogies/70TonTruck_Black.png","Route Of The Electrified Olympian Less Ribbing", "description.milw40.4");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_Billboard_full.png","textures/bogies/70TonTruck_Black.png","Milw Billboard Full Ribbing", "description.milw40.5");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_Billboard_less.png","textures/bogies/70TonTruck_Black.png","Milw Billboard Less Ribbing", "description.milw40.6");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/milw40_FAWX.png","textures/bogies/70TonTruck_Black.png","Fawx Foundry Co", "description.milw40.fawx");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Route Of The Hiawatha Full Ribbing";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 4), null, null,
                null, null, new ItemStack(Blocks.iron_bars, 4),
                null, null, new ItemStack(Blocks.chest, 2)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.0f,2.1f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.2f, -1.2f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.2f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.2f,0f,0f),
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