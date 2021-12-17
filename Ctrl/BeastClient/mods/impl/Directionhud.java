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

public class Directionhud extends ModDraggable
{
    @Override
    public int getWidth() {
        return Directionhud.font.getStringWidth("[w]");
    }
    
    @Override
    public int getHeight() {
        return Directionhud.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModPosition")) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                final String direction = this.mc.getRenderViewEntity().getHorizontalFacing().name();
                String DIR = "";
                if (direction.equalsIgnoreCase("NORTH")) {
                    DIR = "N";
                }
                if (direction.equalsIgnoreCase("WEST")) {
                    DIR = "W";
                }
                if (direction.equalsIgnoreCase("EAST")) {
                    DIR = "E";
                }
                if (direction.equalsIgnoreCase("SOUTH")) {
                    DIR = "S";
                }
                GlStateManager.pushMatrix();
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(ModY.color() + "[§f" + DIR + ModY.color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
                GlStateManager.popMatrix();
            }
            else {
                final String direction = this.mc.getRenderViewEntity().getHorizontalFacing().name();
                String DIR = "";
                if (direction.equalsIgnoreCase("NORTH")) {
                    DIR = "N";
                }
                if (direction.equalsIgnoreCase("WEST")) {
                    DIR = "W";
                }
                if (direction.equalsIgnoreCase("EAST")) {
                    DIR = "E";
                }
                if (direction.equalsIgnoreCase("SOUTH")) {
                    DIR = "S";
                }
                ChromaText.drawChromaString("[" + DIR + "]", pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
}
