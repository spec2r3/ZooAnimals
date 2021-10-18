package zooAnimals;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
    public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/AddWC")
    public String AddBook(){
        WildCat WC = new WildCat("Dot","Cheetah",12/5/2018);
        return WC.toString();
    }

}



