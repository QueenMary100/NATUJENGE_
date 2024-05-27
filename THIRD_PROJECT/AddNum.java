import java.util.*;
public class AddNum {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num1:");
        num1 = sc.nextInt();
        System.out.print("enter num2:");
        num2 = sc.nextInt();
        sum = num1 + num2;

        System.out.println("The sum is :"+sum);

    }
}