public class Main {

  public static void main(String[] args) {
    // Test Case 1
    Robot drone1 = new DroneRobot("D-1", 20.0);
    drone1.performTask();
    drone1.reportStatus();

    System.out.println();

    // Test Case 2
    Robot ground1 = new GroundRobot("G-5", 10.0);
    ground1.performTask();
    ground1.reportStatus();

    System.out.println();

    // Test Case 3
    Robot drone2 = new DroneRobot("D-2", 10.0);
    drone2.performTask();
    drone2.reportStatus();

    System.out.println();

    // Polymorphic Fleet
    Robot[] fleet = { new DroneRobot("D1", 50), new GroundRobot("G1", 50) };

    for (Robot r : fleet) {
      r.performTask();
      r.reportStatus();
      System.out.println();
    }
  }
}
