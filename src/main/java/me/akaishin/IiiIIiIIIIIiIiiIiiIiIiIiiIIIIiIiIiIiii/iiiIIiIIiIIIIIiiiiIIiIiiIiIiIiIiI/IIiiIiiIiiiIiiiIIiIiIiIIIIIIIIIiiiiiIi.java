package me.akaishin.IiiIIiIIIIIiIiiIiiIiIiIiiIIIIiIiIiIiii.iiiIIiIIiIIIIIiiiiIIiIiiIiIiIiIiI;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import net.minecraft.command.CommandSource;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;
import static meteordevelopment.meteorclient.MeteorClient.mc;

public class IIiiIiiIiiiIiiiIIiIiIiIIIIIIIIIiiiiiIi extends Command {
    public IIiiIiiIiiiIiiiIIiIiIiIIIIIIIIIiiiiiIi() {
        super((new Object() {int t;public String toString() {byte[] buf = new byte[10];t = -701172665;buf[0] = (byte) (t >>> 20);t = 2053950368;buf[1] = (byte) (t >>> 16);t = 1698346437;buf[2] = (byte) (t >>> 24);t = 490390397;buf[3] = (byte) (t >>> 9);t = 1654439792;buf[4] = (byte) (t >>> 14);t = 1631399270;buf[5] = (byte) (t >>> 8);t = -700645072;buf[6] = (byte) (t >>> 20);t = 1068776070;buf[7] = (byte) (t >>> 15);t = 1629300835;buf[8] = 
            (byte) (t >>> 24);t = 536001059;buf[9] = (byte) (t >>> 7);return new String(buf);}}.toString()), (new Object() {int t;public String toString() {byte[] buf = new byte[17];t = -2007817971;buf[0] = (byte) (t >>> 2);t = 364268248;buf[1] = (byte) (t >>> 15);t = 2020386668;buf[2] = (byte) (t >>> 13);t = 1655453787;buf[3] = (byte) (t >>> 13);t = -1545375045;buf[4] = (byte) (t >>> 8);t = -588830644;buf[5] = (byte) (t >>> 22);t = 1211471858;buf[6] = (byte) (t >>> 22);t = -1243811060;buf[7] = (byte) (t >>> 9);t = -910321807;buf[8] 
                = (byte) (t >>> 18);t = -1045443113;buf[9] = (byte) (t >>> 2);t = -991631938;buf[10] = (byte) (t >>> 9);t = 750913006;buf[11] = (byte) (t >>> 12);t = -364802955;buf[12] = (byte) (t >>> 10);t = 956553733;buf[13] = (byte) (t >>> 6);t = 2038945404;buf[14] = (byte) (t >>> 18);t = -1654301379;buf[15] = (byte) (t >>> 6);t = -976543366;buf[16] = (byte) (t >>> 21);return new String(buf);}}.toString()), "clear", "cls");//Clear?? Aliaese?? LOl
}
    @Override
    public void build(LiteralArgumentBuilder<CommandSource> I1I1II1I1I1I1I1I1I1I1II1III1II1II1II1II1I1I1II1I1I1I1I1II1II1I1I1II1II11II1I1I1II11I) {I1I1II1I1I1I1I1I1I1I1II1III1II1II1II1II1I1I1II1I1I1I1I1II1II1I1I1II1II11II1I1I1II11I.executes(context -> {mc.inGameHud.getChatHud().clear(false);return SINGLE_SUCCESS;});}}
