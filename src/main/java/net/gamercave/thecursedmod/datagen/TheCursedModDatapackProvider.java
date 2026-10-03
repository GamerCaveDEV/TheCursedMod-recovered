//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.gamercave.thecursedmod.worldgen.ModBiomeModifiers;
import net.gamercave.thecursedmod.worldgen.ModConfiguredFeatures;
import net.gamercave.thecursedmod.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries.Keys;

public class TheCursedModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER;

    public TheCursedModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registeries) {
        super(output, registeries, BUILDER, Set.of("thecursedmod"));
    }

    static {
        BUILDER = (new RegistrySetBuilder()).add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap).add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap).add(Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    }
}
