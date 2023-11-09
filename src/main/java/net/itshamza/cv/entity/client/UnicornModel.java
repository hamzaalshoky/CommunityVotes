package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.UnicornEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UnicornModel extends AnimatedGeoModel<UnicornEntity> {

    @Override
    public ResourceLocation getModelResource(UnicornEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/unicorn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UnicornEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/unicorn/unicorn.png");
    }

    @Override
    public ResourceLocation getAnimationResource(UnicornEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/unicorn.animation.json");
    }
}
