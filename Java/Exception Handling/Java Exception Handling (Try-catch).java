import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try{
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            System.out.println(num1 / num2);
        } catch(InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}