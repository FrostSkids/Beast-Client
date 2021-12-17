// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModY extends ModDraggable
{
    public static String mainColor;
    public static boolean Chroma;
    
    public static String color() {
        if (ModY.mainColor == "pink") {
            return "§d";
        }
        if (ModY.mainColor == "blue") {
            return "§1";
        }
        if (ModY.mainColor == "red") {
            return "§c";
        }
        if (ModY.mainColor == "pink") {
            return "§d";
        }
        if (ModY.mainColor == "green") {
            return "§a";
        }
        if (ModY.mainColor == "cyan") {
            return "§b";
        }
        if (ModY.mainColor == "orange") {
            return "§6";
        }
        if (ModY.mainColor == "white") {
            return "§f";
        }
        if (ModY.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        return 38;
    }
    
    @Override
    public int getHeight() {
        return 10;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModPosition")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                GlStateManager.pushMatrix();
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(color() + "[§fY" + color() + "] " + "§f" + Math.round(Minecraft.getMinecraft().thePlayer.posY * 1000.0) / 1000L, (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                ChromaText.drawChromaString("[Y] " + Math.round(Minecraft.getMinecraft().thePlayer.posY * 1000.0) / 1000L, pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
    
    static {
        ModY.mainColor = "cyan";
        ModY.Chroma = false;
    }
}
