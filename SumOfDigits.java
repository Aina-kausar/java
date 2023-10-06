import java.util.*;
public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r,sum=0;
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        while(n!=0){
            r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println(sum);
    }
}
