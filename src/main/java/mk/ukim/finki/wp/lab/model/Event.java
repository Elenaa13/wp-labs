package mk.ukim.finki.wp.lab.model;
import lombok.Data;
@Data

public class Event {
    String name;
    String description;
    double popularityScore;
    Category category;

    public Event(String name, String description, double popularityScore, Category category){
        this.name=name;
        this.description=description;
        this.popularityScore=popularityScore;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPopularityScore() {
        return popularityScore;
    }
}
