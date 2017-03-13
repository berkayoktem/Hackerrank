import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        //First Case
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        //Second Case
        String lex = "";
        if(A.compareTo(B) > 0){
            lex = "Yes";
        }
        else{
            lex = "No";
        }
        System.out.println(lex);
        
        //Third Case
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        
    }
}