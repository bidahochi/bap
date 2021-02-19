package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelMP15DCW9;
import ebf.bap.models.trucks.ModelBlombergB;
import ebf.bap.models.trucks.ModelFlexi2Axle;
import ebf.bap.models.trucks.ModelTypeASmol;
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

public class MP15DCW9 extends EntityTrainCore {

    public MP15DCW9(World worldObj) {
        super(worldObj);
    }

    public MP15DCW9(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new MP15DCW9((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "MP15DCW9";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "2020";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 117500f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelMP15DCW9()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{180.0f, 0.0f, -180.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/mp15dcw-9_wfr.png","textures/bogies/blombergB_Black.png","Wolf Fox Railroad", "description.mp15dcw.wfr");

    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Wolf Fox Railroad";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(TiMItems.controlStand, 3), new ItemStack(TiMItems.wheelSteel, 4), new ItemStack(TiMItems.frameSteel, 4),
                new ItemStack(TiMOres.ingotSteel, 2), new ItemStack(TiMItems.chimneySteel, 2), new ItemStack(TiMItems.cabinSteel, 2),
                new ItemStack(TiMItems.smallElectricEngine, 4), new ItemStack(TiMItems.mediumDieselEngine, 3), new ItemStack(TiMItems.generator, 3)        };
    }//3 4 4 2 2 2 4 4 3

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.2f,1.2f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.1f, -1.1f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("bitchass fucker piss fucking fucking dick piss fucking dick nut dong balls bong fuck fuck PISS piss pissing pissed piss fucking fucking piss")) {
            return new Bogie[]{new Bogie(new ModelFlexi2Axle(),1.1f,0f,0f),
                    new Bogie(new ModelFlexi2Axle(),-1.1f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelBlombergB(),1.1f,0f,0f),
                    new Bogie(new ModelBlombergB(),-1.1f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1500;}
    @Override
    public float transportTopSpeed(){return 97;}
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