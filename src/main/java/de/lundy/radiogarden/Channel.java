package de.lundy.radiogarden;

public class Channel {

    private int apiVersion;
    private String version;
    private ChannelData data;

    public static class ChannelData {

        private String type;
        private String title;
        private String id;
        private String url;
        private String website;
        private boolean secure;
        private ChannelInfo place;
        private ChannelInfo country;

        public String getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getWebsite() {
            return website;
        }

        public boolean isSecure() {
            return secure;
        }

        public ChannelInfo getPlace() {
            return place;
        }

        public ChannelInfo getCountry() {
            return country;
        }
    }

    public static class ChannelInfo {

        private String id;
        private String title;

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }

    public int getApiVersion() {
        return apiVersion;
    }

    public String getVersion() {
        return version;
    }

    public ChannelData getData() {
        return data;
    }
}
