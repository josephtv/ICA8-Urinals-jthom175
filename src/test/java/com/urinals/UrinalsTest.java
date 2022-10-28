package com.urinals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author JOSEPH THOMAS
 */

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
        assertEquals(true, urinals.validString(testString));
    }

    @Test
    public void validString_Test2() {

        System.out.println("====== Joseph Thomas == TEST TWO EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "abc-abc";
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    public void validString_Test3() {

        System.out.println("====== Joseph Thomas == TEST THREE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "111111111100000000001";
        //assertTrue(testString.length()<=20,"Max String length must be 20");
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    public void validString_Test4() {

        System.out.println("====== Joseph Thomas == TEST FOUR EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "";
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    void countUrinals_Test1() {
        System.out.println("====== Joseph Thomas == TEST FIVE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "10001";
        assertEquals(1, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test2() {
        System.out.println("====== Joseph Thomas == TEST SIX EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "1001";
        assertEquals(0, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test3() {
        System.out.println("====== Joseph Thomas == TEST SEVEN EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "00000";
        assertEquals(3, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test4() {
        System.out.println("====== Joseph Thomas == TEST EIGHT EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "0000";
        assertEquals(2, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test5() {
        System.out.println("====== Joseph Thomas == TEST NINE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "01000";
        assertEquals(1, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test6() {
        System.out.println("====== Joseph Thomas == TEST TEN EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "011";
        assertEquals(-1, urinals.countUrinals(testString));
    }

    @Test
    public void testReadFile() {
        File file = new File("src/main/resources/urinal.dat");
        assertTrue(file.exists());
    }
}