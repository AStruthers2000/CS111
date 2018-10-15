public class PasswordVerifier {
    private static int MIN_PASSWORD_LENGTH = 6;

    public static boolean isValid(String str) {
        if (hasUpperCase(str)) { //checks to see if there is an upper case char
            if (hasLowerClass(str)) { //checks to see if there is a lower case char
                if (hasDigit(str)) { //checks to see if there is a digit
                    return str.length() >= MIN_PASSWORD_LENGTH; //returns true if str is greater than/equal to min length
                }
            }
        }
        return false; //returns false if any if fails
    }

    private static boolean hasUpperCase(String str) {
        for (int a = 0; a < str.length(); a++) { //loops through string
            if (Character.isUpperCase(str.charAt(a))) { //checks to see if char at position a is uppercase
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowerClass(String str) {
        for (int a = 0; a < str.length(); a++) { //loops through string
            if (Character.isLowerCase(str.charAt(a))) { //checks to see if char at position a is lowercase
                return true;
            }
        }
        return false;
    }

    private static boolean hasDigit(String str) {
        for (int a = 0; a < str.length(); a++) { //loops through string
            if (Character.isDigit(str.charAt(a))) { //checks to see if char at position a is a digit
                return true;
            }
        }
        return false;
    }
}
