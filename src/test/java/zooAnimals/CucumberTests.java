package zooAnimals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberTests {
    private Boolean isHungry;
    private String WildCatEat;

    @Given("WildCat hunger is {string}")
    public void wildcatHungerIs(Boolean arg0) {
        isHungry = arg0;
    }

    @When("WildCat is hungry")
    public void wildcatIsHungry() {WildCatEat = TestMethods.isHungry(isHungry);
    }

    @Then("WildCat will be fed")
    public void wildcatWillBeFed()
    {
        WildCat Wc = new WildCat("Power", "Tiger", 5);
        Wc.setHungry(true);
        assertEquals(Wc.getHungry(), true);
    }

    @When("WildCat is not hungry")
    public void wildcatIsNotHungry() {
        WildCatEat = TestMethods.isHungry(isHungry);
    }

    @Then("WildCat will not be fed")
    public void wildcatWillNotBeFed() {
        WildCat Wc = new WildCat("Power", "Tiger", 5);
        Wc.setHungry(false);
        assertEquals(Wc.getHungry(), false);
    }

    static class TestMethods {
        static Boolean isHungry(String isHungry) {
            String eat = "";
            if (isHungry.equals("true")) {
                eat = "Hungry";
            } else if (isHungry.equals("false")) {
                eat = "Not Hungry";
            }
            return eat;
        }
    }
}


