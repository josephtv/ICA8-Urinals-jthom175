package com.urinals;

public class Urinals {

    static Urinals urinals = new Urinals();
    public static void main(String[] args) {
        System.out.println("ICA8 Test: Urinals");
        urinals.validString("abc-abc");
    }

    Boolean validString(String str) {
        System.out.println("To be implemented");
        return true;
    }
}