package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

@Table(name = "events")
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String description;
    double popularityScore;


    @ManyToOne
    private Location location;
    public Event(String name, String description, double popularityScore, Location location){
        this.name=name;
        this.description=description;
        this.popularityScore=popularityScore;
        this.id=(long) (Math.random()*1000);
        this.location=location;

    }
}
