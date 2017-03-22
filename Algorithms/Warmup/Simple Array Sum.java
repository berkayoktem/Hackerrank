import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int sum = 0;
        for(int i = 0; i < count; i++){
            int temp = s.nextInt();
            sum += temp;
        }
        System.out.println(sum);
    }
}