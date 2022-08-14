package de.lundy.radiogarden.places;

import java.util.Arrays;

public class Place {

    private String id;
    private float[] geo;
    private String url;
    private int size;
    private boolean boost;
    private String title;
    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float[] getGeo() {
        return geo;
    }

    public void setGeo(float[] geo) {
        this.geo = geo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isBoost() {
        return boost;
    }

    public void setBoost(boolean boost) {
        this.boost = boost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Place{" + "id='" + id + '\'' + ", geo=" + Arrays.toString(geo) + ", url='" + url + '\'' + ", size=" + size + ", boost=" + boost + ", title='" + title + '\'' + ", country='" + country + '\'' + '}';
    }

}
