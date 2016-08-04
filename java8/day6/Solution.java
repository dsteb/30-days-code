package day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static String separated(String in) {
      StringBuilder odd = new StringBuilder();
      StringBuilder even = new StringBuilder();
      for (int i = 0; i < in.length(); ++i) {
        StringBuilder current = i % 2 == 1 ? odd : even;
        current.append(in.charAt(i));
      }
      return even.toString() + " " + odd.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int n = scanner.nextInt();
          scanner.nextLine();
          for (int i = 0; i < n; ++i) {
            String s = scanner.nextLine();
            System.out.println(separated(s));
          }
        }
    }
}
