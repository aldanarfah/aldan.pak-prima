package perkalianmatriks;

public class PerkalianMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} }; // Matriks 2x3
        int[][] matrix2 = { {7, 8}, {9, 10}, {11, 12} }; // Matriks 3x2

        int[][] result = multiplyMatrices(matrix1, matrix2); // Hasil perkalian
        printMatrix(result); // Menampilkan hasil
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int baris1 = matrix1.length; // Jumlah baris matriks pertama
        int kolom1 = matrix1[0].length; // Jumlah kolom matriks pertama
        int kolom2 = matrix2[0].length; // Jumlah kolom matriks kedua

        int[][] result = new int[baris1][kolom2]; // Matriks hasil

        for (int i = 0; i < baris1; i++) { // Loop untuk baris matriks pertama
            for (int j = 0; j < kolom2; j++) { // Loop untuk kolom matriks kedua
                for (int k = 0; k < kolom1; k++) { // Loop untuk perkalian
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] baris : matrix) {
            for (int value : baris) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}