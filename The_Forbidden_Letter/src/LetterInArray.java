public class LetterInArray {

    public static boolean forbiddenLetter(String ch, String[] words) {

        for (int i = 0; i < words.length; i++) {
            if ( (words[i].contains(ch))) {
                return false;
            }

        }
        return true;

    }

}
