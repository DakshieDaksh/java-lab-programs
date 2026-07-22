import java.util.Scanner;

// Student class
class Student {

  // Data members (instance variables)
  String name;
  int rollNo;

  // ==============================
  // Default Constructor
  // Automatically called when no arguments are passed
  // ==============================
  Student() {
    name = "Unknown";
    rollNo = 0;
  }

  // ==============================
  // Parameterized Constructor
  // Initializes object with user-provided values
  // ==============================
  Student(String name, int rollNo) {
    this.name = name; // "this" refers to the current object
    this.rollNo = rollNo;
  }

  // Method to display student details
  public String toString() {
    return "Student Name : " + name + "\nRoll Number  : " + rollNo;
  }
}

public class StudentDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ==================================
    // Creating object using Default Constructor
    // ==================================
    Student s1 = new Student();

    System.out.println("Student Details using Default Constructor");
    System.out.println(s1.toString());

    System.out.println();

    // ==================================
    // Taking user input
    // ==================================
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Roll Number: ");
    int roll = sc.nextInt();

    // ==================================
    // Creating object using Parameterized Constructor
    // ==================================
    Student s2 = new Student(name, roll);

    System.out.println("\nStudent Details using Parameterized Constructor");
    System.out.println(s2.toString());

    sc.close();
  }
}
