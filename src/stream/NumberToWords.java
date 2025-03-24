package stream;

import java.util.Scanner;

public class NumberToWords {

    // Arrays to map number groups and digits to their word equivalents
    private static final String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    // Main function to convert number to words
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        // Initialize an empty result string
        String result = "";
        int thousandCounter = 0; // Tracks the position (Thousand, Million, Billion, etc.)

        // Process every three digits (thousands, millions, etc.)
        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + thousands[thousandCounter] + " " + result;
            }
            num /= 1000; // Move on to the next group of 3 digits
            thousandCounter++;
        }

        return result.trim(); // Trim trailing spaces
    }

    // Helper function to convert a number less than 1000 to words
    private static String helper(int num) {
        String result = "";

        if (num >= 100) {
            result += belowTen[num / 100] + " Hundred ";
            num %= 100;
        }

        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num >= 10) {
            result += belowTwenty[num - 10] + " ";
        } else if (num > 0) {
            result += belowTen[num] + " ";
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        String result = numberToWords(num);
        System.out.println("Number in words: " + result);
    }
}
