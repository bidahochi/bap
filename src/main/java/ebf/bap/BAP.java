package ebf.bap;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import ebf.bap.entities.freight.*;
import ebf.bap.entities.diesels.*;
import ebf.bap.entities.electrics.*;
import ebf.bap.entities.steamers.*;
import ebf.bap.entities.others.*;
import ebf.bap.entities.passengers.*;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;

@Mod(modid = BAP.MODID, version = BAP.MOD_VERSION, name = "Bida's American Pack for TiM")
public class BAP {
    public static final String MODID = "bap4tim";
    public static final String MOD_VERSION = "0.04_work-in-progress";

    private static ItemTransport tabItem;

    public static TiMTab creativeTabDiesel;
    public static TiMTab creativeTabSteam;
    public static TiMTab creativeTabElectric;
    public static TiMTab creativeTabFreight;
    public static TiMTab creativeTabPassenger;
    public static TiMTab creativeTabOther;

    @Mod.Instance(MODID)
    public static BAP instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        creativeTabDiesel = new TiMTab("bap-diesel", tabItem);
        creativeTabSteam = new TiMTab("bap-steam", tabItem);
        creativeTabElectric = new TiMTab("bap-electric", tabItem);
        creativeTabFreight = new TiMTab("bap-freight", tabItem);
        creativeTabPassenger = new TiMTab("bap-passenger", tabItem);
        creativeTabOther = new TiMTab("bap-other", tabItem);

        creativeTabDiesel.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new AlcoS2(null), MODID, null)
                , MODID, "tab.bapfortimdiesel.name", null, null, null, null);

        creativeTabSteam.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new Tankenstein(null), MODID, null)
                , MODID, "tab.bapfortimsteam.name", null, null, null, null);

        creativeTabElectric.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new EF1(null), MODID, null)
                , MODID, "tab.bapfortimelectric.name", null, null, null, null);

        creativeTabFreight.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new PS160(null), MODID, null)
                , MODID, "tab.bapfortimfreight.name", null, null, null, null);

        creativeTabPassenger.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new PEcoach(null), MODID, null)
                , MODID, "tab.bapfortimpassenger.name", null, null, null, null);

        creativeTabOther.tabItem = tabItem = (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new BombCart(null), MODID, null)
                , MODID, "tab.bapfortimother.name", null, null, null, null);

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){
        TiMGenericRegistry.registerTransports(MODID, listDiesel(), null);
        TiMGenericRegistry.registerTransports(MODID, listSteam(), null);
        TiMGenericRegistry.registerTransports(MODID, listElectric(), null);
        TiMGenericRegistry.registerTransports(MODID, listFreight(), null);
        TiMGenericRegistry.registerTransports(MODID, listPassenger(), null);
        TiMGenericRegistry.registerTransports(MODID, listOther(), null);
    }

    public static GenericRailTransport[] listDiesel() {

        return new GenericRailTransport[]{new AlcoS2(null), new CF7(null), new U23B(null), new B23(null),
                new C424(null), new C425(null), new SW1(null), new SW1500(null), new U36C(null),
                new VO1000(null), new H1044(null), new SD9(null), new GP7(null), new GP7b(null),
                new GP7u(null), new GP9(null), new GP15(null), new GP30(null), new GP38dash2(null),
                new MP15DCW9(null), new NRE3gs21b(null), new HH660(null), new GE25Ton(null), new SW1200(null),
                new SD40dash2(null), new SD40T2(null), new ML4000(null), new Dash8_40B(null), new Dash8_40B_B(null),
                new Dash8_40BW(null), new Beep(null), new F45(null), new FP45(null), new SDP40F(null),
                new Dash8_40C(null), new SB23R(null), new SD70Ace(null)};
    }

    public static GenericRailTransport[] listSteam() {

        return new GenericRailTransport[]{new Tankenstein(null)};
    }

    public static GenericRailTransport[] listElectric() {

        return new GenericRailTransport[]{new EF1(null), new GM6C(null), new EP1A(null)};
    }

    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{new PS160(null), new PS150(null), new PS140(null),
                new Highcube40foot(null), new OWO60Verticube(null), new MILW40boxcar(null),
                new DOT11111000(null), new DOT11120600(null), new DOT11129080(null), new MechanicalReefer64(null),
                new VersaLongi(null), new VersaTrans(null), new WoodchipHopper(null), new MillGondola(null),
                new OreJenny(null), new HuskyStack53Wellcar(null), new Centerbeam60ft(null), new Centerbeam66ft(null),
                new Centerbeam73ft(null), new Hopper5201(null), new Hopper6260(null)};
    }

    public static GenericRailTransport[] listPassenger() {
        return new GenericRailTransport[]{new PEcoach(null), new PEobserve(null), new BilevelCoach(null),
               new BilevelCab(null), new PS_lightweight_52seat_coach(null)};
    }

    public static GenericRailTransport[] listOther() {
        return new GenericRailTransport[]{new BombCart(null), new WVcaboose(null), new DRGW01400Caboose(null), new TESTING_SB23R(null)};
    }

}
