import java.util.*;

public class OctToHexa {
    public static void main(String args[])
    {
        System.out.println("enter the octal number:");
        Scanner sc =new Scanner(System.in);
        int oct=sc.nextInt();
        int rem,sum=0,x=1;
        String hex="";
        char hexadecimal[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //conversion from oct to decimal
        while(oct!=0){
            rem=oct%10;
            sum=sum+x*rem;
            x*=8;
            oct/=10;
        }
        //conversion from decimal to hexa

        while(sum!=0){
            rem=sum%16;
            hex=hexadecimal[rem]+hex;
            sum/=16;
        }
        System.out.print(hex);
    }

}
