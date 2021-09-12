import java.util.Scanner;

public class ouputformatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x); 
                // the upper line tells (- is left intenation with max letter of 15 strings and 03 represents
                // the three integers )
            }
            System.out.println("================================");

    }
}
