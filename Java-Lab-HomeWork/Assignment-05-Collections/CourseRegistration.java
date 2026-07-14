import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class CourseRegistration {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ArrayList stores registered courses
    ArrayList<String> courses = new ArrayList<>();

    int choice;

    do {
      System.out.println("\n===== COURSE REGISTRATION SYSTEM =====");
      System.out.println("1. Register Course");
      System.out.println("2. Remove Course");
      System.out.println("3. View Registered Courses");
      System.out.println("4. Exit");

      System.out.print("Enter Choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          // User enters course name
          System.out.print("Enter Course Name: ");
          String course = sc.nextLine();

          // Store course in ArrayList
          courses.add(course);

          System.out.println("Course Registered Successfully.");

          break;
        case 2:
          if (courses.isEmpty()) {
            System.out.println("No Courses Registered.");
          } else {
            System.out.print("Enter Course Name to Remove: ");
            String removeCourse = sc.nextLine();

            // Remove course if found
            if (courses.remove(removeCourse)) {
              System.out.println("Course Removed Successfully.");
            } else {
              System.out.println("Course Not Found.");
            }
          }

          break;
        case 3:
          if (courses.isEmpty()) {
            System.out.println("No Courses Registered.");
          } else {
            // StringBuffer efficiently builds a long string
            StringBuffer registeredCourses = new StringBuffer();

            registeredCourses.append("\n----- REGISTERED COURSES -----\n");

            // Display every course stored in ArrayList
            for (int i = 0; i < courses.size(); i++) {
              registeredCourses
                .append(i + 1)
                .append(". ")
                .append(courses.get(i))
                .append("\n");
            }

            System.out.println(registeredCourses);
          }

          break;
        case 4:
          System.out.println("Exiting Program...");
          break;
        default:
          System.out.println("Invalid Choice.");
      }
    } while (choice != 4);

    sc.close();
  }
}
