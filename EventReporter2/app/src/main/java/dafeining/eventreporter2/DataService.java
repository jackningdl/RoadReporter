package dafeining.eventreporter2;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    /**
     * Fake all the event data for now.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 10; ++i) {
            eventData.add( new Event("Geralt", "Kaer Morhen", "This is Geralt's address."));
        }
        return eventData;
    }
}

