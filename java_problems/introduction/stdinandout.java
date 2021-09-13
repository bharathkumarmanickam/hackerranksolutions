package introduction;
import java.util.Scanner;

public class stdinandout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                   
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();  
        //---------------------------------------------------
        //explanation of using the string input
        // I think you are using next() function ,so it receives first word only .It doesnot allow space. 
        // If you use nextLine(),you will get problem of not taking input from user(doesnot scan from keyboard).One point we should notice that initialy cursor was in the previous line from which it takes input .
        // If you dont clear buffer memory it takes that as an input .
        // So before using nextline() function to receive string annonymously call nextline() function THen you will get expected output
        //---------------------------------------------------
        String s = scan.nextLine();             
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}