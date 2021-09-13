package introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class endoffile {

    public static void main(String[] args) {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){ //will scan until u give break
          System.out.println(i+" "+scan.nextLine());  
          i++;
        }
    }
}
