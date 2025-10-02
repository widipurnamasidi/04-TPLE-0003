public class Drone {
  // Atribut
  int ketinggian;
  int kecepatan;
  int muatan;
  String merek;

  // Method untuk mengatur ketinggian dan mengecek status terbang
  void terbang() {
    ketinggian = 200;
    if (ketinggian > 100) {
      System.out.println("Drone tidak berfungsi dengan baik");
    } else {
      System.out.println("Drone masih bisa terbang");
    }
  }

  // Method untuk memuat barang dan mengecek apakah bisa dimuat saat terbang
  void muatBarang() {
    muatan = 5;
    if (muatan > 3) {
      System.out.println("Drone tidak bisa dimuati barang sedang terbang");
    } else {
      System.out.println("Drone dimuati");
    }
  }

  // Method untuk menampilkan merek drone
  void tampilkanMerek() {
    merek = "DJI";
    System.out.println("Drone merek: " + merek);
  }

  // Method untuk menampilkan kecepatan drone
  void tampilkanKecepatan() {
    kecepatan = 30; // misalnya 30 km/jam
    System.out.println("Kecepatan drone: " + kecepatan + " km/jam");
  }

  public static void main(String[] args) {
    // Membuat objek dari kelas Drone
    Drone drone1 = new Drone();

    // Memanggil method-method dari objek drone1
    drone1.terbang();
    drone1.muatBarang();
    drone1.tampilkanMerek();
    drone1.tampilkanKecepatan();
  }
}
