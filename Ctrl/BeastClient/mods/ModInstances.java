// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods;

import Ctrl.BeastClient.gui.hud.IRenderer;
import Ctrl.BeastClient.gui.hud.HUDManager;
import Ctrl.BeastClient.mods.impl.ModPerspective;
import Ctrl.BeastClient.mods.impl.ModZ;
import Ctrl.BeastClient.mods.impl.ModY;
import Ctrl.BeastClient.mods.impl.ModProjectL;
import Ctrl.BeastClient.mods.impl.ModX;
import Ctrl.BeastClient.mods.impl.ModPotionStatus;
import Ctrl.BeastClient.mods.impl.ModTimeShow;
import Ctrl.BeastClient.mods.impl.ModPing;
import Ctrl.BeastClient.mods.impl.ModBiom;
import Ctrl.BeastClient.mods.impl.FullBright;
import Ctrl.BeastClient.mods.impl.FovMod;
import Ctrl.BeastClient.mods.impl.ModKeystrokes;
import Ctrl.BeastClient.mods.impl.ModToggleSpirnt;
import Ctrl.BeastClient.mods.impl.ModFPS;
import Ctrl.BeastClient.mods.impl.ModArmorStatus;
import Ctrl.BeastClient.mods.impl.ModClientName;
import net.minecraft.client.Minecraft;

public class ModInstances
{
    public static Minecraft mc;
    private static ModClientName modHelloWorld;
    private static ModArmorStatus modArmorStatus;
    private static ModFPS modFPS;
    private static ModToggleSpirnt modToggleSprint;
    private static ModKeystrokes modKeystrokes;
    private static FovMod fovMod;
    private static FullBright fullBright;
    private static ModBiom modBiom;
    private static ModPing modPing;
    private static ModTimeShow modTimeShow;
    private static ModPotionStatus modPotionStatus;
    private static ModX modX;
    private static ModProjectL modProjectL;
    private static ModY modY;
    private static ModZ modZ;
    private static ModPerspective modPerspective;
    
    public static void register(final HUDManager api) {
        ModInstances.modHelloWorld = new ModClientName();
        api.register(ModInstances.modHelloWorld);
        ModInstances.modArmorStatus = new ModArmorStatus();
        api.register(ModInstances.modArmorStatus);
        ModInstances.modToggleSprint = new ModToggleSpirnt();
        api.register(ModInstances.modToggleSprint);
        ModInstances.fullBright = new FullBright();
        api.register(ModInstances.fullBright);
        ModInstances.modFPS = new ModFPS();
        api.register(ModInstances.modFPS);
        ModInstances.modX = new ModX();
        api.register(ModInstances.modX);
        ModInstances.modY = new ModY();
        api.register(ModInstances.modY);
        ModInstances.modZ = new ModZ();
        api.register(ModInstances.modZ);
        ModInstances.modKeystrokes = new ModKeystrokes();
        api.register(ModInstances.modKeystrokes);
        ModInstances.modPing = new ModPing();
        api.register(ModInstances.modPing);
        ModInstances.modTimeShow = new ModTimeShow();
        api.register(ModInstances.modTimeShow);
        ModInstances.modPotionStatus = new ModPotionStatus();
        api.register(ModInstances.modPotionStatus);
        ModInstances.modPerspective = new ModPerspective();
        api.register(ModInstances.modPerspective);
        ModInstances.modProjectL = new ModProjectL();
        api.register(ModInstances.modProjectL);
        ModInstances.fovMod = new FovMod();
        api.register(ModInstances.fovMod);
        ModInstances.modBiom = new ModBiom();
        api.register(ModInstances.modBiom);
    }
    
    public static ModPerspective getModPerspective() {
        return ModInstances.modPerspective;
    }
}
