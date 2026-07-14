import java.util.Scanner;

// Main class
public class StudentMarks {

  public static void main(String[] args) {
    // Scanner object for taking input
    Scanner sc = new Scanner(System.in);

    // Accept marks as String
    System.out.print("Enter marks for Subject 1: ");
    String mark1 = sc.nextLine();

    System.out.print("Enter marks for Subject 2: ");
    String mark2 = sc.nextLine();

    System.out.print("Enter marks for Subject 3: ");
    String mark3 = sc.nextLine();

    // ==========================================
    // Wrapper Class
    // Integer.parseInt() converts String to int
    // ==========================================
    int m1 = Integer.parseInt(mark1);
    int m2 = Integer.parseInt(mark2);
    int m3 = Integer.parseInt(mark3);

    // Calculate total marks
    int total = m1 + m2 + m3;

    // Display result
    System.out.println("\n----- Student Marks -----");
    System.out.println("Subject 1 : " + m1);
    System.out.println("Subject 2 : " + m2);
    System.out.println("Subject 3 : " + m3);
    System.out.println("Total Marks = " + total);

    // Close Scanner
    sc.close();
  }
}
