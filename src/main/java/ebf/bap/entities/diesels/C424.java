package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelC424;
import ebf.bap.models.trucks.ModelFB2;
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

public class C424 extends EntityTrainCore {

    public C424(World worldObj) {
        super(worldObj);
    }

    public C424(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new C424((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "C424";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1963-1967";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 117934f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelC424()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/c424_SPS.png","textures/bogies/typeb_Black.png","Spokane, Portland & Seattle", "description.c424.sps");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/c424_NDEM.png","textures/bogies/typeb_Black.png","Ferrocarriles Nacionales de México", "description.c424.ndem");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/c424_OWO21.png","textures/bogies/typeb_Grey.png","Washaska & Old Fox 21", "description.c424.owo");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/c424_fox.png","textures/bogies/typeb_LightGrey.png","North Fox & Cascades", "description.c424.fox");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/c424_CP.png","textures/bogies/typeb_Black.png","Canadian Pacific", "description.c424.cp");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Spokane, Portland & Seattle";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 3), new ItemStack(TiMItems.frameSteel, 3),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteelShort, 1), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 3), new ItemStack(TiMItems.generator, 3)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.5f,1.3f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.4f, -1.4f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Washaska & Old Fox 21")) {//this doesnt really need to be the mutiple bogie model code,
            return new Bogie[]{new Bogie(new ModelTypeB(),1.4f,0f,0f),//however some 424s had HiAd trucks which arent made yet
                    new Bogie(new ModelTypeB(),-1.4f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.4f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.4f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2400;}
    @Override
    public float transportTopSpeed(){return 113;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{6000};}



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