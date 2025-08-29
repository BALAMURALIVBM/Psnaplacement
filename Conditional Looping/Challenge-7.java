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
        
        String[] t = time.split(":");
        
        int hrs = Integer.parseInt(t[0]);
        int mins = Integer.parseInt(t[1]);
        int sec = Integer.parseInt(t[2]);
        
        if(hrs>=0 && hrs< 24 && mins>=0 && mins < 60 && sec >=0 && sec < 60){
        System.out.println("Valid");
        }
        
        else {
            System.out.println("Not Valid");
            
        }
    }
}