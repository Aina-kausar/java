import java.util.*;

public class InsertAtPos {
    public static void main(String args[]) {
        System.out.println("entere the element to be inserted:");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        System.out.println("enter the position:");
        int index_pos = sc.nextInt();

        int arr[] = { 1, 3, 5, 7, 2, 8 };

        for (int i = arr.length - 1; i > index_pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index_pos] = element;
        System.out.println("new array" + Arrays.toString(arr));
    }
}
