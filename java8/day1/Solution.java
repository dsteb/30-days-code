package day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        i += scan.nextInt();
        d += scan.nextDouble();
        scan.nextLine();
        s += scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s);

        scan.close();
    }
}
