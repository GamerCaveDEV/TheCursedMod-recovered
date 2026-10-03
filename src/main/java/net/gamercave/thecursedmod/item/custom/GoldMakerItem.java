//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.gamercave.thecursedmod.item.custom;

import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class GoldMakerItem extends Item {
    public GoldMakerItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if (!level.isClientSide()) {
            BlockPos clickedPos = pContext.getClickedPos();
            pContext.getItemInHand().hurtAndBreak(1, (ServerLevel)level, (ServerPlayer)pContext.getPlayer(), (item) -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            level.playSound((Player)null, pContext.getClickedPos(), SoundEvents.AMETHYST_BLOCK_PLACE, SoundSource.BLOCKS);
            boolean success = level.setBlock(clickedPos, Blocks.GOLD_ORE.defaultBlockState(), 3);
            if (success) {
                pContext.getItemInHand().shrink(1);
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.CONSUME;
    }

    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.thecursedmod.goldmaker"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
