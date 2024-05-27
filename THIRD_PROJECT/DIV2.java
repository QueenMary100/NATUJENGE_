import java.util.*;
public class DIV2 {
    public static void main(String[] args) {

        double radius, area,circum;

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = Sc.nextInt();

        area = Math.PI * radius* radius;
        circum = Math.PI * 2 * radius;

        System.out.printf("\nThe area of a circle whose radius is %.2f is %.2f",radius,area);
        System.out.printf("\nThe circumference of a circle whose radius is %.2f is %.2f",radius,circum);

    }
}
