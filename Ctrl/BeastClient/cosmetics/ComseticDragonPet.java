// 
// Decompiled by Procyon v0.5.36
// 

package Ctrl.BeastClient.cosmetics;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import Ctrl.BeastClient.cosmetics.util.CosmeticModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import Ctrl.BeastClient.cosmetics.util.CosmeticBase;

public class ComseticDragonPet extends CosmeticBase
{
    private final CosmeticVilligerNose2 EggsModel;
    
    public ComseticDragonPet(final RenderPlayer renderPlayer) {
        super(renderPlayer);
        this.EggsModel = new CosmeticVilligerNose2(renderPlayer);
    }
    
    @Override
    public void render(final AbstractClientPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        GL11.glPushMatrix();
        if (player.isSneaking()) {
            GlStateManager.translate(0.0, 0.245, 0.0);
        }
        final ResourceLocation enderDragonTextures = new ResourceLocation("textures/entity/enderdragon/dragon.png");
        Minecraft.getMinecraft().getTextureManager().bindTexture(enderDragonTextures);
        if (player == Minecraft.getMinecraft().thePlayer) {
            this.EggsModel.render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
        GL11.glPopMatrix();
    }
    
    public class CosmeticVilligerNose2 extends CosmeticModelBase
    {
        ModelRenderer head;
        ModelRenderer spine;
        ModelRenderer jaw;
        ModelRenderer body;
        ModelRenderer rearLeg;
        ModelRenderer frontLeg;
        ModelRenderer rearLegTip;
        ModelRenderer frontLegTip;
        ModelRenderer rearFoot;
        ModelRenderer frontFoot;
        ModelRenderer wing;
        ModelRenderer wingTip;
        private float partialTicks;
        public float prevAnimTime;
        
        public CosmeticVilligerNose2(final RenderPlayer player) {
            super(player);
            this.textureWidth = 256;
            this.textureHeight = 256;
            this.setTextureOffset("body.body", 0, 0);
            this.setTextureOffset("wing.skin", -56, 88);
            this.setTextureOffset("wingtip.skin", -56, 144);
            this.setTextureOffset("rearleg.main", 0, 0);
            this.setTextureOffset("rearfoot.main", 112, 0);
            this.setTextureOffset("rearlegtip.main", 196, 0);
            this.setTextureOffset("head.upperhead", 112, 30);
            this.setTextureOffset("wing.bone", 112, 88);
            this.setTextureOffset("head.upperlip", 176, 44);
            this.setTextureOffset("jaw.jaw", 176, 65);
            this.setTextureOffset("frontleg.main", 112, 104);
            this.setTextureOffset("wingtip.bone", 112, 136);
            this.setTextureOffset("frontfoot.main", 144, 104);
            this.setTextureOffset("neck.box", 192, 104);
            this.setTextureOffset("frontlegtip.main", 226, 138);
            this.setTextureOffset("body.scale", 220, 53);
            this.setTextureOffset("head.scale", 0, 0);
            this.setTextureOffset("neck.scale", 48, 0);
            this.setTextureOffset("head.nostril", 112, 0);
            final float f = -16.0f;
            (this.head = new ModelRenderer(this, "head")).addBox("upperlip", -6.0f, -1.0f, -8.0f + f, 12, 5, 16);
            this.head.addBox("upperhead", -8.0f, -8.0f, 6.0f + f, 16, 16, 16);
            this.head.mirror = true;
            this.head.addBox("scale", -5.0f, -12.0f, 12.0f + f, 2, 4, 6);
            this.head.addBox("nostril", -5.0f, -3.0f, -6.0f + f, 2, 2, 4);
            this.head.mirror = false;
            this.head.addBox("scale", 3.0f, -12.0f, 12.0f + f, 2, 4, 6);
            this.head.addBox("nostril", 3.0f, -3.0f, -6.0f + f, 2, 2, 4);
            (this.jaw = new ModelRenderer(this, "jaw")).setRotationPoint(0.0f, 4.0f, 8.0f + f);
            this.jaw.addBox("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
            this.head.addChild(this.jaw);
            (this.spine = new ModelRenderer(this, "neck")).addBox("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
            this.spine.addBox("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
            (this.body = new ModelRenderer(this, "body")).setRotationPoint(0.0f, 4.0f, 8.0f);
            this.body.addBox("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
            this.body.addBox("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
            this.body.addBox("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
            this.body.addBox("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
            (this.wing = new ModelRenderer(this, "wing")).setRotationPoint(-12.0f, 5.0f, 2.0f);
            this.wing.addBox("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
            this.wing.addBox("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
            (this.wingTip = new ModelRenderer(this, "wingtip")).setRotationPoint(-56.0f, 0.0f, 0.0f);
            this.wingTip.addBox("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
            this.wingTip.addBox("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
            this.wing.addChild(this.wingTip);
            (this.frontLeg = new ModelRenderer(this, "frontleg")).setRotationPoint(-12.0f, 20.0f, 2.0f);
            this.frontLeg.addBox("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
            (this.frontLegTip = new ModelRenderer(this, "frontlegtip")).setRotationPoint(0.0f, 20.0f, -1.0f);
            this.frontLegTip.addBox("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
            this.frontLeg.addChild(this.frontLegTip);
            (this.frontFoot = new ModelRenderer(this, "frontfoot")).setRotationPoint(0.0f, 23.0f, 0.0f);
            this.frontFoot.addBox("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
            this.frontLegTip.addChild(this.frontFoot);
            (this.rearLeg = new ModelRenderer(this, "rearleg")).setRotationPoint(-16.0f, 16.0f, 42.0f);
            this.rearLeg.addBox("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
            (this.rearLegTip = new ModelRenderer(this, "rearlegtip")).setRotationPoint(0.0f, 32.0f, -4.0f);
            this.rearLegTip.addBox("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
            this.rearLeg.addChild(this.rearLegTip);
            (this.rearFoot = new ModelRenderer(this, "rearfoot")).setRotationPoint(0.0f, 31.0f, 4.0f);
            this.rearFoot.addBox("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
            this.rearLegTip.addChild(this.rearFoot);
        }
        
        @Override
        public void setLivingAnimations(final EntityLivingBase entitylivingbaseIn, final float p_78086_2_, final float p_78086_3_, final float partialTickTime) {
            this.partialTicks = partialTickTime;
        }
        
        @Override
        public void render(final Entity entityIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float headYaw, final float headPitch, final float scale) {
            GlStateManager.pushMatrix();
            final float f111 = ageInTicks / 100.0f;
            final float f112 = f111 * 3.1415927f + 1.0f;
            GlStateManager.translate(0.0f, -(float)(Math.sin(f112 + 1.0f) + 0.5) * 0.08f, 0.0f);
            GlStateManager.scale(0.1, 0.1, 0.1);
            GlStateManager.translate(9.0f, 0.0f, 0.0f);
            final EntityPlayer entitydragon = (EntityPlayer)entityIn;
            this.jaw.rotateAngleX = (float)(Math.sin(6.2831854820251465) + 1.0) * 0.2f;
            float f113 = (float)(Math.sin(5.2831854820251465) + 1.0);
            f113 = (f113 * f113 * 1.0f + f113 * 2.0f) * 0.05f;
            GlStateManager.translate(0.0f, f113 - 2.0f, -3.0f);
            GlStateManager.rotate(f113 * 2.0f, 1.0f, 0.0f, 0.0f);
            float f114 = -30.0f;
            float f115 = 0.0f;
            final float f116 = 1.5f;
            f114 += 2.0f;
            float f117 = 6.2831855f;
            f114 = 20.0f;
            float f118 = -12.0f;
            for (int j = 0; j < 5; ++j) {
                final float f119 = (float)Math.cos(j * 0.45f + f117) * 0.15f;
                this.spine.rotationPointY = f114;
                this.spine.rotationPointZ = f118;
                this.spine.rotationPointX = f115;
                f114 += (float)(Math.sin(this.spine.rotateAngleX) * 10.0);
                f118 -= (float)(Math.cos(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
                f115 -= (float)(Math.sin(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
                this.spine.render(scale);
            }
            this.head.rotationPointY = f114;
            this.head.rotationPointZ = f118;
            this.head.rotationPointX = f115;
            this.head.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(-1.0f * f116 * 1.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.translate(0.0f, -1.0f, 0.0f);
            this.body.rotateAngleZ = 0.0f;
            this.body.render(scale);
            for (int j = 0; j < 2; ++j) {
                GlStateManager.enableCull();
                final float f119 = 6.2831855f;
                this.wing.rotateAngleX = 0.125f - (float)Math.cos(f119) * 0.2f;
                this.wing.rotateAngleY = 0.25f;
                this.wing.rotateAngleZ = (float)(Math.sin(f119) + 0.125) * 0.8f;
                this.wingTip.rotateAngleZ = -(float)(Math.sin(f119 + 2.0f) + 0.5) * 0.75f;
                this.rearLeg.rotateAngleX = 1.0f + f113 * 0.1f;
                this.rearLegTip.rotateAngleX = 0.5f + f113 * 0.1f;
                this.rearFoot.rotateAngleX = 0.75f + f113 * 0.1f;
                this.frontLeg.rotateAngleX = 1.3f + f113 * 0.1f;
                this.frontLegTip.rotateAngleX = -0.5f - f113 * 0.1f;
                this.frontFoot.rotateAngleX = 0.75f + f113 * 0.1f;
                this.frontLeg.render(scale);
                this.rearLeg.render(scale);
                GlStateManager.scale(-1.0f, 1.0f, 1.0f);
                if (j == 0) {
                    GlStateManager.cullFace(1028);
                }
            }
            GlStateManager.popMatrix();
            GlStateManager.cullFace(1029);
            GlStateManager.disableCull();
            float f120 = -(float)Math.sin(6.2831854820251465) * 0.0f;
            f117 = 6.2831855f;
            f114 = 10.0f;
            f118 = 60.0f;
            f115 = 0.0f;
            for (int k = 0; k < 12; ++k) {
                f120 += (float)(Math.sin(k * 0.45f + f117) * 0.05000000074505806);
                this.spine.rotationPointY = f114;
                this.spine.rotationPointZ = f118;
                this.spine.rotationPointX = f115;
                f114 += (float)(Math.sin(this.spine.rotateAngleX) * 10.0);
                f118 -= (float)(Math.cos(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
                f115 -= (float)(Math.sin(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
                this.spine.render(scale);
            }
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            final float f119 = ageInTicks / 100.0f;
            final float f121 = f119 * 3.1415927f + 1.0f;
            GlStateManager.translate(0.0f, -(float)(Math.sin(f121 + 1.0f) + 0.5) * 0.08f, 0.0f);
            GlStateManager.disableLighting();
            GlStateManager.scale(0.1, 0.1, 0.1);
            GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.translate(9.0, -3.0, 1.6);
            GlStateManager.translate(0.0, 0.2, 0.0);
            for (int jx = 0; jx < 2; ++jx) {
                final float f122 = System.currentTimeMillis() % 3000L / 3000.0f * 3.1415927f * 2.0f;
                this.wing.rotateAngleX = (float)Math.toRadians(-80.0) - (float)Math.cos(f122) * 0.4f;
                this.wing.rotateAngleY = (float)Math.toRadians(30.0) + (float)Math.sin(f122) * 0.2f;
                this.wing.rotateAngleZ = (float)Math.toRadians(20.0);
                this.wingTip.rotateAngleZ = -(float)(Math.sin(f122 + 2.0f) + 0.9) * 0.75f;
                this.wing.render(0.0625f);
                GlStateManager.scale(-1.0f, 1.0f, 1.0f);
                if (jx == 0) {}
            }
            GlStateManager.enableLighting();
            GlStateManager.popMatrix();
        }
        
        private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
            model.rotateAngleX = x;
            model.rotateAngleY = y;
            model.rotateAngleZ = z;
        }
        
        private float updateRotations(double p_78214_1_) {
            while (p_78214_1_ >= 180.0) {
                p_78214_1_ -= 360.0;
            }
            while (p_78214_1_ < -180.0) {
                p_78214_1_ += 360.0;
            }
            return (float)p_78214_1_;
        }
    }
}
