import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int max = score[0];
        int min = score[0];
        int maxBreaks = 0;
        int minBreaks = 0;
        for(int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                maxBreaks++;
                max = score[i];
            }
            else if(score[i] < min) {
                minBreaks++;
                min = score[i];
            }
        }
        System.out.println(maxBreaks + " " + minBreaks);
    }
}