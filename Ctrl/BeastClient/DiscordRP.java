// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient;

import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
import net.arikia.dev.drpc.DiscordEventHandlers;
import net.minecraft.client.Minecraft;

public class DiscordRP
{
    private boolean running;
    private long created;
    private Minecraft mc;
    
    public DiscordRP() {
        this.running = true;
        this.created = 0L;
    }
    
    public void start() {
        this.created = System.currentTimeMillis();
        final DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
            @Override
            public void apply(final DiscordUser user) {
                System.out.println("Willkommen" + user.username + "#" + user.discriminator);
                DiscordRP.this.update("", "");
            }
        }).build();
        DiscordRPC.discordInitialize(Client.DiscordID, handlers, true);
        new Thread("Discord RPC Callback") {
            @Override
            public void run() {
                while (DiscordRP.this.running) {
                    DiscordRPC.discordRunCallbacks();
                }
            }
        }.start();
        if (!this.running) {
            this.mc.shutdown();
        }
    }
    
    public void shutdown() {
        this.running = false;
        DiscordRPC.discordShutdown();
    }
    
    public void update(final String firstLine, final String secondLine) {
        final DiscordRichPresence.Builder b = new DiscordRichPresence.Builder(secondLine);
        if (b != null) {
            b.setBigImage("large", "");
            b.setDetails(firstLine);
            b.setStartTimestamps(this.created);
            DiscordRPC.discordUpdatePresence(b.build());
        }
        else {
            System.exit(0);
        }
    }
}
