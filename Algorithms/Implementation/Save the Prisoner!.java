import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();

        for(int i=0; i<t; i++){
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            
            long result = (s+m-1)%n;
            if(result==0)
                System.out.println(n);
            else
                System.out.println(result);
        }
    }
}