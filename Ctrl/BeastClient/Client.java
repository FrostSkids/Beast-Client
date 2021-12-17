// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

import Ctrl.BeastClient.event.EventTarget;
import Ctrl.BeastClient.gui.gui.VapeV4impl;
import net.minecraft.client.gui.GuiScreen;
import Ctrl.BeastClient.gui.gui.GUIToggle;
import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.event.impl.ClientTickEvent;
import Ctrl.BeastClient.mods.ModInstances;
import Ctrl.BeastClient.event.EventManager;
import Ctrl.BeastClient.gui.SplashProgress;
import Ctrl.BeastClient.gui.hud.HUDManager;
import java.awt.Color;

public class Client
{
    private static final Client INSTANCE;
    public static String ClientName;
    public static String mainColor;
    public static String DiscordID;
    public static int FPSBoost;
    public static boolean LogoButtons;
    public static int guiToggleClientName;
    public static int ConfigScreenColor;
    public static Color SplashColor;
    public static String ModFarbe;
    public static int ButtonHover;
    public static String KlammerFarbe;
    public static boolean ChromaText;
    public static boolean LeftHand;
    public static boolean DynamicFOV;
    public static boolean CosmeticGhostWings;
    public static boolean CosmeticCap;
    public static boolean CosmeticHat;
    public static boolean CosmeticWitchHat;
    public static boolean DiamondHead;
    public static boolean ChatBackground;
    public static boolean BetterAnimations;
    public static boolean ItemPhysics;
    public static boolean ToggleSprint;
    public static boolean CosmeticWings;
    public static boolean CosmeticHalo;
    public static boolean CosmeticCape;
    public static boolean CosmeticCape2;
    public static boolean CosmeticCape3;
    public static boolean CosmeticCape4;
    public static boolean ModBiom;
    public static boolean ModFPS;
    public static boolean ModPing;
    public static boolean ModPotionstatus;
    public static boolean ModTimeShow;
    public static boolean ModPosition;
    public static boolean ModArmorStatus;
    public static boolean ModKeystrokes;
    public static boolean ModTntTimer;
    public static boolean Headset;
    public static String Background;
    public static String Cape;
    public static String SplashScreen;
    public static String Logo;
    private DiscordRP discordRP;
    private HUDManager hudManager;
    int scrollTotal;
    private static boolean prevIsKeyDown;
    private static float savedFOV;
    
    public Client() {
        this.discordRP = new DiscordRP();
        this.scrollTotal = 4;
    }
    
    public static final Client getInstance() {
        return Client.INSTANCE;
    }
    
    public HUDManager getHudManager() {
        return this.hudManager;
    }
    
    public static Color getSplashColor() {
        if (Client.mainColor == "pink") {
            return new Color(255, 85, 255);
        }
        if (Client.mainColor == "blue") {
            return new Color(85, 255, 255);
        }
        if (Client.mainColor == "red") {
            return new Color(255, 85, 85);
        }
        if (Client.mainColor == "pink") {
            return new Color(255, 85, 255);
        }
        if (Client.mainColor == "green") {
            return new Color(85, 255, 85);
        }
        if (Client.mainColor == "cyan") {
            return new Color(85, 255, 255);
        }
        if (Client.mainColor == "orange") {
            return new Color(255, 170, 0);
        }
        if (Client.mainColor == "gold") {
            return new Color(255, 170, 0);
        }
        if (Client.mainColor == "brown") {
            return new Color(255, 170, 0);
        }
        if (Client.mainColor == "white") {
            return new Color(255, 255, 255);
        }
        if (Client.mainColor == "yellow") {
            return new Color(255, 255, 85);
        }
        return new Color(0);
    }
    
    public static int getConfigScreenColor() {
        if (Client.mainColor == "pink") {
            return -43521;
        }
        if (Client.mainColor == "blue") {
            return -11184641;
        }
        if (Client.mainColor == "red") {
            return -43691;
        }
        if (Client.mainColor == "pink") {
            return -43521;
        }
        if (Client.mainColor == "green") {
            return -11141291;
        }
        if (Client.mainColor == "cyan") {
            return -11141121;
        }
        if (Client.mainColor == "orange") {
            return -22016;
        }
        if (Client.mainColor == "gold") {
            return -22016;
        }
        if (Client.mainColor == "brown") {
            return -22016;
        }
        if (Client.mainColor == "white") {
            return -1;
        }
        if (Client.mainColor == "yellow") {
            return -171;
        }
        return 0;
    }
    
