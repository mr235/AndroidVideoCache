package com.danikula.videocache.sample;

import android.content.Context;

import java.io.File;

public enum Video {

    ORANGE_1("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv"),
    ORANGE_2("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv"),
    ORANGE_3("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv"),
    ORANGE_4("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv"),
    ORANGE_5("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv");

    public final String url;

    Video(String url) {
        this.url = url;
    }

    public File getCacheFile(Context context) {
        return new File(context.getExternalCacheDir(), name());
    }

    private class Config {
        private static final String ROOT = "https://raw.githubusercontent.com/danikula/AndroidVideoCache/master/files/";
    }
}
