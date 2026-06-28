package com.ohtman.ohtmantv.model;

public class Channel {
    private String name;
    private String logoUrl;
    private String streamUrl;
    private String category;

    public Channel(String name, String logoUrl, String streamUrl, String category) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.streamUrl = streamUrl;
        this.category = category;
    }

    public String getName() { return name; }
    public String getLogoUrl() { return logoUrl; }
    public String getStreamUrl() { return streamUrl; }
    public String getCategory() { return category; }
}
