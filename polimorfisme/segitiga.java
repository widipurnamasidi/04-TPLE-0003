package polimorfisme;

public class segitiga extends bangundatar {
  float alas;
  float tinggi;

  public segitiga(float alas, float tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  @Override
  public float luas() {
    return this.alas * this.tinggi / 2;
  }

  @Override
  public float keliling() {
    return this.alas * 3;
  }
}
