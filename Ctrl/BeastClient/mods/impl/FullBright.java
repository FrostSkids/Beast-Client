// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class FullBright extends ModDraggable
{
    private ScreenPosition pos;
    
    public FullBright() {
        Minecraft.getMinecraft().gameSettings.gammaSetting = 100.0f;
    }
    
    @Override
    public int getWidth() {
        return 0;
    }
    
    @Override
    public int getHeight() {
        return 0;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
    }
    
    @Override
    public void renderDummy(final ScreenPosition pos) {
    }
    
    @Override
    public void save(final ScreenPosition pos) {
        this.pos = pos;
    }
    
    @Override
    public ScreenPosition load() {
        return this.pos;
    }
}
