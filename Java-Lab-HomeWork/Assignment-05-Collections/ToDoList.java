import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class ToDoList {

  public static void main(String[] args) {
    // Scanner object for taking user input
    Scanner sc = new Scanner(System.in);

    // ArrayList stores tasks dynamically
    // Unlike arrays, ArrayList can grow or shrink
    ArrayList<String> tasks = new ArrayList<>();

    int choice;

    do {
      System.out.println("\n===== TO-DO LIST =====");
      System.out.println("1. Add Task");
      System.out.println("2. View Tasks");
      System.out.println("3. Remove Task");
      System.out.println("4. Exit");

      System.out.print("Enter Choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // Clears the newline left by nextInt()

      switch (choice) {
        case 1:
          // User enters a new task
          System.out.print("Enter Task: ");
          String task = sc.nextLine();

          // Store task in ArrayList
          tasks.add(task);

          System.out.println("Task Added Successfully.");
          break;
        case 2:
          // StringBuffer is used because strings can be
          // modified efficiently without creating new objects.
          StringBuffer display = new StringBuffer();

          display.append("\n----- TO-DO TASKS -----\n");

          // Loop through every task in ArrayList
          for (int i = 0; i < tasks.size(); i++) {
            display
              .append(i + 1)
              .append(". ")
              .append(tasks.get(i))
              .append("\n");
          }

          // If no tasks exist
          if (tasks.isEmpty()) {
            System.out.println("No Tasks Found.");
          } else {
            System.out.println(display);
          }

          break;
        case 3:
          if (tasks.isEmpty()) {
            System.out.println("Task List is Empty.");
          } else {
            System.out.print("Enter Task Number to Remove: ");
            int index = sc.nextInt();

            // Check if entered number is valid
            if (index >= 1 && index <= tasks.size()) {
              // Remove task from ArrayList
              tasks.remove(index - 1);

              System.out.println("Task Removed.");
            } else {
              System.out.println("Invalid Task Number.");
            }
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
