public class Main {

    // Method
    static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {

        // Variables
        String studentName = "Daksh";
        int age = 19;
        double cgpa = 8.5;

        // Calling a method
        greet(studentName);

        // Creating an object using a constructor
        Student student = new Student(studentName, age, cgpa);

        // Displaying object details
        student.displayDetails();
    }
}

class Student {

    String name;
    int age;
    double cgpa;

    // Constructor
    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void displayDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("CGPA  : " + cgpa);
    }
}