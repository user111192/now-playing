package com.github.scotsguy.nowplaying.util;

import com.github.scotsguy.nowplaying.NowPlaying;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public final class Localization {
    public static String translationKey(String path) {
        return NowPlaying.MOD_ID + "." + path;
    }

    public static String translationKey(String domain, String path) {
        return domain + "." + NowPlaying.MOD_ID + "." + path;
    }

    public static MutableComponent localized(String path, Object... args) {
        return Component.translatable(translationKey(path), args);
    }

    public static MutableComponent localized(String domain, String path, Object... args) {
        return Component.translatable(translationKey(domain, path), args);
    }
}
