import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String string = "abc";

        reverseCapitalize(string);
    }

    public static String reverseCapitalize(String str) {
        char ch;
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str. charAt(i);
            answer = ch + answer;
        }
        answer = answer.toUpperCase(Locale.ROOT);
        return answer;
    }
}
