package zooAnimals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class AnimalController{

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<WildCat> getAnimal() {

        return animalService.getAnimal();

    }

    @PostMapping
    public void addAnimal(@RequestBody Animal animal) {



    }



}


