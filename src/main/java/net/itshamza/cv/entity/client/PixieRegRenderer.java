package net.itshamza.cv.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.itshamza.cv.entity.custom.PixieRegEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PixieRegRenderer extends GeoEntityRenderer<PixieRegEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("cv:textures/entity/pixie/pixie_reg.png");

    public PixieRegRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PixieRegModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(PixieRegEntity instance) {
        return TEXTURE;
    }


    @Override
    public RenderType getRenderType(PixieRegEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
