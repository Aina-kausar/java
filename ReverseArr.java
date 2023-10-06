import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,4,5,6,7};
        int i;
        for( i=0;i<arr.length/2;i++){
          int temp=arr[i];
          arr[i]=arr[arr.length-1-i];
         arr[arr.length-1-i]=temp;
            
        }
        System.out.println(Arrays.toString(arr));
        
    }

    
     
}
