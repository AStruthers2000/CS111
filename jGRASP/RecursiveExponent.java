import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveExponent {
    public static void main(String[] args) {
        while (true) { //infinite loop to make sure input is good
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("What is the base: ");
                int base = input.nextInt();
                System.out.print("What is the power: ");
                int power = input.nextInt();
                long exponent = exponentiation(base, power); //starts recursion
                System.out.println(base + " raised to the power of " + power + " is " + exponent);
                break;
            } catch (InputMismatchException e) { //looks for bad input
                System.out.println("Bad input");
            }
        }
    }

    private static long exponentiation(int base, int power) {
        if (power == 0) { //if power is 0, exponentiation will always be 1
            return 1;
        } else if (power == 1) { //returns the base as the basecase
            return base;
        } else {
            return base * exponentiation(base, power - 1); //returns the next multiple with one lower power
        }
    }
}
