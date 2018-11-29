// File: ThreeTemps.java
// Author: Andrew Struthers
// Description: A simple GUI that implements a slider, along with several images

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ThreeTemps extends JFrame {
    // Instance Fields
    private JPanel panel;

    private JLabel fahrenheitL;
    private JLabel celsiusL;
    private JLabel kelvinL;
    private JLabel imageLabel;

    private JTextField fahrenheitTF;
    private JTextField celsiusTF;

    private JSlider slider;

    private ImageIcon image;

    private final int WINDOW_WIDTH = 260;
    private final int WINDOW_HEIGHT = 400;

    // constructor
    public ThreeTemps() {
        // Set the title.
        setTitle("Three Temps");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Build the panel that contains the other components.
        buildPanel();

        // Add the panel to the content pane.
        add(panel);

        // Size and display the window.
        setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // the method that instantiates the components
    private void buildPanel() {
        // Create labels to display instructions.
        fahrenheitL = new JLabel("F");

        celsiusL = new JLabel("C");

        kelvinL = new JLabel("K");

        // Create text fields
        fahrenheitTF = new JTextField(20);
        fahrenheitTF.setText("-459.67");
        fahrenheitTF.setEditable(false);

        celsiusTF = new JTextField(20);
        celsiusTF.setText("-273.15");
        celsiusTF.setEditable(false);

        // create a slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 500, 0);
        slider.setMajorTickSpacing(100);
        slider.setMinorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener());

        // create an image icon
        image = new ImageIcon("frozen.jpg");
        imageLabel = new JLabel();
        imageLabel.setIcon(image);

        // Create a panel
        panel = new JPanel();

        // Add the components to the panel
        panel.add(fahrenheitL);
        panel.add(fahrenheitTF);

        panel.add(celsiusL);
        panel.add(celsiusTF);

        panel.add(kelvinL);
        panel.add(slider);

        panel.add(imageLabel);
    }

    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            // declare variable to hold conversion
            double kelvin, fahrenheit, celsius = 0.0;

            // retrieve value from the slider
            kelvin = slider.getValue();

            // convert kelvin to the different scales
            fahrenheit = (kelvin - 273.15) * 1.8 + 32.0;
            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;

            // set the celsius and fahrenheit text fields
            fahrenheitTF.setText(String.valueOf(fahrenheit));
            celsiusTF.setText(String.valueOf(celsius));

            // based on the temperature, select which image
            // should be placed into the imageLabel
            if(celsius < -100){
                image = new ImageIcon("frozen.jpg");
            }else if(celsius < 10){
                image = new ImageIcon("cold.jpg");
            }else if(celsius < 80){
                image = new ImageIcon("warm.gif");
            }else{
                image = new ImageIcon("hot.jpg");
            }
            imageLabel.setIcon(image);
        }
    }

    // main routine
    public static void main(String[] args) {
        new ThreeTemps();
    }
}
