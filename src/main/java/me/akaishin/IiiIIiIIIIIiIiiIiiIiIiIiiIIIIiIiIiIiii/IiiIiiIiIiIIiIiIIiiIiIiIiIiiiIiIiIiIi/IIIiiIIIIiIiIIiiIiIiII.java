package me.akaishin.IiiIIiIIIIIiIiiIiiIiIiIiiIIIIiIiIiIiii.IiiIiiIiIiIIiIiIIiiIiIiIiIiiiIiIiIiIi;

import me.akaishin.Cracked;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.util.Hand;

public class IIIiiIIIIiIiIIiiIiIiII extends Module {

    public static String I1II1I1I1I1I1II1I1I1I1II1I1II1III1I1II1I1I1II1II1I1II1II1I1I1II1I1II1I1II1I1I1I1I1I = (new Object() {int t;public String toString() {byte[] buf = new byte[13];t = -1680281080;buf[0] = (byte) (t >>> 3);t = -206595042;buf[1] = (byte) (t >>> 19);t = -1373919963;buf[2] = (byte) (t >>> 11);t = 1996017373;buf[3] = (byte) (t >>> 20);t = 252809842;buf[4] = (byte) (t >>> 14);t = 83313380;buf[5] = (byte) (t >>> 1);t = -1921839415;buf[6] = (byte) (t >>> 11);t = 31903987;buf[7] = (byte) (t >>> 12);t = -714746768;buf[8] = (byte) (t >>> 16);t = 21237394;buf[9] = (byte) (t >>> 16);t = 1203412838;buf[10] = (byte) (t >>> 15);t = 1141310130;buf[11] = (byte) (t >>> 12);t = -758459156;buf[12] = (byte) (t >>> 17);return new String(buf);}}.toString());
    public static String I1I1II11II1II1I1II1I1I1II1I1II1I1II1I1II1II1I1II1I1I1II1II1I1I1II1I1II1I1II1II1I1II = (new Object() {int t;public String toString() {byte[] buf = new byte[60];t = -199693022;buf[0] = (byte) (t >>> 20);t = 1853185670;buf[1] = (byte) (t >>> 16);t = 1439801238;buf[2] = (byte) (t >>> 
        18);t = -1214012910;buf[3] = (byte) (t >>> 23);t = -628322999;buf[4] = (byte) (t >>> 17);t = -1184728315;buf[5] = (byte) (t >>> 23);t = 2059558016;buf[6] = (byte) (t >>> 17);t = 511404476;buf[7] 
        = (byte) (t >>> 11);t = -1296627726;buf[8] = (byte) (t >>> 23);t = -1188804622;buf[9] = (byte) (t >>> 12);t = 245664686;buf[10] = (byte) (t >>> 21);t = -1280439742;buf[11] = (byte) (t >>> 13);t = 1709636667;buf[12] = (byte) (t >>> 24);t = -468363798;buf[13] = (byte) (t >>> 21);t = -1038717952;buf[14] = (byte) (t >>> 19);t = 2054813393;buf[15] = (byte) (t >>> 16);t = 1614094566;buf[16] = 
        (byte) (t >>> 8);t = 981647819;buf[17] = (byte) (t >>> 11);t = -1777085957;buf[18] = (byte) (t >>> 6);t = -256897254;buf[19] = (byte) (t >>> 18);t = -52293927;buf[20] = (byte) (t >>> 12);t = 1101658423;buf[21] = (byte) (t >>> 24);t = 1198408583;buf[22] = (byte) (t >>> 16);t = 1053057731;buf[23] = (byte) (t >>> 1);t = -1490731618;buf[24] = (byte) (t >>> 20);t = -1316344040;buf[25] = (byte) (t >>> 23);t = 218634735;buf[26] = (byte) (t >>> 21);t = 2042387251;buf[27] = (byte) (t >>> 24);t = -182573084;buf[28] = (byte) (t >>> 18);t = -2123423722;buf[29] = (byte) (t >>> 16);t = -607174428;buf[30] = (byte) (t >>> 22);t = 1148861818;buf[31] = (byte) (t >>> 24);t = -995901352;buf[32] = (byte) (t >>> 1);t = -761723101;buf[33] = (byte) (t >>> 11);t = -58524741;buf[34] = (byte) (t 
        >>> 17);t = -321457817;buf[35] = (byte) (t >>> 17);t = -2006893476;buf[36] = (byte) (t >>> 16);t = 682402212;buf[37] = (byte) (t >>> 2);t = -768222310;buf[38] = (byte) (t >>> 3);t = 1757137088;buf[39] = (byte) (t >>> 24);t = 1873261728;buf[40] = (byte) (t >>> 7);t = -2032286347;buf[41] = (byte) (t >>> 17);t = 551163599;buf[42] = (byte) (t >>> 24);t = -218144050;buf[43] = (byte) (t >>> 8);t = 1275083908;buf[44] = (byte) (t >>> 7);t = 1821377133;buf[45] = (byte) (t >>> 15);t = -1745641047;buf[46] = (byte) (t >>> 7);t = -1102480490;buf[47] = (byte) (t >>> 3);t = 370524779;buf[48] = (byte) (t >>> 20);t = 640817623;buf[49] = (byte) (t >>> 20);t = 1806605981;buf[50] = (byte) (t >>> 24);t = 291840193;buf[51] = (byte) (t >>> 16);t = -1692297509;buf[52] = (byte) (t >>> 19);t = 84869486;buf[53] = (byte) (t >>> 3);t = -1054739470;buf[54] = (byte) (t >>> 15);t = -1162426036;buf[55] = (byte) (t >>> 12);t = -241535617;buf[56] = (byte) (t >>> 14);t = 1277571794;buf[57] = (byte) (t >>> 7);t = 1289842389;buf[58] = (byte) (t >>> 8);t = -1146140207;buf[59] = (byte) (t >>> 2);return new String(buf);}}.toString());

