import java.util.Scanner;

public class RemoveElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={11,22,33,44,55,66};
        System.out.println("Enter the position of element that has to be removed:");
        int pos=sc.nextInt();
        if(pos>=arr.length){
            System.out.println("deletion not possible");
        }
        else{
            for(int i=pos-1;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
         System.out.print("left array:");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
}
