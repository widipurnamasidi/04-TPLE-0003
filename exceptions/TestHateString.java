package exceptions;

class HateStringException extends RuntimeException {
  /* Tidak perlu memasukkan member ataupun construktor */
}

class TestHateString {
  public static void main(String args[]) {
    String input = "invalid input";
    try {
      if (input.equals("invalid input")) {
        throw new HateStringException();
      }
      System.out.println("String accepted.");
    } catch (HateStringException e) {
      System.out.println("I hate this string: " + input + ".");
    }
  }
}