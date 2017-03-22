import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i < length; i++){
            for(int j=0; j < length; j++){
                int num = in.nextInt();
                if(i == j)
                    sum1 += num;
                if(i + j == length - 1)
                    sum2 += num;
            }
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}