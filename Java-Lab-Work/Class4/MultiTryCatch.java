public class MultiTryCatch {

  public static void main(String[] args) {
    try {
      String str = "123a";
      int num = Integer.parseInt(str); //NumberFormatException will be thrown here
      int result = 10 / 0; //ArithmeticException will be thrown here
    } catch (NumberFormatException | ArithmeticException e) {
      System.out.println("Error: " + e.getClass().getSimpleName() + "Occured.");
    } finally {
      System.out.println(
        "Execution completed. Enjoy ur day my fellow AI overlord"
      );
    }

    System.out.println("Program continues after the try-catch block.");
  }
}
