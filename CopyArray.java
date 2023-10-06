import java.util.Scanner;

public class CopyArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]=new int[7];
        System.out.print("Given array:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("copied array:");
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
           System.out.print(arr2[i]+" ");
        }
        
        
    }
    
}
