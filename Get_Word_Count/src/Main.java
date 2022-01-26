//Create a method that takes a string and returns the word count. The string will be a sentence.


public class Main {

    public static void main(String[] args) {

countWords("Just an example here move along another word dsf ");

    }
//    Methods
    public static int countWords(String str) {
        String[] numOfWords = new String[1];
      return str.split(" ").length;
    }

}
