import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner op = new Scanner(System.in);
        int a = op.nextInt();
        
        if(a%3==0&& a%5==0){
            System.out.println("HiHello");
        }
        else if(a%3==0){
            System.out.println("Hi");
        }
        else{
            System.out.println("Hello");
        }
    }
}