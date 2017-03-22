import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = 0;
        for(char c : s.toCharArray()) {
            if(c == 'a')
                result++;
        }
        
        String temp = "";
        long rem = n / s.length();
        long mode = n % s.length();
        result = result * rem;
        for(int i=0; i<mode; i++){
            if(s.charAt(i)=='a')
                result++;
        }
        System.out.println(result);
    }
}