import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        //USD - used default locale variable
        NumberFormat formatUsd = NumberFormat.getCurrencyInstance(Locale.US);
        formatUsd.setMaximumFractionDigits(2);
        String us = formatUsd.format(payment);
        
        //India - created new locale variable
        Locale locale = new Locale("en", "IN");
        NumberFormat formatInd = NumberFormat.getCurrencyInstance(locale);
        formatInd.setMaximumFractionDigits(2);
        String india = formatInd.format(payment);
        
        //China - used default locale variable
        NumberFormat formatChi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        formatChi.setMaximumFractionDigits(2);
        String china = formatChi.format(payment);
        
        //France - used default locale variable
        NumberFormat formatFra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        formatFra.setMaximumFractionDigits(2);
        String france = formatFra.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}