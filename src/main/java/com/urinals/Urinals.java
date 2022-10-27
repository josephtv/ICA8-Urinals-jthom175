package com.urinals;

import java.io.*;
import java.util.ArrayList;

public class Urinals {

    static Urinals urinals = new Urinals();
    ArrayList<String> inputs = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        System.out.println("ICA8 Test: Urinals");
        urinals.readFile();
        ArrayList<Integer> outputList = new ArrayList<>();
        for(String urinalString: urinals.inputs) {
            if(urinals.validString(urinalString)) {
                int count = urinals.countUrinals(urinalString);
                outputList.add(count);
            }
            else{
                outputList.add(-1);
            }
        }

        System.out.println("Output: "+outputList);

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

        System.out.println("Inputs: "+inputs.toString());

    }

    Boolean validString(String str) {
        if(str.matches("^[01]+$") && str.length() >= 1 && str.length() <= 20) {
            System.out.println(str + " is a valid String");
            return true;
        }
        else {
            System.out.println(str + " is an invalid String");
            return false;
        }
    }


    int countUrinals(String temp) {

        int length = temp.length();
        for(int i = 0; i<length-1; i++) {
            if(temp.charAt(i) == '1' && temp.charAt(i+1) == '1') {
                return -1;
            }
        }

        boolean flag = false;
        int ans = 1;
        int tmp = 0;

        for(int i = 0; i<length; i++) {
            if(temp.charAt(i) == '0' && (i == 0 || temp.charAt(i - 1) == '0') && (i == (length - 1) || temp.charAt(i + 1) == '0')) {
                tmp += 1;
                flag = true;
            }
            else {
                if(tmp>0) {
                    ans = ans * (tmp+1)/2;
                    tmp = 0;
                }
            }
        }
        if(tmp>0) {
            ans = ans * (tmp+1)/2;
        }

        if(flag) {
            return ans;
        }
        return 0;
    }

}