package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String test = "My friend Dylan got distracted in school.";
        countDs(test);
    }


    public static int countDs(String s) {
        int numOfD = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'd') {
                numOfD++;
            }
        }
        System.out.println(numOfD);
        return numOfD;
    }

}

