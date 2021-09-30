package zooAnimals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberTests {
    private String isHungry;
    private String WildCatEat;

    @Given("WildCat hunger is {string}")
    public void wildcatHungerIs(String arg0) {
        isHungry = arg0;
    }

    @When("WildCat is hungry")
    public void wildcatIsHungry() {
        WildCatEat = TestMethods.isHungry(isHungry);
    }

    @Then("WildCat will be fed")
    public void wildcatWillBeFed() {
        assertEquals(WildCatEat, WildCatEat);
    }

    @When("WildCat is not hungry")
    public void wildcatIsNotHungry() {
        WildCatEat = TestMethods.isHungry(isHungry);
    }

    @Then("WildCat will not be fed")
    public void wildcatWillNotBeFed() {
        assertEquals(WildCatEat, WildCatEat);
    }

    static class TestMethods {
        static String isHungry(String isHungry) {
            String eat = "";
            if (isHungry.equals("true")) {
                eat = "Food is fed";
            } else if (isHungry.equals("false")) {
                eat = "Food is not fed";
            }
            return eat;
        }
    }
}

