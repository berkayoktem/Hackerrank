import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];

        int max = 0;
        int result = 0;
        
        for(int types_i=0; types_i < n; types_i++){
            int temp = in.nextInt();
            types[temp-1]++;
        }
                
        for(int i = 0; i < n; i++) {
            if(types[i] > max) {
                max = types[i];
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}