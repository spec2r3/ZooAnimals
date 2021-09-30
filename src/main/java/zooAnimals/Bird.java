package zooAnimals;

public class Bird {

    private String name;
    private String breed;
    private int strength;
    private boolean canFly = false;

    public Bird() {
        this.name = "Bird";
    }

    public Bird(String Name) {

        this.name = Name;
    }

    public Bird(String Name, String Breed) {
        this.strength = 50;
        this.name = Name;
        this.breed = Breed;
        canFly();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public int getStrength() {

        return strength;
    }

    public void setFlyEnergy(int flyEnergy) {
        this.strength = flyEnergy;
        canFly();
    }

    public void canFly() {
        if(strength >= 50) {
            canFly = true;
        } else {
            canFly = false;
        }
        fly();
    }

    public String fly() {
        String BirdF;
        if(canFly) {
            BirdF = "Bird can fly";
        } else {
            BirdF = "Bird cannot fly";
        }
        return BirdF;
    }
}

