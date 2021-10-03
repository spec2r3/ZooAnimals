package zooAnimals;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ZooList {
    private List<WildCat> ZooBook = new ArrayList();

    public ZooList() {
        this.ZooBook.add(new WildCat("Simba","Lion",22/3/2019));
        this.ZooBook.add(new WildCat("Stripe","Tiger",21/12/2017));
        this.ZooBook.add(new WildCat("Dot","Cheetah",12/5/2018));
        this.ZooBook.add(new WildCat("BigDot","Leopard",11/12/2016));
        this.ZooBook.add(new WildCat("Black","Puma",5/2/2015));

    }

    public String toString() {
        String json = new Gson().toJson(ZooBook);
        return json;
    }

    public List<WildCat> getZooList() {

        return this.ZooBook;

    }
}
