package drone;

public class Drone {
  // Atribut
  int energi;
  int ketinggian;
  int kecepatan;
  String merek;

  // Method untuk menerbangkan drone
  void terbang() {
    energi--;
    if (energi > 10) {
      ketinggian++;
      System.out.println("Drone terbang ..");
    } else {
      System.out.println("Energi lemah: Drone tidak bisa terbang");
    }
  }

  // Method untuk mematikan mesin drone
  void matikanMesin() {
    if (ketinggian > 1) {
      System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
    } else {
      System.out.println("Mesin dimatikan");
    }
  }

  // Method untuk menurunkan drone
  void turun() {
    ketinggian--;
    energi--;
    System.out.println("Drone turun");
  }

  // Method untuk membelokkan drone
  void belok() {
    energi--;
    System.out.println("Drone belok");
  }

  // Method untuk menggerakkan drone maju
  void maju() {
    energi--;
    kecepatan++;
    System.out.println("Drone maju");
  }

  // Method untuk menggerakkan drone mundur
  void mundur() {
    energi--;
    kecepatan--;
    System.out.println("Drone mundur");
  }
}
