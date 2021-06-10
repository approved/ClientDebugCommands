package dev.odd.clientdbgcom.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.client.Keyboard;

@Mixin(Keyboard.class)
public interface KeyboardF3Mixin {

    @Invoker
    public abstract boolean invokeProcessF3(int key);

    @Invoker
    public abstract void invokeCopyLookAt(boolean hasQueryPermission, boolean queryServer);

    @Invoker
    public abstract void invokeDebugLog(String key, Object... args);
}
