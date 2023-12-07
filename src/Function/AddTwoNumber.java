package Function;
import java.util.*;

public class AddTwoNumber {
    public static int addSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2:");
        int num2 = sc.nextInt();

        int sum = addSum(num1,num2);
        System.out.println("Sum of 2 number is = "+sum);
    }
}
