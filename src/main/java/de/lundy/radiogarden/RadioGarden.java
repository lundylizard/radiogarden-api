package de.lundy.radiogarden;

import com.google.gson.Gson;
import de.lundy.radiogarden.exceptions.InternalErrorException;
import de.lundy.radiogarden.places.Place;
import de.lundy.radiogarden.places.Places;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RadioGarden {

    private static final Gson gson = new Gson();
    public static final String API_ROOT_URL = "http://radio.garden/api/ara/content/";
    public static final String API_PLACES_URL = API_ROOT_URL + "places/";
    public static final String API_PAGE_URL = API_ROOT_URL + "page/";
    public static final String API_CHANNEL_URL = API_ROOT_URL + "channel/";
    public static final String API_LISTEN_URL = API_ROOT_URL + "listen/";

    public static String getListenUrl(String id) {
        return API_LISTEN_URL + id + "/channel.mp3";
    }

    public static List<Place> getAllPlaces() throws IOException {

        URL url;

        try {
            url = new URL(API_PLACES_URL);
        } catch (MalformedURLException e) {
            throw new InternalErrorException("Incorrect endpoint url '%s' - Please report this.", API_PLACES_URL);
        }

        InputStreamReader reader = new InputStreamReader(url.openStream());
        return gson.fromJson(reader, Places.class).getData().getList();

    }

    public static Page getPageFromId(String id) throws IOException {

        URL url;

        try {
            url = new URL(API_PAGE_URL + id);
        } catch (MalformedURLException e) {
            throw new InternalErrorException("Incorrect endpoint url '%s' - Please report this.", API_PAGE_URL + id);
        }

        InputStreamReader reader = new InputStreamReader(url.openStream());
        return gson.fromJson(reader, Page.class);

    }

    public static Channel getChannelFromId(String id) throws IOException {

        URL url;

        try {
            url = new URL(API_CHANNEL_URL + id);
        } catch (MalformedURLException e) {
            throw new InternalErrorException("Incorrect endpoint url '%s' - Please report this.", API_CHANNEL_URL + id);
        }

        InputStreamReader reader = new InputStreamReader(url.openStream());
        return gson.fromJson(reader, Channel.class);

    }

}