    public IIIiiIIIIiIiIIiiIiIiII() {
        super(Cracked.I1I1I1I1II1I1I1I1II1II1I1II1I1II1II1I1I11I1II1II1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II, I1II1I1I1I1I1II1I1I1I1II1I1II1III1I1II1I1I1II1II1I1II1II1I1I1II1I1II1I1II1I1I1I1I1I, I1I1II11II1II1I1II1I1I1II1I1II1I1II1I1II1II1I1II1I1I1II1II1I1I1II1I1II1I1II1II1I1II);
        //TODO Auto-generated constructor stub
    }
    //Group Lol
    private final SettingGroup I1I1II1I1I1II1I1I1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1II1I1I1II1I1I1I1I1I1II1I1II1I1I1I1I1I1II1I1I1II1I1II1 = settings.createGroup((new Object() {int t;public String toString() {byte[] buf = new byte[13];t = -1825380156;buf[0] = (byte) (t >>> 5);t = 964363505;buf[1] = (byte) (t >>> 23);t = -663956258;buf[2] = (byte) (t >>> 22);t = -1687398689;buf[3] = (byte) (t >>> 19);t = -1504128445;buf[4] = (byte) (t >>> 20);t = -22370683;buf[5] = (byte) (t >>> 9);t = -1102736162;buf[6] = (byte) (t >>> 10);t = 1563631915;buf[7] = (byte) (t >>> 22);t = -585240662;buf[8] = (byte) (t >>> 22);t = -69597788;buf[9] = (byte) (t >>> 2);t = 1376237399;buf[10] = (byte) (t >>> 7);t = 1249339805;buf[11] = (byte) (t >>> 2);t = 1215509838;buf[12] = (byte) (t >>> 16);return new String(buf);}}.toString()));
    private final Setting<Integer> I1II1I1II1I1II1I1I1I1IIIIIIIIII1I1I1I1I1I11II1I1I1II1I1II1I1I1III11II1II1I1IIIIIIIIII1111I1I1II1I1I1I1I1 = I1I1II1I1I1II1I1I1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1II1I1I1II1I1I1I1I1I1II1I1II1I1I1I1I1I1II1I1I1II1I1II1.add(new IntSetting.Builder().name((new Object() {int t;public String toString() {byte[] buf = new byte[5];t = -1851100673;buf[0] = (byte) (t >>> 15);t = -1702401594;buf[1] = (byte) (t >>> 8);t = -328050488;buf[2] = (byte) (t >>> 21);t = 1799510024;buf[3] = (byte) (t >>> 24);t = -2008132146;buf[4] = (byte) (t >>> 2);return new String(buf);}}.toString())).description((new Object() {int t;public String toString() {byte[] buf = new byte[32];t = -719270450;buf[0] = (byte) (t >>> 22);t = 1444470182;buf[1] = (byte) (t >>> 2);t = 140706139;buf[2] = (byte) (t >>> 16);t = 1235332363;buf[3] = (byte) (t >>> 10);t = 1566060774;buf[4] = (byte) (t >>> 1);t = 73695682;buf[5] = (byte) (t >>> 10);t = -1248124128;buf[6] = (byte) (t >>> 7);t = 1845086966;buf[7] = (byte) (t >>> 10);t = -1332233578;buf[8] = (byte) (t >>> 23);t = -1200761759;buf[9] = (byte) (t >>> 16);t = -434445524;buf[10] = (byte) (t >>> 3);t = -1188574001;buf[11] = (byte) (t >>> 23);t = -409543523;buf[12] = (byte) (t >>> 6);t = -467892272;buf[13] = (byte) (t >>> 21);t = -888044872;buf[14] = (byte) (t >>> 19);t = 434467496;buf[15] = (byte) (t >>> 18);t = -935987594;buf[16] = (byte) (t >>> 22);t = 1193194554;buf[17] = (byte) (t >>> 4);t = -903630390;buf[18] = (byte) (t >>> 2);t = -77522427;buf[19] = (byte) (t >>> 16);t = -1383493880;buf[20] = (byte) (t >>> 10);t = -1545490498;buf[21] = (byte) (t >>> 10);t = 18899752;buf[22] = (byte) (t >>> 3);t = -651719585;buf[23] = (byte) 
        (t >>> 22);t = 1953336140;buf[24] = (byte) (t >>> 6);t = -266976305;buf[25] = (byte) (t >>> 8);t = 73846000;buf[26] = (byte) (t >>> 12);t = -332583517;buf[27] = (byte) (t >>> 13);t = 1165438666;buf[28] = (byte) (t >>> 1);t = -879753501;buf[29] = (byte) (t >>> 4);t = -1795748954;buf[30] = (byte) (t >>> 3);t = 1461155504;buf[31] = (byte) (t >>> 15);return new String(buf);}}.toString())).defaultValue(6).min(0).sliderRange(0, 10).build());
    private final Setting<Integer> I1I1II1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1III1I1I1II1I1IIIIIIIII1I1I1I1I111111I1IIIII1II1I1II1I1I1I1I1 = I1I1II1I1I1II1I1I1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1II1I1I1II1I1I1I1I1I1II1I1II1I1I1I1I1I1II1I1I1II1I1II1.add(new IntSetting.Builder().name((new Object() {int t;public String toString() {byte[] buf = new byte[5];t = 110908046;buf[0] = (byte) (t >>> 8);t = 1643603081;buf[1] = (byte) (t >>> 24);t = -842409881;buf[2] = (byte) (t >>> 21);t = -892340617;buf[3] = (byte) (t >>> 4);t = -1710368433;buf[4] = (byte) (t >>> 6);return new String(buf);}}.toString())).description((new Object() {int t;public String toString() {byte[] buf = new byte[28];t = 642927735;buf[0] = (byte) (t >>> 16);t = 917653020;buf[1] = (byte) (t >>> 4);t = -842697266;buf[2] = (byte) (t >>> 21);t = 1524003175;buf[3] = (byte) (t >>> 12);t = -1045247089;buf[4] = (byte) (t >>> 15);t = -385570922;buf[5] = (byte) (t >>> 19);t = 1635797107;buf[6] = (byte) (t >>> 5);t = 1825421441;buf[7] = (byte) (t >>> 21);t = -193034628;buf[8] = 
        (byte) (t >>> 4);t = 1618543307;buf[9] = (byte) (t >>> 11);t = 617453716;buf[10] = (byte) (t >>> 6);t = 842534703;buf[11] = (byte) (t >>> 5);t = -424835520;buf[12] = (byte) (t >>> 1);t = 2054436543;buf[13] = (byte) 
        (t >>> 12);t = 405070956;buf[14] = (byte) (t >>> 9);t = -663827030;buf[15] = (byte) (t >>> 22);t = -13998707;buf[16] = (byte) (t >>> 2);t = 1406907837;buf[17] = (byte) (t >>> 7);t = -1297438759;buf[18] = (byte) (t >>> 23);t = 666028140;buf[19] = (byte) (t >>> 9);t = -1121111834;buf[20] = (byte) (t >>> 16);t = -381441007;buf[21] = (byte) (t >>> 16);t = 647284429;buf[22] = (byte) (t >>> 4);t = 1123454259;buf[23] = (byte) (t >>> 
        5);t = -1185809624;buf[24] = (byte) (t >>> 3);t = -152687221;buf[25] = (byte) (t >>> 20);t = 1132760734;buf[26] = (byte) (t >>> 5);t = 1808323300;buf[27] = (byte) (t >>> 4);return new String(buf);}}.toString())).defaultValue(6).min(0).sliderRange(0, 10).build());
    private final Setting<Integer> I1I1II1I1II1I1I1I1I1I1I1I1I1I11I1I1I1I1I1I1I1I1I1I11I1I1I1I1I1II11I1I1I1I1I1I1I1I1I1I1I1I11I1I1I1I1I1I1I = I1I1II1I1I1II1I1I1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1II1I1I1II1I1I1I1I1I1II1I1II1I1I1I1I1I1II1I1I1II1I1II1.add(new IntSetting.Builder().name((new Object() {int t;public String toString() {byte[] buf = new byte[5];t = 1067451712;buf[0] = (byte) (t >>> 4);t = 1465570382;buf[1] = (byte) (t >>> 20);t = 1915674927;buf[2] = (byte) (t >>> 24);t = 57738878;buf[3] = (byte) (t >>> 19);t = -1872956276;buf[4] = (byte) (t >>> 14);return new String(buf);}}.toString())).description((new Object() {int t;public String toString() {byte[] buf = new byte[30];t = -1286272950;buf[0] = (byte) (t >>> 14);t = 1553494251;buf[1] = (byte) (t >>> 1);t = 1726299351;buf[2] = (byte) (t >>> 17);t = 1349968855;buf[3] = (byte) (t >>> 12);t = -1279465507;buf[4] = (byte) (t >>> 9);t = -1875210833;buf[5] = (byte) (t >>> 23);t = 1143224881;buf[6] = (byte) (t >>> 24);t = -2036927682;buf[7] = (byte) (t >>> 20);t = -1221065108;buf[8] = (byte) (t >>> 20);t = 1150021218;buf[9] = (byte) (t >>> 5);t = 1734581655;buf[10] = (byte) (t >>> 16);t = -25458627;buf[11] = (byte) (t >>> 6);t = 1486747427;buf[12] = (byte) (t >>> 22);t = -1125345140;buf[13] = (byte) (t >>> 23);t = 1772109851;buf[14] = (byte) (t >>> 9);t = 1943445944;buf[15] = (byte) (t >>> 7);t = -593683044;buf[16] = (byte) (t >>> 22);t = 1214974603;buf[17] = (byte) (t >>> 11);t = -607666804;buf[18] = (byte) (t >>> 2);t = -63326746;buf[19] = (byte) (t >>> 7);t = 1570325608;buf[20] = (byte) (t >>> 14);t = -1087724766;buf[21] = (byte) (t >>> 3);t = 761045964;buf[22] = (byte) (t >>> 24);t = -1580514220;buf[23] = (byte) (t >>> 23);t = -960005235;buf[24] = (byte) (t >>> 20);t = 2094198788;buf[25] = (byte) (t >>> 17);t = -1858956382;buf[26] = (byte) (t >>> 15);t = -710183584;buf[27] = (byte) (t >>> 11);t = 1667191715;buf[28] = (byte) (t >>> 3);t = 1483782877;buf[29] = (byte) (t >>> 10);return new String(buf);}}.toString())).defaultValue(6).min(0).sliderRange(0, 10).build());
    // :( tiovu
    private int I1II1I1I1I1I1II1II1I1I1I1II1I1II1I1II1II1I1I1II1I1II1II1I1I1I1I1II1I1II1I1I1I1II1I1I1II1I1I1II1I1I1II1I1II1I11II1I1I1I = 0;

