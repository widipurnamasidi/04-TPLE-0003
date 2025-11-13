package input;

import java.io.*;

class ContohLineReader {
  public static void main(String[] args) throws IOException {
    String hasil = "";
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Ketik sejumlah string dan akhiri dengan KELUAR");
    str = br.readLine();
    while (!str.equals("KELUAR")) {
      hasil += str + '\n';
      str = br.readLine();
    }
    System.out.println();
    System.out.println("String yang anda ketik: " + hasil);
  }
}