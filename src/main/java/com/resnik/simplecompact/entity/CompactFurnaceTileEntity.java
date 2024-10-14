package com.resnik.simplecompact.entity;

import com.resnik.simplecompact.inventory.CompactFurnaceMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CompactFurnaceTileEntity extends AbstractFurnaceBlockEntity {
    public CompactFurnaceTileEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.COMPACT_FURNACE.get(), pos, blockState, RecipeType.SMELTING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("block.simplecompact.compact_furnace");
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int id, Inventory player) {
        return new CompactFurnaceMenu(id, player, this, this.dataAccess);
    }
}
