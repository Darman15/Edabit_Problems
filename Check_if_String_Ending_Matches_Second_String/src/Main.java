//Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

public class Main {

    public static void main(String[] args) {

        System.out.println(checkEnding("abc", "bc"));

//        String str4 = "Testing for last";
//        String str3 = "last";
//
//        boolean var1 = str4.endsWith("st");
//
//        System.out.println(var1);

    }

    public static boolean checkEnding(String str1, String str2) {

        if (str1.endsWith(str2)) {
            return true;
        } else {
            return false;
        }
    }





}
