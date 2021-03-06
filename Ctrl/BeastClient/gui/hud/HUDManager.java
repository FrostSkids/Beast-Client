// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.hud;

import Ctrl.BeastClient.event.EventTarget;
import java.util.Iterator;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiContainer;
import Ctrl.BeastClient.event.impl.RenderEvent;
import net.minecraft.client.gui.GuiScreen;
import java.util.Collection;
import Ctrl.BeastClient.event.EventManager;
import com.google.common.collect.Sets;
import net.minecraft.client.Minecraft;
import java.util.Set;

public class HUDManager
{
    private static HUDManager instance;
    private static boolean isPaused;
    private Set<IRenderer> registeredRenderers;
    private Minecraft mc;
    
    private HUDManager() {
        this.registeredRenderers = (Set<IRenderer>)Sets.newHashSet();
        this.mc = Minecraft.getMinecraft();
    }
    
    public static HUDManager getInstance() {
        if (HUDManager.instance != null) {
            return HUDManager.instance;
        }
        EventManager.register(HUDManager.instance = new HUDManager());
        return HUDManager.instance;
    }
    
    public void register(final IRenderer... renderers) {
        for (final IRenderer render : renderers) {
            this.registeredRenderers.add(render);
        }
    }
    
    public void unreister(final IRenderer... renderers) {
        for (final IRenderer render : renderers) {
            this.registeredRenderers.remove(render);
        }
    }
    
    public Collection<IRenderer> getRegisteredRenderers() {
        return (Collection<IRenderer>)Sets.newHashSet((Iterable)this.registeredRenderers);
    }
    
    public void openConfigScreen() {
        HUDManager.isPaused = false;
        this.mc.displayGuiScreen(new HUDConfigScreen(this, true));
    }
    
    public void openConfigScreenPaused() {
        HUDManager.isPaused = true;
        this.mc.displayGuiScreen(new HUDConfigScreen(this, false));
    }
    
    @EventTarget
    public void onRender(final RenderEvent e) {
        if ((this.mc.currentScreen == null || this.mc.currentScreen instanceof GuiContainer) && (this.mc.currentScreen == null || this.mc.currentScreen instanceof GuiChat)) {
            if (this.mc.gameSettings.showDebugInfo) {
                return;
            }
            for (final IRenderer renderer : this.registeredRenderers) {
                this.callRenderer(renderer);
            }
        }
    }
    
    private void callRenderer(final IRenderer renderer) {
        if (!renderer.isEnabled()) {
            return;
        }
        ScreenPosition pos = renderer.load();
        if (pos == null) {
            pos = ScreenPosition.fromRelativePosition(0.5, 0.5);
        }
        renderer.render(pos);
    }
    
    static {
        HUDManager.instance = null;
    }
}
