package net.itshamza.cv.entity.client;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.custom.PixieAttEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PixieAttModel extends AnimatedGeoModel<PixieAttEntity> {

    @Override
    public ResourceLocation getModelResource(PixieAttEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "geo/pixie_att.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PixieAttEntity object) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "textures/entity/pixie/pixie_att.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PixieAttEntity animatable) {
        return new ResourceLocation(CommunityVotes.MOD_ID, "animations/pixie_reg.animation.json");
    }
}
