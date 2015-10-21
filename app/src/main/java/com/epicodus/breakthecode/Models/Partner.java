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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
