//package mk.ukim.finki.wp.lab.service.impl;
//
//import mk.ukim.finki.wp.lab.model.EventBooking;
////import mk.ukim.finki.wp.lab.repository.BookingRepository;
//import mk.ukim.finki.wp.lab.service.EventBookingService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EventBookingServiceImpl implements EventBookingService {
//    @Override
//    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
//        return new EventBooking(eventName,attendeeName,attendeeAddress,(long)numberOfTickets);
//    }
//
//    @Override
//    public List<EventBooking> getAllBookings() {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> getBookingsByEventName(String eventName) {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> getBookingsByAttendeeName(String attendeeName) {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> searchBookings(String attendeeName) {
//        return null;
//    }
//
//}
package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.EventBooking;
//import mk.ukim.finki.wp.lab.repository.BookingRepository;
import mk.ukim.finki.wp.lab.repository.jpa.BookingRepository;
import mk.ukim.finki.wp.lab.service.EventBookingService;
import org.springframework.stereotype.Service;

import java.util.List;
//
//@Service
//public class EventBookingServiceImpl implements EventBookingService {
//    @Override
//    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
//        return new EventBooking(eventName, attendeeName, attendeeAddress, (long) numberOfTickets);
//    }
//
//    @Override
//    public List<EventBooking> getAllBookings() {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> getBookingsByEventName(String eventName) {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> getBookingsByAttendeeName(String attendeeName) {
//        return null;
//    }
//
//    @Override
//    public List<EventBooking> searchBookings(String attendeeName) {
//        return null;
//    }
//
//}
//}
//
//@Service
//public class EventBookingServiceImpl implements EventBookingService {
//    private final BookingRepository BookingRepository;
//
//    public EventBookingServiceImpl(BookingRepository BookingRepository) {
//        this.BookingRepository = BookingRepository;
//    }
//
//    @Override
//    public EventBooking placeBooking(Long eventId, String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
//        return BookingRepository.EventBooking(eventId, eventName, attendeeName, attendeeAddress, numberOfTickets);
//    }
//}



@Service
public class EventBookingServiceImpl implements EventBookingService {
    private final BookingRepository bookingRepository;

    public EventBookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        EventBooking booking =  new EventBooking();
        booking.setEventName(eventName);
        booking.setAttendeeName(attendeeName);
        booking.setAttendeeAddress(attendeeAddress);
        booking.setNumberOfTickets(numberOfTickets);
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public List<EventBooking> getEventBookings() {
        return bookingRepository.findAll();
    }

}
