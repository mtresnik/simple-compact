package com.resnik.simplecompact.item;

import com.resnik.simplecompact.SimpleCompact;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimpleCompact.MOD_ID);

    public static final DeferredItem<Item> COMPACTING_GEM = ITEMS.register("compacting_gem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
