package com.cout970.magneticraft.item

import com.cout970.magneticraft.gui.client.guide.GuiGuideBook
import com.cout970.magneticraft.misc.CreativeTabMg
import net.minecraft.client.Minecraft
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.util.ActionResult
import net.minecraft.util.EnumActionResult
import net.minecraft.util.EnumHand
import net.minecraft.world.World

object ItemGuideBook : ItemBase("guide_book") {

    init {
        creativeTab = CreativeTabMg
        maxStackSize = 1
    }

    override fun onItemRightClick(stack: ItemStack?, world: World?, player: EntityPlayer?, hand: EnumHand?): ActionResult<ItemStack?>? {
        if ((player == null) || player.isSneaking || world == null || !world.isRemote) {
            return super.onItemRightClick(stack, world, player, hand)
        }

        Minecraft.getMinecraft().displayGuiScreen(GuiGuideBook())

        return ActionResult(EnumActionResult.SUCCESS, stack)
//        return super.onItemRightClick(stack, world, player, hand)
    }
}