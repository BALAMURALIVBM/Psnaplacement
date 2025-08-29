import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine(); 

        String[] parts = date.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 9999 || month < 1 || month > 12) {
            System.out.println("Invalid");
            return;
        }

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days[1] = 29;
        }

        if (day >= 1 && day <= days[month - 1]) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
