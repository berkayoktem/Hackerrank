package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
    public static PerformOperation is_odd() {
        return num -> (num % 2) != 0;
    }

    public static PerformOperation is_prime() {
    	return num -> java.math.BigInteger.valueOf(num).isProbablePrime(1);
    }

    public static PerformOperation is_palindrome() {
        return num -> {
            String original = Integer.toString(num);
            String reversed = new StringBuilder(Integer.toString(num)).reverse().toString();
            return original.equals(reversed);
        };
    }
}

public class Main {

    public static void main(String[] args) throws IOException {    	
    	MyMath ob = new MyMath();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	
    	PerformOperation op;
    	boolean ret = false;
    	String ans = null;
    	
    	while(t--> 0) {
    		String s = br.readLine().trim();
    		StringTokenizer st = new StringTokenizer(s);
    		int ch = Integer.parseInt(st.nextToken());
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(ch == 1) {
    			op = ob.is_odd();
    			ret = ob.checker(op, num);
    			ans = (ret) ? "ODD" : "EVEN";
    		}
    		else if(ch == 2) {
    			op = ob.is_prime();
    			ret = ob.checker(op, num);
    			ans = (ret) ? "PRIME" : "COMPOSITE";
    		}
    		else if(ch == 3) {
    			op = ob.is_palindrome();
    			ret = ob.checker(op, num);
    			ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
    		}
    		System.out.println(ans);
    	}
    }  
}

