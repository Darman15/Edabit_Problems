public class Main {

    public static void main(String[] args) {

        System.out.println(TotalDistance(.1, .1, 6.0));

    }

    public static double TotalDistance(double height, double lenght, double tower) {
        double numOfStairs = tower / height;

        return numOfStairs * (height + lenght);
    }


}
