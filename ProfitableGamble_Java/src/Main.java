public class Main {

    public static void main(String[] args) {

        System.out.println(profitableGamble(0.9, 1, 2));
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay) {
            return true;
        }
        return false;
    }
}
