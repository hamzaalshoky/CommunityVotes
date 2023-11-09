package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.PixieRegEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PixieRegModel extends AnimatedGeoModel<PixieRegEntity> {

    @Override
    public ResourceLocation getModelResource(PixieRegEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/pixie_reg.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PixieRegEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/pixie/pixie_reg.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PixieRegEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/pixie_reg.animation.json");
    }
}