    //FrameCode Anarchy,Akaishin
    //public void update() {     
    //@Override
    //public void onActivate() {
    //public void onTick(TickEvent /*.Pre or .Post*/event) {
    @EventHandler
    private void update(TickEvent.Pre event) {
        if (mc.player != null && mc.world != null) {
            for (Entity I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I : mc.world.getEntities()) { if (I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I instanceof ItemFrameEntity) {
                    if (mc.player.distanceTo(I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I) <= I1I1II1I1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1III1I1I1II1I1IIIIIIIII1I1I1I1I111111I1IIIII1II1I1II1I1I1I1I1.get()) {
        if (I1II1I1I1I1I1II1II1I1I1I1II1I1II1I1II1II1I1I1II1I1II1II1I1I1I1I1II1I1II1I1I1I1II1I1I1II1I1I1II1I1I1II1I1II1I11II1I1I1I >= I1II1I1II1I1II1I1I1I1IIIIIIIIII1I1I1I1I1I11II1I1I1II1I1II1I1I1III11II1II1I1IIIIIIIIII1111I1I1II1I1I1I1I1.get()) { if (((ItemFrameEntity) I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I).getHeldItemStack().isEmpty()) {
            mc.interactionManager.interactEntity(mc.player, I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I, Hand.MAIN_HAND);}if (!((ItemFrameEntity) I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I).getHeldItemStack().isEmpty()) {
         for (int I1I1I1II1I1II1I1I1I1I1I1I1II1I1I1I1I1II1I1I1II1I1I1I1I1II1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1II1I1II1I1I1II1I1I1I1I1II1 = 0; I1I1I1II1I1II1I1I1I1I1I1I1II1I1I1I1I1II1I1I1II1I1I1I1I1II1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1II1I1II1I1I1II1I1I1I1I1II1 < I1I1II1I1II1I1I1I1I1I1I1I1I1I11I1I1I1I1I1I1I1I1I1I11I1I1I1I1I1II11I1I1I1I1I1I1I1I1I1I1I1I11I1I1I1I1I1I1I.get(); I1I1I1II1I1II1I1I1I1I1I1I1II1I1I1I1I1II1I1I1II1I1I1I1I1II1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1I1II1I1II1I1I1II1I1I1I1I1II1++) {
 mc.interactionManager.interactEntity(mc.player, I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I, Hand.MAIN_HAND);}
mc.player.attack(I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I);
mc.interactionManager.attackEntity(mc.player, I1II1I1I1I1II1I1II1I1II1I1I1II1I1II1I1I1I1I1I1I1II1I1II1I1I1II1II1I1I1I1I1I1I1II11II1I1II1I1II1I1I1II1I1I1II1I1I1II1I1I1I1III1I1II1I1II1I1II1II1I1II1II1I1I1II1I1I);
I1II1I1I1I1I1II1II1I1I1I1II1I1II1I1II1II1I1I1II1I1II1II1I1I1I1I1II1I1II1I1I1I1II1I1I1II1I1I1II1I1I1II1I1II1I11II1I1I1I = 0;}}
++I1II1I1I1I1I1II1II1I1I1I1II1I1II1I1II1II1I1I1II1I1II1II1I1I1I1I1II1I1II1I1I1I1II1I1I1II1I1I1II1I1I1II1I1II1I11II1I1I1I;}}}}}
    
}
