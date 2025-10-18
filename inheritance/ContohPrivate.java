package inheritance;

class ContohPrivate {
  public static void main(String[] args) {
    Orang xOrang = new Orang();
    xOrang.nama = "Galuh Saputri"; // disini error

    System.out.println("Nama Orang: " + xOrang.nama);
  }
}