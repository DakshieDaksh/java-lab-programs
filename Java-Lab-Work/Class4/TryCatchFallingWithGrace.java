public class TryCatchFallingWithGrace {

  /*
    
        CLASS WORK CLASS 4 I HAVE MISSED HALF CLASSES TECHNICALLY BUT YEA
    
    */
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 0;

    try {
      int result = num1 / num2;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Caught an exception: " + e.getMessage());
    } finally {
      System.out.println(
        "Execution completed. Enjoy ur day my fellow AI overlord"
      );
    }
  }
}
