import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        BitSet firstSet = new BitSet(n);
        BitSet secondSet = new BitSet(n);
        BitSet[] bitSet = new BitSet[3];
        
        bitSet[1] = firstSet;
        bitSet[2] = secondSet;
        
        while(0 < m--) {
            String operation = scn.next();
            int x = scn.nextInt();
            int y = scn.nextInt();
            
            switch(operation) {
                case "AND":
                    bitSet[x].and(bitSet[y]);
                    break;
                case "OR":
                    bitSet[x].or(bitSet[y]);
                    break;
                case "XOR":
                    bitSet[x].xor(bitSet[y]);
                    break;
                case "FLIP":
                    bitSet[x].flip(y);
                    break;
                case "SET":
                    bitSet[x].set(y);
                    break;
            }
            System.out.printf("%d %d%n", firstSet.cardinality(), secondSet.cardinality());
        }
        
    }
}