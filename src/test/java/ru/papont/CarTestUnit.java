package ru.papont;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Method;

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

    @ParameterizedTest
    @CsvSource({"'ABCD-123', 'ABCD-123'",
            "'DEF-456', 'DEF-456'"})
    void testSetNumberMultipleValues(String number, String x) {
        car.setNumber(number);
        assertEquals(x, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"1, 5",
                "8, 12",
                "32, 36"})
    void testInt(int input, int output) {
        assertEquals(output, car.testInt(input));
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
    void testPrivateMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", null);
            method.setAccessible(true);

            assertEquals("abc", method.invoke(car).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testInt() {
    }
}