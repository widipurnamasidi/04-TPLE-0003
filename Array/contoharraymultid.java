package Array;

import java.util.Scanner;

public class contoharraymultid {
  public static void main(String[] args) {
    String[][] bangku = new String[3][3];
    Scanner input = new Scanner(System.in);
    for (int bar = 0; bar < bangku.length; bar++) {
      for (int kol = 0; kol < bangku[bar].length; kol++) {
        System.out.printf("Acara reuni SMA yang akan hadir adalah (%d,%d): ", bar, kol);
        bangku[bar][kol] = input.nextLine();
      }
    }
    System.out.println("************************************");
    for (int bar = 0; bar < bangku.length; bar++) {
      for (int kol = 0; kol < bangku[bar].length; kol++) {
        System.out.printf("");
      }
      System.out.println("************************************");
    }
  }
}
