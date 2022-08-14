package de.lundy.radiogarden;

import java.util.Arrays;
import java.util.List;

public class Page {

    public static class PageItem {

        private String itemsType;
        private String title;
        private String type;
        private PageItemInfo[] items;

        public String getItemsType() {
            return itemsType;
        }

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }

        public PageItemInfo[] getItems() {
            return items;
        }

        @Override
        public String toString() {
            return "PageItem{" + "itemsType='" + itemsType + '\'' + ", title='" + title + '\'' + ", type='" + type + '\'' + ", items=" + Arrays.toString(items) + '}';
        }
    }

    public static class PageItemInfo {

        private String map;
        private String href;
        private String title;
        private String subtitle;

        public String getHref() {
            return href;
        }

        public String getTitle() {
            return title;
        }

        public String getMap() {
            return map;
        }

        public String getSubtitle() {
            return subtitle;
        }

        @Override
        public String toString() {
            return "PageItemInfo{" + "map='" + map + '\'' + ", href='" + href + '\'' + ", title='" + title + '\'' + ", subtitle='" + subtitle + '\'' + '}';
        }
    }

    public static class PageData {

        private String type;
        private int count;
        private String map;
        private String title;
        private String subtitle;
        private String url;
        private int utcOffset;
        private List<PageItem> content;

        public String getType() {
            return type;
        }

        public int getCount() {
            return count;
        }

        public String getMap() {
            return map;
        }

        public String getTitle() {
            return title;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public String getUrl() {
            return url;
        }

        public int getUtcOffset() {
            return utcOffset;
        }

        public List<PageItem> getContent() {
            return content;
        }

        @Override
        public String toString() {
            return "PageData{" + "type='" + type + '\'' + ", count=" + count + ", map='" + map + '\'' + ", title='" + title + '\'' + ", subtitle='" + subtitle + '\'' + ", url='" + url + '\'' + ", utcOffset=" + utcOffset + ", content=" + content + '}';
        }
    }

    private int apiVersion;
    private String version;
    private PageData data;

    public int getApiVersion() {
        return apiVersion;
    }

    public String getVersion() {
        return version;
    }

    public PageData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Page{" + "apiVersion=" + apiVersion + ", version='" + version + '\'' + ", data=" + data + '}';
    }
}
