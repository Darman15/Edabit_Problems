package com.company;

public class Main {

    public static void main(String[] args) {

         int[] distArray = {3, 4, -5, -2};

        System.out.println(distanceHome(distArray));

    }

    public static int distanceHome(int[] dist) {
        int distanceHome = 0;
        for (int i = 0; i < dist.length; i++) {

            distanceHome = distanceHome + dist[i];
            System.out.println(Math.abs(distanceHome));
        }
        return Math.abs(distanceHome);
    }

}
