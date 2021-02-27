package ebf.bap.entities.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.locomotives.ModelB23dash7;
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

public class B23 extends EntityTrainCore {

    public B23(World worldObj) {
        super(worldObj);
    }

    public B23(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new B23((World)null), BAP.MODID, BAP.creativeTabDiesel);

    //main stats
    @Override
    public String transportName(){return "B23-7";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1977-1984";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 114759f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelB23dash7()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-0f, -0.0f, 0.0f}};}//-1.7, -1.155
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_UP.png","textures/bogies/fb2_up.png","Union Pacific", "description.b23dash7.up");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_ATSF_red.png","textures/bogies/typeb_LightGrey.png","Atchison Topeka & Santa Fe Kodachrome", "description.b23dash7.atsfred");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_ATSF_blu.png","textures/bogies/fb2_Grey.png","Atchison Topeka & Santa Fe Freightbonnet", "description.b23dash7.atsfblu");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_Furrx.png","textures/bogies/typeb_Black.png","FurrX", "description.b23dash7.furrx");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_Beansniff.png","textures/bogies/typeb_bnsf_h1.png","Burlington Northern Santa Fe H1", "description.b23dash7.bnsf");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_Beansniff_furrbi.png","textures/bogies/typeb_bnsf_h1.png","BNSF FurrX Patch", "description.b23dash7.furrx2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/diesels/b23_bnl.png","textures/bogies/fb2_Black.png","Buy N Large Lines", "description.b23dash7.bnl");
    }
    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"Union Pacific";
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

    //ModelFB2 fb2 = new ModelFB2();
    //ModelTypeB typeB = new ModelTypeB();

    /*@SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        return new Bogie[]{
                new Bogie(new ModelFB2(), 1.55f,0f,0f),
                new Bogie(new ModelFB2(),-1.55f,0f,0f),
        };
    }*/
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){

        if(getCurrentSkin()==null || getCurrentSkin().name.equals("Atchison Topeka & Santa Fe Kodachrome") || getCurrentSkin().name.equals("FurrX")
                || getCurrentSkin().name.equals("Burlington Northern Santa Fe H1") || getCurrentSkin().name.equals("BNSF FurrX Patch")) {
            return new Bogie[]{new Bogie(new ModelTypeB(),1.55f,0f,0f),
                    new Bogie(new ModelTypeB(),-1.55f,0f,0f)};
        } else {
            return new Bogie[]{new Bogie(new ModelFB2(),1.55f,0f,0f),
                    new Bogie(new ModelFB2(),-1.55f,0f,0f)};
        }
    }
    /*@SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        if(getCurrentSkin().name.equals("Atchison Topeka & Santa Fe Kodachrome")) {
                new Bogie(typeB, 1.55f, 0f, 0f),
                new Bogie(typeB, -1.55f, 0f, 0f),
        }
    }*/

    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 2250;}
    @Override
    public float transportTopSpeed(){return 90;}
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

   /* @SideOnly(Side.CLIENT)
    public int[] getParticleData(int id){

        if(getCurrentSkin().name.equals("Atchison Topeka & Santa Fe Kodachrome")){

            /*switch (id){
                case 0:{return new int[]{0, 100, 0x232323};}//disable ID 0
            }*/
        /*}

        //defaults
        switch (id){
            case 0:{return new int[]{3, 100, 0x232323};}//smoke
            case 1:{return new int[]{5, 100, 0x232323};}//heavy smoke
            case 2:{return new int[]{2, 100, 0xEEEEEE};}//steam
            case 3:{return new int[]{6, 100, 0xCECDCB};}//led lamp
            case 4:{return new int[]{3, 50, 0xCC0000};}//reverse lamp
            case 5:{return new int[]{3, 10, 0xCCCC00};}//small sphere lamp

            default:{return new int[]{5, 100, 0xCCCC00};}//lamp
        }
    }*/
}