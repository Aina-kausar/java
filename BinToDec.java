import java.util.Scanner;

public class BinToDec {
    public static void main(String args[]){
        long bin,rem,sum=0,x=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the binary number:");
        bin=sc.nextLong();
        
        //logic
        while(bin>0){
            rem=bin%10;
            sum=sum+rem*x;
            x=x*2;
            bin/=10;
        }
        System.out.print(sum);
    }
}
