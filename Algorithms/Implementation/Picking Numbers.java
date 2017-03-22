import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] secArr = new int[100];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            secArr[arr[i]]++;
        }
        
        int max = 0;
        int temp = 0;
        
        for(int j = 0; j < 99; j++) {
            temp = secArr[j] + secArr[j + 1];
            if(temp > max) {
                max = temp;
            }
        }
        
        System.out.println(max);
    }
}