import java.util.*;
public class BinarySearch {
    public static void main(String aregs[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements of an array:");
        int n=sc.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("Enter the data that has to be searched:");
        int data=sc.nextInt();
       
            int  lb=0,ub=n-1,mid=(lb+ub)/2;
            while(lb<=ub){
                if(data==arr[mid]){
                    System.out.println("data is found ,that is:"+arr[mid]);
                    break;
                }
                else if(data<arr[mid]){
                    ub=mid-1;
                }
                
                else{
                    lb=mid+1;
                }
                mid=(lb+ub)/2;
            }
            
            if(lb>ub){
                System.out.println("data not found");

            }
       }
    }

