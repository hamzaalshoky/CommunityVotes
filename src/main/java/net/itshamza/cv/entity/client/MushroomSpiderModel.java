package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.MushroomSpiderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MushroomSpiderModel extends AnimatedGeoModel<MushroomSpiderEntity> {

    @Override
    public ResourceLocation getModelResource(MushroomSpiderEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/mushroom_spider.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MushroomSpiderEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/mushroom_spider/mushroom_spider.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MushroomSpiderEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/mushroom_spider.animation.json");
    }
}
