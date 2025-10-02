public class MainDrone {
  public static void main(String[] args) {
    // Membuat objek dari kelas Drone
    Drone drone = new Drone();

    // Memanggil method-method dari objek drone1
    drone.energi = 90;
    drone.ketinggian = 2;
    drone.kecepatan = 20;
    drone.merek = "Sony";

    drone.terbang();
    drone.matikanMesin();
    drone.turun();
    drone.belok();
    drone.maju();
    drone.mundur();
  }
}