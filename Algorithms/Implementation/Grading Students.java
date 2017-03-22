import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int result = 0;
            int grade = in.nextInt();
            if(grade < 38) {
                result = grade;
            }
            else {
                int tempGrade = grade + (5 - (grade % 5));
                if((tempGrade - grade) < 3) {
                    result = tempGrade;
                }
                else {
                    result = grade;
                }
            }
            System.out.println(result);
        }
    }
}