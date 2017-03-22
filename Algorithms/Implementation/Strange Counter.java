import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long temp = 2;
        while (3 * (temp - 1) < t) 
            temp = 2 * temp;
        System.out.println((3 * (temp - 1) - t + 1));
    }
}