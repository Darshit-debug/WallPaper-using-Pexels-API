package com.example.wallyset;

public class WallpaperModel {
    private int Id;
    private String originalUrl,mediumUrl;

    public WallpaperModel(){

    }

    public WallpaperModel(int id, String originalUrl, String mediumUrl) {
        Id = id;
        this.originalUrl = originalUrl;
        this.mediumUrl = mediumUrl;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }
}
