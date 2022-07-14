package processor;

public class MatrixProcessor {

    public static boolean isSameDemension(int[][] matrix1, int[][] matrix2) {
        boolean lengthsAreSame = matrix1.length == matrix2.length;
        if (lengthsAreSame) {

            return matrix1[0].length ==matrix2[0].length;
        }
        System.out.println("ERROR");
        return false;
    }
}
