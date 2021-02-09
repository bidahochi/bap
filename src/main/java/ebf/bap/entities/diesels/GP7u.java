package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelGP7u;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelTypeA;
import ebf.bap.models.trucks.ModelTypeB;
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

public class GP7u extends EntityTrainCore {

    public GP7u(World worldObj) {
        super(worldObj);
    }

    public GP7u(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new GP7u((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "GP7u";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1970s";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 116768f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelGP7u()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.00f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_freightbonnet.png","textures/bogies/blombergB_LightGrey.png","ATSF Freightbonnet", "description.gp7u.atsf1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_kodachrome.png","textures/bogies/blombergB_LightGrey.png","ATSF Kodachrome", "description.gp7u.atsf2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_fwwr.png","textures/bogies/blombergB_Black.png","Fort Worth & Western", "description.gp7u.fwwr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_furrx70.png","textures/bogies/blombergB_Black.png","Furrx #70", "description.gp7u.furrx70");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_furrx74.png","textures/bogies/blombergB_Black.png","Furrx #74 (Snowy)", "description.gp7u.furrx74");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/gp7u_furrx77.png","textures/bogies/typeb_Black.png","Furrx #77 (Dirty)", "description.gp7u.furrx77");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"ATSF Kodachrome";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 2), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMItems.generator, 4)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.05f,1.2f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.1f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4f, -1.4f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Furrx #77 (Dirty)")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.4f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.4f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.4f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.4f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1500;}
    @Override
    public float transportTopSpeed(){return 100;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{4000};}

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