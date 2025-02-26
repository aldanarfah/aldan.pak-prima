public class MenentukanDiagonal {
    public static void main(String[] args) {
   
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks:");
        printMatriks(matriks);

        System.out.println("\nDiagonal Utama:");
        int[] diagonalUtama = getDiagonalUtama(matriks);
        printArray(diagonalUtama);

        System.out.println("\nDiagonal Samping:");
        int[] diagonalSamping = getDiagonalSamping(matriks);
        printArray(diagonalSamping);
    }

    
    public static int[] getDiagonalUtama(int[][] matriks) {
        int n = matriks.length;
        int[] diagonal = new int[n]; 
        for (int i = 0; i < n; i++) {
            diagonal[i] = matriks[i][i]; 
        }

        return diagonal;
    }


    public static int[] getDiagonalSamping(int[][] matriks) {
        int n = matriks.length;
        int[] diagonal = new int[n]; 

        for (int i = 0; i < n; i++) {
            diagonal[i] = matriks[i][n - 1 - i]; 
        }

        return diagonal;
    }

 
    public static void printMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }

    
    public static void printArray(int[] array) {
        for (int nilai : array) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}