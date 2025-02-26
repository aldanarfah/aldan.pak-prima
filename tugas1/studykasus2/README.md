# PENJELASAN

```java
public class TicTacToe {
    // Mendeklarasikan kelas bernama TicTacToe

    public static void main(String[] args) {
        // Mendeklarasikan metode main sebagai langkah awal untuk mengeksekusi program

        char[][] papan = new char[3][3];
        // Ini mendefinisikan array dua dimensi papan yang berukuran 3x3, untuk merepresentasikan papan permainan Tic-Tac-Toe.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papan[i][j] = '-';
                // Ini adalah loop bersarang yang menginisialisasi semua elemen di dalam array papan dengan karakter '-' untuk menunjukkan bahwa papan kosong.
            }
        }

        papan[0][0] = 'X';
        papan[1][1] = 'O';
        papan[2][2] = 'X';
        // Ini adalah langkah-langkah simulasi permainan di mana pemain 'X' dan 'O' menempatkan tanda mereka di beberapa posisi pada papan. papan[0][0] diisi dengan 'X', papan[1][1] diisi dengan 'O', dan papan[2][2] diisi dengan 'X'.


        System.out.println("Status Papan:");
        tampilkanPapan(papan);
        // Ini mencetak pesan "Status Papan:" ke konsol dan memanggil metode tampilkanPapan untuk menampilkan papan permainan.
    }

    public static void tampilkanPapan(char[][] papan) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
            // Metode tampilkanPapan menampilkan status papan permainan dengan menggunakan loop bersarang untuk mencetak setiap elemen di dalam array papan. Setiap baris papan dicetak di konsol.
        }
    }
}
