import java.lang.*;
import java.util.*;

//Custom Checked Exception
class InvalidAgeException extends Exception {

  public InvalidAgeException(String message) {
    super(message);
  }
}

//Using Custom Exception
public class Throws {

  public static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Age must be at atleast 18.");
    } else {
      System.out.println("Valid age: " + age);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    try {
      validateAge(age);
    } catch (InvalidAgeException e) {
      System.out.println("Caught an exception: " + e.getMessage());
    } finally {
      System.out.println(
        "Execution completed. Enjoy ur day my fellow AI overlord"
      );
    }
  }
}
