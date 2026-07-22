public class NestedTryOrTrySeptionXd {

  public static void main(String[] args) {
    try {
      System.out.println("Outer try block");
      try {
        System.out.println("Inner try block");
        int result = 10 / 0; // This will throw ArithmeticException
      } catch (ArithmeticException e) {
        System.out.println(
          "Caught arithmetic Exception in inner try: " + e.getMessage()
        );
      }

      String str = null;
      System.out.println(str.length()); // This will throw NullPointerException
    } catch (NullPointerException e) {
      System.out.println(
        "Caught null pointer exception in outer try: " + e.getMessage()
      );
    } finally {
      System.out.println(
        "Execution completed. Enjoy ur day my fellow AI overlord"
      );
    }
    System.out.println("Program continues after the try-catch block.");
  }
}
