
import jdk.nashorn.internal.scripts.JO;

import java.awt.*;   // the "basic" awt functionality
import javax.swing.*;   // java's awesome swing functionality
import java.awt.event.*;   // necessary for event listeners

// A FortuneTeller class that extends the JFrame class
public class FortuneTeller extends JFrame {
    // Components
    private JPanel panel;
    private JTextField questionText;
    private JButton answerButton;

    // Constants for the window size
    private final int WINDOW_WIDTH = 340;
    private final int WINDOW_HEIGHT = 130;

    // This class's default, no-argument constructor
    public FortuneTeller() {
        setTitle("Fortune Teller");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    // Create the panel, with the necessary components
    private void buildPanel() {
        JLabel label = new JLabel("Ask me a question!");
        questionText = new JTextField(10);
        answerButton = new JButton("Tell me now");
        answerButton.addActionListener(new CalcButtonListener());
        panel = new JPanel();

        panel.add(label);
        panel.add(questionText);
        panel.add(answerButton);
    }

    // A private INNER class that implements an event listener.
    // Recall that the actionPerformed method below
    // is invoked when the calcButton in the GUI is clicked.
    private class CalcButtonListener implements ActionListener {

        // The required method, which ActionListner requires
        public void actionPerformed(ActionEvent e) {
            String question = questionText.getText().toLowerCase();
            //Who, what, when, where, why, how
            if (question.contains("who")) {
                JOptionPane.showMessageDialog(null, "You already know them, you just need to think.");
            } else if (question.contains("what")) {
                JOptionPane.showMessageDialog(null, "Think hard, and the answer is sure to come");
            } else if (question.contains("when")) {
                JOptionPane.showMessageDialog(null, "At some point in the near future");
            } else if (question.contains("where")) {
                JOptionPane.showMessageDialog(null, "Closer than you think...");
            } else if (question.contains("why")) {
                JOptionPane.showMessageDialog(null, "Because sometimes it do be like that.");
            } else if (question.contains("how")) {
                JOptionPane.showMessageDialog(null, "You already know how, don't you?");
            } else {
                JOptionPane.showMessageDialog(null, "All knowing fortune teller can't answer that question.");
            }
        }
    }

    // The "main" routine, where it all begins
    public static void main(String[] args) {
        new FortuneTeller();
    }
}
