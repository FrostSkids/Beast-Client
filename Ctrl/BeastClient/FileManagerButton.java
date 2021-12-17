// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import com.google.gson.Gson;

public class FileManagerButton
{
    private static Gson gson;
    private static File ROOT_DIR;
    public static File TOGGLE_DIR;
    
    public static void init() {
        if (!FileManagerButton.ROOT_DIR.exists()) {
            FileManagerButton.ROOT_DIR.mkdirs();
        }
        if (!FileManagerButton.TOGGLE_DIR.exists()) {
            FileManagerButton.TOGGLE_DIR.mkdirs();
        }
    }
    
    public static Gson getGson() {
        return FileManagerButton.gson;
    }
    
    public static boolean writeJsonToFile(final File file, final Object obj) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            final FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(FileManagerButton.gson.toJson(obj).getBytes());
            outputStream.flush();
            outputStream.close();
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static <T> T readFromJson(final File file, final Class<T> c) {
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            final StringBuilder builder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line);
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            return (T)FileManagerButton.gson.fromJson(builder.toString(), (Class)c);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    static {
        FileManagerButton.gson = new Gson();
        FileManagerButton.ROOT_DIR = new File("client");
        FileManagerButton.TOGGLE_DIR = new File(FileManagerButton.ROOT_DIR, "Toggle");
    }
}
