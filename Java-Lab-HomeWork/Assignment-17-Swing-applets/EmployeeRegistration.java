import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EmployeeRegistration {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Employee Registration Form");

    JLabel title = new JLabel("Employee Registration");

    JLabel idLabel = new JLabel("Employee ID:");
    JLabel nameLabel = new JLabel("Name:");
    JLabel departmentLabel = new JLabel("Department:");
    JLabel salaryLabel = new JLabel("Salary:");

    JTextField idField = new JTextField(15);
    JTextField nameField = new JTextField(15);
    JTextField departmentField = new JTextField(15);
    JTextField salaryField = new JTextField(15);

    JButton submitButton = new JButton("Submit");

    frame.setLayout(new FlowLayout());

    frame.add(title);

    frame.add(idLabel);
    frame.add(idField);

    frame.add(nameLabel);
    frame.add(nameField);

    frame.add(departmentLabel);
    frame.add(departmentField);

    frame.add(salaryLabel);
    frame.add(salaryField);

    frame.add(submitButton);

    submitButton.addActionListener(e -> {
      String details =
        "Employee ID: " +
        idField.getText() +
        "\nName: " +
        nameField.getText() +
        "\nDepartment: " +
        departmentField.getText() +
        "\nSalary: " +
        salaryField.getText();

      JOptionPane.showMessageDialog(
        frame,
        details,
        "Employee Details",
        JOptionPane.INFORMATION_MESSAGE
      );
    });

    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
