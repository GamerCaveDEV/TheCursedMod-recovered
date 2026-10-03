//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.item;

import net.gamercave.thecursedmod.item.custom.ForgerItem;
import net.gamercave.thecursedmod.item.custom.FuelItem;
import net.gamercave.thecursedmod.item.custom.GoldMakerItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TheCursedModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("thecursedmod");
    public static final DeferredItem<Item> CURSED_ITEM;
    public static final DeferredItem<Item> RAW_CURSED_ITEM;
    public static final DeferredItem<Item> OVERWARTS;
    public static final DeferredItem<Item> FORGER;
    public static final DeferredItem<Item> GOLDMAKER;
    public static final DeferredItem<Item> SUPERSTAR;
    public static final DeferredItem<Item> CURSED_MODE;

    public TheCursedModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        CURSED_ITEM = ITEMS.register("cursed_item", () -> new Item(new Item.Properties()));
        RAW_CURSED_ITEM = ITEMS.register("raw_cursed_item", () -> new Item(new Item.Properties()));
        OVERWARTS = ITEMS.register("over_warts", () -> new Item((new Item.Properties()).food(TheCursedModFoodProperties.OVERWARTS)));
        FORGER = ITEMS.register("forger", () -> new ForgerItem((new Item.Properties()).durability(300)));
        GOLDMAKER = ITEMS.register("goldmaker", () -> new GoldMakerItem((new Item.Properties()).durability(200)));
        SUPERSTAR = ITEMS.register("the_superstar", () -> new FuelItem(new Item.Properties(), 2300));
        CURSED_MODE = ITEMS.register("cursed_mode", () -> new Item(new Item.Properties()));
    }
}
