import java.util.Scanner;

public class BinToHex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rem,sum=0,x=1;
        String hex="";
        char hexdeci[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.println("enter the binary number:");
        int bin=sc.nextInt();

        //conversion from binary to decimal

        while(bin!=0){
            rem=bin%10;
            sum=sum+x*rem;
            x=x*2;
            bin/=10;
        }

        //conversion from decimal to hexa

        while(sum!=0){
            rem=sum%16;
            hex=hexdeci[rem]+hex;
            sum/=16;
        }
        System.out.println(hex);
    }
}
