class GoldPlan extends Plan {

  // Constructor
  public GoldPlan(String patientName, double baseFee) {
    super(patientName, baseFee);
  }

  // Implement abstract method
  @Override
  public double calculateBill() {
    return getBaseFee() + (getBaseFee() * 0.10) - 20;
  }
}
