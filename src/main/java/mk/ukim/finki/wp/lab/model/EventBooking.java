package mk.ukim.finki.wp.lab.model;
import lombok.Data;


//public class EventBooking {
//    String eventName;
//    String attendeeName;
//    String attendeeAddress;
//    Long numberOfTickets;
//
//    public EventBooking(String eventName, String attendeeName, String attendeeAddress, Long numberOfTickets){
//        this.eventName=eventName;
//        this.attendeeName=attendeeName;
//        this.attendeeAddress=attendeeAddress;
//        this.numberOfTickets=numberOfTickets;
//    }
//
//}


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class EventBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;
    private String eventName;
    private String attendeeName;
    private String attendeeAddress;
    private int numberOfTickets;

    public EventBooking(){}

    public EventBooking(Long eventId, String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.attendeeName = attendeeName;
        this.attendeeAddress = attendeeAddress;
        this.numberOfTickets = numberOfTickets;
    }

}


