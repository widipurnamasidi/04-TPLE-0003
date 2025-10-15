package inheritance;

public class mainbangundatar {
  public static void main(String[] args) {
    // Membuat objek dari masing-masing class
    bangundatar mBangunDatar = new bangundatar();

    persegi mPersegi = new persegi();
    mPersegi.sisi = 2;

    lingkaran mLingkaran = new lingkaran();
    mLingkaran.r = 22;

    persegipanjang mPersegiPanjang = new persegipanjang();
    mPersegiPanjang.panjang = 8;
    mPersegiPanjang.lebar = 4;

    segitiga mSegitiga = new segitiga();
    mSegitiga.alas = 12;
    mSegitiga.tinggi = 8;

    // Memanggil method luas dan keliling dari masing-masing objek
    mBangunDatar.luas();
    mBangunDatar.keliling();

    mPersegi.luas();
    mPersegi.keliling();

    mLingkaran.luas();
    mLingkaran.keliling();

    mPersegiPanjang.luas();
    mPersegiPanjang.keliling();

    mSegitiga.luas();
    mSegitiga.keliling();
  }
}
