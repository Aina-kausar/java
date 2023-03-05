import java.util.*;

public class GreatestNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("X is greater");
        } else if (y > x && y > z) {
            System.out.println("Y is greater");
        } else {
            System.out.println("z is greater");
        }
    }
}
