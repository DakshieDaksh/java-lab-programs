public class Main {

  // Polymorphic method
  public static void printInvoice(Plan p) {
    System.out.println("Patient: " + p.getPatientName());
    System.out.println("Bill: $" + p.calculateBill());
    System.out.println();
  }

  public static void main(String[] args) {
    // Test Case 1
    Plan silver = new SilverPlan("John", .0);

    // Test Case 2
    Plan gold1 = new GoldPlan("Sophia", 200.0);

    // Test Case 3
    Plan gold2 = new GoldPlan("Max", 50.0);

    // Print invoices
    printInvoice(silver);
    printInvoice(gold1);
    printInvoice(gold2);
  }
}
