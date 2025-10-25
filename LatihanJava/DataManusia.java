package LatihanJava;

public class DataManusia {
  public static void main(String[] args) {
    Manusia manusia = new Manusia();

    manusia.setNama("Widi purnama sidi");
    manusia.setNoktp(1234567);
    manusia.setAlamat("pasar kemis");
    manusia.setTtl("Jakarta, 1 Juli 1996");
    manusia.setUmur(29);
    manusia.setTinggi(155);

    System.out.println("Nama : " + manusia.getNama());
    System.out.println("No. KTP : " + manusia.getNoktp());
    System.out.println("Alamat : " + manusia.getAlamat());
    System.out.println("Tempat Tanggal Lahir : " + manusia.getTtl());
    System.out.println("Umur : " + manusia.getUmur());
    System.out.println("Tinggi : " + manusia.getTinggi());
  }
}
