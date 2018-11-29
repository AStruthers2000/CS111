import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FibonacciRecursionGUI extends JFrame {

    //All the constants and class fields
    private JFrame frame = new JFrame("");

    private JPanel panel;

    private JButton button1;

    private JLabel label1;
    private JLabel label2;

    private JTextField textField1;
    private JTextField textField2;

    private JTextArea display;

    private int numInvocations = 0;
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 250;

    // Components
    private FibonacciRecursionGUI() {
        buildPanel(); //Builds the panel
        frame.add(panel);
        frame.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        frame.setLocationRelativeTo(null); //sets panel location to the middle of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
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

        display = new JTextArea(5, 15);
        display.setEditable(false);

        JScrollPane scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(button1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(scroll);
    }

    // fibonacci recursive method
    private int fibonacci(int n) {
        numInvocations++;
        display.append("Invocation #" + numInvocations + "\n");
        if(n<=1){ //faster sorting algorithm than the example
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // the inner class; the action listener
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                numInvocations = 0; //sets this to 0 so it can be run multiple times
                display.setText(""); //clears the JTextField so it can be run multiple times
                int userInput = Integer.parseInt(textField1.getText());
                int fibNum = fibonacci(userInput);
                textField2.setText(String.valueOf(fibNum));
            }catch(NumberFormatException e1){ //adds error catching for if user input was bad
                JOptionPane.showMessageDialog(null, "That isn't a number");
            }
        }
    }

    // the main method
    public static void main(String[] args) {
        new FibonacciRecursionGUI(); //calls constructor
    }
}