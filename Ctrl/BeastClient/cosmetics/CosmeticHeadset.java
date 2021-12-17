// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.cosmetics;

import Ctrl.BeastClient.cosmetics.util.Rainbow;
import net.minecraft.client.model.ModelBase;
import Ctrl.BeastClient.cosmetics.util.CosmeticModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import Ctrl.BeastClient.Client;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import Ctrl.BeastClient.cosmetics.util.CosmeticBase;

public class CosmeticHeadset extends CosmeticBase
{
    private final HeadSetRenderer headsetModel;
    
    public CosmeticHeadset(final RenderPlayer renderPlayer) {
        super(renderPlayer);
        this.headsetModel = new HeadSetRenderer(renderPlayer);
    }
    
    @Override
    public void render(final AbstractClientPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        GL11.glPushMatrix();
        if (player.isSneaking()) {
            GlStateManager.translate(0.0, 0.245, 0.0);
        }
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("white.png"));
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GlStateManager.rotate(netHeadYaw, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(headPitch, 1.0f, 0.0f, 0.0f);
        if (player == Minecraft.getMinecraft().thePlayer && Client.Headset) {
            this.headsetModel.render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
        GL11.glPopMatrix();
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public class HeadSetRenderer extends CosmeticModelBase
    {
        ModelRenderer Left1;
        ModelRenderer Left2;
        ModelRenderer Left3;
        ModelRenderer Left4;
        ModelRenderer Shape1;
        ModelRenderer Left5;
        ModelRenderer Left6;
        ModelRenderer Right1;
        ModelRenderer Right2;
        ModelRenderer Right3;
        ModelRenderer Right4;
        ModelRenderer Right5;
        ModelRenderer Right6;
        ModelRenderer Right7;
        ModelRenderer Upper1;
        ModelRenderer Upper2;
        ModelRenderer Upper3;
        
        public HeadSetRenderer(final RenderPlayer player) {
            super(player);
            this.textureWidth = 64;
            this.textureHeight = 32;
            (this.Left1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 2);
            this.Left1.setRotationPoint(-5.0f, -5.0f, -1.0f);
            this.Left1.setTextureSize(64, 32);
            this.Left1.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left1, 0.0f, 0.0f, 0.0f);
            (this.Left2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
            this.Left2.setRotationPoint(-5.0f, -5.0f, 1.0f);
            this.Left2.setTextureSize(64, 32);
            this.Left2.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left2, 0.0f, 0.0f, 0.0f);
            (this.Left3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
            this.Left3.setRotationPoint(-5.0f, -5.0f, -2.0f);
            this.Left3.setTextureSize(64, 32);
            this.Left3.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left3, 0.0f, 0.0f, 0.0f);
            (this.Left4 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 2);
            this.Left4.setRotationPoint(-5.3f, -5.0f, -1.0f);
            this.Left4.setTextureSize(64, 32);
            this.Left4.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left4, 0.0f, 0.0f, 0.0f);
            (this.Shape1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 2);
            this.Shape1.setRotationPoint(4.0f, -5.0f, -1.0f);
            this.Shape1.setTextureSize(64, 32);
            this.Shape1.mirror = true;
            CosmeticHeadset.this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
            (this.Left5 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
            this.Left5.setRotationPoint(-5.0f, -6.0f, -1.0f);
            this.Left5.setTextureSize(64, 32);
            this.Left5.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left5, 0.0f, 0.0f, 0.0f);
            (this.Left6 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
            this.Left6.setRotationPoint(-5.0f, -3.0f, -1.0f);
            this.Left6.setTextureSize(64, 32);
            this.Left6.mirror = true;
            CosmeticHeadset.this.setRotation(this.Left6, 0.0f, 0.0f, 0.0f);
            (this.Right1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 2);
            this.Right1.setRotationPoint(4.3f, -5.0f, -1.0f);
            this.Right1.setTextureSize(64, 32);
            this.Right1.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right1, 0.0f, 0.0f, 0.0f);
            (this.Right2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
            this.Right2.setRotationPoint(4.0f, -6.0f, -1.0f);
            this.Right2.setTextureSize(64, 32);
            this.Right2.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right2, 0.0f, 0.0f, 0.0f);
            (this.Right3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
            this.Right3.setRotationPoint(4.0f, -5.0f, 1.0f);
            this.Right3.setTextureSize(64, 32);
            this.Right3.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right3, 0.0f, 0.0f, 0.0f);
            (this.Right4 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
            this.Right4.setRotationPoint(4.0f, -5.0f, -2.0f);
            this.Right4.setTextureSize(64, 32);
            this.Right4.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right4, 0.0f, 0.0f, 0.0f);
            (this.Right5 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
            this.Right5.setRotationPoint(4.0f, -3.0f, -1.0f);
            this.Right5.setTextureSize(64, 32);
            this.Right5.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right5, 0.0f, 0.0f, 0.0f);
            (this.Right6 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 8, 1, 2);
            this.Right6.setRotationPoint(-4.0f, -9.0f, -1.0f);
            this.Right6.setTextureSize(64, 32);
            this.Right6.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right6, 0.0f, 0.0f, 0.0f);
            (this.Right7 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 2);
            this.Right7.setRotationPoint(4.0f, -9.0f, -1.0f);
            this.Right7.setTextureSize(64, 32);
            this.Right7.mirror = true;
            CosmeticHeadset.this.setRotation(this.Right7, 0.0f, 0.0f, 0.0f);
            (this.Upper1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 2);
            this.Upper1.setRotationPoint(-5.0f, -9.0f, -1.0f);
            this.Upper1.setTextureSize(64, 32);
            this.Upper1.mirror = true;
            CosmeticHeadset.this.setRotation(this.Upper1, 0.0f, 0.0f, 0.0f);
            (this.Upper2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 4);
            this.Upper2.setRotationPoint(4.0f, -4.0f, 2.0f);
            this.Upper2.setTextureSize(64, 32);
            this.Upper2.mirror = true;
            CosmeticHeadset.this.setRotation(this.Upper2, 0.0f, 0.0f, 0.0f);
            (this.Upper3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 1);
            this.Upper3.setRotationPoint(2.0f, -4.0f, 5.0f);
            this.Upper3.setTextureSize(64, 32);
            this.Upper3.mirror = true;
            CosmeticHeadset.this.setRotation(this.Upper3, 0.0f, 0.0f, 0.0f);
        }
        
        @Override
        public void render(final Entity entityIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float headYaw, final float headPitch, final float scale) {
            GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.pushMatrix();
            this.Left1.render(scale);
            this.Left2.render(scale);
            this.Left3.render(scale);
            this.Shape1.render(scale);
            this.Left5.render(scale);
            this.Left6.render(scale);
            this.Right2.render(scale);
            this.Right3.render(scale);
            this.Right4.render(scale);
            this.Right5.render(scale);
            this.Right6.render(scale);
            this.Right7.render(scale);
            this.Upper1.render(scale);
            GlStateManager.translate(0.0, 0.04, 0.0);
            this.Upper2.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.color(0.0f, 0.0f, 0.0f);
            GlStateManager.translate(0.0, 0.04, 0.0);
            this.Upper3.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("", 0.0f, 0.0f, Rainbow.rainbowEffect(1L, 1.0f).getRGB());
            this.Left4.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("", 0.0f, 0.0f, Rainbow.rainbowEffect(1L, 1.0f).getRGB());
            this.Right1.render(scale);
            GlStateManager.popMatrix();
        }
    }
}
