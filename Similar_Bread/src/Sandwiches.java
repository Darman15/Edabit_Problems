public class Sandwiches {

    public static boolean hasSameBread(String[]a, String[] b) {
        if ( (a[0] == b[0]) && (a[2] == b[2]) ) {
            return true;
        }
        return false;
    }
}
