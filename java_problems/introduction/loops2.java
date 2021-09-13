package introduction;
import java.util.*;
import java.io.*;

class loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int series = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int x = 0; x < n; x++){
                if(x == 0){
                    series = a+(1*b); // 2^0 = 1
                    System.out.printf("%d ",series);
                }else{
                    series += (Math.pow(2,x)*b);
                    System.out.printf("%d ",series);
                }
            }
            System.out.println();
        }
        in.close();
    }
}
//formula
// (a+2^n.b),(a+2^n.b+2^n+1.b),.....,(a+2^n.b+2^n+1.b+....+2^n-1.b) => till it reached end number
// Sample Input
// 2
// 0 2 10
// 5 3 5

// Sample Output
// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98