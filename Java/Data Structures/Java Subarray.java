import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int result = 0;
        int tempSum = 0;
        for(int i = 0; i < n; i++) {
            tempSum = 0;
            for(int j = i; j < n; j++) {
                tempSum += arr[j];
                if(tempSum < 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}