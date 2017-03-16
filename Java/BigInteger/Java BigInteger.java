import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger a = new BigInteger(scn.next());
        BigInteger b = new BigInteger(scn.next());
        
        BigInteger result1 = a.add(b);
        BigInteger result2 = a.multiply(b);
        System.out.println(result1);
        System.out.println(result2);
    }
}