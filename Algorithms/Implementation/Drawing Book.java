import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = 0;
        if((n-p) < p){
            result = (n-p) / 2;
        }
        else {
            result = p / 2;
        }
        System.out.println(result);
    }
}