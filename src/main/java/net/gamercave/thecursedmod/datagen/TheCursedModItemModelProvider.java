//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import net.gamercave.thecursedmod.item.TheCursedModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TheCursedModItemModelProvider extends ItemModelProvider {
    public TheCursedModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "thecursedmod", existingFileHelper);
    }

    protected void registerModels() {
        this.basicItem((Item)TheCursedModItems.CURSED_ITEM.get());
        this.basicItem((Item)TheCursedModItems.RAW_CURSED_ITEM.get());
        this.basicItem((Item)TheCursedModItems.FORGER.get());
        this.basicItem((Item)TheCursedModItems.GOLDMAKER.get());
        this.basicItem((Item)TheCursedModItems.SUPERSTAR.get());
        this.basicItem((Item)TheCursedModItems.CURSED_MODE.get());
        this.basicItem((Item)TheCursedModItems.OVERWARTS.get());
    }
}
