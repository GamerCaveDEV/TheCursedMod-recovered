//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.gamercave.thecursedmod.item.TheCursedModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class TheCursedModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TheCursedModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> CURSEDITEM_SMELTABLES = List.of((ItemLike)TheCursedModItems.RAW_CURSED_ITEM.get(), (ItemLike)TheCursedModBlocks.CURSED_ORE.get(), (ItemLike)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, (ItemLike)TheCursedModBlocks.CURSED_BLOCK.get()).pattern("CCC").pattern("CCC").pattern("CCC").define('C', (ItemLike)TheCursedModItems.CURSED_ITEM.get()).unlockedBy(getHasName((ItemLike)TheCursedModItems.CURSED_ITEM.get()), has((ItemLike)TheCursedModItems.CURSED_ITEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, (ItemLike)TheCursedModItems.FORGER.get()).pattern("CIO").pattern("CGO").pattern("C O").define('C', Items.COPPER_INGOT).define('I', Items.IRON_BLOCK).define('G', Items.GOLD_BLOCK).define('O', Items.OBSIDIAN).unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, (ItemLike)TheCursedModItems.GOLDMAKER.get()).pattern("GDR").pattern("GOR").pattern("G R").define('R', Items.REDSTONE).define('D', Items.DIAMOND).define('G', Items.GOLD_BLOCK).define('O', Items.OBSERVER).unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, (ItemLike)TheCursedModBlocks.TRANSFORMER_BLOCK.get()).pattern(" D ").pattern("DGD").pattern("DID").define('D', Items.DIAMOND).define('I', Items.IRON_BLOCK).define('G', Items.GOLD_BLOCK).unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, (ItemLike)TheCursedModItems.SUPERSTAR.get()).pattern(" G ").pattern("B B").pattern(" G ").define('G', Items.GOLD_INGOT).define('B', Items.GOLD_BLOCK).unlockedBy(getHasName(Items.GOLD_BLOCK), has(Items.GOLD_BLOCK)).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, (ItemLike)TheCursedModItems.CURSED_ITEM.get(), 9).requires((ItemLike)TheCursedModBlocks.CURSED_BLOCK.get()).unlockedBy(getHasName((ItemLike)TheCursedModBlocks.CURSED_BLOCK.get()), has((ItemLike)TheCursedModBlocks.CURSED_BLOCK.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 9).requires((ItemLike)TheCursedModBlocks.TRANSFORMER_BLOCK.get()).unlockedBy(getHasName((ItemLike)TheCursedModBlocks.TRANSFORMER_BLOCK.get()), has((ItemLike)TheCursedModBlocks.TRANSFORMER_BLOCK.get())).save(pRecipeOutput);
        oreSmelting(pRecipeOutput, CURSEDITEM_SMELTABLES, RecipeCategory.MISC, (ItemLike)TheCursedModItems.CURSED_ITEM.get(), 250.0F, 200, "cursed");
        oreBlasting(pRecipeOutput, CURSEDITEM_SMELTABLES, RecipeCategory.MISC, (ItemLike)TheCursedModItems.CURSED_ITEM.get(), 500.0F, 100, "cursed");
    }
}
