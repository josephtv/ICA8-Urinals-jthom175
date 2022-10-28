package com.urinals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

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
        //checking valid string
        System.out.println("====== Joseph Thomas == TEST ONE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "101010";
        assertEquals(true, urinals.validString(testString));
    }

    @Test
    public void validString_Test2() {
        //checking for invalid string
        System.out.println("====== Joseph Thomas == TEST TWO EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "abc-abc";
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    public void validString_Test3() {
        //checking for string length greater than 20
        System.out.println("====== Joseph Thomas == TEST THREE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "111111111100000000001";
        //assertTrue(testString.length()<=20,"Max String length must be 20");
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    public void validString_Test4() {
        //checking string length less than 1
        System.out.println("====== Joseph Thomas == TEST FOUR EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "";
        assertEquals(false, urinals.validString(testString));
    }

    @Test
    void countUrinals_Test1() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST FIVE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "10001";
        assertEquals(1, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test2() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST SIX EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "1001";
        assertEquals(0, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test3() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST SEVEN EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "00000";
        assertEquals(3, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test4() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST EIGHT EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "0000";
        assertEquals(2, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test5() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST NINE EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "01000";
        assertEquals(1, urinals.countUrinals(testString));
    }

    @Test
    void countUrinals_Test6() {
        //checking countUrinals function give expected outcome
        System.out.println("====== Joseph Thomas == TEST TEN EXECUTED =======");
        Urinals urinals = new Urinals();
        String testString = "011";
        assertEquals(-1, urinals.countUrinals(testString));
    }

    @Test
    public void testReadFile_Test1() {
        //checking file exists
        System.out.println("====== Joseph Thomas == TEST ELEVEN EXECUTED =======");
        File file = new File("src/main/resources/urinal.dat");
        assertTrue(file.exists());
    }

    @Test
    public void testReadFile_Test2() throws IOException {
        //checking for empty file
        System.out.println("====== Joseph Thomas == TEST TWELVE EXECUTED =======");
        File file = new File("src/main/resources/urinal.dat");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/urinal.dat"));
        if (bufferedReader.readLine() == null) {
            System.out.println("No errors, and file empty");
        }
        assertTrue(file.exists());
        assertNotNull(bufferedReader.readLine());
    }

    @Test
    public void testWrite() {
        //checks valid output file name
        System.out.println("====== Joseph Thomas == TEST THIRTEEN EXECUTED =======");
        File file = new File("src/main/resources/rule7.txt");
        String name = file.getName();
        assertTrue(name.contains("rule"));
    }

}