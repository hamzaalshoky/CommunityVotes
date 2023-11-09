package net.itshamza.cv.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab CV_TAB = new CreativeModeTab("cv_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MUSHROOM_SPIDER_SPAWN_EGG.get());
        }
    };
}
