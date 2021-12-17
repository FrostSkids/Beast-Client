// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import net.minecraft.client.renderer.GlStateManager;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModPing extends ModDraggable
{
    public static String mainColor;
    
    public static String color() {
        if (ModPing.mainColor == "pink") {
            return "§d";
        }
        if (ModPing.mainColor == "blue") {
            return "§1";
        }
        if (ModPing.mainColor == "red") {
            return "§c";
        }
        if (ModPing.mainColor == "pink") {
            return "§d";
        }
        if (ModPing.mainColor == "green") {
            return "§a";
        }
        if (ModPing.mainColor == "cyan") {
            return "§b";
        }
        if (ModPing.mainColor == "orange") {
            return "§6";
        }
        if (ModPing.mainColor == "white") {
            return "§f";
        }
        if (ModPing.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        return ModPing.font.getStringWidth("Ping: " + Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime());
    }
    
    @Override
    public int getHeight() {
        return ModPing.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModPing")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                GlStateManager.pushMatrix();
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(color() + "[§fPing: " + Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime() + color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                ChromaText.drawChromaString("[Ping: " + Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime() + "]", pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
    
    static {
        ModPing.mainColor = "cyan";
    }
}
