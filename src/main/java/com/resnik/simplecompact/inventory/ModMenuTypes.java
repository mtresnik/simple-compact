package com.resnik.simplecompact.inventory;

import com.resnik.simplecompact.SimpleCompact;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, SimpleCompact.MOD_ID);

    public static final Supplier<MenuType<CompactFurnaceMenu>> COMPACT_FURNACE_MENU = MENUS.register("compact_furnace", () -> new MenuType(CompactFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }

}
