//You are given 2 out of 3 angles in a triangle, in degrees.
//        Write a function that classifies the missing angle as either "acute", "right", or "obtuse" based on its degrees.

public class Main {

    public static void main(String[] args) {
        System.out.println(missingAngle(45, 45));
    }
//    methods

    public static String missingAngle(int angleOne, int angleTwo) {
        if ( (180 - (angleOne + angleTwo))  > 90) {
            return " obtuse";
        }
        if ((180 - (angleOne + angleTwo)) < 90) {
            return "acute";
        }
        return "right";
    }
}
