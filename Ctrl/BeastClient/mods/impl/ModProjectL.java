// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.event.EventTarget;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.event.impl.MouseEvent;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModProjectL extends ModDraggable
{
    @Override
    public int getWidth() {
        return ModProjectL.font.getStringWidth("");
    }
    
    @Override
    public int getHeight() {
        return ModProjectL.font.FONT_HEIGHT;
    }
    
    @EventTarget
    public void onMouse(final MouseEvent event) {
        if (this.isEnabled() && (event.dx != 0 || event.dy != 0)) {
            final EntityPlayerSP entity = Minecraft.getMinecraft().thePlayer;
            if (entity != null) {
                entity.prevRenderYawOffset = entity.renderYawOffset;
                entity.prevRotationYawHead = entity.rotationYawHead;
                entity.prevRotationYaw = entity.rotationYaw;
                entity.prevRotationPitch = entity.rotationPitch;
            }
        }
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        ModProjectL.font.drawString("", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
    }
}
