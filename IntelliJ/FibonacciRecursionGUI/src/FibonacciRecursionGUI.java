import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FibonacciRecursionGUI extends JFrame {
    private JPanel panel;

    private JButton button1;

    private JLabel label1;
    private JLabel label2;

    private JTextField textField1;
    private JTextField textField2;

    private JTextArea display;

    private int numInvocations = 0;
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 200;

    // Components
    public FibonacciRecursionGUI() {

    }

    // build panel method
    private void buildPanel() {
        button1 = new JButton("Calculate Fibonacci Number");
        button1.addActionListener(new ButtonListener());

        label1 = new JLabel("Which Fibonacci Number: ");
        label2 = new JLabel("The Fibonacci Number: ");

        textField1 = new JTextField(5);
        textField2 = new JTextField(5);
        textField2.setEditable(false);
    }

    // fibonacci recursive method
    public int fibonacci(int n) {
        // remove this line, when you add your code, which is
        // placed here only so that the class compiles
        // when you originally receive it.
        return 0;
    }

    // the inner class; the action listener
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    // the main method
    public static void main(String[] args) {

    }
}