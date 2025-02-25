# PENJELASAN

```java
public class PencarianArray {
    // Mendeklarasikan kelas bernama PencarianArray

    public static void main(String[] args) {
        // Mendeklarasikan metode main sebagai langkah awal untuk mengeksekusi program
        
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        // Mendeklarasikan dan menginisialisasi array nilai dengan beberapa bilangan bulat.

        int cari = 90;
        // Mendeklarasikan variabel cari yang berisi nilai yang akan dicari dalam array nilai.

        boolean ketemu = false;
        // Mendeklarasikan variabel ketemu yang bertipe boolean, digunakan untuk menyimpan status apakah nilai yang dicari ditemukan atau tidak. Inisialisasi dengan nilai false.

        int indeks = -1;
        // Mendeklarasikan variabel indeks yang digunakan untuk menyimpan indeks di mana nilai yang dicari ditemukan. Inisialisasi dengan nilai -1 sebagai indikator nilai belum ditemukan.

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
                //Loop for ini digunakan untuk mencari nilai cari dalam array nilai. Loop ini akan menelusuri setiap elemen dalam array. Jika elemen yang sedang diperiksa sama dengan nilai cari, variabel ketemu diubah menjadi true, indeks diisi dengan nilai i (indeks di mana nilai ditemukan), dan loop dihentikan dengan menggunakan break.
            }
        }

        // Menampilkan hasil
        if (ketemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
            // Blok if-else ini digunakan untuk menampilkan hasil pencarian. Jika nilai cari ditemukan (ketemu adalah true), maka program akan mencetak pesan bahwa nilai tersebut ditemukan pada indeks tertentu. Jika tidak ditemukan (ketemu adalah false), maka program akan mencetak pesan bahwa nilai tersebut tidak ditemukan.
        }
    }
}
