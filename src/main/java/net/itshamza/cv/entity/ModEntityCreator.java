package net.itshamza.cv.entity;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.client.*;
import net.itshamza.cv.entity.custom.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CommunityVotes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityCreator {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CommunityVotes.MOD_ID);

    // REGESTRIES

    public static final RegistryObject<EntityType<MushroomSpiderEntity>> MUSHROOM_SPIDER = ENTITY_TYPES.register("mushroom_spider", () -> EntityType.Builder.of(MushroomSpiderEntity::new, MobCategory.CREATURE).sized(0.8F, 0.4F).build(new ResourceLocation(CommunityVotes.MOD_ID, "mushroom_spider").toString()));
    public static final RegistryObject<EntityType<PonycornEntity>> PONYCORN = ENTITY_TYPES.register("ponycorn", () -> EntityType.Builder.of(PonycornEntity::new, MobCategory.CREATURE).sized(0.8F, 1.0F).build(new ResourceLocation(CommunityVotes.MOD_ID, "ponycorn").toString()));
    public static final RegistryObject<EntityType<UnicornEntity>> UNICORN = ENTITY_TYPES.register("unicorn", () -> EntityType.Builder.of(UnicornEntity::new, MobCategory.CREATURE).sized(0.8F, 1.0F).build(new ResourceLocation(CommunityVotes.MOD_ID, "unicorn").toString()));
    public static final RegistryObject<EntityType<PixieRegEntity>> PIXIE_REG = ENTITY_TYPES.register("pixie_reg", () -> EntityType.Builder.of(PixieRegEntity::new, MobCategory.CREATURE).sized(0.5F, 0.5F).build(new ResourceLocation(CommunityVotes.MOD_ID, "pixie_reg").toString()));
    public static final RegistryObject<EntityType<PixieDefEntity>> PIXIE_DEF = ENTITY_TYPES.register("pixie_def", () -> EntityType.Builder.of(PixieDefEntity::new, MobCategory.CREATURE).sized(0.5F, 0.5F).build(new ResourceLocation(CommunityVotes.MOD_ID, "pixie_def").toString()));
    public static final RegistryObject<EntityType<PixieAttEntity>> PIXIE_ATT = ENTITY_TYPES.register("pixie_att", () -> EntityType.Builder.of(PixieAttEntity::new, MobCategory.CREATURE).sized(0.5F, 0.5F).build(new ResourceLocation(CommunityVotes.MOD_ID, "pixie_att").toString()));
    // ATTRIBUTES

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityCreator.MUSHROOM_SPIDER.get(), MushroomSpiderEntity.setAttributes());
        event.put(ModEntityCreator.PONYCORN.get(), PonycornEntity.setAttributes());
        event.put(ModEntityCreator.UNICORN.get(), UnicornEntity.setAttributes());
        event.put(ModEntityCreator.PIXIE_REG.get(), PixieRegEntity.setAttributes());
        event.put(ModEntityCreator.PIXIE_DEF.get(), PixieDefEntity.setAttributes());
        event.put(ModEntityCreator.PIXIE_ATT.get(), PixieAttEntity.setAttributes());
    }

    // RENDERERS

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityCreator.MUSHROOM_SPIDER.get(), MushroomSpiderRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.PONYCORN.get(), PonycornRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.UNICORN.get(), UnicornRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.PIXIE_REG.get(), PixieRegRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.PIXIE_DEF.get(), PixieDefRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.PIXIE_ATT.get(), PixieAttRenderer::new);
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
