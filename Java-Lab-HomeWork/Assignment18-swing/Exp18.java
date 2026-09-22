import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exp18 extends JFrame implements ActionListener {

  JTextField balanceField, amountField;
  JButton depositButton, withdrawButton;
  JLabel resultLabel;

  Exp18() {
    setTitle("Bank Balance Calculator");
    setSize(400, 300);
    setLayout(new FlowLayout());

    add(new JLabel("Initial Balance:"));
    balanceField = new JTextField(15);
    add(balanceField);

    add(new JLabel("Transaction Amount:"));
    amountField = new JTextField(15);
    add(amountField);

    depositButton = new JButton("Deposit");
    withdrawButton = new JButton("Withdraw");

    add(depositButton);
    add(withdrawButton);

    resultLabel = new JLabel("Balance: ");
    add(resultLabel);

    depositButton.addActionListener(this);
    withdrawButton.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    double balance = Double.parseDouble(balanceField.getText());
    double amount = Double.parseDouble(amountField.getText());

    if (e.getSource() == depositButton) {
      balance = balance + amount;
    }

    if (e.getSource() == withdrawButton) {
      balance = balance - amount;
    }

    resultLabel.setText("Balance: " + balance);
  }

  public static void main(String[] args) {
    new Exp18();
  }
}
