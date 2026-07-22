import java.util.Scanner;

public class ChainedException {

  public static void main(String args[]) {
    try {
      int[] n = new int[5];
      int divisor = 0;
      for (int i = 0; i < n.length; i++) {
        int res = n[i] / divisor;
        System.out.println("Result: " + res);
      }
    } catch (ArithmeticException e) {
      throw new RuntimeException("Error Division by 0 not possible", e);
    } finally {
      System.out.println("Enjoy ur day my fellow AI overlord");
    }
  }
}
