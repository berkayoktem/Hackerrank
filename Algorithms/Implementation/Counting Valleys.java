import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        String[] arr = str.split("");
        int seaLevel = 0;
        int valley = 0;
        boolean flg = true;
        
        for(int i = 0; i < arr.length; i++){
        	if(arr[i].equals("D")){
        		seaLevel--;
        	}
        	else if(arr[i].equals("U")){
        		seaLevel++;
        	}
        	
        	if(seaLevel < 0 && flg && arr[i].equals("D")){
        		flg = false;
        	}
        	else if(seaLevel == 0 && arr[i].equals("U")){
        		flg = true;
        		valley++;
        	}
        }
        
        System.out.println(valley);
    }
}