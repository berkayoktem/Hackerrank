import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //decide which hourglass is biggest
    public static int maxHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = findSum(arr, i, j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    
    //find sum of hourglass
    public static int findSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxHourglass(arr));
    }
}
