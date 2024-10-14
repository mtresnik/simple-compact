package com.resnik.simplecompact.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.crafting.RecipeType;

public class CompactFurnaceMenu extends AbstractFurnaceMenu {

    public CompactFurnaceMenu(int containerId, Inventory playerInventory) {
        super(ModMenuTypes.COMPACT_FURNACE_MENU.get(), RecipeType.SMELTING, RecipeBookType.FURNACE, containerId, playerInventory);
    }

    public CompactFurnaceMenu(int containerId, Inventory playerInventory, Container furnaceContainer, ContainerData furnaceData) {
        super(ModMenuTypes.COMPACT_FURNACE_MENU.get(), RecipeType.SMELTING, RecipeBookType.FURNACE, containerId, playerInventory, furnaceContainer, furnaceData);
    }

}
