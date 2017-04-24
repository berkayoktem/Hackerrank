import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        
        int[] a = new int[n];        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int lcmFinal = lcm(a);
        //System.out.println(lcmFinal);
        
        int[] b = new int[m];        
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int hcfFinal = hcf(b);
        //System.out.println(hcfFinal);
        
        if (lcmFinal <= hcfFinal) {
            int  i = 1;
            int lcmTemp = lcmFinal;
            while (lcmTemp <= hcfFinal) {
                if (hcfFinal % lcmTemp == 0) {
                    count ++;
                }                    
                i ++;
                lcmTemp = lcmFinal * i;
            }
            System.out.println(count);
        }
        else {
            System.out.println("0");
        }
    }
    private static int hcf(int a, int b) {
        int temp = (a > b) ? b : a;
        a = (a > b) ? a : b;
        while(temp > 0) {
            b = temp;
            temp = a % temp;
            a = b;
        }
        return b;
    }
    private static int hcf(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i ++) {
            temp = hcf(temp, a[i]);
        }
        return temp;
    }
    private static int lcm(int a, int b) {
        int temp = hcf(a, b);
        return ((a * b) / temp);
    }
    private static int lcm(int[] a) {
        int temp = a[0];
        for (int i = 1; i <a.length; i++) {
            temp = lcm(temp, a[i]);
        }
        return temp;
    }
}