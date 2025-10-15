package polimorfisme;

public class mainbangundatar {
  public static void main(String[] args) {
    bangundatar objbangundatar = new bangundatar();
    persegi objpersegi = new persegi(5);
    segitiga objsegitiga = new segitiga(4, 6);
    lingkaran objlingkaran = new lingkaran(10);

    objbangundatar.luas();
    objbangundatar.keliling();

    System.out.println("Luas persegi : 5 * 5 = " + objpersegi.luas());
    System.out.println("Keliling persegi : 4 * 5 = " + objpersegi.keliling());
    System.out.println("Luas segitiga : 4 * 6 / 2 = " + objsegitiga.luas());
    System.out.println("Luas lingkaran : phi * 10 * 10 = " + objlingkaran.luas());
    System.out.println("Keliling lingkaran : 2 * phi * 10 = " + objlingkaran.keliling());

  }
}
