import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
   
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        
        String result = dayNames[cal.get(Calendar.DAY_OF_WEEK)];
        System.out.println(result.toUpperCase());
    }
}