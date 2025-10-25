package kontruktor;

public class customer {
  private String username;
  private String password;

  public customer() {
    System.out.print("ini method constructor");
  }
}

class contohconstructor {
  public static void main(String[] args) {
    customer galuh = new customer();
  }
}
