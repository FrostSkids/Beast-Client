// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

import java.awt.Color;
import net.minecraft.client.Minecraft;

public class ChromaText
{
    public static void drawChromaString(final String string, final int x, final int y, final boolean shadow) {
        final Minecraft mc = Minecraft.getMinecraft();
        int xTmp = x;
        for (final char textChar : string.toCharArray()) {
            final long l = System.currentTimeMillis() - (xTmp * 10 - y * 10);
            final int i = Color.HSBtoRGB(l % 2000L / 2000.0f, 0.8f, 0.8f);
            final String tmp = String.valueOf(textChar);
            mc.fontRendererObj.drawString(tmp, (float)xTmp, (float)y, i, shadow);
            xTmp += mc.fontRendererObj.getCharWidth(textChar);
        }
    }
}
