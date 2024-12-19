//package mk.ukim.finki.wp.lab.service;
//
//import mk.ukim.finki.wp.lab.model.Event;
//import mk.ukim.finki.wp.lab.model.EventBooking;
//import mk.ukim.finki.wp.lab.model.SavedBooking;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface EventService {
//    List<Event> listAll();
//    List<Event> searchEvents(String text, Double minRating, Long locationId);
//
//    List<Event> searchEvents(String text);
//
//    Optional<Event> save(String name, String description, Double popularityScore, Long locationId);
//
//    List<Event> searchEvents(String text, Double minRating);
//
//    List<SavedBooking> getSavedBookings();
//
//    void addBooking(String evName, int numTickets);
//
//    Optional<Event> save(String name, String description, double popularityScore, Long locationId);
//
//    void deleteById(Long id);
//
//    Optional<Event> findById(Long id);
//    Optional<Event> update(Long id, String name, String description, Double popularityScore, Long locationId);
//    Optional<Event> delete(Long id);
//    Optional<Event> likeEvent(Long id);
//    List<Event> findAllByLocation_Id(Long locationId);
//}

package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> listAll();

    List<Event> searchEvents(String text, Double minRating, Long locationId);

    Optional<Event> findById(Long id);

    Optional<Event> deleteEvent(Long id);

    List<Event> findAllByLocation_Id(Long locationId);

    Optional<Event> saveEvent(String name, String description, Double popularityScore, Long locationID);

    Optional<Event> editEvent(Long id, String name, String description, Double popularityScore, Long locationID);

    List<Event> searchEvents(String searchText, Double rating);
}