package zooAnimals;

public abstract class Mammal extends Animal {
    //Attributes


    //Constructor


    //Methods
    public String breathe(){
        return "In and Out";
    }

    @Override
    public String reproduce() {
        return "Sexual reproduction";
    }
}