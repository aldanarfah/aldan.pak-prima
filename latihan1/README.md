# PENJELASAN

```java
public class LatihanArray1 {
    // Mendeklarasikan kelas bernama LatihanArray1

    public static void main(String[] args) {
        // Mendeklarasikan main metode sebagai langkah awal eksekusi program

        int[] bilanganGenap = new int[10];
        // Mendeklarasikan sebuah array yang isinya 10 elemen bilangan bulat
        int jumlah = 0;
        // Mendeklarasikan sebuah variabel jumlah dan menginisialisasinya dengan nilai 0.
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
            // Mengisi array bilanganGenap dengan bilangan genap mulai dari 2. Looping for ini akan menelusuri setiap indeks array dan mengisi setiap elemen dengan bilangan genap.
        }
        

        System.out.println("Isi array:");
        // Mencetak teks "Isi array:" ke layar.

        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }
        // Loop for-each ini akan menelusuri setiap elemen dalam array bilanganGenap, mencetak elemen tersebut ke layar, dan menambahkan nilai elemen tersebut ke variabel jumlah.

        System.out.println("\nJumlah semua elemen: " + jumlah);
    // Mencetak jumlah semua elemen dalam array bilanganGenap ke layar.
    }
}

```
