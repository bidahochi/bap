package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSW1;
import ebf.bap.models.locomotives.ModelSW1200;
import ebf.bap.models.trucks.ModelBluntTruck;
import ebf.bap.models.trucks.ModelFlexi2Axle;
import ebf.bap.models.trucks.ModelTypeASmol;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class SW1200 extends EntityTrainCore {

    public SW1200(World worldObj) {
        super(worldObj);
    }

    public SW1200(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new SW1200((World)null), BAP.MODID, BAP.creativeTabDiesel);
    
    //main stats
    @Override
    public String transportName(){return "SW1200";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1954-1966";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 111130f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSW1200()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_sp.png","textures/bogies/typeasmol_sp.png","Southern Pacific", "description.sw1200.sp");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_wvn.png","textures/bogies/typeasmol_Black.png","West Virginia Northern", "description.sw1200.wvn");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_drgw_early.png","textures/bogies/typeasmol_Black.png","Denver & Rio Grande Western", "description.sw1200.drgw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_drgw_late.png","textures/bogies/typeasmol_Black.png","Denver & Rio Grande Western (Late)", "description.sw1200.drgw2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_cnw.png","textures/bogies/typeasmol_Black.png","Chicago Northwestern System", "description.sw1200.cnw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_it.png","textures/bogies/flexicoil2_Silver.png","Illinois Terminal", "description.sw1200.it");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sw1200_fox.png","textures/bogies/flexicoil2_Silver.png","North Fox & Cascades", "description.sw1200.fox");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Southern Pacific";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand,2), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 2),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 1),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 4), new ItemStack(TiMItems.generator, 3)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.9f,1.2f, -0.3f}, {0.9f,1.2f, 0.3f}};}//{0.9f,1.2f, -0.45f} for dynamic equipped units
    @Override
    public float[] getHitboxSize(){return new float[]{4.2f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.0f, -1.0f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Illinois Terminal")|| getCurrentSkin().name.equals("im gonna stab you through the heart with a fucking pencil")) {
            return new Bogie[]{new Bogie(new ModelFlexi2Axle(),1.0f,0f,0f),
                    new Bogie(new ModelFlexi2Axle(),-1.0f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeASmol(),1.0f,0f,0f),
                    new Bogie(new ModelTypeASmol(),-1.0f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1200;}
    @Override
    public float transportTopSpeed(){return 105;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{3000};}

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