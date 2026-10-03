//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class TheCursedModBlockStateProvider extends BlockStateProvider {
    public TheCursedModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, "thecursedmod", exFileHelper);
    }

    protected void registerStatesAndModels() {
        this.blockWithItem(TheCursedModBlocks.CURSED_BLOCK);
        this.blockWithItem(TheCursedModBlocks.CURSED_ORE);
        this.blockWithItem(TheCursedModBlocks.CURSED_DEEPSLATE_ORE);
        this.blockWithItem(TheCursedModBlocks.TRANSFORMER_BLOCK);
    }

    private void blockWithItem(DeferredBlock<Block> block) {
        this.simpleBlockWithItem((Block)block.get(), this.cubeAll((Block)block.get()));
    }
}
