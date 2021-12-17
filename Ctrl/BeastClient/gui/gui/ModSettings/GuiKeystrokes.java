// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.gui.ModSettings;

import Ctrl.BeastClient.mods.impl.ModY;
import Ctrl.BeastClient.mods.impl.ModKeystrokes;
import net.minecraft.client.resources.I18n;
import Ctrl.BeastClient.Client;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiKeystrokes extends GuiScreen
{
    private final GuiScreen field_146598_a;
    private GuiButton field_146596_f;
    private GuiButton field_146597_g;
    private String field_146599_h;
    private boolean field_146600_i;
    
    public GuiKeystrokes(final GuiScreen p_i1055_1_) {
        this.field_146599_h = "survival";
        this.field_146598_a = p_i1055_1_;
    }
    
    @Override
    public void initGui() {
        if (Client.ModPosition) {
            this.buttonList.add(new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Coordinates Display: ON", new Object[0])));
        }
        else if (!Client.ModPosition) {
            this.buttonList.add(new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Coordinates Display: OFF", new Object[0])));
        }
        if (ModKeystrokes.maincolor == "red") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Red", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "blue") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: blue", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "cyan") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: cyan", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "pink") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: pink", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "green") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: green", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "orange") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: orange", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "white") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Default", new Object[0])));
        }
        else if (ModKeystrokes.maincolor == "yellow") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Yellow", new Object[0])));
        }
        if (ModKeystrokes.showcps) {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Show CPS: ON", new Object[0])));
        }
        else if (!ModKeystrokes.showcps) {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Show CPS: OFF", new Object[0])));
        }
        if (ModY.Chroma) {
            this.buttonList.add(new GuiButton(3000, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: ON", new Object[0])));
        }
        else if (!ModY.Chroma) {
            this.buttonList.add(new GuiButton(3000, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: OFF", new Object[0])));
        }
    }
}
