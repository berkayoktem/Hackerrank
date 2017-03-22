import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        for(int i = 1; i <= temp; i++){
            for(int j = 1; j <= (temp-i); j++){
                System.out.print(" ");
            }
            for(int a = 1; a <= i; a++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}