import java.util.*;

public class DeciToBin {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int i=1;
        int bin[]=new int[20];
        System.out.println("enter the decimal number:");
        int n =sc.nextInt();

        while(n>0){
            bin[i++]=n%2;
            n/=2;
        }
        for(int j=i-1;j>0;j--){
            System.out.print(bin[j]);
        }
    }
}
