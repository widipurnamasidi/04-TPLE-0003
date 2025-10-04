package Array;

import java.util.ArrayList;

public class contoharraylist {
  public static void main(String[] args) {
    ArrayList<String> isiDompet = new ArrayList<String>();
    isiDompet.add("Foto");
    isiDompet.add("100.000");
    isiDompet.add("Struk Belanja");
    isiDompet.add("50.000");
    isiDompet.add("kartu ATM ");
    isiDompet.add("5.000");
    isiDompet.add("2.000  ");
    isiDompet.remove("Struk Belanja");
    System.out.println(isiDompet);
    System.out.println("Dompet berisi: " + isiDompet.size() + " item");
  }
}