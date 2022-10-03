package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(findDigitAmount(6356));
    }

    public static int findDigitAmount(int num) {
        int count = 0;

        do {
            count++;
            num = num / 10;
        }
            while (num != 0);
        return count;
    }
}
