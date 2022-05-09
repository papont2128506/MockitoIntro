package ru.papont;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    private Dog dog;

    @BeforeEach
    void prepareData() {
        dog = new Dog("Albert", 2);
    }

    @Test
    void testNameDogIsNotBlank() {
        assertEquals("Albert", dog.getName());
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @Test
    void testNameDogIsBlank() {
        dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}