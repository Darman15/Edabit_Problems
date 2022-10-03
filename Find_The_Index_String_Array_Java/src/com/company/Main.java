package com.company;

public class Main {

    public static void main(String[] args) {

        String[] stringArr = {"hi", "edabit", "fgh", "abc"};
    }

    public static int findIndex(String[] arr, String str) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                answer = i;
            }
        }
        return answer;
    }
}
