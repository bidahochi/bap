package ebf.bap.entities.others;

import ebf.bap.BAP;
import ebf.bap.models.ModelBombCart;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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

public class BombCart extends GenericRailTransport {

    public BombCart(World worldObj) {
        super(worldObj);
    }

    public BombCart(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new BombCart((World)null), BAP.MODID, BAP.creativeTabOther);


    //main stats
    @Override
    public String transportName(){return "Payload";}
    @Override
    public String transportcountry(){return "North America";}
    @Override
    public String transportYear(){return "1968";}
    @Override
    public boolean isFictional(){return true;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 621f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelBombCart()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, -0.0f, 0.0f}};}//-0.15
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),
            new TransportSkin(BAP.MODID,"textures/others/payload_BLU.png","BLU Team", "description.payload.blu"));
        SkinRegistry.addSkin(this.getClass(),
                new TransportSkin(BAP.MODID,"textures/others/payload_RED.png","RED Team", "description.payload.red"));
    }

    @Override
    public String getDefaultSkin(){
        return BAP.MODID+":"+"BLU Team";
    }

    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null, new ItemStack(Blocks.tnt, 32), new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.iron_ingot, 1)        };
    }

    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.3f,1.5f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{2.0f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.800000011920929f, -0.800000011920929f};}



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
    public String[] additionalItemText() {
        return new String[]{"Entire Team is Babies!"};
    }
}