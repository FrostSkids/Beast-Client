// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Date;
import java.text.SimpleDateFormat;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModTimeShow extends ModDraggable
{
    public static String mainColor;
    
    public static String color() {
        if (ModTimeShow.mainColor == "pink") {
            return "§d";
        }
        if (ModTimeShow.mainColor == "blue") {
            return "§1";
        }
        if (ModTimeShow.mainColor == "red") {
            return "§c";
        }
        if (ModTimeShow.mainColor == "pink") {
            return "§d";
        }
        if (ModTimeShow.mainColor == "green") {
            return "§a";
        }
        if (ModTimeShow.mainColor == "cyan") {
            return "§b";
        }
        if (ModTimeShow.mainColor == "orange") {
            return "§6";
        }
        if (ModTimeShow.mainColor == "white") {
            return "§f";
        }
        if (ModTimeShow.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        return ModTimeShow.font.getStringWidth("Time: AA:AA:AA AA ");
    }
    
    @Override
    public int getHeight() {
        return ModTimeShow.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModTimeShow")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                final String pattern = "hh:mm:ss a ";
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                final String time = simpleDateFormat.format(new Date());
                GlStateManager.pushMatrix();
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(color() + "[ " + "§fClock: " + time + color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                final String pattern = "hh:mm:ss a ";
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                final String time = simpleDateFormat.format(new Date());
                ChromaText.drawChromaString("[ Clock: " + time + "]", pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
    
    static {
        ModTimeShow.mainColor = "cyan";
    }
}
