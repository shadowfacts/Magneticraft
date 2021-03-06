package com.cout970.magneticraft.item

import net.minecraft.item.ItemStack

/**
 * Created by cout970 on 11/06/2016.
 */
object ItemHeavyPlate : ItemBase("heavy_plate") {

    override val variants = mapOf(
        0 to "ore=iron",
        1 to "ore=gold",
        2 to "ore=copper",
        3 to "ore=lead",
        4 to "ore=cobalt",
        5 to "ore=tungsten"
    )

    override fun getUnlocalizedName(stack: ItemStack?): String =
        "${unlocalizedName}_${ItemCrushedOre.variants[stack?.metadata]?.removePrefix("ore=")}"
}