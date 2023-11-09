package net.itshamza.cv.item;

import net.itshamza.cv.CommunityVotes;
import net.itshamza.cv.entity.ModEntityCreator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CommunityVotes.MOD_ID);

    public static final RegistryObject<Item> MUSHROOM_SPIDER_SPAWN_EGG = ITEMS.register("mushroom_spider_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.MUSHROOM_SPIDER,10311589, 14003156,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));
    public static final RegistryObject<Item> PONYCORN_SPAWN_EGG = ITEMS.register("ponycorn_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.PONYCORN,10311589, 14003156,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));
    public static final RegistryObject<Item> UNICORN_SPAWN_EGG = ITEMS.register("unicorn_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.UNICORN,10311589, 14003156,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));
    public static final RegistryObject<Item> PIXIE_REG_SPAWN_EGG = ITEMS.register("pixie_reg_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.PIXIE_REG,16096445, 12871344,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));

    public static final RegistryObject<Item> PIXIE_DEF_SPAWN_EGG = ITEMS.register("pixie_def_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.PIXIE_DEF,5952987, 4427450,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));
    public static final RegistryObject<Item> PIXIE_ATT_SPAWN_EGG = ITEMS.register("pixie_att_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.PIXIE_ATT,15653959, 13210666,
                    new Item.Properties().tab(ModCreativeModeTabs.CV_TAB)));

   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
