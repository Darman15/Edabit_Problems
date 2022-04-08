public class Main {

    public static void main(String[] args) {
        System.out.println(even(100));
    }

    public static int even(int n) {
        if ( ( (n * 2)  - 2) % 2 == 0 ) {
            return ((n * 2) - 2);
        }
        return -1;
    }
}
