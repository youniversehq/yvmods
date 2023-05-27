package net.youniversehq.funtravel.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.youniversehq.funtravel.FunTravel;

import java.security.cert.Certificate;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FunTravel.MOD_ID);

    // Mod items below
    public static final RegistryObject<Item> TRAVERSIUM = ITEMS.register("traversium",
            () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MISC)));


    // Register items onto the ModEventBus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
