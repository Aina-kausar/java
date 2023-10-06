//import java.util.Scanner;

public class DuplicateValArr {
    public static void main(String args[]){
        int arr[]={1,3,4,5,2,3,4};
     {

        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j<arr.length;j++){
            if((arr[i]==arr[j])&&(i!=j)){
                System.out.print(arr[i]);
            }
           }
         }
      }
    }
}
