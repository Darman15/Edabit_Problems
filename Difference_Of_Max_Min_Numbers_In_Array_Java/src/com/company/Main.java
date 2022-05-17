package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {44, 32, 86, 19};

        System.out.println( differenceMaxMin(arr));

    }

    public static int differenceMaxMin(int[] arr) {
        int lowestInt = Integer.MAX_VALUE;
        int highestInt = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > highestInt) {
                highestInt = arr[i];
            }

            if (arr[i] < lowestInt) {
                lowestInt = arr[i];

            }


        }
        return highestInt - lowestInt;
    }
}
