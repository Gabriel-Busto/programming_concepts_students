package basics;

public class Matrix {

    /**
     * Create a matrix from a String.
     *
     * The string if formatted as follow:
     *  - Each row of the matrix is separated by a newline
     *    character \n
     *  - Each element of the rows are separated by a space
     *
     *  @param s The input String
     *  @return The matrix represented by the String
     */
    public static int[][] buildFrom(String s) {
        if (s == null || s.isEmpty()) {
            return new int [0][0];
        }
        String [] lines = s.split("\n");
        int [][] matrix = new int [lines.length][];
        for (int i = 0; i < lines.length; i++) {
            /*
            * 1. création de la liste à parcourir (éléments)
            * 1.1. .trim() supprime les espaces superflus
            * 1.2. .split() coupe lines[i] à chaque "\\s+" (le premier \ signifie que "\s" devrait
            *      être un caractère spécial), mais ce n'en est pas un valide
            *      enfin donc \s+ signfie n'importe quel caractère d'espace, 1 ou plusieurs grâce au +
            * 2. création d'un array de la bonne longueur
            * 3. boucle sur les élément de elements
            * 4. Integer.parseInt(String) convertit le String en int
            */
            String[] elements = lines[i].trim().split("\\s");
            matrix[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
        return matrix;
    }


    /**
     * Compute the sum of the element in a matrix
     *
     * @param matrix The input matrix
     * @return The sum of the element in matrix
     */
    public static int sum(int[][] matrix) {
         int count = 0;
         for (int i = 0; i < matrix.length; i++){
             for (int j = 0; j < matrix[i].length; j++){
                 count += matrix[i][j];
             }
         }
         return count;
    }

    /**
     * Compute the transpose of a matrix
     * (pour une matrice carrée, pas besoin de s'embêter avec rows et cols)
     * @param matrix1 The input matrix
     * @return A new matrix that is the transpose of matrix
     */
    public static int[][] transpose(int[][] matrix1) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int [][] matrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = matrix1[i][j];
            }
        }
        return matrix;
    }

    /**
     * Compute the product of two matrix
     *
     * @param matrix1 A n x m matrix
     * @param matrix2 A m x k matrix
     * @return The n x k matrix product of matrix1 and matrix2
     *
     * really interesting to see and understand how the product works
     */
    public static int[][] product(int[][] matrix1, int[][] matrix2) {
        int [][] matrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int count = 0;
                for (int k = 0; k < matrix1[0].length; k++ ) {
                    count += matrix1[i][k] * matrix2[k][j];
                    matrix[i][j] = count;
                }
            }
        }
        return matrix;
    }
}