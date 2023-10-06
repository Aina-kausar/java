import java.util.Scanner;

public class MinMaxElementOfArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,7,3,9,1,4};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]){
            min=arr[i];
        }
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("minimum element of array :"+min);
    System.out.println("maximum element of array:"+max);
}}
