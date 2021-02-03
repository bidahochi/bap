package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelPS140;
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

public class PS140 extends GenericRailTransport {

    public PS140(World worldObj) {
        super(worldObj);
    }

    public PS140(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new PS140((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "PS140";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1947-Onwards";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 20980f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelPS140()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps140_NYC.png","textures/bogies/70TonTruck_Black.png","NYC Pacemaker", "description.ps140.nyc");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps140_ATSF.png","textures/bogies/70TonTruck_Black.png","Atchison Topeka & Santa Fe", "description.ps140.atsf");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps140_CP.png","textures/bogies/70TonTruck_Black.png","Canadian Pacific", "description.ps140.cp");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps140_RI.png","textures/bogies/70TonTruck_Black.png","Rock Solid Island", "description.ps140.ri");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/ps140_owo.png","textures/bogies/70TonTruck_Black.png","Washaska", "description.ps140.owo");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"NYC Pacemaker";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(Blocks.planks, 4), null, null,
                null, null, null, null, null, new ItemStack(Blocks.chest, 2)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{4f,2.1f,1.3f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.1f, -1.1f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.1f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.1f,0f,0f),
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