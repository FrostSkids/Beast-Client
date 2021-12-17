// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.gui;

import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiScreen;

public class VapeV4impl extends GuiScreen
{
    private final GuiScreen field_146598_a;
    
    public VapeV4impl(final GuiScreen p_i1055_1_) {
        this.field_146598_a = p_i1055_1_;
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        final ScaledResolution scaledRes = new ScaledResolution(this.mc);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("VapeV4.png"));
        Gui.drawScaledCustomSizeModalRect(0, 0, 0.0f, 0.0f, scaledRes.getScaledWidth(), scaledRes.getScaledHeight(), scaledRes.getScaledWidth(), scaledRes.getScaledHeight(), (float)scaledRes.getScaledWidth(), (float)scaledRes.getScaledHeight());
    }
}
