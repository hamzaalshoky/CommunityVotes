package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.PixieDefEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PixieDefModel extends AnimatedGeoModel<PixieDefEntity> {

    @Override
    public ResourceLocation getModelResource(PixieDefEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/pixie_def.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PixieDefEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/pixie/pixie_def.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PixieDefEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/pixie_reg.animation.json");
    }
}
