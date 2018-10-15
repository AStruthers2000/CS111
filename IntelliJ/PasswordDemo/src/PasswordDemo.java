import javax.swing.JOptionPane;

public class PasswordDemo {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a password", "7G343hy1"); //Uses JOptionPane to make an input box with default password 7G343hy1
        if (PasswordVerifier.isValid(str)) { //Calls isValid(str) without making an instance of PasswordVerifier
            JOptionPane.showMessageDialog(null, "Valid password."); //Outputting "valid password" on a UI output box
        } else {
            JOptionPane.showMessageDialog(null, "Not a valid password."); //Outputting "Not valid" on a UI output box
        }
    }
}
