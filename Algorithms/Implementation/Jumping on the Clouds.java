import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = 0;
        int count = 0;
        while(count != (n - 1)) {
            if((count+2)<n && c[count+2]==0){
                count = count + 2;
                result++;
            }
            else if(c[count+1]==0) {
                count = count + 1;
                result++;
            }
        }
        System.out.println(result);
    }
}