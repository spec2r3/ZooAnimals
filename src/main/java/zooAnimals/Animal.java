package zooAnimals;

public abstract class Animal {
    //Variables

    //Constructor

    //Methods
    public abstract String breathe();

    public abstract String eat();

    public abstract String reproduce();

    public String sleep() {
        return "The animal is sleeping";
    }

    public String die()
    {

        return "The animal has died.";
    }
}