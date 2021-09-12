import java.util.*;
import java.io.*;



class datatypes{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte"); //byte has the length has -128 to (128-1)
                if(x>=-32768 && x<=32767)System.out.println("* short"); // short has 10^15 = 32768
                if(x>=-(Math.pow(2,31)) && x<= (Math.pow(2,31)-1)) System.out.println("* int"); // int is 32 bit so 2^31
                if(x>=-(Math.pow(2,63)) && x<= (Math.pow(2,63)-1)) System.out.println("* long"); //long is 64 bit so 2^63
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

// why we are use (-)minus in length means the length starts from 0 so we minus the last number

