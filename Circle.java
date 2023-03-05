import java.util.*;

public class Circle {
    public static void main(String args[]) {
        System.out.println("enter the radius of the circle:");

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 1;
        double perimetre = 0;
        area = 3.14 * (r * r);
        System.out.println(area);
        perimetre = 2 * 3.14 * r;
        System.out.println(perimetre);
    }
}
