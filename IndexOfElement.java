import java.util.*;

public class IndexOfElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of an array:");
        int n=sc.nextInt();
        int arr[]=new int[10];
        //input the array
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element:");
        int x=sc.nextInt();
        //to find index of element of an array
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println("index of element is :"+i);
            }
        }
    }


    ////using function//////Another Method////////

    // public static int index(int []arr,int x){
    //     for(int i=0;i<arr.length;i++){
    //         if(x==arr[i]){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter the number of elements of an array:");
    //     int n=sc.nextInt();
    //     int arr[]=new int[10];
    //     //input the array
    //     System.out.println("enter the elements of array:");
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println("Enter the element:");
    //     int x=sc.nextInt();
    //     System.out.println(index(arr,x));
    //}
}
