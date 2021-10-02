package zooAnimals;

import org.junit.Test;

import static org.junit.Assert.*;

public class MammalTest {

    @Test
    public void breathe() {
        WildCat M = new WildCat();
        assertEquals("In and Out", M.breathe());
    }

    @Test
    public void reproduce() {
        WildCat M = new WildCat();
        assertEquals("Sexual reproduction", M.reproduce());
    }
}