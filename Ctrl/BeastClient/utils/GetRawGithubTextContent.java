// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.utils;

import java.io.Writer;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetRawGithubTextContent
{
    public static String getText(String link) {
        URL Url = null;
        try {
            Url = new URL(link);
        }
        catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        HttpURLConnection Http = null;
        try {
            Http = (HttpURLConnection)Url.openConnection();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        Map<String, List<String>> Header = Http.getHeaderFields();
        for (final String header : Header.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = Header.get("Location").get(0);
                try {
                    Url = new URL(link);
                }
                catch (MalformedURLException e3) {
                    e3.printStackTrace();
                }
                try {
                    Http = (HttpURLConnection)Url.openConnection();
                }
                catch (IOException e4) {
                    e4.printStackTrace();
                }
                Header = Http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = Http.getInputStream();
        }
        catch (IOException e5) {
            e5.printStackTrace();
        }
        String Response = null;
        try {
            Response = GetStringFromStream(Stream);
        }
        catch (IOException e4) {
            e4.printStackTrace();
        }
        return Response;
    }
    
    private static String GetStringFromStream(final InputStream Stream) throws IOException {
        if (Stream != null) {
            final Writer Writer = new StringWriter();
            final char[] Buffer = new char[2048];
            try {
                final Reader Reader = new BufferedReader(new InputStreamReader(Stream, "UTF-8"));
                int counter;
                while ((counter = Reader.read(Buffer)) != -1) {
                    Writer.write(Buffer, 0, counter);
                }
            }
            finally {
                Stream.close();
            }
            return Writer.toString();
        }
        return "Could not connect";
    }
}
