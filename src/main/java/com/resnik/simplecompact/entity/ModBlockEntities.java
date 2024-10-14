package com.resnik.simplecompact.entity;

import com.resnik.simplecompact.SimpleCompact;
import com.resnik.simplecompact.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SimpleCompact.MOD_ID);

    public static final Supplier<BlockEntityType<CompactFurnaceTileEntity>> COMPACT_FURNACE = BLOCK_ENTITIES.register(
            "compact_furnace",
            () -> BlockEntityType.Builder.of(CompactFurnaceTileEntity::new, ModBlocks.COMPACT_FURNACE.get()).build(null)
    );


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
