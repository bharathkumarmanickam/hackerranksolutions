package introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticinit {

    // static  blocks are executed when the class are loaded
    // static method is used to initialize the variabled or operations outside the functions
    
static boolean flag = true;
static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt();
static{
    try{
        if( H<=0 || B<=0){
        flag = false;
        throw new Exception("Breadth and height must be positive");
        }        
    }catch(Exception e){
        System.out.println(e);
    } 
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
