package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelAlcoS2;
import ebf.bap.models.trucks.ModelBluntTruck;
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

import java.util.List;
import java.util.UUID;

public class AlcoS2 extends EntityTrainCore {

    public AlcoS2(World worldObj) {
        super(worldObj);
    }

    public AlcoS2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new AlcoS2((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "Alco S2";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1940 - 1950";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 104326f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelAlcoS2()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.0f, 0.0f}};} //-0.1, 0.1, 0 originally, {0.0f, 0.3f, 0.0f} for the not dominik model
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID, "textures/diesels/alcos2_PC.png","textures/bogies/blunttruck_Black.png","Penn Central", "description.alcos2.pc");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_NPTC.png","textures/bogies/blunttruck_Black.png","Northern Pacific Terminal Co", "description.alcos2.nptc");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_GN.png","textures/bogies/blunttruck_Black.png","Great Northern", "description.alcos2.gn");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_MILW.png","textures/bogies/blunttruck_Black.png","Milwaukee Road", "description.alcos2.milw");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_MTS.png","textures/bogies/blunttruck_Black.png","Messicrew Tenneva & Southern", "description.alcos2.mts");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_FURRX.png","textures/bogies/blunttruck_Furrx.png","FurrX Patch", "description.alcos2.furrx");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_ATSF.png","textures/bogies/blunttruck_Black.png","Atchison Topeka & Santa Fe", "description.alcos2.atsf");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_AMTK1.png","textures/bogies/blunttruck_Black.png","Amtrak Phase 1", "description.alcos2.amtk1");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_AMTK2.png","textures/bogies/blunttruck_Black.png","Amtrak Phase 2", "description.alcos2.amtk2");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_CP.png","textures/bogies/blunttruck_Black.png","Canadian Pacific", "description.alcos2.cp");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_DRGW.png","textures/bogies/blunttruck_Black.png","Denver & Rio Grande Western", "description.alcos2.drgw");
        SkinRegistry.addSkin(this.getClass(),
            BAP.MODID,"textures/diesels/alcos2_DRGW_late.png","textures/bogies/blunttruck_Black.png","Denver & Rio Grande Western (Late)", "description.alcos2.drgw2");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Penn Central";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 1), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 2), new ItemStack(TiMItems.generator, 3)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.2f,1.3f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.0f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.9f, -0.9f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new ModelBluntTruck(), 0.9f,0f,0f),
                new Bogie(new ModelBluntTruck(), 0.9f,0f,0f).setRotation(0,180,0),//this needs to be rotated 180 but like, that doesnt exist yet
        };
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1000;}
    @Override
    public float transportTopSpeed(){return 96;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}

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