import java.util.Scanner;

// Interface for performing an action
interface Action {
  void performAction();
}

// Outer class
class Vehicle {

  // Data members
  String vehicleName;
  String vehicleNumber;

  // Constructor to initialize vehicle details
  Vehicle(String name, String number) {
    vehicleName = name;
    vehicleNumber = number;
  }

  // ====================================================
  // Inner Class
  // This class belongs to Vehicle and can access
  // all the variables of the outer class directly.
  // ====================================================
  class VehicleDetails {

    void displayDetails() {
      System.out.println("\n----- Vehicle Details -----");
      System.out.println("Vehicle Name   : " + vehicleName);
      System.out.println("Vehicle Number : " + vehicleNumber);
    }
  }
}

public class VehicleDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking input from user
    System.out.print("Enter Vehicle Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Vehicle Number: ");
    String number = sc.nextLine();

    // Create object of outer class
    Vehicle vehicle = new Vehicle(name, number);

    // Create object of inner class
    // Syntax: OuterClass.InnerClass object = outerObject.new InnerClass();
    Vehicle.VehicleDetails details = vehicle.new VehicleDetails();

    // Display vehicle details
    details.displayDetails();

    // ====================================================
    // Anonymous Class
    // No class name is created.
    // It is used only once.
    // ====================================================
    Action action = new Action() {
      @Override
      public void performAction() {
        System.out.println("\nVehicle Started Successfully.");
      }
    };

    // Call anonymous class method
    action.performAction();

    sc.close();
  }
}
