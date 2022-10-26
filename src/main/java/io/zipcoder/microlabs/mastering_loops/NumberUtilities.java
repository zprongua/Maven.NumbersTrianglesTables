package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //establish string of numbers in sequence;
        String numberLine = "";
        //loop to add all applicable numbers to string
        for (int i = start; i < stop; i += 2) {
            //check if even, add to string
            if (i % 2 == 0) {
                numberLine += Integer.toString(i);
            }
            //if odd, add one (even), add to string
            else {
                i++;
                numberLine += Integer.toString(i);
            }
        }
        //spit out number sequence
        return numberLine;
    }


    public static String getOddNumbers(int start, int stop) {
        //establish string of numbers in sequence;
        String numberLine = "";
        //loop to add all applicable numbers to string
        for (int i = start; i < stop; i += 2) {
            //check if odd, add to string
            if (i % 2 == 1) {
                numberLine += Integer.toString(i);
            }
            //if even, add one (odd), add to string
            else {
                i++;
                numberLine += Integer.toString(i);
            }
        }
        //spit out number sequence
        return numberLine;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        //establish and assign value to string
        String numberLine = "";
        //loop to add numbers
        for (int i=start; i<stop; i+=step) {
            int power = 2;
            int square = (int) Math.pow(i, power);
            numberLine += Integer.toString(square);
        }
        //return String
        return numberLine;
    }

    public static String getRange(int stop) {
        //establish and assign value to string
        String numberLine = "";
        //loop to add numbers
        for (int i=0; i<stop; i++) {
            numberLine += Integer.toString(i);
        }
        //return String
        return numberLine;
    }

    public static String getRange(int start, int stop) {
        //establish and assign value to string
        String numberLine = "";
        //loop to add numbers
        for (int i=start; i<stop; i++) {
            numberLine += Integer.toString(i);
        }
        //return String
        return numberLine;
    }


    public static String getRange(int start, int stop, int step) {
        //establish and assign value to string
        String numberLine = "";
        //loop to add numbers
        for (int i=start; i<stop; i+=step) {
            numberLine += Integer.toString(i);
        }
        //return String
        return numberLine;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        //establish and assign value to string
        String numberLine = "";
        //loop to add numbers
        for (int i=start; i<stop; i+=step) {
            int power = exponent;
            int square = (int) Math.pow(i, power);
            numberLine += Integer.toString(square);
        }
        //return String
        return numberLine;
    }
}
