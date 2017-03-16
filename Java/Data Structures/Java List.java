import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        //read list elements and put them in the list
        for(int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }
        
        int numOfQueries = scn.nextInt();
        
        for(int i = 0; i < numOfQueries; i++) {
            String queryType = scn.next();
            //Insert operation
            if(queryType.equals("Insert")) {
                int x = scn.nextInt();
                int y = scn.nextInt();
                list.add(x, y);
            }
            //Delete operation
            else if(queryType.equals("Delete")) {
                int x = scn.nextInt();
                list.remove(x);
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}