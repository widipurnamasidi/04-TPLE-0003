package java2;

import inheritance.Orang;

public class ContohProtected {
  Orang xOrang = new Orang();

  public ContohProtected() {
    /*
     * error karena atribut nama
     * diberikan modifier protected
     */
    xOrang.nama = "Galuh Saputri";
  }
}