import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] time = in.nextLine().split(":");
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String day = time[2].substring(2,4);
        
        if(day.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
        }
    }
}