import java.util.Random;
import java.util.Scanner;

public class AllRecursion {

    private static boolean isMember(int[] numArray, int num, int index) {
        if (index >= numArray.length) { //Checks to see if index is off the edge
            return false;
        } else if (numArray[index] == num) { //Checks to see if num is at index of array
            return true;
        } else {
            return isMember(numArray, num, index + 1); //Calls function again
        }
    }

    private static String stringReverser(String text, int index) {
        if (index < 0) { //Checks to see if index is before the beginning of string
            return "";
        } else { //returns char at current location plus the next function call
            return text.charAt(index) + stringReverser(text, index - 1);
        }
    }

    private static int maxElement(int[] numArray, int max, int index) {
        if (index >= numArray.length) { //Checks to see if index is larger than array length
            return max;
        } else {
            if (numArray[index] > max) { //Checks to see if current num is bigger than maximum
                max = numArray[index];
            }
            return maxElement(numArray, max, index + 1); //Calls function with increased index
        }
    }

    private static int characterCounter(char[] charArray, char regex, int count, int index) {
        if (index >= charArray.length) { //Checks to see if index is larger than array length
            return count;
        } else {
            if (charArray[index] == regex) { //Checks to see if current char is equal to the key
                count += 1;
            }
            return characterCounter(charArray, regex, count, index + 1); //Calls function with increased index and updated count
        }
    }

    private static long recursivePower(int base, int power) {
        if (power == 1) { //Checks to see if power is one
            return base;
        } else {
            return base * recursivePower(base, power - 1); //Creates multiplication chain
        }
    }

    private static boolean palindromeDetector(String text, String reverse, int index) {
        if (index < 0) {
            //Lowercases the text and reverse vars for simple checking
            text = text.toLowerCase();
            reverse = reverse.toLowerCase();
            //Output for debugging
            System.out.println("Old:      " + text);
            System.out.println("Reversed: " + reverse);
            return text.equalsIgnoreCase(reverse); //Returns true if true, false if false
        } else {
            reverse += text.charAt(index); //adds to reverse var
            return palindromeDetector(text, reverse, index - 1);
        }
    }

    private static int sumOfNumbers(int num) {
        if (num == 0) { //checks to see if the call has reached the end
            return 0;
        } else {
            return num + sumOfNumbers(num - 1); //creates addition chain
        }
    }

    private static int ackermann(int m, int n) {
        //Executes the ackermann function as outlined in the directions
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Creates new Scanner for input

        /*
         * Beginning of Challenge 1
         */
        System.out.println("Challenge 1");

        int[] nums = genArray(getNum(in, "Enter the size of randomly generated array: "), 30);
        int num = getNum(in, "Enter number to search for: ");
        System.out.println("Does " + num + " exist in the array? " + isMember(nums, num, 0));

        System.out.println("End of Challenge 1\n====================\n");


        /*
         * Beginning of Challenge 2
         */
        System.out.println("Challenge 2");

        String text = input(in, "Enter text to be reversed: ");
        System.out.println(stringReverser(text, text.length() - 1));

        System.out.println("End of Challenge 2\n====================\n");


        /*
         * Beginning of Challenge 3
         */
        System.out.println("Challenge 3");

        nums = genArray(getNum(in, "Enter size of randomly generated array: "), 2000);
        System.out.println("Highest number in randomly generated array: " + maxElement(nums, 0, 0));

        System.out.println("End of Challenge 3\n====================\n");


        /*
         * Beginning of Challenge 4
         */
        System.out.println("Challenge 4");

        text = input(in, "Enter character array as string: ");
        char[] charArray = text.toCharArray();
        char regex = input(in, "Char to search for: ").toCharArray()[0];
        System.out.println(regex + " appears " + characterCounter(charArray, regex, 0, 0) + " times.");

        System.out.println("End of Challenge 4\n====================\n");


        /*
         * Beginning of Challenge 5
         */
        System.out.println("Challenge 5");

        int base = getNum(in, "Enter the base: ");
        int power = getNum(in, "Enter the power: ");
        System.out.println(base + " raised to the " + power + " power is " + recursivePower(base, power));

        System.out.println("End of Challenge 5\n====================\n");

        System.out.println("==============================\n");

        /*
         * Beginning of Bonus 1
         */
        System.out.println("Bonus 1");

        text = input(in, "Enter text to be checked for palindrome: ");
        text = text.replaceAll(",", "")
                .replaceAll(" ", "")
                .replaceAll("\\.", "");
        System.out.println("Is \"" + text + "\" a palindrome? " + palindromeDetector(text, "", text.length() - 1));

        System.out.println("End of Bonus 1\n====================\n");

        /*
         * Beginning of Bonus 2
         */
        System.out.println("Bonus 2");

        num = getNum(in, "Enter number: ");
        System.out.println("Sum of integer numbers from 1 to " + num + " equals " + sumOfNumbers(num));

        System.out.println("End of Bonus 2\n====================\n");

        /*
         * Beginning of Bonus 3
         */
        System.out.println("Bonus 3");

        System.out.println("Demonstration of Ackermann algorithm...");
        System.out.println(ackermann(0, 0));
        System.out.println(ackermann(1, 3));
        System.out.println(ackermann(0, 1));
        System.out.println(ackermann(2, 2));
        System.out.println(ackermann(1, 1));
        System.out.println(ackermann(3, 2));

        System.out.println("End of Bonus 3\n====================\n");

    }

    private static int[] genArray(int size, int bound) { //Built a generator class so that the challenges that involve arrays can be random and better
        Random rand = new Random(); //Creates new Random class for generating numbers
        //Creates an Array of size input with random numbers 0-30
        int[] nums = new int[size];
        System.out.println("Randomly generating " + size + " numbers between 0-" + bound);
        for (int a = 0; a < size; a++) {
            nums[a] = rand.nextInt(bound + 1);
        }
        return nums;
    }

    private static String input(Scanner in, String msg) { //Basic input function to make stuff easier
        System.out.print(msg);
        return in.nextLine();
    }

    private static int getNum(Scanner in, String msg) { //Input function to get number input
        System.out.print(msg);
        return Integer.parseInt(in.nextLine());
    }
}
