package com.chadow97.sporium.item;

import com.chadow97.sporium.Sporium;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Sporium.MODID);

    //public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
    //        () -> new Item(BlockBehaviour.Properties.of(Material.STONE)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
