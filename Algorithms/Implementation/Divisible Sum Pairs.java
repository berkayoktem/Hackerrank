import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int result = 0;
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((a[i] + a[j]) % k == 0 && i < j){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}