# PENJELASAN

```java
public class SistemNilai {
    // Medeklarasikan kelas bernama SistemNilai

    public static void main(String[] args) {
        // Mendeklarasikan metode main sebagai langkah awal mengeksekusi program

        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
        // Mendeklarasikan dan menginisialisasi array namaSiswa dengan beberapa nama siswa.

        int[][] nilai = {
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
            // Mendeklarasikan dan menginisialisasi array dua dimensi nilai dengan nilai-nilai siswa untuk setiap mata pelajaran.
        };

        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
        // Mendeklarasikan dan menginisialisasi array mapel dengan nama-nama mata pelajaran.

        System.out.println("Rata-rata nilai per siswa:");
        // Mencetak teks Rata-rata nilai per siswa:

        for (int i = 0; i < nilai.length; i++) {
            double total = 0;
            for (int n : nilai[i]) {
                total += n;
            }
            double rataSiswa = total / nilai[i].length;
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);
            //Loop for ini digunakan untuk menghitung rata-rata nilai setiap siswa. Loop bagian luar menelusuri setiap siswa, menghitung total nilai siswa tersebut, dan kemudian menghitung rata-rata dengan membagi total dengan jumlah mata pelajaran. Hasilnya kemudian dicetak ke layar.
        }

        System.out.println("\nRata-rata nilai per mata pelajaran:");
        // mencetak teks "Rata-rata nilai per mata pelajaran:"

        for (int j = 0; j < nilai[0].length; j++) {
            double total = 0;
            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i][j];
            }
            double rataMapel = total / nilai.length;
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
            // Loop ini mengiterasi melalui setiap mata pelajaran. Untuk setiap mata pelajaran, ia menghitung total nilai dari semua siswa dalam mata pelajaran tersebut, lalu menghitung rata-rata dengan membagi total nilai dengan jumlah siswa. Hasilnya kemudian dicetak ke konsol menggunakan System.out.printf.
        }
    }
}
