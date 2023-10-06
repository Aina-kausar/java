import java.util.*;

public class DeciToHex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int deciNum,rem;
        System.out.println("enter the decimal number :");
        deciNum=sc.nextInt();
        String hex="";

        char hexdeci[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        //logic
        while(deciNum>0){
            rem=deciNum%16;
            hex=hexdeci[rem]+hex;
            deciNum/=16;
        }
        System.out.print(hex);
    }
}
