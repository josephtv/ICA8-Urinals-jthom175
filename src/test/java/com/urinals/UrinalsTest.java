package com.urinals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UrinalsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void validString_Test1() {

        System.out.println("====== Joseph Thomas == TEST ONE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "101010";
        assertEquals(true,urinals.validString(testString));
        }

    @Test
    public void validString_Test2() {

        System.out.println("====== Joseph Thomas == TEST TWO EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "abc-abc";
        assertEquals(false,urinals.validString(testString));
    }
}