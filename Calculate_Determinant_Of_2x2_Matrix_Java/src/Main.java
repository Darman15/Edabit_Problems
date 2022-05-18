public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        System.out.println(calcDeterminant(matrix));
    }

    public static int calcDeterminant(int[][] matrix) {
         int determinant = ( ( matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]) );

        return determinant;
    }




}
