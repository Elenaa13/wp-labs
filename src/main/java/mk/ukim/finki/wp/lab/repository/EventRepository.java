package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository

public class EventRepository {
    private List<Event> events = new ArrayList<>();

    public EventRepository(){
        events.add(new Event("Oppenheimer", "A film about the father of the atomic bomb", 9.5));
        events.add(new Event("Dune", "A science fiction film based on the novel", 8.8));
        events.add(new Event("Jazz Festival", "A night of jazz music and performances", 7.5));
        events.add(new Event("Tech Summit 2023", "Annual technology and innovation conference", 9.1));
        events.add(new Event("Art Expo", "Local artists showcasing unique works", 8.3));
        events.add(new Event("Wine Tasting", "Sample wines from around the world", 7.9));
        events.add(new Event("Shakespeare in the Park", "Outdoor performances of classic plays", 8.7));
        events.add(new Event("Book Fair", "Meet authors and discover new books", 7.4));
        events.add(new Event("Film Marathon", "Back-to-back screenings of classic films", 8.0));
        events.add(new Event("Coding Bootcamp", "A full day of hands-on programming workshops", 8.5));
    }

    public List<Event> findAll(){
        return events;
    }

    public List<Event> searchEvents (String text, Double minRating){
        return events.stream()
                .filter(e -> (text == null || e.getName().contains(text) || e.getDescription().contains(text)) &&
                (minRating == null || e.getPopularityScore() >= minRating))
                .collect(Collectors.toList());
    }
}
