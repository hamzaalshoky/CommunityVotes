package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.PonycornEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PonycornModel extends AnimatedGeoModel<PonycornEntity> {

    @Override
    public ResourceLocation getModelResource(PonycornEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/ponycorn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PonycornEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/ponycorn/ponycorn.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PonycornEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/ponycorn.animation.json");
    }
}
