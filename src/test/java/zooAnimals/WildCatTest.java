package zooAnimals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;


public class WildCatTest {

    @Test
    @DisplayName("Test Constructor 1")
    public void ConstructorTest() {
        WildCat Wc = new WildCat();
        assertEquals("Incorrect Breed","Tiger",Wc.getBreed());
    }

    @Test
    @DisplayName("Test Constructor 2")
    public void ConstructorTest1() {
        WildCat Wc = new WildCat("Aventador");
        assertEquals("Incorrect Name","Aventador",Wc.getName());
    }

    @Test
    @DisplayName("Test Constructor 3")
    public void ConstructorTest2() {
        WildCat Wc = new WildCat("HyperVenum","Puma");
        assertEquals("Incorrect Breed","Puma",Wc.getBreed());
        assertEquals("Incorrect Name","HyperVenum",Wc.getName());
    }

    @Test
    @DisplayName("Test of Get and Set Name")
    public void SetGetName() {
        WildCat Wc = new WildCat("Royal", "Lion", LocalDate.now());
        Wc.setName("Simba");
        assertEquals("Incorrect Name","Simba",Wc.getName());
    }

    @Test
    @DisplayName("Test of Set and Get Breed")
    public void SetGetBreed() {
        WildCat Wc = new WildCat("Speed", "Leopard", LocalDate.now());
        Wc.setBreed("Cheetah");
        assertEquals("Incorrect Name","Cheetah",Wc.getBreed());
    }

    @Test
    @DisplayName("Test of Set and Get DoB")
    public void SetGetDateOfBirth() {
        WildCat Wc = new WildCat("Power", "Tiger", 5);
        Wc.setDateOfBirth(LocalDate.of(2019, 4, 17));
        assertEquals(LocalDate.of(2019, 4, 17), Wc.getDateOfBirth());
    }

    @Test
    @DisplayName("Test of Set and Get Hungry")
    public void SetGetIsHungry() {
        WildCat Wc = new WildCat("Power", "Tiger", 5);
        Wc.setHungry(false);
        assertEquals(false,Wc.getHungry());
    }


}