import java.util.*;

public class Index {
    public static void main(String args[]) {
        System.out.println("entere the element of which u want to find the index:");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int arr[] = { 1, 3, 5, 7, 2, 8 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("element is at the index :" + i);
            }
        }

    }
}
