package input;

import java.io.*;

public class ContohLineReader2 {
  public static void main(String[] args) {
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    String nama = "";

    System.out.print("Masukkan Nama Anda : ");
    try {
      nama = data.readLine();
    } catch (IOException e) {
      System.out.println("Ada Kesalahan!");
    }
    System.out.println("Halo " + nama + "!");
  }
}