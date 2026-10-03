//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class TheCursedModFoodProperties {
    public static final FoodProperties OVERWARTS = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.01F).effect(() -> new MobEffectInstance(MobEffects.POISON, 600), 1.0F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 500, 1), 1.0F).build();

    public TheCursedModFoodProperties() {
    }
}
