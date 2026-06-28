package com.ohtman.ohtmantv.model;

public class Category {
    private String name;
    private String logoUrl;
    private String type;

    public Category(String name, String logoUrl, String type) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.type = type;
    }

    public String getName() { return name; }
    public String getLogoUrl() { return logoUrl; }
    public String getType() { return type; }
}
