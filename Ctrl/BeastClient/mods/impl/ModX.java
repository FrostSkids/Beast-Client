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

public class ModX extends ModDraggable
{
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
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(ModY.color() + "[§fX" + ModY.color() + "] " + "§f" + Math.round(Minecraft.getMinecraft().thePlayer.posX * 1000.0) / 1000L, (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                ChromaText.drawChromaString("[X] " + Math.round(Minecraft.getMinecraft().thePlayer.posX * 1000.0) / 1000L, pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
}
