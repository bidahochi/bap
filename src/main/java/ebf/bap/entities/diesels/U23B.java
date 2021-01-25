package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelU23b;
import ebf.bap.models.trucks.ModelFB2;
import ebf.bap.models.trucks.ModelTypeB;
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

public class U23B extends EntityTrainCore {

    public U23B(World worldObj) {
        super(worldObj);
    }

    public U23B(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new U23B((World)null), BAP.MODID, BAP.creativeTabDiesel);


    //main stats
    @Override
    public String transportName(){return "U23B";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1968-1977";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 109769f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelU23b()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, 0.0f, 0.0f}};}//-1.7, 0.15
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_SBD.png","textures/bogies/typeb_Black.png","Seaboard System", "description.u23b.sbd");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_SBD2.png","textures/bogies/fb2_Black.png","Seaboard Coast Line", "description.u23b.sbd2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_MILW.png","textures/bogies/fb2_Black.png","Milwaukee Road", "description.u23b.milw");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_Furrx.png","textures/bogies/fb2_Black.png","FurrX", "description.u23b.furrx");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_FurrxB.png","textures/bogies/fb2_Black.png","FurrX B Unit", "description.u23b.furrxb");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_ATSF.png","textures/bogies/typeb_Black.png","ATSF Pinstripe", "description.u23b.atsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_ATSF2.png","textures/bogies/typeb_LightGrey.png","ATSF Freightbonnet", "description.u23b.atsf2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_CR.png","textures/bogies/typeb_Black.png","Conrail", "description.u23b.cr");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_SOU.png","textures/bogies/fb2_Black.png","Southern", "description.u23b.sou");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_NS.png","textures/bogies/typeb_Black.png","Norfolk Southern", "description.u23b.ns");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_MKT.png","textures/bogies/typeb_Black.png","Missouri–Kansas–Texas", "description.u23b.mkt");
       /* SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/u23b_MTS.png","textures/bogies/typeb_Black.png","Messicrew Tenneva & Southern", "description.u23b.mts");*/


    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Seaboard System";
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
    public float[][] getRiderOffsets(){return new float[][]{{-1.7f,1.3f, -0.3f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{5.500000047683716f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.5f, -1.5f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin().name.equals("Milwaukee Road") || getCurrentSkin().name.equals("FurrX")|| getCurrentSkin().name.equals("FurrX B Unit")
                || getCurrentSkin().name.equals("Southern")|| getCurrentSkin().name.equals("Seaboard Coast Line")) {
            return new Bogie[]{new Bogie(new ModelFB2(),1.55f,0f,0f),
                    new Bogie(new ModelFB2(),-1.55f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.55f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.55f,0f,0f)};
        }
    }

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2250;}
    @Override
    public float transportTopSpeed(){return 70;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{7000};}

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