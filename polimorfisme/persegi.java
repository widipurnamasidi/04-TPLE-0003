package polimorfisme;

public class persegi extends bangundatar {
  float sisi;

  public persegi(float sisi) {
    this.sisi = sisi;
  }

  @Override
  public float luas() {
    return this.sisi * this.sisi;
  }

  @Override
  public float keliling() {
    return this.sisi * 4;
  }
}
