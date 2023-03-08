import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum[] = new int[10];

        // input
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            sum[i] = sc.nextInt();
        }

        // output
        System.out.println("entered array elements:");
        for (int i = 0; i < n; i++)
            System.out.print(sum[i] + " ");
    }
}
