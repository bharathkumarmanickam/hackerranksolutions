import java.io.*;
import java.util.*;

public class loops1 {
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       for(int i = 1; i <= 10; i++){
            System.out.printf("%d%s%d%s%d\n",n," x ",i," = ",n*i); //First solution with formatting
            System.out.printf(n+" x "+i+" = "+n*i); //second sol without formatting
            System.out.println(); // second sol
       }
       
    }
}
