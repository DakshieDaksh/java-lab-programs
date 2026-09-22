class GroundRobot extends Robot {

  public GroundRobot(String batteryId, double chargeLevel) {
    super(batteryId, chargeLevel);
  }

  @Override
  public void performTask() {
    if (chargeLevel < 5) {
      System.out.println("Low battery!");
      return;
    }

    System.out.println("Performing surface check.");

    chargeLevel -= 5;

    System.out.println("Ground robot moving.");
    System.out.println("Task completed.");
  }
}
