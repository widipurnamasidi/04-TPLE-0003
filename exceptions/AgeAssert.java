package exceptions;

class AgeAssert {
  public static void main(String args[]) {
    int age = Integer.parseInt(args[0]);
    assert (age > 0);
    /* jika masukan umur benar (misal, age>0) */
    if (age >= 18) {
      System.out.println("Congrats! You're an adult!");
    }
  }
}