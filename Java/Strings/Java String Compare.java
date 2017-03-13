import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int len = scn.nextInt();
        
        String max = str.substring(0, len);
        String min = max;
        String piece;
        
        for (int i = 0; i <= str.length() - len; i++) {
            piece = str.substring(i, i + len);
            
            if (max.compareTo(piece) < 0) {
                max = piece;
            }
            if (min.compareTo(piece) > 0) {
                min = piece;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
}