import java.util.Scanner;

public class DrivingLicenseSystem {

  static void checkLicenseAge(int age) throws LicenseAgeException {
    if (age < 18) {
      throw new LicenseAgeException(
        "You must be 18 or above to apply for a driving license."
      );
    }

    System.out.println("You are eligible for a driving license.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    try {
      checkLicenseAge(age);
    } catch (LicenseAgeException e) {
      System.out.println("Custom Exception: " + e.getMessage());
    }

    sc.close();
  }
}
