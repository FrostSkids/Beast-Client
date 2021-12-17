// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import Ctrl.BeastClient.ModToggle;
import net.minecraft.server.MinecraftServer;
import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import Ctrl.BeastClient.mods.ModDraggable;

public class ServerIPMod extends ModDraggable
{
    public static String mainColor;
    private ScreenPosition pos;
    public static Minecraft mc;
    
    public static String color() {
        if (ServerIPMod.mainColor == "pink") {
            return "§d";
        }
        if (ServerIPMod.mainColor == "blue") {
            return "§1";
        }
        if (ServerIPMod.mainColor == "red") {
            return "§c";
        }
        if (ServerIPMod.mainColor == "pink") {
            return "§d";
        }
        if (ServerIPMod.mainColor == "green") {
            return "§a";
        }
        if (ServerIPMod.mainColor == "cyan") {
            return "§b";
        }
        if (ServerIPMod.mainColor == "orange") {
            return "§6";
        }
        if (ServerIPMod.mainColor == "white") {
            return "§f";
        }
        if (ServerIPMod.mainColor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    @Override
    public int getWidth() {
        if (MinecraftServer.getServer().isSinglePlayer()) {
            return 40;
        }
        return ServerIPMod.font.getStringWidth(this.getIP());
    }
    
    @Override
    public int getHeight() {
        return ServerIPMod.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (!MinecraftServer.getServer().isSinglePlayer()) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                ServerIPMod.font.drawStringWithShadow(color() + "[§fIP: " + this.getIP() + color() + "]", (float)(pos.getAbsoluteX() + 2), (float)(pos.getAbsoluteY() + 1), -1);
            }
            else {
                ChromaText.drawChromaString("[IP: " + this.getIP() + "]", pos.getAbsoluteX() + 2, pos.getAbsoluteY() + 1, true);
            }
        }
    }
    
    private String getIP() {
        final String IP = ServerIPMod.mc.getCurrentServerData().serverIP;
        return IP;
    }
    
    @Override
    public void renderDummy(final ScreenPosition pos) {
        ServerIPMod.font.drawString("[Server IP]", pos.getAbsoluteX() + 2, pos.getAbsoluteY() + 1, -1);
    }
    
    static {
        ServerIPMod.mainColor = "cyan";
        ServerIPMod.mc = Minecraft.getMinecraft();
    }
}
