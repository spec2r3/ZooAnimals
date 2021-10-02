package zooAnimals;

import java.time.LocalDate;

public class WildCat extends Mammal {

    private String name;
    private String breed;
    private LocalDate DOB;
    private boolean Hungry;

    public WildCat() {

        this.breed = "Tiger";
    }

    public WildCat(String name) {

        this.name = name;
    }

    public WildCat(String name, String Breed) {
       this.name = name;
       this.breed = Breed;
    }

    public WildCat(String Name, String Breed, LocalDate dateOfBirth) {
        this.name = Name;
        this.breed = Breed;
        this.DOB = dateOfBirth;
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
    public WildCat(String name, String breed, int Years) {
        this.name = name;
        this.breed = breed;
        this.DOB = LocalDate.now().minusYears(Years);
        this.Hungry = false;
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

    public boolean getHungry() {
        return Hungry;
    }

    public void setHungry(boolean IsHungry) {
        this.Hungry = IsHungry;
    }

    public String eat() {
        if(this.Hungry) {
            return "Hungry";
        } else {
            return " Not Hungry";
        }
    }

}
