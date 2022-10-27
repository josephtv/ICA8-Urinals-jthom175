package com.urinals;

public class Urinals {

    static Urinals urinals = new Urinals();
    public static void main(String[] args) {
        System.out.println("ICA8 Test: Urinals");
        urinals.validString("abc-abc");
    }

    Boolean validString(String str) {
        if(str.matches("^[01]+$")) {
            System.out.println("valid String");
            return true;
        }
        else {
            System.out.println("Invalid String");
            return false;
        }
    }
}