// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.gui.ModSettings;

import java.io.IOException;
import Ctrl.BeastClient.mods.impl.ModY;
import net.minecraft.client.resources.I18n;
import Ctrl.BeastClient.Client;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiXYZ extends GuiScreen
{
    private final GuiScreen field_146598_a;
    private GuiButton field_146596_f;
    private GuiButton field_146597_g;
    private String field_146599_h;
    private boolean field_146600_i;
    
    public GuiXYZ(final GuiScreen p_i1055_1_) {
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
        if (ModY.mainColor == "red") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Red", new Object[0])));
        }
        else if (ModY.mainColor == "blue") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: blue", new Object[0])));
        }
        else if (ModY.mainColor == "cyan") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: cyan", new Object[0])));
        }
        else if (ModY.mainColor == "pink") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: pink", new Object[0])));
        }
        else if (ModY.mainColor == "green") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: green", new Object[0])));
        }
        else if (ModY.mainColor == "orange") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: orange", new Object[0])));
        }
        else if (ModY.mainColor == "white") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Default", new Object[0])));
        }
        else if (ModY.mainColor == "yellow") {
            this.buttonList.add(new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Yellow", new Object[0])));
        }
        if (Client.ModBiom) {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Biome Display: ON", new Object[0])));
        }
        else if (!Client.ModBiom) {
            this.buttonList.add(new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Biome Display: OFF", new Object[0])));
        }
        if (ModY.Chroma) {
            this.buttonList.add(new GuiButton(3000, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: ON", new Object[0])));
        }
        else if (!ModY.Chroma) {
            this.buttonList.add(new GuiButton(3000, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: OFF", new Object[0])));
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton button) throws IOException {
        switch (button.id) {
            case 3000: {
                ModY.Chroma = !ModY.Chroma;
                if (ModY.Chroma) {
                    this.buttonList.set(3, new GuiButton(3001, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: ON", new Object[0])));
                    break;
                }
                if (!ModY.Chroma) {
                    this.buttonList.set(3, new GuiButton(3001, this.width / 2 - 61, this.height / 2 - 66, 120, 20, I18n.format("Chroma: OFF", new Object[0])));
                    break;
                }
                break;
            }
            case 3002: {
                if (ModY.mainColor == "cyan") {
                    ModY.mainColor = "blue";
                }
                else if (ModY.mainColor == "blue") {
                    ModY.mainColor = "red";
                }
                else if (ModY.mainColor == "red") {
                    ModY.mainColor = "pink";
                }
                else if (ModY.mainColor == "pink") {
                    ModY.mainColor = "green";
                }
                else if (ModY.mainColor == "green") {
                    ModY.mainColor = "orange";
                }
                else if (ModY.mainColor == "orange") {
                    ModY.mainColor = "white";
                }
                else if (ModY.mainColor == "white") {
                    ModY.mainColor = "yellow";
                }
                else if (ModY.mainColor == "yellow") {
                    ModY.mainColor = "red";
                }
                if (ModY.mainColor == "red") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Red", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "blue") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: blue", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "cyan") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: cyan", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "pink") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: pink", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "green") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: green", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "orange") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: orange", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "Purple") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: purple", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "Dark green") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: dark green", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "white") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Default", new Object[0])));
                    break;
                }
                if (ModY.mainColor == "yellow") {
                    this.buttonList.set(1, new GuiButton(3002, this.width / 2 - 61, this.height / 2 - 18, 120, 20, I18n.format("Color: Yellow", new Object[0])));
                    break;
                }
                break;
            }
            case 1006: {
                Client.ModPosition = !Client.ModPosition;
                if (Client.ModPosition) {
                    this.buttonList.set(0, new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Coordinates Display: ON", new Object[0])));
                    break;
                }
                if (!Client.ModPosition) {
                    this.buttonList.set(0, new GuiButton(1006, this.width / 2 - 61, this.height / 2 - 90, 120, 20, I18n.format("Coordinates Display: OFF", new Object[0])));
                    break;
                }
                break;
            }
            case 1007: {
                Client.ModBiom = !Client.ModBiom;
                if (Client.ModBiom) {
                    this.buttonList.set(2, new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Biome Display: ON", new Object[0])));
                    break;
                }
                if (!Client.ModBiom) {
                    this.buttonList.set(2, new GuiButton(1007, this.width / 2 - 61, this.height / 2 - 42, 120, 20, I18n.format("Biome Display: OFF", new Object[0])));
                    break;
                }
                break;
            }
        }
    }
}
