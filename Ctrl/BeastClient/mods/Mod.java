// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods;

import Ctrl.BeastClient.event.EventManager;
import Ctrl.BeastClient.Client;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.Minecraft;

public class Mod
{
    private boolean isEnabled;
    protected final Minecraft mc;
    protected static FontRenderer font;
    protected final Client client;
    
    public Mod() {
        this.isEnabled = true;
        this.mc = Minecraft.getMinecraft();
        Mod.font = this.mc.fontRendererObj;
        this.client = Client.getInstance();
        this.setEnabled(this.isEnabled);
    }
    
    private void setEnabled(final boolean isEnabled) {
        this.isEnabled = isEnabled;
        if (isEnabled) {
            EventManager.register(this);
        }
        else {
            EventManager.unregister(this);
        }
    }
    
    public boolean isEnabled() {
        return this.isEnabled;
    }
}
