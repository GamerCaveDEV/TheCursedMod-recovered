//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import java.util.Set;
import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.gamercave.thecursedmod.item.TheCursedModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TheCursedModBlockLootTableProvider extends BlockLootSubProvider {
    protected TheCursedModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    protected void generate() {
        this.dropSelf((Block)TheCursedModBlocks.CURSED_BLOCK.get());
        this.dropSelf((Block)TheCursedModBlocks.TRANSFORMER_BLOCK.get());
        this.add((Block)TheCursedModBlocks.CURSED_ORE.get(), (block) -> this.createOreDrop((Block)TheCursedModBlocks.CURSED_ORE.get(), (Item)TheCursedModItems.RAW_CURSED_ITEM.get()));
        this.add((Block)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get(), (block) -> this.createOreDrop((Block)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get(), (Item)TheCursedModItems.RAW_CURSED_ITEM.get()));
    }

    protected Iterable<Block> getKnownBlocks() {
        return TheCursedModBlocks.BLOCKS.getEntries().stream().map((block) -> (Block)block.get()).toList();
    }
}
