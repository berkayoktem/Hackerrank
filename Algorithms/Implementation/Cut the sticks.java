import java.io.*;
import java.util.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for(int a_i=0; a_i < n; a_i++){
            int val = in.nextInt();
            list.add(val);
        }
        list.removeAll(Collections.singleton(0));
        Collections.sort(list);
        while(list.size()>0)
        {
            int smallest = list.get(0);
            for(int j=0; j<list.size(); j++){
                list.set(j, list.get(j)-smallest);
            }
            System.out.println(list.size());
            list.removeAll(Collections.singleton(0));
            
        }
    }
}