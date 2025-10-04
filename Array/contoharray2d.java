package Array;

public class contoharray2d {
  public static void main(String[] args) {
    String[][] dataMahasiswa = {
        { "Nayla Putri", "Serpong" },
        { "Eki Saputri", "Ciputat" },
        { "Ade Naplia", "Pasar Kemis" },
        { "Yuliana", "Pasar Minggu" }
    };
    // Menampilkan data mahasiswa
    for (int i = 0; i < dataMahasiswa.length; i++) {
      System.out.println("Nama: " + dataMahasiswa[i][0] + ", Alamat: " + dataMahasiswa[i][0]);
      System.out.println("Nama: " + dataMahasiswa[i][0] + ", Alamat: " + dataMahasiswa[i][1]);
    }
  }
}