import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Month;
        switch(n){
            case 1:
                Month = "January";
                break;
            case 2:
                Month = "Februray";
                break;
            case 3:
                Month = "March";
                break;
            case 4:
                Month = "April";
                break;
            case 5:
                Month = "May";
                break;
            case 6:
                Month = "June";
                break;
            case 7:
                Month = "July";
                break;
            case 8:
                Month = "August";
                break;
            case 9:
                Month= "September";
                break;
            case 10:
               Month= "October";
                break;
            case 11:
               Month = "November";
                break;
            case 12:
              Month = "December";
                break;
            default:
                Month ="Invalid";
                
        }
        System.out.println(Month);
    }
}