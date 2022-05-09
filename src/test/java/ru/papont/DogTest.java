package ru.papont;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testNameDogIsNotBlank() {
        Dog dog = new Dog("Albert", 2);
        assertEquals("Albert", dog.getName());
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @Test
    void testNameDogIsBlank() {
        Dog dog = new Dog("", 2);
        dog.setName("Albert");
        assertEquals("Albert", dog.getName());
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