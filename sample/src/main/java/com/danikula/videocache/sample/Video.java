package com.danikula.videocache.sample;

import android.content.Context;

import java.io.File;

public enum Video {

    ORANGE_1("http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv"),
    ORANGE_2("http://220.194.199.184/11/g/b/u/u/gbuustuaqwiwhhsvwhmnfvlolfdqnc/hc.yinyuetai.com/17F0015849548884B263584D615989A1.mp4"),
    ORANGE_3("http://220.194.199.186/6/t/z/l/c/tzlcjecqjfkfhpddgtthklrogziner/hc.yinyuetai.com/7C27014831544B8F26587F5FCD86FB2D.flv"),
    ORANGE_4("http://112.253.22.153/11/z/y/v/k/zyvkagddgnexbikbdoilghsuzaavpl/hc.yinyuetai.com/0607013C337BD9E342A70A828E87797C.flv"),
    ORANGE_5("http://112.253.22.162/11/z/b/o/v/zbovkdaizbnmxwphthcqulwboftljv/hc.yinyuetai.com/23AB013B8E3695A0249505AEB78B32B9.flv");

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
