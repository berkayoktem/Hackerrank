import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appleRes = 0;
        int orangeRes = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int dist = a + apple[apple_i];
            if(dist <= t && dist >= s)
                appleRes++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int dist = b + orange[orange_i];
            if(dist <= t && dist >= s)
                orangeRes++;
        }
        System.out.println(appleRes);
        System.out.println(orangeRes);
    }
}