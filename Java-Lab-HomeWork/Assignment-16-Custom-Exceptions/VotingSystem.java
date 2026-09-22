import java.util.Scanner;

public class VotingSystem {

  static void checkVotingAge(int age) throws VotingAgeException {
    if (age < 18) {
      throw new VotingAgeException("You must be 18 or above to vote.");
    }

    System.out.println("You are eligible to vote.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    try {
      checkVotingAge(age);
    } catch (VotingAgeException e) {
      System.out.println("Custom Exception: " + e.getMessage());
    }

    sc.close();
  }
}
