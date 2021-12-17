// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import Ctrl.BeastClient.Client;
import Ctrl.BeastClient.gui.Branding.color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModClientName extends ModDraggable
{
    @Override
    public int getWidth() {
        return ModClientName.font.getStringWidth("Beast Client");
    }
    
    @Override
    public int getHeight() {
        return ModClientName.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (!ModToggle.loadEnabledFromFile("Chroma")) {
            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(String.valueOf(color.BrandingTextColor()) + Client.ClientName, (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
            GlStateManager.popMatrix();
        }
        else {
            ChromaText.drawChromaString(Client.ClientName, pos.getAbsoluteX(), pos.getAbsoluteY(), true);
        }
    }
}
