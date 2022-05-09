package ru.papont;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CarTest {

    @Test
    void createCar() {
        Car car = new Car("", "", 2014,"");
        Car newCar = Mockito.mock(Car.class);

        assertEquals( 0, newCar.getYear());
    }


    @Test
    void remoteServiceReturnValue() {
        Car car = Mockito.mock(Car.class);
        when(car.testInt(4)).thenReturn(10);

        assertEquals(10, car.testInt(4));
    }

    @Test
    void getOwner() {
        Car car = Mockito.mock(Car.class);
        when(car.getOwner()).thenReturn("Dmitrij");

        assertEquals("Dmitrij", car.getOwner());
    }
}
