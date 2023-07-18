public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        // Matrisin transpozunu al
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisi ve transpozunu ekrana yazdır
        System.out.println("Matris:");
        printMatrix(matrix);
        System.out.println("Transpoze:");
        printMatrix(transpose);
    }

    // Matrisi ekrana yazdıran yardımcı metot
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}