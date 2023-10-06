import java.util.*;
public class SumValuesOfArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0,average;
         System.out.print("enter the number of elemnts of array:");
        int n=sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
          System.out.print("\n");

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
            System.out.println("sum of values of array:"+sum);
            average=sum/n;
             System.out.print("average of values:"+average);


    }
}
