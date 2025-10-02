
// Mengimpor Scanner ke program
import java.util.Scanner;

public class ContohScanner {
  public static void main(String[] args) {
    // Deklarasi variabel
    String nama, alamat;
    int usia, kelas;

    // Membuat scanner baru dan menggunakan try-with-resources
    try (Scanner keyboard = new Scanner(System.in)) {

      // Menampilkan output ke user
      System.out.println("===== Pendataan Mahasiswa Universitas Pamulang =====");
      System.out.print("Nama Mahasiswa : ");
      // Menggunakan scanner dan menyimpan data yang diketik di variabel nama
      nama = keyboard.nextLine();

      System.out.print("Alamat : ");
      alamat = keyboard.nextLine();

      System.out.print("Usia : ");
      usia = keyboard.nextInt();

      System.out.print("Semester : ");
      kelas = keyboard.nextInt();

      // Menampilkan data yang sudah disimpan di variabel
      System.out.println("------------------------------------------");
      System.out.println("Nama Siswa : " + nama);
      System.out.println("Alamat : " + alamat);
      System.out.println("Usia : " + usia + " tahun");
      System.out.println("Kelas : " + kelas);
      // Scanner akan otomatis ditutup setelah blok try selesai
    }
  }
}