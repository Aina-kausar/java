import java.util.*;

public class AddBinaryNum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int i=0;
        long b1,b2,rem=0;
        long sum[]=new long[100];
        System.out.println("enter two binary numbers");
        b1=sc.nextLong();
         b2=sc.nextLong();

         while(b1!=0||b2!=0){
            sum[i++]=(int)((b1%10+b2%10+rem)%2);
            rem=(int)((b1%10+b2%10+rem)/2);

            b1=b1/10;
            b2=b2/10;
         }
         if(rem!=0){
            sum[i++]=rem;
            
         }
         i--;

         while(i>=0){
            System.out.print(sum[i--]);
         }
    }
}
