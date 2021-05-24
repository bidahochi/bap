package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelSB23R;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelTypeB;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TESTING_SB23R extends EntityTrainCore {

    public TESTING_SB23R(World worldObj) {
        super(worldObj);
    }

    public TESTING_SB23R(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new TESTING_SB23R((World)null), BAP.MODID, BAP.creativeTabOther);

    //main stats
    @Override
    public String transportName(){return "TESTING_SB23R";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1981-1982";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 1;}
    /*@Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        if(getCurrentSkin()==null || getCurrentSkinName().equals("North Fox & Cascades (Road Version)")){
            return TrainsInMotion.transportTypes.STEAM.singleton();
        } else {
            return TrainsInMotion.transportTypes.DIESEL.singleton();
        }
    }*/
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 114759f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelSB23R()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sb23r_fox_27.png","textures/bogies/fb2_Grey.png","North Fox & Cascades (Road Version)", "description.sb23r.fox27");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sb23r_fox_21.png","textures/bogies/typeb_LightGrey.png","North Fox & Cascades (Yard Version)", "description.sb23r.fox21");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/sb23r_fox_17.png","textures/bogies/typeb_LightGrey.png","North Fox & Cascades (Remote Control Version)", "description.sb23r.fox17");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"North Fox & Cascades (Road Version)";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.65f,1.4f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.9f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.5f, -1.5f};}

    /*@SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("North Fox & Cascades (Road Version)")) {
            return new Bogie[]{new Bogie(new ModelFB2(),1.55f,0f,0f),
                    new Bogie(new ModelFB2(),-1.55f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.55f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.55f,0f,0f)};
        }
    }*/

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2250;}
    @Override
    public float transportTopSpeed(){return 95;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}


    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public Map<String, TransportSkin> getSkinList(EntityPlayer viewer, boolean isPaintBucket){
        if(!isPaintBucket && viewer !=null && viewer.getUniqueID()!=null && viewer.getUniqueID().equals(UUID.fromString("d46213e9-ea09-40e7-9ec9-595903d98e17")) || viewer.getUniqueID().equals(UUID.fromString("dd87ba2c-c38a-4fbf-b836-25b940123c11"))) {//can use || viewer.getUniqueID().equals(SOMEUUID) for adding more people to it
            return SkinRegistry.getTransportSkins(getClass());
        } else {
            Map<String, TransportSkin> tempMap = SkinRegistry.getTransportSkins(getClass());
            if(SkinRegistry.getTransportSkins(getClass())!=null){
                tempMap.remove("North Fox & Cascades (Yard Version)");
                tempMap.remove("North Fox & Cascades (Remote Control Version)");
                //tempMap.remove("mySkin"); //can clone this more
            }
            return tempMap;
        }
    }

}