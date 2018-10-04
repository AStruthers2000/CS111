
import java.util.Scanner;

// File: NaiveEncryption.java
// Author: Tatiana Harrison
//
// Description: An "encryption" program that does not
// use the split nor StringBuilder classes,
// but only the types of control structures that
// you've learned in CS110. This same functionality
// can be written in far fewer lines of code if
// a split and StringBuilder were used.
public class NaiveEncryption {

    public static void main(String[] args) {

        // setup a scanner object, and receive user's input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide an input sentence: ");
        String input = keyboard.nextLine();

        System.out.print("The output sentence is   : ");
        String intermediateWord = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals(" ") || (i + 1) == input.length()) {
                if ((i + 1) == input.length()) {
                    intermediateWord += input.substring(i, i + 1);
                }
                for (int j = intermediateWord.length() - 1; j > -1; j--) {
                    System.out.print(intermediateWord.substring(j, j + 1));
                }
                intermediateWord = "";
                System.out.print(" ");
            } else {
                intermediateWord += input.substring(i, i + 1);
            }
        }
        System.out.println("");
    }
}
