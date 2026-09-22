import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class Exp17 extends Applet {

  public void init() {
    setLayout(new FlowLayout());

    add(new Label("Employee Registration"));
    add(new Label("Employee ID:"));
    add(new TextField(15));

    add(new Label("Name:"));
    add(new TextField(15));

    add(new Label("Department:"));
    add(new TextField(15));

    add(new Label("Salary:"));
    add(new TextField(15));

    add(new Button("Submit"));
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Swing and Applet Demo");

    JLabel label = new JLabel("Employee Registration");
    JTextField textField = new JTextField(15);
    JButton button = new JButton("Submit");

    frame.setLayout(new FlowLayout());

    frame.add(label);
    frame.add(textField);
    frame.add(button);

    button.addActionListener(e ->
      JOptionPane.showMessageDialog(
        frame,
        "Employee Name: " + textField.getText()
      )
    );

    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
