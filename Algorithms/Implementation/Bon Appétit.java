import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        int temp = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            temp = in.nextInt();
            arr[i] = temp;
            sum = sum + temp;
        }
        int brian = in.nextInt();
        int anna = (sum-arr[k])/2;
        if(brian == anna)
            System.out.println("Bon Appetit");
        else {
            int res = brian - anna;
            System.out.println(res);
        }
        
    }
}