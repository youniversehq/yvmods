package net.youniversehq.funtravel.Block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.youniversehq.funtravel.FunTravel;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FunTravel.MOD_ID);


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
