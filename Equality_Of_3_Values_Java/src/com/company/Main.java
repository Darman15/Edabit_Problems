package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(equal(4,4,3));
    }

    public static int equal(int a, int b, int c) {
        int answer = 0;

        if(a == b && b == c) {
            answer = 3;
            return answer;
        }
        if ( (a == c && a != b) || (b == c && b != a ) || (a == b && a != c)) {
            answer = 2;
            return answer;
        }

        return answer;
    }
}
