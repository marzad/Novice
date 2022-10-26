package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testNumber() {
        int number = 1;
        assertTrue(Main.testNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testNumber_when_number_is_zero() {
        int number = 0;
        assertTrue(Main.testNumber(number));
    }

/*    @Test
    void getName() {
        String name = "Maria";
        assertTrue(Main.getName() == name);
    }*/
}