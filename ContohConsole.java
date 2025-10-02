import java.io.Console;

public class ContohConsole {
  public static void main(String[] args) {
    String jurusan;
    int semester;

    // Membuat objek console
    Console con = System.console();

    // Periksa apakah console tersedia
    if (con == null) {
      System.err.println("Console tidak tersedia. Jalankan program ini dari terminal.");
      System.exit(1);
    }

    // Mengisi variabel dengan console
    System.out.print("Inputkan jurusan: ");
    jurusan = con.readLine();

    System.out.print("Inputkan semester: ");
    // Merubah tipe data String ke Integer
    semester = Integer.parseInt(con.readLine());

    // Menampilkan isi variabel
    System.out.println("Jurusan anda adalah " + jurusan);
    System.out.println("Semester anda adalah " + semester);
  }
}