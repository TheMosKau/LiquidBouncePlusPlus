/*
 * LiquidBounce+ Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/WYSI-Foundation/LiquidBouncePlus/
 *
 * This code was taken from UnlegitMC/FDPClient. Please credit them when using this code in your repository.
 */
package net.ccbluex.liquidbounce.injection.access;

public interface IMixinWorldAccess {

    void markBlockForUpdate(int var1, int var2, int var3);

    void notifyLightSet(int var1, int var2, int var3);
}
