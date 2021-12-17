// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.cosmetics;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.model.ModelBiped;

public abstract class Cosmetic extends ModelBiped implements LayerRenderer<AbstractClientPlayer>
{
    ModelBiped playerModel;
    
    public Cosmetic(final RenderPlayer player) {
        this.playerModel = player.getMainModel();
    }
    
    @Override
    public void doRenderLayer(final AbstractClientPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float headYaw, final float headPitch, final float scale) {
        if (player.hasPlayerInfo() && !player.isInvisible()) {
            this.render(player, limbSwing, limbSwingAmount, partialTicks, ageInTicks, headYaw, headPitch, scale);
        }
    }
    
    public abstract void render(final AbstractClientPlayer p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7);
    
    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
    
    private static float Sigmoid(final double value) {
        return 1.0f / (1.0f + (float)Math.exp(-value));
    }
}
