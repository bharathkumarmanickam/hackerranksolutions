package introduction;
import java.util.*;
import java.text.*;

public class currencyformatter {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double i = scan.nextDouble();
        try{
             NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);            
             NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en","in"));       // works with only java 7 => (Rs.) after versions => new indian symbol     
             NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
             NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
             
             System.out.println("US: "+us.format(i));
             System.out.println("India: "+in.format(i));             
             System.out.println("China: "+ch.format(i));
             System.out.println("France: "+fr.format(i));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

//numberformat is used to parse the locale codes 