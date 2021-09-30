package zooAnimals;

import java.time.LocalDate;
import java.util.ArrayList;

public class WildCat extends Mammal {

    private String name;
    private String breed;
    private LocalDate DOB;
    private boolean Hungry;

    public WildCat() {
        this.name = "Tiger";
    }

    public WildCat(String name) {

        this.name = name;
    }

    public WildCat(String name, String Breed) {
       this.name = name;
       this.breed = Breed;
    }

    public WildCat(String Name, String Breed, int Years) {

        this(Name, Breed, Years, true);
    }

    public WildCat(String pName, String pBreed, LocalDate dateOfBirth, boolean hungry) {
        this.name = pName;
        this.breed = pBreed;
        this.DOB = dateOfBirth;
        this.Hungry = hungry;
    }

    public WildCat(String name, String breed, int Years, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.DOB = LocalDate.now().minusYears(Years);
        this.Hungry = hungry;
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public String getName()
    {
        return name;
    }

    public void setBreed(String Breed)
    {
        this.breed = Breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setDateOfBirth(LocalDate DateOfBirth) {
        this.DOB = DateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return DOB;
    }

    public boolean getIsHungry() {
        return Hungry;
    }

    public void setIsHungry(boolean IsHungry) {
        this.Hungry = IsHungry;
    }

    public String eat() {
        if(this.Hungry) {
            return this.name + " is hungry and needs food";
        } else {
            return this.name + " is not hungry and does not need food";
        }
    }

}
