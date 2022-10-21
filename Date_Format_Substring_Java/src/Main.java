public class Main {

    public static void main(String[] args) {

        String date = "11/12/2019";

        System.out.println(formatDate(date));
    }

    public static String formatDate(String date) {

        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        String year = date.substring(6, 10);

        return year + month + day;
    }
}
