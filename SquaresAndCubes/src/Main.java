//Create a function that takes an array of two numbers and checks if the square root of the first number is equal to the cube root of the second number.

public class Main {

    public static void main(String[] args) {

        int [] myArray = {9, 27};

        System.out.println(checkSquareAndCube(myArray));

    }

    public static boolean checkSquareAndCube(int [] array) {
        if ( Math.sqrt(array[0]) == Math.cbrt(array[1]) ) {
            return true;
        }
        return false;
    }
}
