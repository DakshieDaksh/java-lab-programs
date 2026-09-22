class DroneRobot extends Robot {

  public DroneRobot(String batteryId, double chargeLevel) {
    super(batteryId, chargeLevel);
  }

  @Override
  public void performTask() {
    if (chargeLevel < 15) {
      System.out.println("Low battery!");
      return;
    }

    chargeLevel -= 15;

    System.out.println("Drone moving at 2x speed.");
    System.out.println("Task completed.");
  }
}
