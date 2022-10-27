package com.urinals;

import java.io.*;
import java.util.ArrayList;

public class Urinals {

    static Urinals urinals = new Urinals();
    ArrayList<String> inputs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("ICA8 Test: Urinals");
        urinals.readFile();
        urinals.validString("abc-abc");
    }

    void readFile() throws IOException {
        File file = new File("src/main/resources/urinal.dat");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String lineFromFile;

        while ((lineFromFile = bufferedReader.readLine()) != null) {
           if(lineFromFile.equals("-1")) {
               break;
           }
           inputs.add(lineFromFile);
        }

        System.out.println(inputs.toString());

    }

    Boolean validString(String str) {
        if(str.matches("^[01]+$") && str.length() >= 1 && str.length() <= 20) {
            System.out.println("valid String");
            return true;
        }
        else {
            System.out.println("Invalid String");
            return false;
        }
    }
}