//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod;

import com.mojang.logging.LogUtils;
import net.gamercave.thecursedmod.block.TheCursedModBlocks;
import net.gamercave.thecursedmod.datagen.TheCursedModDataGenerators;
import net.gamercave.thecursedmod.item.TheCursedModCreativeModeTabs;
import net.gamercave.thecursedmod.item.TheCursedModItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig.Type;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod("thecursedmod")
public class The_Cursed_Mod {
    public static final String MOD_ID = "thecursedmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public The_Cursed_Mod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        TheCursedModCreativeModeTabs.register(modEventBus);
        TheCursedModItems.register(modEventBus);
        TheCursedModBlocks.register(modEventBus);
        modEventBus.addListener(TheCursedModDataGenerators::gatherData);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(Type.COMMON, The_Cursed_ModConfig.SPEC);
        modEventBus.addListener(this::modifyDefaultComponents);
    }

    private void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
        FoodProperties cursedfood = new FoodProperties.Builder()
                .nutrition(5)
                .saturationModifier(0.1F)
                .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 750, 1), 1.0F)
                .alwaysEdible()
                .build();

        event.modify(Items.NETHER_WART, builder -> builder.set(DataComponents.FOOD, cursedfood));
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(TheCursedModItems.CURSED_ITEM);
            event.accept(TheCursedModItems.CURSED_MODE);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(TheCursedModItems.RAW_CURSED_ITEM);
            event.accept(TheCursedModItems.FORGER);
            event.accept(TheCursedModItems.GOLDMAKER);
            event.accept(TheCursedModItems.SUPERSTAR);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(TheCursedModBlocks.CURSED_BLOCK);
            event.accept(TheCursedModBlocks.CURSED_ORE);
            event.accept(TheCursedModBlocks.CURSED_DEEPSLATE_ORE);
        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(TheCursedModItems.OVERWARTS);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
