// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

public class SetBlockOverlay
{
    public static float ro;
    public static float go;
    public static float bo;
    public static float ao;
    public static float THICCNESS;
    
    public void setBlockOverlay(final float r, final float g, final float b, final float a, final float THICCNESSS) {
        SetBlockOverlay.ro = r;
        SetBlockOverlay.go = g;
        SetBlockOverlay.bo = b;
        SetBlockOverlay.ao = a;
        SetBlockOverlay.THICCNESS = THICCNESSS;
    }
    
    static {
        SetBlockOverlay.ro = 255.0f;
        SetBlockOverlay.go = 255.0f;
        SetBlockOverlay.bo = 255.0f;
        SetBlockOverlay.ao = 0.4f;
        SetBlockOverlay.THICCNESS = 3.0f;
    }
}
