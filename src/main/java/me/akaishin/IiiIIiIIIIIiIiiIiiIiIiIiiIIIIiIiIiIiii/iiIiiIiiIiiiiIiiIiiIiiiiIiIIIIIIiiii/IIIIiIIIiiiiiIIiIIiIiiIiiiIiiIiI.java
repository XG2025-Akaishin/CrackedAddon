package me.akaishin.IiiIIiIIIIIiIiiIiiIiIiIiiIIIIiIiIiIiii.iiIiiIiiIiiiiIiiIiiIiiiiIiIIIIIIiiii;

import me.akaishin.Cracked;
import meteordevelopment.meteorclient.renderer.GL;
import meteordevelopment.meteorclient.renderer.Renderer2D;
import meteordevelopment.meteorclient.settings.*;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;
import net.minecraft.util.Identifier;

public class IIIIiIIIiiiiiIIiIIiIiiIiiiIiiIiI extends HudElement {
    public static final HudElementInfo<IIIIiIIIiiiiiIIiIIiIiiIiiiIiiIiI> I1II1I1I1I1II1I1II1II1I1II1I1I1I1II1I1II1I1I1II1I1III1I1I1II1I1II1I1I11I1II1I1II1I1I1I1II1I1I1II1I1II1I1II1I1I1I1II1II1I1 = new HudElementInfo<>(Cracked.I1I1I1I1I1II1I1I1I11II1II1I1II1I1I1I1II1I1I1I1I1II1I1I1I1I1II1I1I1I1I1I1I1I1I1II1I1I1I1II1, (new Object() {int t;public String toString() {byte[] buf = new byte[5];t = 1935867061;buf[0] = (byte) (t >>> 24);t = 1251155237;buf[1] = (byte) (t >>> 11);t = -1581152464;buf[2] = (byte) (t >>> 10);t = 1527039767;buf[3] = (byte) (t >>> 22);t = -231820602;buf[4] = (byte) (t >>> 7);return new String(buf);}}.toString()), (new Object() {int t;public String toString() {byte[] buf = new byte[37];t = -1435732110;buf[0] = (byte) (t >>> 21);t = 727935136;buf[1] = (byte) (t >>> 8);t = -2066423892;buf[2] = (byte) (t >>> 9);t = -1360499786;buf[3] = (byte) (t >>> 21);t = 2073601562;buf[4] = (byte) (t >>> 19);t = 1027005569;buf[5] = (byte) (t >>> 2);t = -1621765790;buf[6] = (byte) (t >>> 10);t = 876816056;buf[7] = (byte) (t >>> 23);t = 1915328475;buf[8] 
        = (byte) (t >>> 10);t = 523306603;buf[9] = (byte) (t >>> 11);t = 1079327548;buf[10] = (byte) (t >>> 10);t = 518703247;buf[11] = (byte) (t >>> 17);t = -211164266;buf[12] = (byte) (t >>> 19);t = 103107385;buf[13] = (byte) (t >>> 20);t = 1206859139;buf[14] = (byte) (t >>> 13);t = -259861991;buf[15] = (byte) (t >>> 18);t = 1738837919;buf[16] = (byte) (t >>> 12);t = -1328743665;buf[17] = (byte) (t >>> 23);t = -734580297;buf[18] = (byte) (t >>> 7);t = -957295101;buf[19] = (byte) (t >>> 9);t = -509198272;buf[20] = (byte) (t >>> 9);t = 1812263413;buf[21] = (byte) (t >>> 24);t = 1871051914;buf[22] = (byte) (t >>> 24);t = 1737259346;buf[23] = (byte) (t >>> 24);t = -1876618371;buf[24] = (byte) (t >>> 3);t = 813273098;buf[25] = (byte) (t >>> 7);t = 1315099491;buf[26] = (byte) (t >>> 9);t = -1203053090;buf[27] = (byte) (t >>> 9);t = 505547055;buf[28] = (byte) (t >>> 12);t = -1340650114;buf[29] = (byte) (t >>> 12);t = 1830595549;buf[30] = (byte) (t >>> 21);t = 1196936370;buf[31] = (byte) (t >>> 5);t = -1710618047;buf[32] = (byte) (t >>> 1);t = 938774551;buf[33] = (byte) (t >>> 9);t = -1179757115;buf[34] = (byte) (t >>> 8);t = 1142270766;buf[35] = (byte) (t >>> 24);t = 1259049654;buf[36] = (byte) (t >>> 14);return new String(buf);}}.toString()), IIIIiIIIiiiiiIIiIIiIiiIiiiIiiIiI::new);

    private final SettingGroup I11I1II11II1I1II1I1I1II1I1II1I1II1I1I1I1II1I1I1I1I1I1II1I1I1I1I1II1I1I1I1II1I1I1I1II1I1I1I1I1II1IIIIIII1I1II1II1IIII1I1II111 = settings.getDefaultGroup();

    private final Setting<Double> I1II1I1I1I1II1I1II1I1II1I1II1I1I1II1II1II1I1II1I1I1II1I1I1II1II1I1II1I111II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1II1I1I1II1 = I11I1II11II1I1II1I1I1II1I1II1I1II1I1I1I1II1I1I1I1I1I1II1I1I1I1I1II1I1I1I1II1I1I1I1II1I1I1I1I1II1IIIIIII1I1II1II1IIII1I1II111.add(new DoubleSetting.Builder().name("scale").description("The scale of the logo.").defaultValue(3).min(0.1).sliderRange(0.1, 10).build()
    );

    public IIIIiIIIiiiiiIIiIIiIiiIiiiIiiIiI() {
        super(I1II1I1I1I1II1I1II1II1I1II1I1I1I1II1I1II1I1I1II1I1III1I1I1II1I1II1I1I11I1II1I1II1I1I1I1II1I1I1II1I1II1I1II1I1I1I1II1II1I1);
    }

    private final Identifier I1I1II1I1II1I1II1I1II1I1II1I1II1II1I1II1I1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1I1II1I1II1I1I1II1I1 = new Identifier("cracked-addon", "textures/icon.png");

    @Override
    public void tick(HudRenderer I1I1I1II1I1II1I1II1II1II1II1I1II1II1I1II1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1II1I1II1I1I1II1I) {box.setSize(64 * I1II1I1I1I1II1I1II1I1II1I1II1I1I1II1II1II1I1II1I1I1II1I1I1II1II1I1II1I111II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1II1I1I1II1.get(), 64 * I1II1I1I1I1II1I1II1I1II1I1II1I1I1II1II1II1I1II1I1I1II1I1I1II1II1I1II1I111II1I1I1II1I1II1I1I1II1I1I1I1II1I1II1I1II1I1I1II1.get());
    }

    @Override
    public void render(HudRenderer I1I1II1I1I1II1I1II1I1II1I1II1I1I1II1I1II1II1II1I1II1I1II1I1II1I1I1II1I1II1I1I1I1II1I1II1I1II1) {GL.bindTexture(I1I1II1I1II1I1II1I1II1I1II1I1II1II1I1II1I1I1II1I1II1I1II1I1II1I1II1I1I1II1I1II1I1I1II1I1I1II1I1II1I1I1II1I1);Renderer2D.TEXTURE.begin();Renderer2D.TEXTURE.texQuad(this.x, this.y, this.getWidth(), this.getHeight(), Color.WHITE);Renderer2D.TEXTURE.render(null);
    }
}