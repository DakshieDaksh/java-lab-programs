import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

  JTextField number1Field, number2Field;
  JButton addButton, subtractButton;
  JLabel resultLabel;

  Calculator() {
    setTitle("GUI Calculator");
    setSize(400, 250);
    setLayout(new FlowLayout());

    add(new JLabel("First Number:"));
    number1Field = new JTextField(15);
    add(number1Field);

    add(new JLabel("Second Number:"));
    number2Field = new JTextField(15);
    add(number2Field);

    addButton = new JButton("Addition");
    subtractButton = new JButton("Subtraction");

    add(addButton);
    add(subtractButton);

    resultLabel = new JLabel("Result: ");
    add(resultLabel);

    addButton.addActionListener(this);
    subtractButton.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    double number1 = Double.parseDouble(number1Field.getText());
    double number2 = Double.parseDouble(number2Field.getText());

    double result;

    if (e.getSource() == addButton) {
      result = number1 + number2;
      resultLabel.setText("Result: " + result);
    } else if (e.getSource() == subtractButton) {
      result = number1 - number2;
      resultLabel.setText("Result: " + result);
    }
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
