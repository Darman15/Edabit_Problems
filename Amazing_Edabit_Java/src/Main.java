public class Main {

    public static void main(String[] args) {

        System.out.println(amazingEdabit("Ben is amazing"));
    }

    public static String amazingEdabit(String str) {
        if(str.contains("edabit")) {
            return str;
        }

        else if (str.contains("amazing")) {
        return str.replace("amazing", "not amazing");
        }

        return str;
    }

}
