package dasar;

// Kelas utama untuk menjalankan permainan
public class Game {
  public static void main(String[] args) {
    // Membuat objek player
    Play galuh = new Play();

    // Mengisi atribut player
    galuh.name = "Galuh Saputri";
    galuh.speed = 70;
    galuh.healthPoint = 100;

    // Menjalankan method
    galuh.run();

    if (galuh.isDead()) {
      System.out.println("Permainan Game Over!");
    }
  }
}