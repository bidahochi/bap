package ebf.bap.entities.freight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelWoodchipHopper;
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

public class WoodchipHopper extends GenericRailTransport {

    public WoodchipHopper(World worldObj) {
        super(worldObj);
    }

    public WoodchipHopper(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new WoodchipHopper((World)null), BAP.MODID, BAP.creativeTabFreight);


    //main stats
    @Override
    public String transportName(){return "Woodchip Hopper";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1968-1969";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 6;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.FREIGHT.singleton();
    }
    @Override
    public float weightKg(){return 25129f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelWoodchipHopper()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//-0.15f
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/woodchiphopper_BAWX.png","textures/bogies/70TonTruck_Black.png","BAWX", "description.chip.bawx");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/woodchiphopper_MILW.png","textures/bogies/70TonTruck_Black.png","Milwaukee Road", "description.chip.milw");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/woodchiphopper_BN.png","textures/bogies/70TonTruck_Black.png","Burlington Northern", "description.chip.bn");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/woodchiphopper_GN.png","textures/bogies/70TonTruck_Black.png","Great Northern", "description.chip.gn");
        SkinRegistry.addSkin(this.getClass(), BAP.MODID,
                "textures/freight/woodchiphopper_OWO.png","textures/bogies/70TonTruck_Black.png","Washaska & Old Fox", "description.chip.owo");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"BAWX";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 4), new ItemStack(Blocks.log, 4), null, new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.iron_ingot, 3), new ItemStack(Blocks.chest, 4)        };
    }//044 440 334

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return null;}
    @Override
    public float[] getHitboxSize(){return new float[]{5.5f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.85f, -1.85f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Model70TonTruck(),1.85f,0f,0f),
                new Bogie(new Model70TonTruck(),-1.85f,0f,0f),
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