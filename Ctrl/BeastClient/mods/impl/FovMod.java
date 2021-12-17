// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class FovMod extends ModDraggable
{
    private static float savedFOV;
    
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
    
    static {
        FovMod.savedFOV = 0.0f;
    }
}
