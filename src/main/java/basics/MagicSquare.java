package basics;

@SuppressWarnings("SpellCheckingInspection")
public class MagicSquare {

    /**
     * A magic square is an (n x n) matrix such that:
     *
     * - all the positive numbers 1,2, ..., n*n are present (thus each number appears exactly once)
     * - the sums of the numbers in each row, each column and both main diagonals are the same
     *
     *   For instance a 3 x 3 magic square is the following
     *
     *   2 7 6
     *   9 5 1
     *   4 3 8
     *
     *   You have to implement the method that verifies if a matrix is a valid magic square
     */

    /**
     *
     * @param matrix a square matrix of size n x n
     * @return true if matrix is a n x n magic square, false otherwise
     */
    @SuppressWarnings("SameReturnValue")
    public static boolean isMagicSquare(int [][] matrix) {
        // TODO Implement the body of this method, feel free to add other methods but do not change the signature of isMagiSquare
        int length = matrix.length;
        for (int i = 1; i <= Math.pow(length, 2); i++ ) {
            if (! contient(matrix, i)) return false;
        }

        int sum_test = 0;
        for (int i = 0; i < length; i++) {
            sum_test += matrix[0][i];
        }

        int sum1 = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                sum1 += matrix[i][j];
            }
            if (sum1 != sum_test) return false;
            sum1 = 0;
        }

        int sum2 = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                sum2 += matrix[j][i];
            }
            if (sum2 != sum_test) return false;
            sum2 = 0;
        }

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < length; i++) {
            sum3 += matrix[i][i];
            sum4 += matrix[length-1-i][i];
        }

        return sum3 == sum_test && sum4 == sum_test;
    }
    private static boolean contient(int[][] matrice, int valeurRecherchee) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == valeurRecherchee) {
                    return true; // Élément trouvé
                }
            }
        }
        return false; // Élément non trouvé après tout le parcours
    }
}
