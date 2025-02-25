# PENJELASAN

```java
public class OperasiMatriks {
    // Mendeklarasikan kelas bernama OperasiMatriks

    public static void main(String[] args) {
        // Mendeklarasikan metode main sebagai langkah awal mengeksekusi program
        
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
            // Mendeklarasikan dan menginisialisasi array dua dimensi matriksA dengan nilai-nilai awal.
        };

        int[][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
            // Mendeklarasikan dan menginisialisasi array dua dimensi matriksB dengan nilai-nilai awal.
        };

        
        int[][] hasil = new int[2][3];
        // Mendeklarasikan array dua dimensi hasil yang akan digunakan untuk menyimpan hasil penjumlahan matriksA dan matriksB. Ukuran array ini sama dengan ukuran matriksA dan matriksB (2 baris dan 3 kolom).

        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                // Loop for ini digunakan untuk menelusuri setiap elemen dalam matriksA dan matriksB, menjumlahkan elemen-elemen yang berkorespondensi, dan menyimpan hasil penjumlahan tersebut ke array hasil.
            }
        }

        System.out.println("Hasil penjumlahan matriks:");
        // Mencetak teks "Hasil penjumlahan matriks:" ke layar.
        for (int[] baris : hasil) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
            // Loop for-each ini digunakan untuk menelusuri setiap baris dalam array hasil, kemudian mencetak setiap elemen dalam baris tersebut. Setelah mencetak semua elemen dalam satu baris, program mencetak baris baru dengan System.out.println().
        }
    }
}
