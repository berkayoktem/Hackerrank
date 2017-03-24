import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int students = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[students];
            int attended = 0;
            for(int j = 0; j < students; j++){
                arr[j] = in.nextInt();
                if(arr[j] <= 0){
                    attended++;
                }
            }
            System.out.println((attended >= k) ? "NO" : "YES");
        }
    }
}