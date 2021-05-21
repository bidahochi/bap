package ebf.bap.entities.others;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.ModelWVcaboose;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.Modelcaboosetruck;
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

public class WVcaboose extends GenericRailTransport {

    public WVcaboose(World worldObj) {
        super(worldObj);
    }

    public WVcaboose(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new WVcaboose((World)null),  BAP.MODID, BAP.creativeTabOther);


    //main stats
    @Override
    public String transportName(){return "WVcaboose";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1960s";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 22000f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelWVcaboose()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//-0.1675
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/wvcaboose_atsf.png","textures/bogies/Caboose_truck_Black.png","AT&SF CE-11", "description.wvboose.atsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/wvcaboose_bn.png","textures/bogies/Caboose_truck_Black.png","Burlington Northern", "description.wvboose.bn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/wvcaboose_owo.png","textures/bogies/Caboose_truck_Black.png","Washaska & old Fox", "description.wvboose.owo");
    }
    @Override
    public String getDefaultSkin(){
        return  BAP.MODID+":"+"AT&SF CE-11";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMOres.ingotSteel, 3), new ItemStack(TiMItems.wheelIron, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneyIron, 1), new ItemStack(TiMItems.cabinSteel, 3),
                null, new ItemStack(Blocks.furnace, 1), new ItemStack(Blocks.crafting_table, 1)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.2f,1.4f, 0.5f},{0.2f,1.4f, -0.5f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{3.875f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.9f, -0.9f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                //new Bogie(new Modelcaboosetruck(), 1.05f,-0.55f,0.35f),//FIX THIS
                //new Bogie(new Modelcaboosetruck(),-0.75f,-0.55f,0.35f),//TRUCKS NO CENTERED
                new Bogie(new Modelcaboosetruck(), 0.9f,-0.0f,0.0f),
                new Bogie(new Modelcaboosetruck(),-0.9f,-0.0f,0.0f),
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