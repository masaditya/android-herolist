package com.adityaeka.listhero;

public class Hero {

    String name, realname, photos, desc;

    public Hero(String name, String realname, String photos, String desc) {
        this.name = name;
        this.realname = realname;
        this.photos = photos;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }
}
