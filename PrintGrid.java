import java.util.*;

public class PrintGrid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("enter the number of columns:");
        int m = sc.nextInt();
        char arr[] = new char[100];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("-" + " ");
            }
            System.out.println("\n");
        }
    }
}
