package example;

import de.lundy.radiogarden.Channel;
import de.lundy.radiogarden.Page;
import de.lundy.radiogarden.RadioGarden;
import de.lundy.radiogarden.places.Place;

import java.io.IOException;
import java.util.List;

public class Example {

    public static void main(String[] args) throws IOException {

        // Get a list of all Places
        List<Place> places = RadioGarden.getAllPlaces();

        // Filter the list
        Place pyongyang = places.stream().filter(p -> p.getTitle().equals("Pyongyang")).toList().get(0);

        // Get the page from that place
        Page page = RadioGarden.getPageFromId(pyongyang.getId());

        // Get the listenId from the first station on the page
        String listenId = page.getData().getContent().get(0).getItems()[0].getHref().split("/")[3];

        // Print the listen url
        System.out.println(RadioGarden.getListenUrl(listenId));

        // Print all the channel info
        Channel channel = RadioGarden.getChannelFromId(listenId);
        System.out.println(channel.getData().getPlace().getTitle());
        System.out.println(channel.getData().getCountry().getTitle());

    }

}
