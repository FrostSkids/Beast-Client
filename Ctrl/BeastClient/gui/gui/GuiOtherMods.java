// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.gui;

import java.io.IOException;
import Ctrl.BeastClient.ModToggle;
import net.minecraft.client.gui.GuiShareToLan;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.resources.I18n;
import Ctrl.BeastClient.Client;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiOtherMods extends GuiScreen
{
    private final GuiScreen field_146598_a;
    private GuiScreen parentScreen;
    private static String Cape;
    private static String Wings;
    private static String ToggleSprint;
    private static String Halo;
    private static String FPS;
    private static String Keystrokes;
    private static String Ping;
    private static String ArmorStatus;
    private static String Time;
    private static String PotionStatus;
    private static String ModPosition;
    private GuiButton field_146596_f;
    private GuiButton field_146597_g;
    private String field_146599_h;
    private boolean field_146600_i;
    
    public GuiOtherMods(final GuiScreen p_i1055_1_) {
        this.field_146599_h = "survival";
        this.field_146598_a = p_i1055_1_;
    }
    
    @Override
    public void initGui() {
        if (Client.ToggleSprint) {
            this.buttonList.add(new GuiButton(1005, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Toggle Sprint: ON", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1005, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Toggle Sprint: OFF", new Object[0])));
        }
        if (Client.ItemPhysics) {
            this.buttonList.add(new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("ItemPhysics: OFF", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("ItemPhysics: ON", new Object[0])));
        }
        if (Client.BetterAnimations) {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("1.7 Animations: OFF", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("1.7 Animations: ON", new Object[0])));
        }
        if (Client.ChatBackground) {
            this.buttonList.add(new GuiButton(1008, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("ChatBackground: OFF", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1008, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("ChatBackground: ON", new Object[0])));
        }
        if (Client.ChromaText) {
            this.buttonList.add(new GuiButton(1009, this.width / 2 - 61, this.height / 2 + 6, 120, 20, I18n.format("Chroma Mods: ON", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1009, this.width / 2 - 61, this.height / 2 + 6, 120, 20, I18n.format("Chroma Mods: OFF", new Object[0])));
        }
        if (Client.LeftHand) {
            this.buttonList.add(new GuiButton(1010, this.width / 2 - 61, this.height / 2 + 30, 120, 20, I18n.format("Left Hand: ON", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1010, this.width / 2 - 61, this.height / 2 + 30, 120, 20, I18n.format("Left Hand: OFF", new Object[0])));
        }
        if (Client.DynamicFOV) {
            this.buttonList.add(new GuiButton(1011, this.width / 2 - 61, this.height / 2 + 54, 120, 20, I18n.format("Dynamic FOV: OFF", new Object[0])));
        }
        else {
            this.buttonList.add(new GuiButton(1011, this.width / 2 - 61, this.height / 2 + 54, 120, 20, I18n.format("Dynamic FOV: ON", new Object[0])));
        }
        this.buttonList.add(new GuiButton(1022, this.width / 2 - 91, this.height / 2 + 78, 180, 20, I18n.format("Back", new Object[0])));
    }
    
    private void func_146595_g() {
        this.field_146597_g.displayString = I18n.format("selectWorld.gameMode", new Object[0]) + " " + I18n.format("selectWorld.gameMode." + this.field_146599_h, new Object[0]);
        this.field_146596_f.displayString = I18n.format("selectWorld.allowCommands", new Object[0]) + " ";
        if (this.field_146600_i) {
            this.field_146596_f.displayString += I18n.format("options.on", new Object[0]);
        }
        else {
            this.field_146596_f.displayString += I18n.format("options.off", new Object[0]);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton button) throws IOException {
        switch (button.id) {
            case 0: {
                this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
                break;
            }
            case 1: {
                final boolean flag = this.mc.isIntegratedServerRunning();
                final boolean flag2 = this.mc.func_181540_al();
                button.enabled = false;
                this.mc.theWorld.sendQuittingDisconnectingPacket();
                this.mc.loadWorld(null);
                if (flag) {
                    this.mc.displayGuiScreen(new GuiMainMenu());
                    break;
                }
                if (flag2) {
                    final RealmsBridge realmsbridge = new RealmsBridge();
                    realmsbridge.switchToRealms(new GuiMainMenu());
                    break;
                }
                this.mc.displayGuiScreen(new GuiMultiplayer(new GuiMainMenu()));
                break;
            }
            case 4: {
                this.mc.displayGuiScreen(null);
                this.mc.setIngameFocus();
                break;
            }
            case 5: {
                this.mc.displayGuiScreen(new GuiAchievements(this, this.mc.thePlayer.getStatFileWriter()));
                break;
            }
            case 6: {
                this.mc.displayGuiScreen(new GuiStats(this, this.mc.thePlayer.getStatFileWriter()));
                break;
            }
            case 7: {
                this.mc.displayGuiScreen(new GuiShareToLan(this));
                break;
            }
            case 8: {
                this.mc.displayGuiScreen(new GuiOtherMods(this));
                break;
            }
            case 1005: {
                Client.ToggleSprint = !Client.ToggleSprint;
                if (Client.ToggleSprint) {
                    this.buttonList.set(0, new GuiButton(1005, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Toggle Sprint: ON", new Object[0])));
                }
                else {
                    this.buttonList.set(0, new GuiButton(1005, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Toggle Sprint: OFF", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("toggleSprint", Client.ToggleSprint);
                break;
            }
            case 1006: {
                Client.ItemPhysics = !Client.ItemPhysics;
                if (Client.ItemPhysics) {
                    this.buttonList.set(1, new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("ItemPhysics: OFF", new Object[0])));
                }
                else {
                    this.buttonList.set(1, new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("ItemPhysics: ON", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("Itemphysics", Client.ItemPhysics);
                break;
            }
            case 1007: {
                Client.BetterAnimations = !Client.BetterAnimations;
                if (Client.BetterAnimations) {
                    this.buttonList.set(2, new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("1.7 Animations: OFF", new Object[0])));
                }
                else {
                    this.buttonList.set(2, new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("1.7 Animations: ON", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("BlockHit", Client.BetterAnimations);
                break;
            }
            case 1008: {
                Client.ChatBackground = !Client.ChatBackground;
                if (Client.ChatBackground) {
                    this.buttonList.set(3, new GuiButton(1008, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("ChatBackground: OFF", new Object[0])));
                }
                else {
                    this.buttonList.set(3, new GuiButton(1008, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("ChatBackground: ON", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("ChatBackground", Client.ChatBackground);
                break;
            }
            case 1009: {
                Client.ChromaText = !Client.ChromaText;
                if (Client.ChromaText) {
                    this.buttonList.set(4, new GuiButton(1009, this.width / 2 - 61, this.height / 2 + 6, 120, 20, I18n.format("Chroma Mods: ON", new Object[0])));
                }
                else {
                    this.buttonList.set(4, new GuiButton(1009, this.width / 2 - 61, this.height / 2 + 6, 120, 20, I18n.format("Chroma Mods: OFF", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("Chroma", Client.ChromaText);
                break;
            }
            case 1010: {
                Client.LeftHand = !Client.LeftHand;
                if (Client.LeftHand) {
                    this.buttonList.set(5, new GuiButton(1010, this.width / 2 - 61, this.height / 2 + 30, 120, 20, I18n.format("Left Hand: ON", new Object[0])));
                }
                else {
                    this.buttonList.set(5, new GuiButton(1010, this.width / 2 - 61, this.height / 2 + 30, 120, 20, I18n.format("Left Hand: OFF", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("LeftHand", Client.LeftHand);
                break;
            }
            case 1011: {
                Client.DynamicFOV = !Client.DynamicFOV;
                if (Client.DynamicFOV) {
                    this.buttonList.set(6, new GuiButton(1011, this.width / 2 - 61, this.height / 2 + 54, 120, 20, I18n.format("Dynamic FOV: OFF", new Object[0])));
                }
                else {
                    this.buttonList.set(6, new GuiButton(1011, this.width / 2 - 61, this.height / 2 + 54, 120, 20, I18n.format("Dynamic FOV: ON", new Object[0])));
                }
                ModToggle.saveIsEnabledToFile("DynamicFOV", Client.DynamicFOV);
                break;
            }
            case 1022: {
                this.mc.displayGuiScreen(new GUIToggle(this));
                break;
            }
        }
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.drawDefaultBackground();
        this.drawString(this.fontRendererObj, Client.ModFarbe + "Ingame Mods", this.width / 2 - 32, this.height / 2 - 120, -1);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    static {
        GuiOtherMods.Cape = "Cape";
        GuiOtherMods.Wings = "Wings";
        GuiOtherMods.ToggleSprint = "Toggle Sprint";
        GuiOtherMods.Halo = "Halo";
        GuiOtherMods.FPS = "FPS";
        GuiOtherMods.Keystrokes = "Keystrokes";
        GuiOtherMods.Ping = "Ping";
        GuiOtherMods.ArmorStatus = "Armor Status";
        GuiOtherMods.Time = "Time";
        GuiOtherMods.PotionStatus = "Potion Status";
        GuiOtherMods.ModPosition = "ModPosition";
    }
}
