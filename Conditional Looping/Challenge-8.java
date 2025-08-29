import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        
        String[] t = time.split("/");
        
        int day = Integer.parseInt(t[0]);
        int month = Integer.parseInt(t[1]);
        int year = Integer.parseInt(t[2]);
        
       if (day >= 1 && month >= 1 && month <= 12 && year >= 1990 && year <= 9999) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day <= 31) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day <= 30) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else if (month == 2) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    if (day <= 29) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    if (day <= 28) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}