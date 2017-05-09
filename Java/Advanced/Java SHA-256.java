import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {    	
    	Scanner scn = new Scanner(System.in);
    	String str = scn.next();
    	
    	MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
    	msgDigest.update(str.getBytes());
    	byte[] digest = msgDigest.digest();
    	
    	for(byte b : digest) {
    		System.out.format("%02x", b);
    	}
    }  
}