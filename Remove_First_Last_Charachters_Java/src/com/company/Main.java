package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "Hello";
        System.out.println(string.length());
        String answer = string.substring(1, (string.length()-1));

        System.out.println(answer);

        System.out.println(removeFirstLast(string));
    }

    public static String removeFirstLast(String str) {
        if (str.length() <= 2) {
            return str;
        }
        else {
            return str.substring(1, (str.length()-1));
        }
    }
}
