import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // Write your code here.
        String regex = "[\\s!,?._'@]+";
        String splitted[] = str.trim().split(regex);
        if(str.trim().length() == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(splitted.length);    
            for(String split: splitted) {
                System.out.println(split);
            }
        }

        scan.close();
    }
}