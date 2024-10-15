package com.resnik.simplecompact.block;

import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SugarBlock extends ColoredFallingBlock {

    public SugarBlock(Properties properties) {
        super(new ColorRGBA(0xFF_FF_FF_FF), properties);
    }

    @Override
    protected @NotNull List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        return List.of(new ItemStack(Items.SUGAR, 9));
    }

}
