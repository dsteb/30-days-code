package day3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
        int n = scan.nextInt();

        boolean isWeird = n % 2 == 1 || (n >= 6 && n <= 20);
        String ans = isWeird ? "Weird" : "Not Weird";
        System.out.println(ans);
      }
   }
}
