import java.util.*;

public class Avrg {
    public static void main(String args[]) {
        System.out.println("enter the three numbers:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float averg = (a + b + c) / 3;
        System.out.println("average of the  numbers" + averg);
    }
}
