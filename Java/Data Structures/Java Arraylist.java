import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            int n2 = scn.nextInt();
            for(int j = 0; j < n2; j++) {
                tempList.add(scn.nextInt());
            }
            list.add(tempList);
        }
        
        int query = scn.nextInt();
        for(int i = 0; i < query; i++) {
            int x = scn.nextInt() - 1;
            int y = scn.nextInt() - 1;
            
            try {
                List<Integer> resultList = list.get(x);
                try {
                    System.out.println(resultList.get(y));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("ERROR!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}