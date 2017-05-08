package com.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

class Prime{
	public Prime(){
		
	}
	
	boolean isPrime(int n){
		for (int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	void checkPrime(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 1 && isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

public class Main {

    public static void main(String[] args) {
    	/*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();*/
    	
    	try{
    		BufferedReader br = new BufferedReader(new InputStreamReader(in));
    		int n1 = Integer.parseInt(br.readLine());
    		int n2 = Integer.parseInt(br.readLine());
    		int n3 = Integer.parseInt(br.readLine());
    		int n4 = Integer.parseInt(br.readLine());
    		int n5 = Integer.parseInt(br.readLine());
    		
    		Prime ob = new Prime();
    		ob.checkPrime(n1);
    		ob.checkPrime(n1,n2);
    		ob.checkPrime(n1,n2,n3);
    		ob.checkPrime(n1,n2,n3,n4,n5);
    		
    		Method[] methods = Prime.class.getDeclaredMethods();
    		Set<String> set = new HashSet<>();
    		boolean overload = false;
    		
    		for (int i = 0; i < methods.length; i++) {
				if(set.contains(methods[i].getName())){
					overload = true;
					break;
				}
				set.add(methods[i].getName());
			}
    		if(overload) {
    			throw new Exception("Overloading not allowed");
    		}
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}

    }
}
