package com.carlosabaunza.walletapp;

public class Category {

    private String name_cat, desc, color, icon;


    public Category(String name_cat, String desc, String color, String icon) {
        this.name_cat = name_cat;
        this.desc = desc;
        this.color = color;
        this.icon = icon;
    }

    public String getName_cat() {
        return name_cat;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
