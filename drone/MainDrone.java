package drone;

public class MainDrone {
  public static void main(String[] args) {
    // Membuat objek drone
    Drone drone1 = new Drone();
    drone1.energi = 90;
    drone1.ketinggian = 2;
    drone1.kecepatan = 20;
    drone1.merek = "Sony";

    // Menerbangkan drone
    drone1.terbang();
    System.out.println("Ketinggian: " + drone1.ketinggian + ", Energi: " + drone1.energi);

    // Menggerakkan drone maju
    drone1.maju();
    System.out.println("Kecepatan: " + drone1.kecepatan + ", Energi: " + drone1.energi);

    // Membelokkan drone
    drone1.belok();
    System.out.println("Energi: " + drone1.energi);

    // Menurunkan drone
    drone1.turun();
    System.out.println("Ketinggian: " + drone1.ketinggian + ", Energi: " + drone1.energi);

    // Mematikan mesin drone
    drone1.matikanMesin();
  }
}