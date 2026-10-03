//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import java.util.concurrent.CompletableFuture;
import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class TheCursedModBlockTagProvider extends BlockTagsProvider {
    public TheCursedModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, "thecursedmod", existingFileHelper);
    }

    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add((Block)TheCursedModBlocks.CURSED_ORE.get()).add((Block)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get()).add((Block)TheCursedModBlocks.CURSED_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add((Block)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add((Block)TheCursedModBlocks.CURSED_ORE.get()).add((Block)TheCursedModBlocks.CURSED_BLOCK.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL).add((Block)TheCursedModBlocks.TRANSFORMER_BLOCK.get());
    }
}
