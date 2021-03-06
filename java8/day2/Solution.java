package day2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double mealCost = scan.nextDouble(); // original meal price
            int tipPercent = scan.nextInt(); // tip percentage
            int taxPercent = scan.nextInt(); // tax percentage

            // Write your calculation code here.
            double tip = mealCost * tipPercent / 100;
            double tax = mealCost * taxPercent / 100;

            // cast the result of the rounding operation to an int and save it as totalCost
            int totalCost = (int) Math.round(mealCost + tip + tax);

            // Print your result
            System.out.printf("The total meal cost is %d dollars.", totalCost);
        }
    }
}
