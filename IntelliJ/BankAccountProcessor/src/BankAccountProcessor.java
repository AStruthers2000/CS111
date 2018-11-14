import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BankAccountProcessor {

    //method to check if the line is valid, takes accountLine as a string and throws BankAccountException
    private static boolean isValid(String accountLine) throws BankAccountException{
        if(accountLine.isEmpty()){ //checks to see if line is blank
            throw new BankAccountException("Blank line");
        }

        if(accountLine.contains(";")) { //check to see if line has a semicolon
            String[] splitLine = accountLine.split(";"); //if line has a semicolon, split the line
            String accountNum = splitLine[0];
            String accountName = splitLine[1];
            if(!accountName.contains(" ")){ //checks to see if the account name has a first and last name, if not it throws BankAccountException
                throw new BankAccountException("Invalid name: " + accountLine);
            }

            if (accountNum.length() != 10) { //checks to see if accountNum is of proper length, if not throws BankAccountException
                throw new BankAccountException("Invalid account number: " + accountNum);
            }

            for (int a = 0; a < accountNum.length(); a++) {
                if (!Character.isDigit(accountNum.charAt(a))) { //loops through accountNum checking to see if there are any non-digit characters
                    throw new BankAccountException("Account number has non-digit character: " + accountNum);
                }
            }
            return true; //returns true if it passes all tests
        }else{
            throw new BankAccountException("No semicolon in line: " + accountLine);
        }
    }

    //main function, throws FileNotFoundException and IOException. FileNotFoundException for if the file is invalid, IOException if BufferedReader cant read file
    //FileNotFoundException is included in IOException, but the instructions said I had to have it so I'm confused
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("What file would you like to parse?\n>>>");
        String filename = input.nextLine();
        boolean runProgram = true;

        while(runProgram){
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while((line=reader.readLine())!=null){ //loops through the file, reading every new line
                try {
                    isValid(line); //checking to see if line is valid
                    System.out.println("Line " + line + " successfully processed");
                }catch(BankAccountException e){ //catches if line is invalid
                    System.out.println(e.toString());
                    System.out.println("Continue?");
                    String cont = input.nextLine(); //asking if user wants to continue
                    if(!cont.equalsIgnoreCase("y")){
                        System.out.println("Okay, quitting.");
                        break; //breaks out of reading loop
                    }
                }
            }
            runProgram = false; //stops main loop and exits program
        }
    }
}