import java.util.*;

public class Swap {
    public static void main(String args[]) {
        int temp, x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number :");
        x = sc.nextInt();
        System.out.println("enter the second number:");
        y = sc.nextInt();

        temp = x;
        x = y;
        y = temp;

        System.out.println("after swapping:x,y=" + x + "," + y);
    }

}