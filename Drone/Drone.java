package Drone;

class Drone {
  // Atribut
  int energi;
  int ketinggian;
  int kecepatan;
  String merek;

  // Method untuk mengatur ketinggian dan mengecek status terbang
  void terbang() {
    energi--;
    if (energi > 10) {
      ketinggian++;
      System.out.println("Drone terbang ..");
    } else {
      System.out.println("Enegi lemah: Drone tidak bisa terbang");
    }
  }

  // Method untuk memuat barang dan mengecek apakah bisa dimuat saat terbang
  void matikanMesin() {
    if (ketinggian > 1) {
      System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
    } else {
      System.out.println("Mesin dimatikan");
    }
  }

  void turun() {
    ketinggian--;
    energi--;
    System.out.println("Drone turun");
  }

  void belok() {
    energi--;
    System.out.println("Drone belok");
  }

  void maju() {
    energi--;
    System.out.println("Drone maju");
    kecepatan++;
  }

  void mundur() {
    energi--;
    System.out.println("Drone mundur");
    kecepatan--;
  }
}