import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentRegistration {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Student Registration Form");

    JLabel title = new JLabel("Student Registration");
    JLabel nameLabel = new JLabel("Name:");
    JLabel idLabel = new JLabel("Student ID:");
    JLabel courseLabel = new JLabel("Course:");
    JLabel ageLabel = new JLabel("Age:");

    JTextField nameField = new JTextField(15);
    JTextField idField = new JTextField(15);
    JTextField courseField = new JTextField(15);
    JTextField ageField = new JTextField(15);

    JButton submitButton = new JButton("Submit");

    frame.setLayout(new FlowLayout());

    frame.add(title);

    frame.add(nameLabel);
    frame.add(nameField);

    frame.add(idLabel);
    frame.add(idField);

    frame.add(courseLabel);
    frame.add(courseField);

    frame.add(ageLabel);
    frame.add(ageField);

    frame.add(submitButton);

    submitButton.addActionListener(e -> {
      String details =
        "Student ID: " +
        idField.getText() +
        "\nName: " +
        nameField.getText() +
        "\nCourse: " +
        courseField.getText() +
        "\nAge: " +
        ageField.getText();

      JOptionPane.showMessageDialog(
        frame,
        details,
        "Student Details",
        JOptionPane.INFORMATION_MESSAGE
      );
    });

    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
