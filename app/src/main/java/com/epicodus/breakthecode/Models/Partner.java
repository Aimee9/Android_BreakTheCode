package com.epicodus.breakthecode.Models;

/**
 * Created by oem on 10/20/15.
 */
public class Partner {
    private String mName;
    private String mDescription;
    private String mWebsite;
    private int mImage;

    public Partner(String name, String description, String website, int image) {
        mName = name;
        mDescription = description;
        mWebsite = website;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }
}
