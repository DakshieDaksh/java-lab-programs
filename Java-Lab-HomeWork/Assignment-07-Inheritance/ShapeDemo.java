import java.util.Scanner;

// ==========================================
// Parent Class (Superclass)
// Common properties and methods for all shapes
// ==========================================
class Shape {

  // Method to calculate area
  // This will be overridden in child classes
  void calculateArea() {
    System.out.println("Area calculation for Shape");
  }
}

// ==========================================
// Circle inherits Shape
// ==========================================
class Circle extends Shape {

  double radius;

  // Constructor
  Circle(double radius) {
    this.radius = radius;
  }

  // Method Overriding
  @Override
  void calculateArea() {
    double area = Math.PI * radius * radius;

    System.out.println("\n----- Circle -----");
    System.out.println("Radius = " + radius);
    System.out.println("Area = " + area);
  }
}

// ==========================================
// Rectangle inherits Shape
// ==========================================
class Rectangle extends Shape {

  double length;
  double width;

  // Constructor
  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method Overriding
  @Override
  void calculateArea() {
    double area = length * width;

    System.out.println("\n----- Rectangle -----");
    System.out.println("Length = " + length);
    System.out.println("Width = " + width);
    System.out.println("Area = " + area);
  }
}

// ==========================================
// Main Class
// ==========================================
public class ShapeDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Circle Input
    System.out.print("Enter Radius: ");
    double radius = sc.nextDouble();

    // Rectangle Input
    System.out.print("Enter Length: ");
    double length = sc.nextDouble();

    System.out.print("Enter Width: ");
    double width = sc.nextDouble();

    // Create Circle Object
    Circle circle = new Circle(radius);

    // Create Rectangle Object
    Rectangle rectangle = new Rectangle(length, width);

    // Call overridden methods
    circle.calculateArea();
    rectangle.calculateArea();

    sc.close();
  }
}