    public static String getModFarbe() {
        if (Client.mainColor == "pink") {
            return "§d";
        }
        if (Client.mainColor == "blue") {
            return "§b";
        }
        if (Client.mainColor == "red") {
            return "§c";
        }
        if (Client.mainColor == "pink") {
            return "§d";
        }
        if (Client.mainColor == "green") {
            return "§a";
        }
        if (Client.mainColor == "cyan") {
            return "§b";
        }
        if (Client.mainColor == "orange") {
            return "§6";
        }
        if (Client.mainColor == "gold") {
            return "§6";
        }
        if (Client.mainColor == "brown") {
            return "§6";
        }
        if (Client.mainColor == "white") {
            return "§f";
        }
        if (Client.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    public static int getButtonHover() {
        if (Client.mainColor == "pink") {
            return 16733695;
        }
        if (Client.mainColor == "blue") {
            return 5636095;
        }
        if (Client.mainColor == "red") {
            return 16733525;
        }
        if (Client.mainColor == "pink") {
            return 16733695;
        }
        if (Client.mainColor == "green") {
            return 5635925;
        }
        if (Client.mainColor == "cyan") {
            return 5636095;
        }
        if (Client.mainColor == "orange") {
            return 16755200;
        }
        if (Client.mainColor == "gold") {
            return 16755200;
        }
        if (Client.mainColor == "brown") {
            return 16755200;
        }
        if (Client.mainColor == "white") {
            return 16777215;
        }
        if (Client.mainColor == "yellow") {
            return 16777045;
        }
        return 0;
    }
    
    public void init() {
        SplashProgress.setProgress(1, Client.ClientName + " - Discord Initialisation");
        FileManager.init();
        this.discordRP.start();
        EventManager.register(this);
    }
    
    public void start() {
        ModInstances.register(this.hudManager = HUDManager.getInstance());
    }
    
    public void shutdown() {
        this.discordRP.shutdown();
    }
    
    public DiscordRP getDiscordRP() {
        return this.discordRP;
    }
    
    @EventTarget
    public void onTick(final ClientTickEvent e) {
        if (Minecraft.getMinecraft().gameSettings.CLIENT_GUI_MOD_POS.isPressed()) {
            this.hudManager.openConfigScreen();
        }
        if (Minecraft.getMinecraft().gameSettings.CLIENT_GUI_MOD_SETTINGS.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new GUIToggle(null));
        }
        if (Minecraft.getMinecraft().gameSettings.VAPEV4.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new VapeV4impl(null));
        }
        final boolean isKeyDown = Minecraft.getMinecraft().gameSettings.ZOOM.isKeyDown();
        if (Client.prevIsKeyDown != isKeyDown) {
            if (isKeyDown) {
                Client.savedFOV = Minecraft.getMinecraft().gameSettings.fovSetting;
                Minecraft.getMinecraft().gameSettings.fovSetting = 30.0f;
                Minecraft.getMinecraft().gameSettings.smoothCamera = true;
            }
            else {
                Minecraft.getMinecraft().gameSettings.fovSetting = Client.savedFOV;
                Minecraft.getMinecraft().gameSettings.smoothCamera = false;
            }
        }
        Client.prevIsKeyDown = isKeyDown;
    }
    
    static {
        INSTANCE = new Client();
        Client.ClientName = "Beast Client";
        Client.mainColor = "blue";
        Client.DiscordID = "880895584532320277";
        Client.FPSBoost = 1;
        Client.LogoButtons = true;
        Client.guiToggleClientName = 55;
        Client.ConfigScreenColor = getConfigScreenColor();
        Client.SplashColor = getSplashColor();
        Client.ModFarbe = getModFarbe();
        Client.ButtonHover = getButtonHover();
        Client.KlammerFarbe = "§f";
        Client.ChromaText = ModToggle.loadEnabledFromFile("Chroma");
        Client.LeftHand = ModToggle.loadEnabledFromFile("LeftHand");
        Client.DynamicFOV = ModToggle.loadEnabledFromFile("DynamicFOV");
        Client.CosmeticGhostWings = CosmeticToggle.loadEnabledFromFile("CosmeticGhostWings");
        Client.CosmeticCap = CosmeticToggle.loadEnabledFromFile("CosmeticCap");
        Client.CosmeticHat = CosmeticToggle.loadEnabledFromFile("CosmeticHat");
        Client.CosmeticWitchHat = CosmeticToggle.loadEnabledFromFile("CosmeticWitchHat");
        Client.DiamondHead = CosmeticToggle.loadEnabledFromFile("DiamondHead");
        Client.ChatBackground = ModToggle.loadEnabledFromFile("ChatBackground");
        Client.BetterAnimations = ModToggle.loadEnabledFromFile("BlockHit");
        Client.ItemPhysics = ModToggle.loadEnabledFromFile("Itemphysics");
        Client.ToggleSprint = ModToggle.loadEnabledFromFile("toggleSprint");
        Client.CosmeticWings = CosmeticToggle.loadEnabledFromFile("CosmeticWings");
        Client.CosmeticHalo = CosmeticToggle.loadEnabledFromFile("CosmeticHalo");
        Client.CosmeticCape = CosmeticToggle.loadEnabledFromFile("CosmeticCape");
        Client.CosmeticCape2 = CosmeticToggle.loadEnabledFromFile("CosmeticCape2");
        Client.CosmeticCape3 = CosmeticToggle.loadEnabledFromFile("CosmeticCape3");
        Client.CosmeticCape4 = CosmeticToggle.loadEnabledFromFile("CosmeticCape4");
        Client.ModBiom = ModToggle.loadEnabledFromFile("ModBiom");
        Client.ModFPS = ModToggle.loadEnabledFromFile("ModFPS");
        Client.ModPing = ModToggle.loadEnabledFromFile("ModPing");
        Client.ModPotionstatus = ModToggle.loadEnabledFromFile("ModPotionstatus");
        Client.ModTimeShow = ModToggle.loadEnabledFromFile("ModTimeShow");
        Client.ModPosition = ModToggle.loadEnabledFromFile("ModPosition");
        Client.ModArmorStatus = ModToggle.loadEnabledFromFile("ModArmorStatus");
        Client.ModKeystrokes = ModToggle.loadEnabledFromFile("ModKeystrokes");
        Client.ModTntTimer = true;
        Client.Headset = true;
        Client.Background = "background.png";
        Client.Cape = "cape.png";
        Client.SplashScreen = "splash.png";
        Client.Logo = "tollerzitronens-01.jpeg";
        Client.prevIsKeyDown = false;
        Client.savedFOV = 0.0f;
    }
}
