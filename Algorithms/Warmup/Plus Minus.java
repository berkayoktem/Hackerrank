import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] < 0)
                neg++;
            if(arr[j] == 0)
                zero++;
            if(arr[j] > 0)
                pos++;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}