package ebf.bap.entities.others;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.bap.BAP;
import ebf.bap.models.rollingstock.ModelDRGW01400Caboose;
import ebf.bap.models.trucks.Modelcaboosetruck;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class DRGW01400Caboose extends GenericRailTransport {

    public DRGW01400Caboose(World worldObj) {
        super(worldObj);
    }

    public DRGW01400Caboose(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new DRGW01400Caboose((World)null),  BAP.MODID, BAP.creativeTabOther);

    //main stats
    @Override
    public String transportName(){return "DRGW01400Caboose";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1940-1959";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 21999f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelDRGW01400Caboose()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//-0.1675
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_early_01400-01449.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (early) 01400-01449", "description.drgw01400.1");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_01450.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW 01450", "description.drgw01400.2");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_01451-01459.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW 01451-01459", "description.drgw01400.3");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_early-mid_01400-01449.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (early mid) 01400-01449", "description.drgw01400.4");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_mid_01440-01469.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (mid) 01440-01469", "description.drgw01400.5");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_mid_01407-01439.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (mid) 01407-01439", "description.drgw01400.6");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW _01400_late-mid_01400-01406.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (late mid) 01400-01406", "description.drgw01400.7");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_mid_01470-01479.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW (mid) 01470-01479", "description.drgw01400.8");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_four-stripe.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW 01400 series four stripe", "description.drgw01400.9");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW 01400_one-stripe.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW 01400 series one stripe", "description.drgw01400.10");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_orange.png","textures/bogiesCaboose_truck_Black_left-generator.png","D&RGW 01400 series orange caboose", "description.drgw01400.11");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_one-stripe_removed-windows.png","textures/bogies/Caboose_truck_Black_journal_boxes.png","D&RGW 01400 series one stripe removed windows caboose", "description.drgw01400.12");
        SkinRegistry.addSkin(this.getClass(),
                BAP.MODID,"textures/others/stupid_drgw_caboose_shit/BAP_D&RGW_01400_orange_removed-windows.png","textures/bogies/Caboose_truck_Black_left-generator.png","D&RGW 01400 series orange removed windows caboose", "description.drgw01400.13");
    }
    @Override
    public String getDefaultSkin(){
        return  BAP.MODID+":"+"D&RGW 01400 series four stripe";
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
    public float[][] getRiderOffsets(){return new float[][]{{1.05f,1.5f, 0.45f},{1.05f,1.5f, -0.45f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{4.6f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{1.25f, -1.25f};}
    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new Modelcaboosetruck(), 1.25f,-0.0f,0.0f),
                new Bogie(new Modelcaboosetruck(),-1.25f,-0.0f,0.0f),
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