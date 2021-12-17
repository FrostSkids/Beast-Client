// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.mods.impl;

import Ctrl.BeastClient.ChromaText;
import net.minecraft.client.Minecraft;
import Ctrl.BeastClient.Client;
import Ctrl.BeastClient.ModToggle;
import Ctrl.BeastClient.gui.hud.ScreenPosition;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.util.BlockPos;
import Ctrl.BeastClient.mods.ModDraggable;

public class ModBiom extends ModDraggable
{
    @Override
    public int getWidth() {
        final BlockPos blockpos = new BlockPos(this.mc.getRenderViewEntity().posX, this.mc.getRenderViewEntity().getEntityBoundingBox().minY, this.mc.getRenderViewEntity().posZ);
        final Chunk chunk = this.mc.theWorld.getChunkFromBlockCoords(blockpos);
        return ModBiom.font.getStringWidth("Biome" + chunk.getBiome(blockpos, this.mc.theWorld.getWorldChunkManager()).biomeName);
    }
    
    @Override
    public int getHeight() {
        return ModBiom.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition pos) {
        if (ModToggle.loadEnabledFromFile("ModPosition") && Client.ModBiom) {
            if (!ModToggle.loadEnabledFromFile("Chroma")) {
                final BlockPos blockpos = new BlockPos(this.mc.getRenderViewEntity().posX, this.mc.getRenderViewEntity().getEntityBoundingBox().minY, this.mc.getRenderViewEntity().posZ);
                final Chunk chunk = this.mc.theWorld.getChunkFromBlockCoords(blockpos);
                Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(ModY.color() + "[§fBiome: " + chunk.getBiome(blockpos, this.mc.theWorld.getWorldChunkManager()).biomeName + ModY.color() + "]", (float)pos.getAbsoluteX(), (float)pos.getAbsoluteY(), -1);
            }
            else {
                final BlockPos blockpos = new BlockPos(this.mc.getRenderViewEntity().posX, this.mc.getRenderViewEntity().getEntityBoundingBox().minY, this.mc.getRenderViewEntity().posZ);
                final Chunk chunk = this.mc.theWorld.getChunkFromBlockCoords(blockpos);
                ChromaText.drawChromaString("[Biome: " + chunk.getBiome(blockpos, this.mc.theWorld.getWorldChunkManager()).biomeName + "]", pos.getAbsoluteX(), pos.getAbsoluteY(), true);
            }
        }
    }
}
