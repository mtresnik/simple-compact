package com.resnik.simplecompact.block;

import com.resnik.simplecompact.SimpleCompact;
import com.resnik.simplecompact.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SimpleCompact.MOD_ID);

    public static final DeferredBlock<Block> COMPACT_FURNACE = registerBlock("compact_furnace",
            () -> new CompactFurnaceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(3.5F).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SUGAR_BLOCK = registerBlock("sugar_block",
            () -> new SugarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
