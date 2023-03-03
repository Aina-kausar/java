import java.util.*;

public class Table {
    public static void main(String args[]) {
        System.out.println("enter the number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 1;
        for (int i = 1; i <= 10; i++) {
            b = n * i;
            System.out.println(b);
        }
    }
}