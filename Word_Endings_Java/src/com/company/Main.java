package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"clever", "meek", "hurried", "nice"};

        addEnding(arr, "ly");
    }

    public static String[] addEnding(String[] arr, String ending) {
        String[] answer = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].concat("ly");
        }
        return answer;
    }
}
