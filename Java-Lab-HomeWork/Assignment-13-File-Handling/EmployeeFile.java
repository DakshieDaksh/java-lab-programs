import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFile {

  public static void main(String[] args) {
    String fileName = "employee.txt";

    try {
      FileWriter fw = new FileWriter(fileName);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write("Employee ID: 101");
      bw.newLine();

      bw.write("Name: Daksh");
      bw.newLine();

      bw.write("Department: CSE");
      bw.newLine();

      bw.write("Salary: 50000");
      bw.newLine();

      bw.close();

      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);

      String line;

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }

      br.close();
    } catch (IOException e) {
      System.out.println("File error: " + e.getMessage());
    }
  }
}
