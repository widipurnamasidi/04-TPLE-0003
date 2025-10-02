import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferedReader {
  public static void main(String[] args) throws IOException {
    String jurusan;

    // Membuat objek inputstream
    InputStreamReader isr = new InputStreamReader(System.in);
    // Membuat objek bufferreader
    BufferedReader br = new BufferedReader(isr);

    // Mengisi variabel jurusan dengan BufferReader

    System.out.print("Inputkan Nama anda: ");
    String nama = br.readLine();
    System.out.print("Inputkan jurusan anda: ");
    jurusan = br.readLine();

    // Menampilkan output isi variabel
    System.out.println("==============================");
    System.out.println("Nama saya adalah " + nama);
    System.out.println("Jurusan saya yaitu adalah " + jurusan);
  }
}