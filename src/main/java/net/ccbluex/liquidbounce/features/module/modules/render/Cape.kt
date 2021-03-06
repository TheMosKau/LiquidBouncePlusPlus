/*
 * LiquidBounce+ Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/WYSI-Foundation/LiquidBouncePlus/
 */
package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.value.ListValue

import net.minecraft.util.ResourceLocation

@ModuleInfo(name = "Cape", description = "LiquidBounce++ and community capes.", category = ModuleCategory.RENDER)
class Cape : Module() {

    val styleValue = ListValue("Style", arrayOf("Dark", "Light", "Special1", "Special2", "Special3", "Flushed", "GatoLover"), "Dark")

    fun getCapeLocation(value: String): ResourceLocation {
        return try {
            CapeStyle.valueOf(value.toUpperCase()).location
        } catch (e: IllegalArgumentException) {
            CapeStyle.DARK.location
        }
    }

    enum class CapeStyle(val location: ResourceLocation) {
        DARK(ResourceLocation("liquidbounce+/cape/dark.png")),
        LIGHT(ResourceLocation("liquidbounce+/cape/light.png")),
        SPECIAL1(ResourceLocation("liquidbounce+/cape/special1.png")),
        SPECIAL2(ResourceLocation("liquidbounce+/cape/special2.png")),
        SPECIAL3(ResourceLocation("liquidbounce+/cape/special3.png")),
        FLUSHED(ResourceLocation("liquidbounce+/cape/flushed.png")),
        GATOLOVER(ResourceLocation("liquidbounce+/cape/gatolover.png"))
    }

    override val tag: String
        get() = styleValue.get()

}
