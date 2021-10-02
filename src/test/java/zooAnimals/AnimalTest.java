package zooAnimals;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class AnimalTest {

    @Test
    public void breathe() {
    }

    @Test
    public void eat() {
    }

    @Test
    public void reproduce() {
    }

    @Test
    public void sleep() {
        WildCat M = new WildCat();
        Assert.assertEquals("The animal is sleeping", M.sleep());
    }

    @Test
    public void die() {
        WildCat M = new WildCat();
        Assert.assertEquals("The animal has died", M.die());
    }
}
