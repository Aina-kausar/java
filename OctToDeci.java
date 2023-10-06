import java.util.Scanner;

public class OctToDeci {
    public static void main(String[] args) {
		System.out.println("enter the octal number:");
		Scanner sc=new Scanner(System.in);
		int oct=sc.nextInt();
		int rem,x=1,sum=0;
	while(oct!=0){
	    rem=oct%10;
	    sum=sum+x*rem;
	    x*=8;
	    oct/=10;
	}
	System.out.print(sum);
	}
}
