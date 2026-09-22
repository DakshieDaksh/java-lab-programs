abstract class Plan {

  // Encapsulated fields
  private String patientName;
  private double baseFee;

  // Constructor
  public Plan(String patientName, double baseFee) {
    this.patientName = patientName;
    this.baseFee = baseFee;
  }

  // Getter for patient name
  public String getPatientName() {
    return patientName;
  }

  // Getter for base fee
  public double getBaseFee() {
    return baseFee;
  }

  // Abstract method
  public abstract double calculateBill();
}
