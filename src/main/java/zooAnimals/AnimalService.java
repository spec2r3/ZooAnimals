package zooAnimals;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service


public class AnimalService {

    private List<WildCat> ZooBook = new ArrayList();

    public AnimalService() {
        this.ZooBook.add(new WildCat("Simba","Lion",22/3/2019));
        this.ZooBook.add(new WildCat("Stripe","Tiger",21/12/2017));
        this.ZooBook.add(new WildCat("Dot","Cheetah",12/5/2018));
        this.ZooBook.add(new WildCat("BigDot","Leopard",11/12/2016));
        this.ZooBook.add(new WildCat("Black","Puma",5/2/2015));

    }

    public List<WildCat> getAnimal() {

        return ZooBook;

    }

    public void addAnimal(WildCat wildCat){

        String name;
        String breed;
        int age;


    }

}
