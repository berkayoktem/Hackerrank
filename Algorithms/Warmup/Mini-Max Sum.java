import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long total = 0;
        long max = 0;
        long min = 0;
        
        min = in.nextLong();
        max = min;
        total = min;
        for(int i = 0; i < 4; i++) {
            long a = in.nextLong();
            total += a;
            if(a < min){
                min = a;
            }
            if(a > max) {
                max = a;
            }
        }
        System.out.println((total - max) + " " + (total - min));
    }
}
