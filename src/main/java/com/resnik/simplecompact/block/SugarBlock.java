package com.resnik.simplecompact.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;

import javax.annotation.Nullable;
import java.util.List;

public class SugarBlock extends ColoredFallingBlock {

    @Nullable
    protected ResourceKey<LootTable> drops;

    public SugarBlock(Properties properties) {
        super(new ColorRGBA(0xFF_FF_FF_FF), properties);
    }

    @Override
    protected List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        return List.of(new ItemStack(Items.SUGAR, 9));
    }

}
