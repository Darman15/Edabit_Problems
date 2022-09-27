package com.company;

public class Challenge {

    public static int countCharachters(String[] arr) {
        int charachters = 0;

       for (int i = 0; i < arr.length; i++) {
         charachters  = arr[i].length() + charachters;
        }
       return charachters;
    }
}
