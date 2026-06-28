package com.ohtman.ohtmantv.utils;

import com.ohtman.ohtmantv.model.Category;
import com.ohtman.ohtmantv.model.Channel;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    
    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("beIN MAX", "", "bein_max"));
        categories.add(new Category("beIN 4K", "", "bein_4k"));
        categories.add(new Category("beIN HD", "", "bein_hd"));
        categories.add(new Category("beIN SD", "", "bein_sd"));
        categories.add(new Category("ARAB SPORT", "", "arab_sport"));
        categories.add(new Category("WORLD SPORT", "", "world_sport"));
        categories.add(new Category("MATCHES", "", "matches"));
        categories.add(new Category("MBC", "", "mbc"));
        categories.add(new Category("OSN", "", "osn"));
        categories.add(new Category("NETFLIX", "", "netflix"));
        categories.add(new Category("NEWS", "", "news"));
        categories.add(new Category("KIDS", "", "kids"));
        return categories;
    }
    
    public static List<Channel> getChannelsByCategory(String categoryType) {
        List<Channel> channels = new ArrayList<>();
        switch (categoryType) {
            case "bein_max":
                channels.add(new Channel("beIN MAX 1", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295211.m3u8", "bein_max"));
                channels.add(new Channel("beIN MAX 2", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295212.m3u8", "bein_max"));
                channels.add(new Channel("beIN MAX 3", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295213.m3u8", "bein_max"));
                channels.add(new Channel("beIN MAX 4", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295214.m3u8", "bein_max"));
                break;
            case "bein_hd":
                channels.add(new Channel("beIN SPORTS 1 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295201.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 2 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295202.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 3 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295203.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 4 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295204.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 5 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295205.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 6 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295206.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 7 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295207.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 8 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295208.m3u8", "bein_hd"));
                channels.add(new Channel("beIN SPORTS 9 HD", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295209.m3u8", "bein_hd"));
                break;
            case "mbc":
                channels.add(new Channel("MBC 1", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295301.m3u8", "mbc"));
                channels.add(new Channel("MBC 2", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295302.m3u8", "mbc"));
                channels.add(new Channel("MBC 3", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295303.m3u8", "mbc"));
                channels.add(new Channel("MBC 4", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295304.m3u8", "mbc"));
                channels.add(new Channel("MBC 5", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295305.m3u8", "mbc"));
                channels.add(new Channel("MBC Action", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295306.m3u8", "mbc"));
                channels.add(new Channel("MBC Drama", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295307.m3u8", "mbc"));
                channels.add(new Channel("MBC Max", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295308.m3u8", "mbc"));
                break;
            case "osn":
                channels.add(new Channel("OSN Movies", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295401.m3u8", "osn"));
                channels.add(new Channel("OSN Movies Action", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295402.m3u8", "osn"));
                channels.add(new Channel("OSN Movies Premiere", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295403.m3u8", "osn"));
                channels.add(new Channel("OSN Yahala", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295404.m3u8", "osn"));
                channels.add(new Channel("OSN Yahala Cinema", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295405.m3u8", "osn"));
                break;
            case "news":
                channels.add(new Channel("Al Jazeera", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295501.m3u8", "news"));
                channels.add(new Channel("Al Arabiya", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295502.m3u8", "news"));
                channels.add(new Channel("BBC Arabic", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295503.m3u8", "news"));
                channels.add(new Channel("Sky News Arabia", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295504.m3u8", "news"));
                break;
            case "kids":
                channels.add(new Channel("Cartoon Network", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295601.m3u8", "kids"));
                channels.add(new Channel("Nickelodeon", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295602.m3u8", "kids"));
                channels.add(new Channel("Disney Channel", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295603.m3u8", "kids"));
                channels.add(new Channel("Spacetoon", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295604.m3u8", "kids"));
                channels.add(new Channel("MBC 3", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295605.m3u8", "kids"));
                break;
            default:
                channels.add(new Channel("Channel 1", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295211.m3u8", categoryType));
                channels.add(new Channel("Channel 2", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295212.m3u8", categoryType));
                channels.add(new Channel("Channel 3", "", "http://asmrasmr.live:8080/live/39495727290/01928238338/1295213.m3u8", categoryType));
                break;
        }
        return channels;
    }
}
