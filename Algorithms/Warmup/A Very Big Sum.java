import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        long arr[] = new long[length];
        int i;
        for(i = 0; i < length; i++){
            arr[i] = in.nextInt();
        }
        long sum = 0;
        for(i = 0; i < length; i++){
            if(length >= 1 && length <= 10 && arr[i]>=1 && arr[i]<=(int)Math.pow(10,10)){
                sum += (long)arr[i];
            }
        }
        if(sum!=0)
            System.out.println(sum);
        else
            System.out.println();
    }
}