//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.item;

import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TheCursedModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS;
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB;

    public TheCursedModCreativeModeTabs() {
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    static {
        CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "thecursedmod");
        EXAMPLE_TAB = CREATIVE_MODE_TABS.register("cursed_mod_tab", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.thecursedmod.cursed_mod")).withTabsBefore(new ResourceKey[]{CreativeModeTabs.COMBAT}).icon(() -> ((Item)TheCursedModItems.CURSED_MODE.get()).getDefaultInstance()).displayItems((parameters, output) -> {
            output.accept((ItemLike)TheCursedModItems.CURSED_ITEM.get());
            output.accept((ItemLike)TheCursedModItems.RAW_CURSED_ITEM.get());
            output.accept((ItemLike)TheCursedModItems.FORGER.get());
            output.accept((ItemLike)TheCursedModItems.SUPERSTAR.get());
            output.accept((ItemLike)TheCursedModItems.OVERWARTS.get());
            output.accept((ItemLike)TheCursedModItems.GOLDMAKER.get());
            output.accept((ItemLike)TheCursedModBlocks.CURSED_BLOCK.get());
            output.accept((ItemLike)TheCursedModBlocks.TRANSFORMER_BLOCK.get());
            output.accept((ItemLike)TheCursedModBlocks.CURSED_ORE.get());
            output.accept((ItemLike)TheCursedModBlocks.CURSED_DEEPSLATE_ORE.get());
        }).build());
    }
}
