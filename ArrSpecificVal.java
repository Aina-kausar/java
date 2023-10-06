import java.util.*;

public class ArrSpecificVal {
   
        public static boolean contains(int []arr,int s){
            for(int i=0;i<arr.length;i++){
                if(s==arr[i]){
                    return true;
                }
            }
            return false;
        }
         public static void main(String args[]){
        System.out.println( "enter the number of elements of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[]=new int[5];

        //input array

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the specific number that has to be searched:");
        int s=sc.nextInt();
        System.out.println(contains(arr,s));
    }
}
