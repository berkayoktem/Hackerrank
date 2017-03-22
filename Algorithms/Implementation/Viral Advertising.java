import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 5; 
        int result = 0;
        for(int i = 0; i < n; i++) {
            count = (int) Math.floor(count / 2);
            result = result + count;
            count = count * 3;
        }
        System.out.println(result);
    }
}