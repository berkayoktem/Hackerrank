import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int height = 1;
            for(int j = 1; j <= n; j++){
                //Spring
                if(j % 2 != 0) {
                    height *= 2;
                }
                //Summer
                else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}