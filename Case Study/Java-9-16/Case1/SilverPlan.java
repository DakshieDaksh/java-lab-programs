class SilverPlan extends Plan {

  // Constructor
  public SilverPlan(String patientName, double baseFee) {
    super(patientName, baseFee);
  }

  // Implement abstract method
  @Override
  public double calculateBill() {
    return getBaseFee() + 15;
  }
}
