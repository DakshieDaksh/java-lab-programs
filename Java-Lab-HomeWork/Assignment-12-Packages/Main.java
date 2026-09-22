import faculty.Faculty;
import student.Student;

public class Main {

  public static void main(String[] args) {
    Student s = new Student("Daksh", 101, "Computer Science");
    Faculty f = new Faculty("Dr. Sharma", 501, "Programming with Java");

    s.display();
    System.out.println();

    f.display();
  }
}
