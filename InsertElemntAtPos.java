import java.util.Scanner;

public class InsertElemntAtPos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={6,7,3,6,2,9,1};
        System.out.println("Enter the element:");
        int x=sc.nextInt();
        System.out.println("Enter the pos:");
        int pos=sc.nextInt();
        
        if(pos>arr.length){
            System.out.println("cann't insert");
        }
        for(int i=arr.length-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
      
        arr[pos]=x;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
