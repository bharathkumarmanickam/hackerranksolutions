package strings;

import java.io.*;
import java.util.*;

public class stringintro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        
        
        // For Lexicographical
        int result = A.compareTo(B);
        if(result <= 0)System.out.println("No");
        else System.out.println("Yes");
        
        
        // For A
        String a = A.substring(0,1);
        String rema = A.substring(1);
         //For B
        String b = B.substring(0,1);
        String remb = B.substring(1);     
        System.out.println(a.toUpperCase()+rema+" "+b.toUpperCase()+remb);
        
       
    }
}



