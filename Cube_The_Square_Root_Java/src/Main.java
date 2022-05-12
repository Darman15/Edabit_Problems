public class Main {

    public static void main(String[] args) {

        System.out.println(cubeSquareRoot(81));
    }

    public static int cubeSquareRoot(int num) {
      int sqrRoot = (int) Math.sqrt(num);
      int cubed = (int) Math.pow( sqrRoot,  3);
      return cubed;
    }
}
