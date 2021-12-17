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

public class ModFPS extends ModDraggable
{
    public static String mainColor;
    
    public static String color() {
        if (ModFPS.mainColor == "pink") {
            return "§d";
        }
        if (ModFPS.mainColor == "blue") {
            return "§1";
        }
        if (ModFPS.mainColor == "red") {
            return "§c";
        }
        if (ModFPS.mainColor == "pink") {
            return "§d";
        }
        if (ModFPS.mainColor == "green") {
            return "§a";
        }
        if (ModFPS.mainColor == "cyan") {
            return "§b";
        }
        if (ModFPS.mainColor == "orange") {
            return "§6";
        }
        if (ModFPS.mainColor == "white") {
            return "§f";
        }
        if (ModFPS.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        return 50;
    }
    
    @Override
    public int getHeight() {
        return ModFPS.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModFPS")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                GlStateManager.pushMatrix();
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(color() + "[§fFps: " + Minecraft.getDebugFPS() + color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                final StringBuilder append = new StringBuilder().append("[FPS: ");
                final Minecraft mc = this.mc;
                ChromaText.drawChromaString(append.append(Minecraft.getDebugFPS()).append("]").toString(), pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
    
    static {
        ModFPS.mainColor = "cyan";
    }
}
