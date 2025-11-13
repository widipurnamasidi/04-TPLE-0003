package input;

import java.io.*;

class ContohWriter {
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter(System.out, true);
    pw.println("Menulis ke console dengan karakter stream");
  }
}
