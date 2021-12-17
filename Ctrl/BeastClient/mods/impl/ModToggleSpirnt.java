// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModToggleSpirnt extends ModDraggable
{
    public static String mainColor;
    
    public static String color() {
        if (ModToggleSpirnt.mainColor == "pink") {
            return "§d";
        }
        if (ModToggleSpirnt.mainColor == "blue") {
            return "§1";
        }
        if (ModToggleSpirnt.mainColor == "red") {
            return "§c";
        }
        if (ModToggleSpirnt.mainColor == "pink") {
            return "§d";
        }
        if (ModToggleSpirnt.mainColor == "green") {
            return "§a";
        }
        if (ModToggleSpirnt.mainColor == "cyan") {
            return "§b";
        }
        if (ModToggleSpirnt.mainColor == "orange") {
            return "§6";
        }
        if (ModToggleSpirnt.mainColor == "white") {
            return "§f";
        }
        if (ModToggleSpirnt.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        return ModToggleSpirnt.font.getStringWidth("[Sprinting Toggled]");
    }
    
    @Override
    public int getHeight() {
        return ModToggleSpirnt.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ToggleSprint")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                this.mc.fontRendererObj.drawStringWithShadow(color() + "[§fSprinting (Toggled)" + color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
            }
            else {
                ChromaText.drawChromaString("[Sprinting (Toggled)]", pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
    
    static {
        ModToggleSpirnt.mainColor = "cyan";
    }
}
