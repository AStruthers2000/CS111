import java.util.Scanner;

public class LessNaiveEncryption {

    public static void main(String[] args) {
        // Setup a scanner object, and receive user's input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide an input sentence: ");
        String userInput = keyboard.nextLine();

        String[] userSplit = userInput.split(" "); //Splits user input on space

        System.out.print("The output sentence is   : ");

        for (int a = 0; a < userSplit.length; a++) { //Loops through array of 'tokens'
            StringBuilder builder = new StringBuilder(userSplit[a]); //creates stringbuilder with value of token at position a
            userSplit[a] = builder.reverse().toString(); //reverses string
            if (builder.length() > 1 && a == 0) { //checks to see if the first character is capitalized
                userSplit[a] = builder.substring(0, 1).toUpperCase() + builder.substring(1); //capitalize the first letter of string concatenate with rest of string
            }
            System.out.print(userSplit[a] + " "); //print reversed string
        }
        System.out.print("\n");
    }
}
