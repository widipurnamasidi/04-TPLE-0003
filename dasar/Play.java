package dasar;

// Kelas Play berisi atribut dan method untuk karakter pemain
public class Play {
    String name;
    int speed;
    int healthPoint;

    // Method untuk menjalankan aksi lari
    void run() {
        System.out.println(name + " sedang berjalan ");
        System.out.println("Kecepatan: ");
    }

    // Method untuk mengecek apakah pemain sudah mati
    boolean isDead() {
        if (healthPoint <= 0)
            return true;
        else
            return false;
    }
}
