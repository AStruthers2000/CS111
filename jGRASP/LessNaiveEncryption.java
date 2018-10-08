// File: LessNaiveEncryption.java
// Author: 
//
// Description: The skeleton of a program that uses split method
// and a StringBuilder objects to reverse the letters of each word,
// but which keeps the order of the words the same. For example:
//
// Input : 123ab 445 hello
// Output: ba321 544 olleh
//

// the required import statements
import java.util.Scanner;

public class LessNaiveEncryption {

    public static void main(String[] args) {

        // Setup a scanner object, and receive user's input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide an input sentence: ");
        String userInput = keyboard.nextLine();

        // Step 1: use a split method on the String userInput. 
        // The argument the split method should be the delimeter " "
        // 
        // Step 1 can be completed in a single line of code.
        		
        System.out.print("The output sentence is   : ");

        // Step 2a: Refer to the lecture slides, to see 
        // how you can tokenize the sentence
        // that you've placed into userInput. You can use a 
        // while loop, or a for loop (I recommend a while).
        // split method will return an array of Strings (tokens).
        // Step 2b: For each token (word) that you extract from 
        // the input sentences, build a StringBuilder object. We 
        // learned in lecture that the StringBuilder Class has 
        // many useful methods used to manipulate a String. 
        // Perform a web search for "Java 8 API", and access the 
        // oracle webpage. Click on the StringBuilder class
        // name in the navigation box on the left of the 
        // screen, and look for a method that will reverse the 
        // String field in the StringBuilder object that you've 
        // created.
        //
        // Step 2c: Use the method that you've found via the API, 
        // to reverse the String field in your StringBuilder object, 
        // and print that reverse String to the console.
        //
        // Steps 2a through 2c can be completed with 5 lines of code.
        // If you used System.out.print when tokenizing your
        // String, the following command will output a final
        // blank line after the last output
        System.out.print("\n");
    }
}
