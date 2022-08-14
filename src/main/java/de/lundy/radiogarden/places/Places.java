package de.lundy.radiogarden.places;

import java.util.List;

public class Places {

    public static class PlacesData {

        private List<Place> list;

        public List<Place> getList() {
            return list;
        }

        @Override
        public String toString() {
            return "PlacesData{" + "list=" + list + '}';
        }

    }

    private int apiVersion;
    private String version;
    private PlacesData data;

    public int getApiVersion() {
        return apiVersion;
    }

    public String getVersion() {
        return version;
    }

    public PlacesData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Places{" + "apiVersion=" + apiVersion + ", version='" + version + '\'' + ", data=" + data + '}';
    }

}
