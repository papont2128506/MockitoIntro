package ru.papont;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTestUnit {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Shkoda", "ABC-1234", 2019, "papont");
    }

    @Test
    void getManufacturer() {
        assertEquals("Shkoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD-1234");
        assertEquals("ABCD-1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("papont", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("mamont");
        assertEquals("mamont", car.getOwner());
    }

    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[] {"papont"}, car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners() {
        car.setOwner("mamont");
        assertArrayEquals(new String[] {"papont", "mamont"}, car.getOwners().toArray());
    }

    @Test
    void testInt() {
    }
}