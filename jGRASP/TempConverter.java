import javax.swing.*;
import java.awt.*;

public class TempConverter extends JPanel{
    private static final int SCREEN_X = 400;
    private static final int SCREEN_Y = 200;
    private static float tempInput;
    private static String units;

    private static void doConversion(float temp, String unit){
        float convertedTemp = 0.0f;
        String otherUnit = "";
        switch (unit.toLowerCase()){ //sets input to lowercase so the cases wont break the program
            case "celsius":
                otherUnit = "Fahrenheit";
                convertedTemp = 32.0f + (temp * 1.8f);
                break;
            case "fahrenheit":
                otherUnit = "Celsius";
                convertedTemp = 5.0f/9.0f * (temp - 32.0f);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid units!");
                System.exit(-1); //exits app if unit is bad
        }
        JOptionPane.showMessageDialog(null, "The equivalent " + otherUnit + " temp: " + convertedTemp + " degrees."); //outputs the converted thing
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("C/F Converter"); //Creates frame with title "C/F Converter"
        frame.setSize(SCREEN_X, SCREEN_Y);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20)); //Sets the layout to FlowLayout with enough vgap to not look terrible


        JLabel tempLabel = new JLabel("Temperature: "); //Text for the temp inputbox
        JTextField temp = new JTextField();
        temp.setPreferredSize(new Dimension(200, 20)); //Sets size so that it doesn't go to the smallest default size

        JLabel unitLabel = new JLabel("Temperature Scale: "); //Text for the unit inputbox
        JTextField unit = new JTextField();
        unit.setPreferredSize(new Dimension(200, 20)); //Sets size so that it doesn't go to the smallest default size

        JButton convert = new JButton("Convert Temperature");
        //Adds an ActionListener using Lambda notation instead of creating a new actionlistener class (not covered in class but lambda is better
        convert.addActionListener(e -> {
            tempInput = Float.parseFloat(temp.getText());
            units = unit.getText();
            doConversion(tempInput, units); //actually does the conversion
        });

        //adds all of the components to frame
        frame.add(tempLabel);
        frame.add(temp);
        frame.add(unitLabel);
        frame.add(unit);
        frame.add(convert);

        frame.setVisible(true); //sets frame visible

    }
}
