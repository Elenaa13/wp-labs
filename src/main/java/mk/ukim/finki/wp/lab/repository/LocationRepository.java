////package mk.ukim.finki.wp.lab.repository;
////
////
////import mk.ukim.finki.wp.lab.model.Location;
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.stereotype.Repository;
////
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Optional;
////
////
////
////@Repository
////public class LocationRepository {
////
////    private List<Location> locations =new ArrayList<>();
////
////    public LocationRepository(){
////        locations.add(new Location("Cineplexx", "Adresa 1", "200", "Filmovi" ));
////        locations.add(new Location("Teatar", "Adresa 2", "400", "Pretstavi"));
////        locations.add(new Location("Koncert", "Adresa 3", "1000", "Muzika"));
////        locations.add(new Location("Seminar", "Adresa 4", "300", "Seminari"));
////        locations.add(new Location("Uciliste", "Adresa 5", "600", "Ucenje"));
////    }
////    public List<Location> findAll(){
////        return locations;
////    }
////    public Optional<Location> findById(Long id){
////        return locations.stream().filter(location -> location.getId().equals(id)).findFirst();
////    }
////}
//package mk.ukim.finki.wp.lab.repository;
//
//
//import mk.ukim.finki.wp.lab.model.Location;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//
//
//@Repository
//public class LocationRepository {
//
//    private List<Location> locations =new ArrayList<>();
//
//    public LocationRepository(){
//        locations.add(new Location("Cineplexx", "Adresa 1", "200", "Filmovi" ));
//        locations.add(new Location("Teatar", "Adresa 2", "400", "Pretstavi"));
//        locations.add(new Location("Koncert", "Adresa 3", "1000", "Muzika"));
//        locations.add(new Location("Seminar", "Adresa 4", "300", "Seminari"));
//        locations.add(new Location("Uciliste", "Adresa 5", "600", "Ucenje"));
//    }
//    public List<Location> findAll(){
//        return locations;
//    }
//    public Optional<Location> findById(Long id){
//        return locations.stream().filter(location -> location.getId().equals(id)).findFirst();
//    }
//}