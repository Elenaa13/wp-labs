////package mk.ukim.finki.wp.lab.repository;
////
////
////import mk.ukim.finki.wp.lab.model.Event;
////import mk.ukim.finki.wp.lab.model.Location;
////import mk.ukim.finki.wp.lab.model.SavedBooking;
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.stereotype.Repository;
////
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Objects;
////import java.util.Optional;
////import java.util.stream.Collectors;
////
////
////@Repository
////
////public class EventRepository {
////    private List<Event> events = new ArrayList<>();
////    private List<SavedBooking> savedBookings=new ArrayList<>();
////
////
////    public EventRepository(){
////        events.add(new Event("Oppenheimer", "A film about the father of the atomic bomb", 9.5, new Location("Cineplexx", "Adresa 1", "200", "Filmovi" )));
////        events.add(new Event("Dune", "A science fiction film based on the novel", 8.8, new Location("Cineplexx", "Adresa 1", "200", "Filmovi" )));
////        events.add(new Event("Jazz Festival", "A night of jazz music and performances", 7.5,new Location("Koncert", "Adresa 3", "1000", "Muzika")));
////        events.add(new Event("Tech Summit 2023", "Annual technology and innovation conference", 9.1,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
////        events.add(new Event("Art Expo", "Local artists showcasing unique works", 8.3,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
////        events.add(new Event("Wine Tasting", "Sample wines from around the world", 7.9,new Location("Seminar", "Adresa 4", "300", "Seminari")));
////        events.add(new Event("Shakespeare in the Park", "Outdoor performances of classic plays", 8.7,new Location("Teatar", "Adresa 2", "400", "Pretstavi")));
////        events.add(new Event("Book Fair", "Meet authors and discover new books", 7.4,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
////        events.add(new Event("Film Marathon", "Back-to-back screenings of classic films", 8.0,new Location("Teatar", "Adresa 2", "400", "Pretstavi")));
////        events.add(new Event("Coding Bootcamp", "A full day of hands-on programming workshops", 8.5,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
////    }
////
////    public List<Event> findAll(){
////        return events;
////    }
////
////    public List<Event> searchEvents (String text){
////        return events.stream()
////                .filter(e -> (text == null || e.getName().contains(text) || e.getDescription().contains(text)))
////                .collect(Collectors.toList());
////    }
////
////    public List<SavedBooking> getSavedBooking(){
////        return savedBookings;
////    }
////    public Optional<Event> save(String name, String description, double popularityScore, Location location) {
////        Event newEvent = new Event(name, description, popularityScore, location);
////        events.removeIf(e -> Objects.equals(e.getName(), name));
////        events.add(newEvent);
////        return Optional.of(newEvent);
////    }
////
////    public Optional<Event> findById(Long id) {
////        return events.stream().filter(e -> e.getId().equals(id)).findFirst();
////    }
////
////    public void deleteById(Long id) {
////        events.removeIf(event -> Objects.equals(event.getId(),id));
////    }
////
////    public void addBooking(String evName, int numTickets) {
////        boolean bookingExists = false;
////        for (SavedBooking booking : savedBookings) {
////            if (booking.getEventName().equals(evName)) {
////                booking.setNumberOfTickets(booking.getNumberOfTickets() + numTickets);
////                bookingExists = true;
////                break;
////            }
////        }
////
////        if (!bookingExists) {
////            savedBookings.add(new SavedBooking(evName, numTickets));
////        }
////    }
////}
//package mk.ukim.finki.wp.lab.repository;
//
//
//import mk.ukim.finki.wp.lab.model.Event;
//import mk.ukim.finki.wp.lab.model.Location;
//import mk.ukim.finki.wp.lab.model.SavedBooking;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//
//@Repository
//
//public class EventRepository {
//    private List<Event> events = new ArrayList<>();
//    private List<SavedBooking> savedBookings=new ArrayList<>();
//
//
//    public EventRepository(){
//        events.add(new Event("Oppenheimer", "A film about the father of the atomic bomb", 9.5, new Location("Cineplexx", "Adresa 1", "200", "Filmovi" )));
//        events.add(new Event("Dune", "A science fiction film based on the novel", 8.8, new Location("Cineplexx", "Adresa 1", "200", "Filmovi" )));
//        events.add(new Event("Jazz Festival", "A night of jazz music and performances", 7.5,new Location("Koncert", "Adresa 3", "1000", "Muzika")));
//        events.add(new Event("Tech Summit 2023", "Annual technology and innovation conference", 9.1,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
//        events.add(new Event("Art Expo", "Local artists showcasing unique works", 8.3,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
//        events.add(new Event("Wine Tasting", "Sample wines from around the world", 7.9,new Location("Seminar", "Adresa 4", "300", "Seminari")));
//        events.add(new Event("Shakespeare in the Park", "Outdoor performances of classic plays", 8.7,new Location("Teatar", "Adresa 2", "400", "Pretstavi")));
//        events.add(new Event("Book Fair", "Meet authors and discover new books", 7.4,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
//        events.add(new Event("Film Marathon", "Back-to-back screenings of classic films", 8.0,new Location("Teatar", "Adresa 2", "400", "Pretstavi")));
//        events.add(new Event("Coding Bootcamp", "A full day of hands-on programming workshops", 8.5,new Location("Uciliste", "Adresa 5", "600", "Ucenje")));
//    }
//
//    public List<Event> findAll(){
//        return events;
//    }
//
//    public List<Event> searchEvents (String text){
//        return events.stream()
//                .filter(e -> (text == null || e.getName().contains(text) || e.getDescription().contains(text)))
//                .collect(Collectors.toList());
//    }
//
//    public List<SavedBooking> getSavedBooking(){
//        return savedBookings;
//    }
//    public Optional<Event> save(String name, String description, double popularityScore, Location location) {
//        Event newEvent = new Event(name, description, popularityScore, location);
//        events.removeIf(e -> Objects.equals(e.getName(), name));
//        events.add(newEvent);
//        return Optional.of(newEvent);
//    }
//
//    public Optional<Event> findById(Long id) {
//        return events.stream().filter(e -> e.getId().equals(id)).findFirst();
//    }
//
//    public void deleteById(Long id) {
//        events.removeIf(event -> Objects.equals(event.getId(),id));
//    }
//
//    public void addBooking(String evName, int numTickets) {
//        boolean bookingExists = false;
//        for (SavedBooking booking : savedBookings) {
//            if (booking.getEventName().equals(evName)) {
//                booking.setNumberOfTickets(booking.getNumberOfTickets() + numTickets);
//                bookingExists = true;
//                break;
//            }
//        }
//
//        if (!bookingExists) {
//            savedBookings.add(new SavedBooking(evName, numTickets));
//        }
//    }
//
//
//}