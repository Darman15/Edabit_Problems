package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3};
        search(arr, 5);
    }

    public static int search(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }

        }
        return -1;

    }
}
