package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] strOne = {"cat", "blue", "skt", "umbrells", "paddy"};

    String[] strTwo = {"cat", "blue", "sky", "umbrella", "paddy"};

        System.out.println(Arrays.toString(correctStream(strOne, strTwo)));


    }

    public static int[] correctStream(String[] user, String[] correct) {
        int[] answer = new int[user.length];

        for(int i = 0; i < user.length; i++) {
            if (user[i].equals(correct[i])) {
                answer[i] = 1;
            }
            else answer[i] = -1;
        }
        return answer;
    }
}
