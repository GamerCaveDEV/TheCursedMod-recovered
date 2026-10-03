//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.block;

import java.util.function.Supplier;
import net.gamercave.thecursedmod.block.custom.TransformerBlock;
import net.gamercave.thecursedmod.item.TheCursedModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TheCursedModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("thecursedmod");
    public static final DeferredBlock<Block> CURSED_BLOCK = registerBlock("cursed_block", () -> new Block(Properties.of().strength(4.0F).destroyTime(3.0F).sound(SoundType.ANVIL)));
    public static final DeferredBlock<Block> CURSED_ORE = registerBlock("cursed_ore", () -> new DropExperienceBlock(UniformInt.of(9999, 99999), Properties.of().strength(4.0F).destroyTime(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> CURSED_DEEPSLATE_ORE = registerBlock("cursed_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(999999999, 999999999), Properties.of().strength(5.0F).destroyTime(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRANSFORMER_BLOCK = registerBlock("transformer_block", () -> new TransformerBlock(Properties.of().strength(2.0F).requiresCorrectToolForDrops()));

    public TheCursedModBlocks() {
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        TheCursedModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
