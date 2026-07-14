import java.util.Scanner;

// ==========================================
// Parent Class
// Stores vehicle information
// ==========================================
class Vehicle {

  String vehicleNumber;
  String ownerName;

  // Parent constructor
  Vehicle(String vehicleNumber, String ownerName) {
    this.vehicleNumber = vehicleNumber;
    this.ownerName = ownerName;
  }

  // Display vehicle information
  void displayVehicle() {
    System.out.println("Vehicle Number : " + vehicleNumber);
    System.out.println("Owner Name     : " + ownerName);
  }
}

// ==========================================
// Child Class
// Inherits Vehicle
// ==========================================
class Insurance extends Vehicle {

  double insuranceAmount;

  // Child constructor
  Insurance(String vehicleNumber, String ownerName, double insuranceAmount) {
    // Calls parent constructor
    super(vehicleNumber, ownerName);
    this.insuranceAmount = insuranceAmount;
  }

  // Display insurance information
  void displayInsurance() {
    // Calls parent method using super
    super.displayVehicle();

    System.out.println("Insurance Amount : ₹" + insuranceAmount);
  }
}

// ==========================================
// Main Class
// ==========================================
public class VehicleInsurance {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // User input
    System.out.print("Enter Vehicle Number: ");
    String vehicleNo = sc.nextLine();

    System.out.print("Enter Owner Name: ");
    String owner = sc.nextLine();

    System.out.print("Enter Insurance Amount: ");
    double amount = sc.nextDouble();

    // Create Insurance object
    Insurance insurance = new Insurance(vehicleNo, owner, amount);

    // Display details
    System.out.println("\n===== Vehicle Insurance Details =====");
    insurance.displayInsurance();

    sc.close();
  }
}
