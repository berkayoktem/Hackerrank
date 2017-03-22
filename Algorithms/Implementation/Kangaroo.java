import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int dif0 = Math.abs(x1-x2);
        int dif = 0;
        do{
            x1=x1+v1;
            x2=x2+v2;
            dif=Math.abs(x1-x2);
            if(x1==x2){
                System.out.println("YES");
                break;
            }
            if(dif>dif0){
                System.out.println("NO");
                break;
            }
            if(x1>x2){
                System.out.println("NO");
                break;
            }
        }while(x1!=x2);
            
    }
}