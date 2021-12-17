// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

import java.io.File;

public class ModToggle
{
    public static File getFolder(final String mod) {
        final File file = new File(FileManager.MODS_DIR, mod);
        file.mkdirs();
        return file;
    }
    
    public static void saveIsEnabledToFile(final String mod, final Boolean b) {
        FileManager.writeJsonToFile(new File(getFolder(mod), "Enabled.json"), b);
    }
    
    public static Boolean loadEnabledFromFile(final String mod) {
        Boolean b = FileManager.readFromJson(new File(getFolder(mod), "Enabled.json"), Boolean.class);
        if (b == null) {
            b = true;
            saveIsEnabledToFile(mod, b);
        }
        return b;
    }
    
    public static void saveDoubleToFile(final String mod, final Double b) {
        FileManager.writeJsonToFile(new File(getFolder(mod), "Double.json"), b);
    }
    
    public static Double loadDoubleFromFile(final String mod) {
        Double b = FileManager.readFromJson(new File(getFolder(mod), "Double.json"), Double.class);
        if (b == null) {
            b = 1.0;
            saveDoubleToFile(mod, b);
        }
        return b;
    }
}
