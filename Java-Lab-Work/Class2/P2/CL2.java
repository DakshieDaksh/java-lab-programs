/*
Method Overriding

A vehicle tracking system needs to calculate the maximum speed of different types of vehicles.
A generic vehicle has a base speed.
A car has a higher max speed.
A bike has an even higher max speed.

Method Overloading

Scenario: Payment Processing System
A company is building a payment gateway that allows users to pay using different methods:
Credit Card (card number & CVV)
Bank Transfer (account number & IFSC code)
UPI (UPI ID)

*/
public class CL2 {

  public static void main(String[] args) {
    Vehicle vehicle;

    vehicle = new Vehicle();
    vehicle.maxSpeed();

    vehicle = new Car();
    vehicle.maxSpeed();

    vehicle = new Bike();
    vehicle.maxSpeed();
  }
}

class Vehicle {

  void maxSpeed() {
    System.out.println("Vehicle Maximum Speed: 80 km/h");
  }
}

class Car extends Vehicle {

  void maxSpeed() {
    System.out.println("Car Maximum Speed: 180 km/h");
  }
}

class Bike extends Vehicle {

  void maxSpeed() {
    System.out.println("Bike Maximum Speed: 220 km/h");
  }
}
