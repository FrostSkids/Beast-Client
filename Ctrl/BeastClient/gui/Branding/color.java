// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.gui.Branding;

import java.awt.Color;

public class color
{
    public static String mainColor;
    public static String textcolor;
    
    public static int BrandingButtonHover() {
        if (color.mainColor == "pink") {
            return 16733695;
        }
        if (color.mainColor == "blue") {
            return 170;
        }
        if (color.mainColor == "red") {
            return 16733525;
        }
        if (color.mainColor == "pink") {
            return 16733695;
        }
        if (color.mainColor == "green") {
            return 5635925;
        }
        if (color.mainColor == "cyan") {
            return 5636095;
        }
        if (color.mainColor == "orange") {
            return 16755200;
        }
        if (color.mainColor == "white") {
            return 16777215;
        }
        if (color.mainColor == "yellow") {
            return 16777045;
        }
        return 0;
    }
    
    public static Color BrandingRGBColor() {
        if (color.mainColor == "pink") {
            return new Color(255, 85, 255, 255);
        }
        if (color.mainColor == "blue") {
            return new Color(0, 64, 255, 255);
        }
        if (color.mainColor == "red") {
            return new Color(255, 85, 85, 255);
        }
        if (color.mainColor == "pink") {
            return new Color(255, 85, 255, 255);
        }
        if (color.mainColor == "green") {
            return new Color(85, 255, 85, 255);
        }
        if (color.mainColor == "cyan") {
            return new Color(85, 255, 255, 255);
        }
        if (color.mainColor == "orange") {
            return new Color(255, 170, 0, 255);
        }
        if (color.mainColor == "Purple") {
            return new Color(179, 0, 255, 255);
        }
        if (color.mainColor == "Dark green") {
            return new Color(20, 114, 49, 255);
        }
        if (color.mainColor == "white") {
            return new Color(255, 255, 255, 255);
        }
        if (color.mainColor == "yellow") {
            return new Color(255, 255, 85, 255);
        }
        return new Color(0);
    }
    
    public static int Branding0xColor() {
        if (color.mainColor == "pink") {
            return -43521;
        }
        if (color.mainColor == "blue") {
            return -11184641;
        }
        if (color.mainColor == "red") {
            return -43691;
        }
        if (color.mainColor == "pink") {
            return -43521;
        }
        if (color.mainColor == "green") {
            return -11141291;
        }
        if (color.mainColor == "cyan") {
            return -11141121;
        }
        if (color.mainColor == "orange") {
            return -22016;
        }
        if (color.mainColor == "white") {
            return -1;
        }
        if (color.mainColor == "yellow") {
            return -171;
        }
        return 0;
    }
    
    public static String BrandingTextColor() {
        if (color.textcolor == "pink") {
            return "§d";
        }
        if (color.textcolor == "blue") {
            return "§1";
        }
        if (color.textcolor == "red") {
            return "§c";
        }
        if (color.textcolor == "pink") {
            return "§d";
        }
        if (color.textcolor == "green") {
            return "§a";
        }
        if (color.textcolor == "cyan") {
            return "§b";
        }
        if (color.textcolor == "orange") {
            return "§6";
        }
        if (color.textcolor == "white") {
            return "§f";
        }
        if (color.textcolor == "yellow") {
            return "§e";
        }
        return "0000000000";
    }
    
    static {
        color.mainColor = "cyan";
        color.textcolor = color.mainColor;
    }
}
