package ebf.bap;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.bap.entities.diesels.AlcoS2;
import ebf.bap.entities.diesels.CF7;
import ebf.bap.entities.electrics.EF1;
import ebf.bap.entities.freight.*;
import ebf.bap.entities.passengers.PEcoach;
import ebf.bap.entities.passengers.PEobserve;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;

@Mod(modid = BAP.MODID, version = BAP.MOD_VERSION, name = "Bida's American Pack for TiM")
public class BAP {
    public static final String MODID = "bap4tim";
    public static final String MOD_VERSION = "0.01_pre-alpha";

    private static ItemTransport tabItem;

    public static TiMTab creativeTabDiesel;
    public static TiMTab creativeTabSteam;
    public static TiMTab creativeTabElectric;
    public static TiMTab creativeTabFreight;
    public static TiMTab creativeTabPassenger;

    @Mod.Instance(MODID)
    public static BAP instance;


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        creativeTabDiesel = new TiMTab("bap-diesel", tabItem);
        creativeTabSteam = new TiMTab("bap-steam", tabItem);
        creativeTabElectric = new TiMTab("bap-electric", tabItem);
        creativeTabFreight = new TiMTab("bap-freight", tabItem);
        creativeTabPassenger = new TiMTab("bap-passenger", tabItem);

        TiMGenericRegistry.registerTransports(MODID, listDiesel(), null);
       // TiMGenericRegistry.registerTransports(MODID, listSteam(), null);
        TiMGenericRegistry.registerTransports(MODID, listElectric(), null);
        TiMGenericRegistry.registerTransports(MODID, listFreight(), null);
        TiMGenericRegistry.registerTransports(MODID, listPassenger(), null);

        creativeTabDiesel.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new AlcoS2(null), MODID, null)
                , MODID, "tab.bapfortimdiesel.name", null, null, null, null);

        creativeTabSteam.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new AlcoS2(null), MODID, null)
                , MODID, "tab.bapfortimsteam.name", null, null, null, null);

        creativeTabElectric.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new AlcoS2(null), MODID, null)
                , MODID, "tab.bapfortimelectric.name", null, null, null, null);

        creativeTabFreight.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new PS160(null), MODID, null)
                , MODID, "tab.bapfortimfreight.name", null, null, null, null);

        creativeTabPassenger.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new PEcoach(null), MODID, null)
                , MODID, "tab.bapfortimpassenger.name", null, null, null, null);

    }

    public static GenericRailTransport[] listDiesel() {

        return new GenericRailTransport[]{new AlcoS2(null), new CF7(null)};
    }

    public static GenericRailTransport[] listSteam() {
        return new GenericRailTransport[]{new AlcoS2(null), new AlcoS2(null),
        new AlcoS2(null)};
    }

    public static GenericRailTransport[] listElectric() {
        return new GenericRailTransport[]{new EF1(null)};
    }

    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{new PS160(null)/*, new PS160(null), new PS160(null)*/};
    }

    public static GenericRailTransport[] listPassenger() {
        return new GenericRailTransport[]{new PEcoach(null), new PEobserve(null)};
    }

}
