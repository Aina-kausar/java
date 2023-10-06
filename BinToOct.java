import java.util.Scanner;

public class BinToOct {

	public static void main(String[] args) {
		System.out.println("enter the binary number:");
		Scanner sc=new Scanner(System.in);
		
		int bin,sum=0,rem,x=1,r,oct=0,i=1;
		bin=sc.nextInt();
		int octal[]=new int[20];
		//first convert binary number into decimal number
		
		while(bin>0){
		    rem=bin%10;
		    sum=sum+x*rem;
		    x=x*2;
		    bin/=10;
		}
	
		
		// now convert the resultant into hexadecimal number
		
		while(sum!=0){
		    r=sum%8;
		    octal[i]=oct*10+r;
		    sum/=8;
		    i++;
		}
		//printing the number 
		for(int j=i-1;j>0;j--){
		    
		System.out.print(octal[j]);
		}
	}
}


