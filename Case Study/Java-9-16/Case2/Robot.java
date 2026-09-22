abstract class Robot {

  private String batteryId;
  protected double chargeLevel;

  // Constructor
  public Robot(String batteryId, double chargeLevel) {
    this.batteryId = batteryId;
    this.chargeLevel = chargeLevel;
  }

  // Getter for battery ID
  public String getBatteryId() {
    return batteryId;
  }

  // Common method
  public void reportStatus() {
    System.out.println("Battery ID: " + batteryId);
    System.out.println("Charge: " + chargeLevel + "%");
  }

  // Abstract method
  public abstract void performTask();
}
