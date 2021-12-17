// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.hud;

import net.minecraft.client.Minecraft;

public class ScreenPosition
{
    private static final Minecraft mc;
    private int x;
    private int y;
    
    public ScreenPosition(final double x, final double y) {
        this.setRelative(x, y);
    }
    
    public ScreenPosition(final int x, final int y) {
        this.setAbsolute(x, y);
    }
    
    public static ScreenPosition fromRelativePosition(final double x, final double y) {
        return new ScreenPosition(x, y);
    }
    
    public static ScreenPosition fromAbsolute(final int x, final int y) {
        return new ScreenPosition(x, y);
    }
    
    public int getAbsoluteX() {
        final ScreenResolution resolution = new ScreenResolution(ScreenPosition.mc);
        return this.x;
    }
    
    public int getAbsoluteY() {
        final ScreenResolution resolution = new ScreenResolution(ScreenPosition.mc);
        return this.y;
    }
    
    public double getRelativeX() {
        final ScreenResolution res = new ScreenResolution(ScreenPosition.mc);
        return (int)(this.x / res.getScaledWidth_double());
    }
    
    public double getRelativeY() {
        final ScreenResolution res = new ScreenResolution(ScreenPosition.mc);
        return (int)(this.y / res.getScaledHeight_double());
    }
    
    public void setAbsolute(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setRelative(final double x, final double y) {
        final ScreenResolution res = new ScreenResolution(ScreenPosition.mc);
        this.x = (int)(x / res.getScaledWidth());
        this.y = (int)(y / res.getScaledHeight());
        System.err.println(x);
        System.out.println(y);
    }
    
    static {
        mc = Minecraft.getMinecraft();
    }
}
