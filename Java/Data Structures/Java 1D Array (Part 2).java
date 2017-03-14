import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        for(int i = 0; i < testCase; i++){
            int n = scn.nextInt();
            int m = scn.nextInt();
            //Create array and take inputs
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            
            int pos = 0;
            boolean result = escape(arr, m, pos);
            System.out.println(result ? "YES" : "NO");
        }
    }
    
    //Recursion for search
    public static boolean escape(int[] arr, int m, int pos) {
        
        if(pos < 0 || arr[pos] == 1) {
            return false;
        }
        else if ((pos + 1) >= arr.length || (pos + m) >= arr.length) {
            return true;
        }
        arr[pos] = 1;
        return escape(arr, m, (pos - 1)) || escape(arr, m, (pos + 1)) || escape(arr, m, (pos + m));
    }
}