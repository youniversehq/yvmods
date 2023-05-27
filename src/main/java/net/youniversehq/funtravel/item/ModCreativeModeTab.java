package net.youniversehq.funtravel.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FUNTRAVEL_TAB = new CreativeModeTab("funtraveltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRAVERSIUM.get());
        }
    };
}
