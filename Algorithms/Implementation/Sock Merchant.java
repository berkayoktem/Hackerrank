import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int c_i=0; c_i < n; c_i++){
            arr[c_i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i< n-1; i++) {
            if(arr[i] == arr[i+1]) {
            result++;
            i++;
            }
        }
        System.out.println(result);
    }
}