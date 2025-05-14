package Pulkit06417711923;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorFrame extends JFrame implements ActionListener {
    JTextField tf1, tf2, result;
    JButton add, sub, mul, div;
    public CalculatorFrame() {
        setTitle("Basic Calculator");
        setLayout(new GridLayout(5, 2, 5, 5));
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("First Number:");
        tf1 = new JTextField();
        JLabel l2 = new JLabel("Second Number:");
        tf2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        add(l1); add(tf1);
        add(l2); add(tf2);
        add(add); add(sub);
        add(mul); add(div);
        add(new JLabel("Result:")); add(result);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tf1.getText());
            double num2 = Double.parseDouble(tf2.getText());
            double res = 0;

            if (e.getSource() == add) res = num1 + num2;
            else if (e.getSource() == sub) res = num1 - num2;
            else if (e.getSource() == mul) res = num1 * num2;
            else if (e.getSource() == div) {
                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                } else {
                    res = num1 / num2;
                }
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }
    public static void main(String[] args) {
        new CalculatorFrame();
    }
}

