package zooAnimals;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController

    public class Main {


    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

    @CrossOrigin("http://localhost:8000")
    @PostMapping("/InitialZoo")
    public String ZooList(String Name, String Breed, LocalDate DoB) {
        ZooList zooWC = new ZooList();
        return zooWC.toString();
    }

    @CrossOrigin("http://localhost:8000")
    @GetMapping("/SelectWildCat")
    public String WildCatSelect() {
        ZooList zooWC = new ZooList();
        List<WildCat> animals = zooWC.getZooList();
        WildCat WC;
        WC = animals.get(0);
        String json = new Gson().toJson(WC);
        return json;
    }

    @CrossOrigin("http://localhost:8000")
    @PostMapping("/addWildCat")
    public String WildCatAdd(String name, String breed, int age) {
        ZooList zooWC = new ZooList();
        List<WildCat> WCat = zooWC.getZooList();
        WildCat WC = new WildCat(name,breed,age);
        WCat.add(WC);
        return WC.toString();

    }

    @CrossOrigin("http://localhost:8000")
    @GetMapping("/WildCatTest")
    public String WildCatTest() {
        WildCat WC = new WildCat("Thriller", "Jaguar", 6);
        String name = WC.getName();
        String breed = WC.getBreed();
        LocalDate Dob = WC.getDateOfBirth();
        return "Date Of Birth: " + Dob + " Name: " + name + " Breed: " + breed ;
    }

}



