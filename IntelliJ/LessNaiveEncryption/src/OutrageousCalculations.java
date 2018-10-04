// File: OutrageousCalculations.java
// Author: Tatiana Harrison
// Explanation: A 'confusing' program, that lends itself
// to analysis, using jGRASP's debugger.

public class OutrageousCalculations {

    // the main routine
    public static void main(String[] args) {

        int calculatedNumber = performOutrageousCalculation(32);
        int finalCal = performAnotherOutrageuosCalc(calculatedNumber);

        System.out.println(calculatedNumber);
        System.out.println(finalCal);
    }

    // a method that has a complex for loop, with an embedded while loop
    public static int performOutrageousCalculation(int m) {
        int someNumber = m;
        int anotherNumber = 33;
        int j = 3;
        for (int i = -2, k = 4; i < 9; i++, k -= 3) {
            i = i + 1;
            j -= k;
            anotherNumber %= k;
            while (i > 5 && i < 10) {
                someNumber -= (i - j);
                i++;
            }
            anotherNumber += someNumber;
        }
        // perform integer division
        return anotherNumber / 8;
    }

    // a method that has a complex for loop, with an embedded while
    public static int performAnotherOutrageuosCalc(int n) {
        int quotient = n;
        int calcVal = 43;
        int j = 7;
        for (int ii = 0, k = 3; ii < 16; ii++, k--) {
            ii = ii + 1;
            j += 0;
            calcVal -= k;
            while (ii > 7 && ii < 8) {
                quotient += (ii - j);
                ii *= 2;
            }
            calcVal += quotient;
        }
        return calcVal;
    }
}
